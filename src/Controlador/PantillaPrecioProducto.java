/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.io.File;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Brisa
 */
public class PantillaPrecioProducto {
    
    public static void generarPlantillaPrecioProducto() {
        try (Workbook workbook = new XSSFWorkbook()) {

            Sheet sheet = workbook.createSheet("PrecioProducto");

            Row header = sheet.createRow(0);
            header.createCell(0).setCellValue("id_producto");
            header.createCell(1).setCellValue("tipo_cliente");
            header.createCell(2).setCellValue("precio");

            JFileChooser chooser = new JFileChooser();
            chooser.setSelectedFile(new File("plantilla_precio_producto.xlsx"));

            if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                File archivo = chooser.getSelectedFile();
                try (FileOutputStream fos = new FileOutputStream(archivo)) {
                    workbook.write(fos);
                }
                JOptionPane.showMessageDialog(null,
                    "Plantilla de precio_producto guardada en:\n" + archivo.getAbsolutePath());
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                "Error al generar plantilla precio_producto: " + e.getMessage());
        }
    }

}
