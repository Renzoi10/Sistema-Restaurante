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

public class ProductoDAO {

    Conexion conexion = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public Stock AtraparProductos(String Nombre) {
        Stock s = new Stock();

        String sql = "SELECT * FROM producto WHERE Nombre=?";

        try {
            con = conexion.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, Nombre);
            rs = ps.executeQuery();
            while (rs.next()) {
                s.setId_Stock(rs.getInt(1));
                s.setNombre(rs.getString(2));
                s.setDescripcion(rs.getString(3));
                s.setCantidad(rs.getInt(4));
                s.setPrecio(rs.getInt(5));
            }

        } catch (Exception e) {

        }
        return s;
    }

    public List listarStock() {
        List<Stock> datos = new ArrayList<>();
        String sql = "SELECT * FROM producto";

        try {
            con = conexion.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Stock s = new Stock();
                s.setId_Stock(rs.getInt(1));
                s.setNombre(rs.getString(2));
                s.setDescripcion(rs.getString(3));
                s.setCantidad(rs.getInt(4));
                s.setPrecio(rs.getDouble(5));
                datos.add(s);
            }

        } catch (Exception e) {
        }
        return datos;
    }

    public int añadir(Stock s) {
        String sql = "INSERT INTO producto (Nombre, Descripcion, Stock, Precio) VALUES (?, ?, ?, ?);";
        try {
            con = conexion.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, s.getNombre());
            ps.setString(2, s.getDescripcion());
            ps.setInt(3, s.getCantidad());
            ps.setDouble(4, s.getPrecio());
            ps.executeUpdate();

        } catch (Exception e) {
        }
        return 1;
    }

    public int Modificar(Stock s) {
        int respuesta = 0;
        String sql = "UPDATE producto SET Nombre = ?, Descripcion = ?, Stock = ?, Precio = ? WHERE (id_Producto = ?);";

        try {
            con = conexion.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, s.getNombre());
            ps.setString(2, s.getDescripcion());
            ps.setInt(3, s.getCantidad());
            ps.setDouble(4, s.getPrecio());
            ps.setInt(5, s.getId_Stock());
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
        String sql = "delete from producto where id_Producto= " + id;
        try {
            con = conexion.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();

        } catch (Exception e) {
        }

    }

}
