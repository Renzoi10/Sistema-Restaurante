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
public class Ventas {
    private int id_Ventas;
    private int id_Cliente;
    private int id_Mozo;
    private String Numero_Venta;
    private String Fecha;
    private int Monto;

    public Ventas() {
    }

    public Ventas(int id_Ventas, int id_Cliente, int id_Mozo, String Numero_Venta, String Fecha, int Monto) {
        this.id_Ventas = id_Ventas;
        this.id_Cliente = id_Cliente;
        this.id_Mozo = id_Mozo;
        this.Numero_Venta = Numero_Venta;
        this.Fecha = Fecha;
        this.Monto = Monto;
    }

    public int getId_Ventas() {
        return id_Ventas;
    }

    public void setId_Ventas(int id_Ventas) {
        this.id_Ventas = id_Ventas;
    }

    public int getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(int id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public int getId_Mozo() {
        return id_Mozo;
    }

    public void setId_Mozo(int id_Mozo) {
        this.id_Mozo = id_Mozo;
    }

    public String getNumero_Venta() {
        return Numero_Venta;
    }

    public void setNumero_Venta(String Numero_Venta) {
        this.Numero_Venta = Numero_Venta;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public int getMonto() {
        return Monto;
    }

    public void setMonto(int Monto) {
        this.Monto = Monto;
    }
    

}
