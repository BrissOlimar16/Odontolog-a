package Controlador;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import odontologia.Interfaz;

public class Funciones extends Interfaz {
    public static void limpiaTabla(DefaultTableModel t){
        int a=t.getRowCount();  
        while(a!=0){ // Ciclo para Borrar la Tabla 1
            if(a!=0)
                t.removeRow(0);                      
            a=t.getRowCount();        
        }          
    }
    
//    public static void consultarU(String query, DefaultTableModel t){
//        java.sql.ResultSet r= new Controlador.Conectar().consulta(query); 
//        int i=1;
//        try{                      
//            while(r.next())
//            {
//                String x=r.getString("insumo")+" "+evaluarnull(r.getString("descripcion"))
//                        +" "+evaluarnull(r.getString("presentacion"));
//                id=r.getInt("no_item");
//                linea[0]=id;
//                linea[1]=x;
//                linea[3]=r.getString("total_de_piezas");
//                t.addRow(linea);   
//                i=i+1;
//            }
//        }catch(Exception ex) {
//            System.out.println(ex.getMessage());
//        }  
//    }
    
    private static String evaluarnull(String value) {
        if (value == null || value.trim().isEmpty()) {
            return "";
        }
        return " - " + value;
    }
    
//    public static void buscando(String buscar){
//        limpiaTabla(t1);        
//        if (!buscar.trim().isEmpty()) { 
//            consultarU("SELECT * FROM inventario_dental WHERE "
//            + "insumo ILIKE '%" + buscar + "%' OR " // ILIKE para búsqueda sin distinción entre mayúsculas/minúsculas en PostgreSQL
//            + "descripcion ILIKE '%" + buscar + "%' OR "
//            + "CAST(no_item AS TEXT) LIKE '%" + buscar + "%' OR " // Convierte matrícula a texto para buscar coincidencias parciales
//            + "presentacion ILIKE '%" + buscar + "%'",t1);
//        }
//    }
    

}
