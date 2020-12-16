package Vista;

import Controlador.ControladorMozo;
import Modelo.Mozo;
import Modelo.MozoDao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Renzo
 */
public class ordenMenu1 extends javax.swing.JFrame {

    MozoDao mdao = new MozoDao();
    DefaultTableModel model = new DefaultTableModel();
//    ordenMenu1 om=new ordenMenu1();

    public ordenMenu1() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMozo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaOrden = new javax.swing.JTable();
        txtMesa = new javax.swing.JTextField();
        txtNombre_mozo = new javax.swing.JTextField();
        txtId_Mozo = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnGenerarFactura = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMozo.setBackground(new java.awt.Color(255, 51, 51));
        btnMozo.setForeground(new java.awt.Color(255, 255, 255));
        btnMozo.setText("Añadir");
        btnMozo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMozoActionPerformed(evt);
            }
        });
        getContentPane().add(btnMozo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, -1, -1));

        btnEliminar.setBackground(new java.awt.Color(255, 51, 51));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ORDEN MENÚ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesIconos/dragon.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, -1, -1));

        TablaOrden.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nro", "Cod. Producto", "Nombre Producto", "Cantidad", "Precio Uni.", "Total"
            }
        ));
        jScrollPane1.setViewportView(TablaOrden);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 450, 130));
        getContentPane().add(txtMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 90, -1));

        txtNombre_mozo.setEditable(false);
        getContentPane().add(txtNombre_mozo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 90, -1));
        getContentPane().add(txtId_Mozo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 90, -1));
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 90, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("N de mesa:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 325, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre del Moso:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cod. Mozo:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 325, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Total:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, -1, -1));

        btnGenerarFactura.setForeground(new java.awt.Color(0, 0, 0));
        btnGenerarFactura.setText("Generar Factura");
        btnGenerarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarFacturaActionPerformed(evt);
            }
        });
        getContentPane().add(btnGenerarFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 125, -1));

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesIconos/atras.png"))); // NOI18N
        btnClose.setFocusPainted(false);
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesIconos/ordenmenu.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 490, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        opciones o = new opciones();
        o.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnMozoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMozoActionPerformed
        buscarMozo();

    }//GEN-LAST:event_btnMozoActionPerformed

    private void btnGenerarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarFacturaActionPerformed
        Factura f = new Factura();
        ordenMenu1 om = new ordenMenu1();
        f.txtTotal.setText(String.valueOf(om.txtTotal));
        f.txtMesa.setText(String.valueOf(om.txtMesa));
        f.txtMozo.setText(String.valueOf(om.txtNombre_mozo));
        GenerarFactura();
    }//GEN-LAST:event_btnGenerarFacturaActionPerformed

    public void GenerarFactura() {
        Factura f = new Factura();
        double total = 0;
        int item;
        model = (DefaultTableModel) f.TablaFactura.getModel();
        for (int i = 0; i < TablaOrden.getRowCount(); i++) {
            item = Integer.parseInt((String) TablaOrden.getValueAt(i, 1));
            int idp = Integer.parseInt((String) TablaOrden.getValueAt(i, 2));
            String nomp = (String) TablaOrden.getValueAt(i, 3);
            int cant = Integer.parseInt((String) TablaOrden.getValueAt(i, 4));
            double precio = Integer.parseInt((String) TablaOrden.getValueAt(i, 5));
            total = Integer.parseInt((String) TablaOrden.getValueAt(i, 6));
            ArrayList list = new ArrayList();
            list.add(item);
            list.add(idp);
            list.add(nomp);
            list.add(cant);
            list.add(precio);
            list.add(total);
            Object[] ob = new Object[6];
            ob[0] = list.get(0);
            ob[1] = list.get(1);
            ob[2] = list.get(2);
            ob[3] = list.get(3);
            ob[4] = list.get(4);
            ob[5] = list.get(5);
            model.addRow(ob);

        }
        f.TablaFactura.setModel(model);
    }

    void buscarMozo() {
        int r;
        String cod = txtId_Mozo.getText();
        if (txtId_Mozo.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe de ingresar un codigo de mozo");
        } else {
            Mozo mozo = mdao.listarID(cod);
            if (mozo.getDNI() != null) {
                txtNombre_mozo.setText(mozo.getNombre_Apellido());
                txtMesa.requestFocus();

            } else {
                r = JOptionPane.showConfirmDialog(this, "Usuario no registrado, Desea Registrarlo?");
                if (r == 0) {
                    MantMoso m = new MantMoso();
                    ControladorMozo cm = new ControladorMozo(m);
                    m.setVisible(true);
                } else {
                }
            }

        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ordenMenu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ordenMenu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ordenMenu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ordenMenu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ordenMenu1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable TablaOrden;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGenerarFactura;
    public javax.swing.JButton btnMozo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtId_Mozo;
    public javax.swing.JTextField txtMesa;
    public javax.swing.JTextField txtNombre_mozo;
    public javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
