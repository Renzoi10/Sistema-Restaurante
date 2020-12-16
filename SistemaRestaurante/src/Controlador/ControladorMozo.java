/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Mozo;
import Modelo.MozoDao;
import Vista.MantMoso;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Renzo
 */
public class ControladorMozo implements ActionListener {

    MozoDao dao = new MozoDao();
    Mozo m = new Mozo();

    MantMoso mantm = new MantMoso();

    DefaultTableModel modelo = new DefaultTableModel();

    public ControladorMozo(MantMoso m) {
        this.mantm = m;
        this.mantm.btnAñadir.addActionListener(this);
        this.mantm.btnAceptar.addActionListener(this);
        this.mantm.btnModificar.addActionListener(this);
        this.mantm.btnEliminar.addActionListener(this);
        listar(mantm.TablaMozo);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == mantm.btnAñadir) {
            agregar();
            LimpiarTabla();
            listar(mantm.TablaMozo);
        }
        if (e.getSource() == mantm.btnModificar) {
            int fila = mantm.TablaMozo.getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(mantm, "Debe seleccionar una fila");
            } else {
                int id = Integer.parseInt((String) mantm.TablaMozo.getValueAt(fila, 0).toString());
                String Nombre = (String) mantm.TablaMozo.getValueAt(fila, 1);
                String DNI = (String) mantm.TablaMozo.getValueAt(fila, 2).toString();
                int telefono = Integer.parseInt((String) mantm.TablaMozo.getValueAt(fila, 3).toString());
                String Direccion = (String) mantm.TablaMozo.getValueAt(fila, 4);
                mantm.txtId_Mozo.setText("" + id);
                mantm.txtNombre_A.setText(Nombre);
                mantm.txtDNI.setText( DNI);
                mantm.txtTelefono.setText("" + telefono);
                mantm.txtDireccion.setText(Direccion);
            }
        }
        if (e.getSource() == mantm.btnAceptar) {

            Actualizar();
            LimpiarTabla();
            listar(mantm.TablaMozo);
        }

        if (e.getSource() == mantm.btnEliminar) {

            eliminar();
            LimpiarTabla();
            listar(mantm.TablaMozo);

        }

    }

    public void listar(JTable tabla) {
        modelo = (DefaultTableModel) tabla.getModel();
        List<Mozo> lista = dao.listar();
        Object[] object = new Object[5];
        for (int i = 0; i < lista.size(); i++) {
            object[0] = lista.get(i).getId_Moso();
            object[1] = lista.get(i).getNombre_Apellido();
            object[2] = lista.get(i).getDNI();
            object[3] = lista.get(i).getTelefono();
            object[4] = lista.get(i).getDireccion();
            modelo.addRow(object);
        }
        mantm.TablaMozo.setModel(modelo);
    }

    public void eliminar() {
        int fila = mantm.TablaMozo.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(mantm, "Debe seleccionar una fila");
        } else {
            int id = Integer.parseInt((String) mantm.TablaMozo.getValueAt(fila, 0).toString());
            dao.eliminar(id);
            JOptionPane.showMessageDialog(mantm, "Usuario eliminado correcatamente");

        }

    }

    public void LimpiarTabla() {
        for (int i = 0; i < mantm.TablaMozo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }
    
    public void Actualizar() {
        int id = Integer.parseInt(mantm.txtId_Mozo.getText());
        String nombre = mantm.txtNombre_A.getText();
        String dni = mantm.txtDNI.getText();
        int telefono = Integer.parseInt(mantm.txtTelefono.getText());
        String Direccion = mantm.txtDireccion.getText();
        m.setId_Moso(id);
        m.setNombre_Apellido(nombre);
        m.setDNI(dni);
        m.setTelefono(telefono);
        m.setDireccion(Direccion);
  

        int r = dao.Actualizar(m);

        if (r == 1) {
            JOptionPane.showMessageDialog(mantm, "Datos Atualizados con exito");
        } else {
            JOptionPane.showMessageDialog(mantm, "Ocurrio un error");
        }

    }
    
        public void agregar() {
        String nombre = mantm.txtNombre_A.getText();
        String dni = mantm.txtDNI.getText();
        int telefono = Integer.parseInt(mantm.txtTelefono.getText());
        String Direccion = mantm.txtDireccion.getText();
        m.setNombre_Apellido(nombre);
        m.setDNI(dni);
        m.setTelefono(telefono);
        m.setDireccion(Direccion);

        int r = dao.agregar(m);

        if (r == 1) {
            JOptionPane.showMessageDialog(mantm, "Datos agregados con exito");
        } else {
            JOptionPane.showMessageDialog(mantm, "Ocurrio un error");
        }

    }

}
