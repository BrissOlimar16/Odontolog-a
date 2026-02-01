/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;
import java.sql.*;
import org.apache.poi.ss.usermodel.*;
/**
 *
 * @author Brisa
 */
public class ImportarProductos {



    public static void importar(File archivoExcel) {

        try (FileInputStream fis = new FileInputStream(archivoExcel);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0);
            Connection con = new Conectar().conectaBD();

            String sql = """
                INSERT INTO producto (id_producto, nombre, descripcion, existencias, costo)
                VALUES (?, ?, ?, ?, ?)
            """;

            PreparedStatement ps = con.prepareStatement(sql);

            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);

                if (row == null) continue;
                    String id = getCellAsString(row.getCell(0)).trim();
                    String nombre = getCellAsString(row.getCell(1)).trim();
                    String desc = getCellAsString(row.getCell(2)).trim();

                    int existencias = (int) row.getCell(3).getNumericCellValue();
                    double costo = row.getCell(4).getNumericCellValue();


                ps.setString(1, id);
                ps.setString(2, nombre);
                ps.setString(3, desc);
                ps.setInt(4, existencias);
                ps.setDouble(5, costo);
                ps.executeUpdate();
            }

            javax.swing.JOptionPane.showMessageDialog(null,
                    "Productos importados correctamente");

        } catch (Exception e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(null,
                    "Error al importar: " + e.getMessage());
        }
    }
    


    public static String getCellAsString(Cell cell) {
        if (cell == null) return "";

        return switch (cell.getCellType()) {
            case STRING -> cell.getStringCellValue();
            case NUMERIC -> {
                if (DateUtil.isCellDateFormatted(cell)) {
                    yield cell.getDateCellValue().toString();
                } else {
                    yield String.valueOf((long) cell.getNumericCellValue());
                }
            }
            case BOOLEAN -> String.valueOf(cell.getBooleanCellValue());
            case FORMULA -> cell.getCellFormula();
            default -> "";
        };
    }


}
