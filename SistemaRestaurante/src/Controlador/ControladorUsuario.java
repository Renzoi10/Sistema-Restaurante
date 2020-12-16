/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.usuarios;
import Modelo.UsuarioDAO;
import Vista.MantUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * 
 * @author Melissa Ponce
 */
public class ControladorUsuario  implements ActionListener{
    
     UsuarioDAO dao = new UsuarioDAO();
    usuarios usu = new usuarios();
    MantUsuario mu = new MantUsuario();
    DefaultTableModel modelo = new DefaultTableModel();
    
    public ControladorUsuario(MantUsuario u){
        this.mu = u;
        this.mu.btnAñadir.addActionListener(this);
        this.mu.btnModificar.addActionListener(this);
        this.mu.btnAceptar.addActionListener(this);
        this.mu.btnEliminar.addActionListener(this);
        listar(mu.tablaUsuario);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == mu.btnAñadir){
            añadir();
            LimpiarTabla();
            listar(mu.tablaUsuario);
        }
        
        if(e.getSource() == mu.btnModificar){
          int fila = mu.tablaUsuario.getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(mu, "Debe seleccionar una fila");
            } else {
                String  usuario = (String) mu.tablaUsuario.getValueAt(fila, 0);
                String password = (String) mu.tablaUsuario.getValueAt(fila, 1);
                int nivelAcceso = Integer.parseInt((String) mu.tablaUsuario.getValueAt(fila, 2).toString());
               
                mu.txtUsuario.setText("" + usuario);
                mu.txtContraseña.setText("" + password);
                mu.txtNivel.setText("" + nivelAcceso);
               

            }

        }
          if (e.getSource() == mu.btnAceptar) {

            Modificar();
            LimpiarTabla();
            listar(mu.tablaUsuario);
        }

        if (e.getSource() == mu.btnEliminar) {

            eliminar();
            LimpiarTabla();
            listar(mu.tablaUsuario);

        }

    }
     public void eliminar() {
        int fila = mu.tablaUsuario.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(mu, "Debe seleccionar una fila");
        } else {
           String usuario = (String) mu.tablaUsuario.getValueAt(fila, 0);
            dao.Eliminar(usuario);
            JOptionPane.showMessageDialog(mu, "Usuario eliminado correctamente");

        }

    }
    public void listar(JTable tabla) {
        modelo = (DefaultTableModel) tabla.getModel();
        List<usuarios> lista = dao.listarUsuario();
        Object[] object = new Object[5];
        for (int i = 0; i < lista.size(); i++) {
            object[0] = lista.get(i).getUsuario();
            object[1] = lista.get(i).getPassword();
            object[2] = lista.get(i).getNivelacceso();
            modelo.addRow(object);
        }
        mu.tablaUsuario.setModel(modelo);
    }
    
        public void LimpiarTabla() {
        for (int i = 0; i < mu.tablaUsuario.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }
        
         public void Modificar() {
        String usuario = (String) mu.txtUsuario.getText();
        String password = (String) mu.txtContraseña.getText();
         int nivelAcceso = Integer.parseInt(mu.txtNivel.getText());
        usu.setUsuario(usuario);
        usu.setPassword(password);
        usu.setNivelacceso(nivelAcceso);
        int r = dao.Modificar(usu);

        if (r == 1) {
            JOptionPane.showMessageDialog(mu, "Datos modificados con exito");
        } else {
            JOptionPane.showMessageDialog(mu, "Ocurrio un error");
        }

    }
         
    public void añadir() {
        String usuario = (String) mu.txtUsuario.getText();
        String password = (String) mu.txtContraseña.getText();
        int nivelAcceso= Integer.parseInt(mu.txtNivel.getText());
        usu.setUsuario(usuario);
        usu.setPassword(password);
        usu.setNivelacceso(nivelAcceso);
        int r = dao.Añadir(usu);
        if (r == 1) {
            JOptionPane.showMessageDialog(mu, "Datos registrados con exito");
        } else {
            JOptionPane.showMessageDialog(mu, "Ocurrio un error");
        }
    }

}

