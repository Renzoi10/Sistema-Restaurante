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
public class Mozo {

    private int id_Moso;
    private String nombre_Apellido;
    private String DNI;
    private int Telefono;
    private String direccion;

    public Mozo() {    
 
    }

    public Mozo(int id_Moso, String nombre_Apellido, String DNI, int Telefono, String direccion) {
        this.id_Moso = id_Moso;
        this.nombre_Apellido = nombre_Apellido;
        this.DNI = DNI;
        this.Telefono = Telefono;
        this.direccion = direccion;
    }
    
    

    public int getId_Moso() {
        return id_Moso;
    }

    public void setId_Moso(int id_Moso) {
        this.id_Moso = id_Moso;
    }

    public String getNombre_Apellido() {
        return nombre_Apellido;
    }

    public void setNombre_Apellido(String nombre_Apellido) {
        this.nombre_Apellido = nombre_Apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
