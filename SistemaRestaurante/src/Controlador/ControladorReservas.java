package Controlador;

import Modelo.ReservaDAO;
import Modelo.Reservas;
import Vista.Reserva;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ControladorReservas implements ActionListener {

    ReservaDAO dao = new ReservaDAO();

    Reservas res = new Reservas();

    Reserva reser = new Reserva();
    DefaultTableModel modelo = new DefaultTableModel();

    public ControladorReservas(Reserva r) {
        this.reser = r;
        this.reser.btnListar.addActionListener(this);
        this.reser.btnAgregar.addActionListener(this);
        this.reser.btnAceptar.addActionListener(this);
        this.reser.btnEditar.addActionListener(this);
        this.reser.btnEliminar.addActionListener(this);
        listar(reser.Tabla1);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == reser.btnListar) {
            LimpiarTabla();
            listar(reser.Tabla1);
        }
        if (e.getSource() == reser.btnAgregar) {
            agregar();
            LimpiarTabla();
            listar(reser.Tabla1);
        }
        if (e.getSource() == reser.btnEditar) {
            int fila = reser.Tabla1.getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(reser, "Debe seleccionar una fila");
            } else {
                int id = Integer.parseInt((String) reser.Tabla1.getValueAt(fila, 0).toString());
                String nom = (String) reser.Tabla1.getValueAt(fila, 1);
                int dni = Integer.parseInt((String) reser.Tabla1.getValueAt(fila, 2).toString());
                String email = (String) reser.Tabla1.getValueAt(fila, 3);
                int telefono = Integer.parseInt((String) reser.Tabla1.getValueAt(fila, 4).toString());
                String fecha_hora = (String) reser.Tabla1.getValueAt(fila, 5);
                int numero_mesa = Integer.parseInt((String) reser.Tabla1.getValueAt(fila, 6).toString());
                reser.txtId.setText("" + id);
                reser.txtNombre.setText(nom);
                reser.txtDNI.setText("" + dni);
                reser.txtEmail.setText(email);
                reser.txtTelefono.setText("" + telefono);
                ((JTextField) reser.txtFecha.getDateEditor().getUiComponent()).setText(fecha_hora);
                reser.txtMesa.setText("" + numero_mesa);

            }

        }
        if (e.getSource() == reser.btnAceptar) {

            Actualizar();
            LimpiarTabla();
            listar(reser.Tabla1);
        }

        if (e.getSource() == reser.btnEliminar) {
            eliminar();
            LimpiarTabla();
            listar(reser.Tabla1);

        }

    }

    public void LimpiarTabla() {
        for (int i = 0; i < reser.Tabla1.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }

    }

    public void eliminar() {
        int fila = reser.Tabla1.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(reser, "Debe seleccionar una fila");
        } else {
            int id = Integer.parseInt((String) reser.Tabla1.getValueAt(fila, 0).toString());
            dao.eliminar(id);
            JOptionPane.showMessageDialog(reser, "Usuario eliminado correcatamente");

        }

    }

    public void Actualizar() {
        int id = Integer.parseInt(reser.txtId.getText());
        String nom = reser.txtNombre.getText();
        int dni = Integer.parseInt(reser.txtDNI.getText());
        String email = reser.txtEmail.getText();
        int telefono = Integer.parseInt(reser.txtTelefono.getText());
        String Fecha = ((JTextField) reser.txtFecha.getDateEditor().getUiComponent()).getText();
        int N_Mesa = Integer.parseInt(reser.txtMesa.getText());
        res.setId_Reserva(id);
        res.setNombre_cliente(nom);
        res.setDNI(dni);
        res.setEmail(email);
        res.setTelefono(telefono);
        res.setFecha_hora(Fecha);
        res.setNumero_mesa(N_Mesa);
        int re = dao.Actualizar(res);
        if (re == 1) {
            JOptionPane.showMessageDialog(reser, "Reserva Actualizada con exito");
        } else {
            JOptionPane.showMessageDialog(reser, "error");
        }

    }

    public void agregar() {
        String nom = reser.txtNombre.getText();
        int dni = Integer.parseInt(reser.txtDNI.getText());
        String email = reser.txtEmail.getText();
        int telefono = Integer.parseInt(reser.txtTelefono.getText());
        String Fecha = ((JTextField) reser.txtFecha.getDateEditor().getUiComponent()).getText();
        int N_Mesa = Integer.parseInt(reser.txtMesa.getText());
        res.setNombre_cliente(nom);
        res.setDNI(dni);
        res.setEmail(email);
        res.setTelefono(telefono);
        res.setFecha_hora(Fecha);
        res.setNumero_mesa(N_Mesa);
        int r = dao.agregar(res);
        if (r == 1) {
            JOptionPane.showMessageDialog(reser, "Reserva registrado con exito");
        } else {
            JOptionPane.showMessageDialog(reser, "Ocurrio un error");
        }

    }

    public void listar(JTable tabla) {
        modelo = (DefaultTableModel) tabla.getModel();
        List<Reservas> lista = dao.listar();

        Object[] object = new Object[7];

        for (int i = 0; i < lista.size(); i++) {
            object[0] = lista.get(i).getId_Reserva();
            object[1] = lista.get(i).getNombre_cliente();
            object[2] = lista.get(i).getDNI();
            object[3] = lista.get(i).getEmail();
            object[4] = lista.get(i).getTelefono();
            object[5] = lista.get(i).getFecha_hora();
            object[6] = lista.get(i).getNumero_mesa();
            modelo.addRow(object);
        }
        reser.Tabla1.setModel(modelo);

    }

}
