/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Lucero
 */
public class Venta {
    private int idVenta;
    private int idBoleta;
    private String descripcion;
    private Date fecha;
    private String telefono;
    private String modeloVehiculo;
    
    public Venta(int idVenta,int idBoleta, String descripcion, Date fecha, String telefono, String modeloVehiculo){
        this.idVenta=idVenta;
        this.idBoleta=idBoleta;
        this.descripcion=descripcion;
        this.fecha=fecha;
        this.telefono=telefono;
        this.modeloVehiculo=modeloVehiculo;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdBoleta() {
        return idBoleta;
    }

    public void setIdBoleta(int idBoleta) {
        this.idBoleta = idBoleta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getModeloVehiculo() {
        return modeloVehiculo;
    }

    public void setModeloVehiculo(String modeloVehiculo) {
        this.modeloVehiculo = modeloVehiculo;
    }
    
    
}
