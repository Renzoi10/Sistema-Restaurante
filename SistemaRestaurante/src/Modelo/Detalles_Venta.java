/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

/**
 * 
 * @author Renzo
 */
public class Detalles_Venta {

    private int id_Detalle;
    private int id_Venta;
    private int id_Producto;
    private int Cantidad;
    private double Precio_Venta;

    public Detalles_Venta() {
    }

    public Detalles_Venta(int id_Detalle, int id_Venta, int id_Producto, int Cantidad, double Precio_Venta) {
        this.id_Detalle = id_Detalle;
        this.id_Venta = id_Venta;
        this.id_Producto = id_Producto;
        this.Cantidad = Cantidad;
        this.Precio_Venta = Precio_Venta;
    }

    public int getId_Detalle() {
        return id_Detalle;
    }

    public void setId_Detalle(int id_Detalle) {
        this.id_Detalle = id_Detalle;
    }

    public int getId_Venta() {
        return id_Venta;
    }

    public void setId_Venta(int id_Venta) {
        this.id_Venta = id_Venta;
    }

    public int getId_Producto() {
        return id_Producto;
    }

    public void setId_Producto(int id_Producto) {
        this.id_Producto = id_Producto;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public double getPrecio_Venta() {
        return Precio_Venta;
    }

    public void setPrecio_Venta(double Precio_Venta) {
        this.Precio_Venta = Precio_Venta;
    }

    

 
}
