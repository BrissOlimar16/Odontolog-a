/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Brisa
 */
public class ImportgarPreciosProducto {

    public static void importar(File archivoExcel) throws Exception {

        String sql = "INSERT INTO precioproducto (tipo_cliente, precio, id_producto) VALUES (?, ?, ?)";

        try (FileInputStream fis = new FileInputStream(archivoExcel);
             Workbook workbook = WorkbookFactory.create(fis);
             Connection con = new Conectar().conectaBD(); 
             PreparedStatement ps = con.prepareStatement(sql)) {

            Sheet sheet = workbook.getSheetAt(0);

            int filasInsertadas = 0;
            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);
                if (row == null) continue;

                String idProductoStr = getCellAsString(row.getCell(0)).trim();
                String tipoClienteRaw = getCellAsString(row.getCell(1)).trim();
                double precio = getCellAsDouble(row.getCell(2));

                if (idProductoStr.isEmpty() || tipoClienteRaw.isEmpty()) {
                    throw new Exception("Fila " + (i + 1) + ": campos obligatorios vacíos.");
                }

                int idProducto;
                try {
                    idProducto = Integer.parseInt(idProductoStr);
                } catch (NumberFormatException e) {
                    throw new Exception("Fila " + (i + 1) + ": id_producto no es un número válido.");
                }
                String tipoCliente;
                if (tipoClienteRaw.equalsIgnoreCase("INTERNO")) {
                    tipoCliente = "Interno";
                } else if (tipoClienteRaw.equalsIgnoreCase("EXTERNO")) {
                    tipoCliente = "Externo"; 
                } else {
                    throw new Exception("Fila " + (i + 1) + 
                        ": tipo_cliente inválido. Usa INTERNO o EXTERNO.");
                }

                if (precio < 0) {
                    throw new Exception("Fila " + (i + 1) + ": el precio no puede ser negativo.");
                }

                ps.setString(1, tipoCliente);
                ps.setDouble(2, precio);
                ps.setInt(3, idProducto);
                ps.addBatch();

                filasInsertadas++;
            }

            ps.executeBatch();

            JOptionPane.showMessageDialog(null,
                    "Importación completada. Registros insertados: " + filasInsertadas,
                    "Éxito", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Error al importar precio_producto:\n" + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
            throw e;
        }
    }


        private static String getCellAsString(Cell cell) {
        if (cell == null) return "";
        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue();
            case NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) {
                    return cell.getDateCellValue().toString();
                }
                double num = cell.getNumericCellValue();
                long longVal = (long) num;
                return (num == longVal) ? String.valueOf(longVal) : String.valueOf(num);
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
            case FORMULA:
                try {
                    return cell.getStringCellValue();
                } catch (IllegalStateException e) {
                    return String.valueOf(cell.getNumericCellValue());
                }
            case BLANK:
            default:
                return "";
        }
    }

    private static double getCellAsDouble(Cell cell) {
        if (cell == null) return 0.0;
        switch (cell.getCellType()) {
            case NUMERIC:
                return cell.getNumericCellValue();
            case STRING:
                String s = cell.getStringCellValue().trim().replace(",", ".");
                if (s.isEmpty()) return 0.0;
                return Double.parseDouble(s);
            case FORMULA:
                return cell.getNumericCellValue();
            default:
                return 0.0;
        }
    }

}
