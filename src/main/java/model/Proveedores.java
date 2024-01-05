/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author santo
 */
public class Proveedores {

 
    
    private int idProveedores;
    private String descripcion;
    private int stock;
    private double precio;
    
    
    public Proveedores(int idProveedores, String descripcion, int stock, double precio){
        this.idProveedores = idProveedores;
        this.descripcion = descripcion;
        this.stock = stock;
        this.precio = precio;
    }
    
       public int getIdProveedores() {
        return idProveedores;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getStock() {
        return stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setIdProveedores(int idProveedores) {
        this.idProveedores = idProveedores;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
