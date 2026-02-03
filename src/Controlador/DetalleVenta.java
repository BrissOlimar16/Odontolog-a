/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author david
 */
public class DetalleVenta {
    private String id;
    private String descripcion;
    private int cantidad;
    private double precio;
    private double subtotal;

    public DetalleVenta() {
    }

    public DetalleVenta(String id, String descripcion, int cantidad, double precio) {
        this.id = id;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
        this.subtotal = cantidad * precio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
        this.actualizarSubtotal();
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
        this.actualizarSubtotal();
    }

    public double getSubtotal() {
        return subtotal;
    }

    private void actualizarSubtotal() {
        this.subtotal = this.cantidad * this.precio;
    }

    
}
