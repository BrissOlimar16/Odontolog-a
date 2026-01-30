/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author Brisa
 */
public class Paquete {
    private int idPaquete;
    private String nombre;
    private String descripcion;
    private String grupo;
    private double precioInterno;
    private double precioExterno;

    public Paquete(){
    }

    public int getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(int idPaquete) {
        this.idPaquete = idPaquete;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public double getPrecioInterno() {
        return precioInterno;
    }

    public void setPrecioInterno(double precioInterno) {
        this.precioInterno = precioInterno;
    }

    public double getPrecioExterno() {
        return precioExterno;
    }

    public void setPrecioExterno(double precioExterno) {
        this.precioExterno = precioExterno;
    }
    
}
