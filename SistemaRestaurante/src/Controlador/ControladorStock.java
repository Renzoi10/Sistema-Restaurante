/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.Presupuestos;
import Modelo.Stock;
import Modelo.ProductoDAO;
import Vista.MantStock;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControladorStock implements ActionListener {
   
    ProductoDAO dao = new ProductoDAO();
    Stock sto = new Stock();
    MantStock ms = new MantStock();
    DefaultTableModel modelo = new DefaultTableModel();
    
    public ControladorStock(MantStock s){
        this.ms = s;
        this.ms.btnAñadir.addActionListener(this);
        this.ms.btnModificar.addActionListener(this);
        this.ms.btnAceptar.addActionListener(this);
        this.ms.btnEliminar.addActionListener(this);
        listar(ms.tablaStock);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == ms.btnAñadir){
            añadir();
            LimpiarTabla();
            listar(ms.tablaStock);
        }
        
        if(e.getSource() == ms.btnModificar){
          int fila = ms.tablaStock.getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(ms, "Debe seleccionar una fila");
            } else {
                int id = Integer.parseInt((String) ms.tablaStock.getValueAt(fila, 0).toString());
                String nombre = (String) ms.tablaStock.getValueAt(fila, 1);
                String descripcion = (String) ms.tablaStock.getValueAt(fila, 2);
                int cantidad = Integer.parseInt((String) ms.tablaStock.getValueAt(fila, 3).toString());
                double precio = Double.parseDouble((String) ms.tablaStock.getValueAt(fila, 4).toString());
                ms.txtId.setText("" + id);
                ms.txtNombre.setText("" + nombre);
                ms.txtDescrip.setText("" + descripcion);
                ms.txtCant.setText("" + cantidad);
                ms.txtPrecio.setText("" + precio);
               

            }

        }
          if (e.getSource() == ms.btnAceptar) {

            Modificar();
            LimpiarTabla();
            listar(ms.tablaStock);
        }

        if (e.getSource() == ms.btnEliminar) {

            eliminar();
            LimpiarTabla();
            listar(ms.tablaStock);

        }

    }
     public void eliminar() {
        int fila = ms.tablaStock.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(ms, "Debe seleccionar una fila");
        } else {
            int id = Integer.parseInt((String) ms.tablaStock.getValueAt(fila, 0).toString());
            dao.eliminar(id);
            JOptionPane.showMessageDialog(ms, "Usuario eliminado correctamente");

        }

    }
    public void listar(JTable tabla) {
        modelo = (DefaultTableModel) tabla.getModel();
        List<Stock> lista = dao.listarStock();
        Object[] object = new Object[5];
        for (int i = 0; i < lista.size(); i++) {
            object[0] = lista.get(i).getId_Stock();
            object[1] = lista.get(i).getNombre();
            object[2] = lista.get(i).getDescripcion();
            object[3] = lista.get(i).getCantidad();
            object[4] = lista.get(i).getPrecio();
            modelo.addRow(object);
        }
        ms.tablaStock.setModel(modelo);
    }
    
        public void LimpiarTabla() {
        for (int i = 0; i < ms.tablaStock.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }
        
         public void Modificar() {
        int id = Integer.parseInt(ms.txtId.getText());
        String nombre = (String) ms.txtNombre.getText();
        String descripcion = (String) ms.txtDescrip.getText();
         int cantidad = Integer.parseInt(ms.txtCant.getText());
         double precio = Double.parseDouble(ms.txtPrecio.getText());
        sto.setId_Stock(id);
        sto.setNombre(nombre);
        sto.setDescripcion(descripcion);
        sto.setCantidad(cantidad);
        sto.setPrecio(precio);
        int r = dao.Modificar(sto);

        if (r == 1) {
            JOptionPane.showMessageDialog(ms, "Datos modificados con exito");
        } else {
            JOptionPane.showMessageDialog(ms, "Ocurrio un error");
        }

    }
         
    public void añadir() {
        String nombre = (String) ms.txtNombre.getText();
        String descripcion = (String) ms.txtDescrip.getText();
        int cantidad= Integer.parseInt(ms.txtCant.getText());
        double precio = Double.parseDouble(ms.txtPrecio.getText());
        sto.setNombre(nombre);
        sto.setDescripcion(descripcion);
        sto.setCantidad(cantidad);
        sto.setPrecio(precio);
        int r = dao.añadir(sto);
        if (r == 1) {
            JOptionPane.showMessageDialog(ms, "Datos registrados con exito");
        } else {
            JOptionPane.showMessageDialog(ms, "Ocurrio un error");
        }
    }

}
