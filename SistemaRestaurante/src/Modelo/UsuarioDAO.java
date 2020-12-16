/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Melissa Ponce
 */
public class UsuarioDAO {
Conexion conexion = new Conexion();
Connection con;
PreparedStatement ps;
ResultSet rs; //resultado de la operacion

public List listarUsuario(){
    List<usuarios> datos = new ArrayList<>();
    String sql= "SELECT * FROM usuarios ";
    
    try {
        con= conexion.getConnection();
        ps=con.prepareStatement(sql); //prepara la consulta de sentencia, llamando a la secuenci sql
        rs= ps.executeQuery(); // ejecuta la secuencia sql  y la almacena
        
        while(rs.next()){ //si el rs funciona tons entra en el buble sino sale (.next sirve para  que vea si cumple)
        usuarios u =new usuarios();
        u.setUsuario(rs.getString(1));
        u.setPassword(rs.getString(2));
        u.setNivelacceso(rs.getInt(3));
        datos.add(u);
        }
    } catch (Exception e) {
    }
        return datos;
    }

public int Añadir(usuarios u){
    int respuesta = 0;
    String sql= "INSERT INTO usuarios (Usuario, Password, Level_Acces) VALUES (?, ?, ?);";
     try {
            con = conexion.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, u.getUsuario());
            ps.setString(2, u.getPassword());
            ps.setInt(3, u.getNivelacceso());
            ps.executeUpdate();
            
        } catch (Exception e) {
        }
           return 1;
    }


 public int Modificar(usuarios u) {
        int respuesta = 0;
        String sql = "UPDATE usuarios SET  Password = ?, Level_Acces = ? WHERE (Usuario = ?);";
    try {
         con = conexion.getConnection();
         ps = con.prepareStatement(sql);
         ps.setString(1, u.getPassword());
         ps.setInt(2, u.getNivelacceso());
         ps.setString(3, u.getUsuario());
         respuesta = ps.executeUpdate();
         if (respuesta == 1) {
             return 1;
        }else{
             return 0;
         }
         
    } catch (Exception e) {
    }
    return respuesta;
    }
    
 public void Eliminar(String usuario){
     String sql = "DELETE FROM usuarios WHERE Usuario =  " + usuario;
        try {
            con = conexion.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();

        } catch (Exception e) {
        }

    }
}
