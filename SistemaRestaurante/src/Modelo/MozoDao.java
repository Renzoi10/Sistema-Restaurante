/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Renzo
 */
public class MozoDao {

    Conexion conexion = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public Mozo listarID(String DNI) {
        Mozo m = new Mozo();

        String sql = "SELECT * FROM mozos WHERE DNI=?";

        try {
            con = conexion.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, DNI);
            rs = ps.executeQuery();
            while (rs.next()) {
                m.setId_Moso(rs.getInt(1));
                m.setNombre_Apellido(rs.getString(2));
                m.setDNI(rs.getString(3));
                m.setTelefono(rs.getInt(4));
                m.setDireccion(rs.getString(5));
            }

        } catch (Exception e) {

        }
        return m;
    }
    
    
    
    public List listar() {

        List<Mozo> datos = new ArrayList<>();
        String sql = "SELECT * FROM mozos";

        try {
            con = conexion.getConnection();

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Mozo m=new Mozo();
                m.setId_Moso(rs.getInt(1));
                m.setNombre_Apellido(rs.getString(2));
                m.setDNI(rs.getString(3));
                m.setTelefono(rs.getInt(4));
                m.setDireccion(rs.getString(5));

                datos.add(m);

            }

        } catch (Exception e) {
        }

        return datos;

    }
    
    
    public int agregar(Mozo m) {

        String sql = "INSERT INTO mozos (Nombre_Apellido, DNI, Telefono, Direccion) VALUES (?,?,?,?); ";

        try {

            con = conexion.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, m.getNombre_Apellido());
            ps.setString(2, m.getDNI());
            ps.setInt(3, m.getTelefono());
            ps.setString(4, m.getDireccion());
            ps.executeUpdate();

        } catch (SQLException e) {
        }

        return 1;

    }

    public int Actualizar(Mozo m) {
        int respuesta = 0;
        String sql = "UPDATE mozos SET Nombre_Apellido = ?, DNI = ?, Telefono = ?, Direccion = ? WHERE (id_Moso = ?);";

        try {
            con = conexion.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, m.getNombre_Apellido());
            ps.setString(2, m.getDNI());
            ps.setInt(3, m.getTelefono());
            ps.setString(4, m.getDireccion());
            ps.setInt(5, m.getId_Moso());
            ps.executeUpdate();
            respuesta = ps.executeUpdate();
            if (respuesta == 1) {
                return 1;
            } else {
                return 0;
            }
        } catch (SQLException e) {

        }
        return respuesta;
    }

    public void eliminar(int id) {
        String sql = "DELETE FROM mozos WHERE id_Moso = " + id;
        try {
            con = conexion.getConnection();
            ps = con.prepareStatement(sql); 
            ps.executeUpdate();

        } catch (SQLException e) {
        }

    }

}
