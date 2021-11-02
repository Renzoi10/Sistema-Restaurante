package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Yonatan
 */
public class Sqlusuarios extends Conexion {

    Conexion conexion = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public usuarios AtraparAcces(String Nombre) {
        usuarios u = new usuarios();

        String sql = "Select * FROM usuarios WHERE Usuario=?";

        try {
            con = conexion.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, Nombre);
            rs = ps.executeQuery();
            while (rs.next()) {
                u.setUsuario(rs.getString(1));
                u.setPassword(rs.getString(2));
                u.setNivelacceso(rs.getInt(3));
            }

        } catch (Exception e) {

        }
        return u;
    }

}
