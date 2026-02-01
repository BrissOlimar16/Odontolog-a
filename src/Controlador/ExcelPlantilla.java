/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
/**
 *
 * @author Brisa
 */
public class ExcelPlantilla {

    public static void generarPlantillaProductos() {
        try (Workbook workbook = new XSSFWorkbook()) {

            Sheet sheet = workbook.createSheet("Productos");

            Row header = sheet.createRow(0);
            header.createCell(0).setCellValue("id_producto");
            header.createCell(1).setCellValue("nombre");
            header.createCell(2).setCellValue("descripcion");
            header.createCell(3).setCellValue("existencias");
            header.createCell(4).setCellValue("costo");

            JFileChooser chooser = new JFileChooser();
            chooser.setSelectedFile(new File("plantilla_productos.xlsx"));

            int opcion = chooser.showSaveDialog(null);

            if (opcion == JFileChooser.APPROVE_OPTION) {
                File archivo = chooser.getSelectedFile();

                try (FileOutputStream fos = new FileOutputStream(archivo)) {
                    workbook.write(fos);
                }

                JOptionPane.showMessageDialog(null,
                        "Plantilla guardada en:\n" + archivo.getAbsolutePath());
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    "Error al generar plantilla: " + e.getMessage());
        }
    }

}
