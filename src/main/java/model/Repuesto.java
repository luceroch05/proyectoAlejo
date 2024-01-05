/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author santo
 */
public class Repuesto {
    
    private int idRepuesto;
    private int idProveedor;
    private String descripcion;
    private int Stock;
    private double precio;
    
    public Repuesto(int idRepuesto, int idProveedor, String descripcion, int Stock, double precio) {
        this.idRepuesto = idRepuesto;
        this.idProveedor = idProveedor;
        this.descripcion = descripcion;
        this.Stock = Stock;
        this.precio = precio;
    }

    public int getIdRepuesto() {
        return idRepuesto;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getStock() {
        return Stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setIdRepuesto(int idRepuesto) {
        this.idRepuesto = idRepuesto;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
         
}
