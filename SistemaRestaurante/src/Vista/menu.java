package Vista;

import Modelo.ProductoDAO;
import Modelo.Stock;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class menu extends javax.swing.JFrame {

    ordenMenu1 om = new ordenMenu1();

    ProductoDAO pdao = new ProductoDAO();
    Stock s = new Stock();

    DefaultTableModel model = new DefaultTableModel();
    String Nombre;
    int idp = 0;
    double totalFondo;//total hamburguesas
    double totalComple;
    double totalBebidas;
    double total, TotalP;
    int canT;
    double totalColum = 0;
    int qty = 0;
    double subSum1 = 0;
    double subSum2 = 0;
    double subSum3 = 0;
    double subSum4 = 0;
    double subSum5 = 0;
    double subSum6 = 0;
    double subSum7 = 0;
    double subSum8 = 0;
    double subSum9 = 0;

    public menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public double total() {
        total = totalFondo + totalComple + totalBebidas;
//        om.txtTotal.setText(String.valueOf(total));
        return total;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox2 = new javax.swing.JComboBox<>();
        cbBebidas = new javax.swing.JComboBox<>();
        cbAdicionales = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        SpinTaypa = new javax.swing.JSpinner();
        SpinChaufa = new javax.swing.JSpinner();
        SpinLomo = new javax.swing.JSpinner();
        SpinAdicionales = new javax.swing.JSpinner();
        SpinBebidas = new javax.swing.JSpinner();
        cbTaypa = new javax.swing.JCheckBox();
        cbChaufa = new javax.swing.JCheckBox();
        cbLomo1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbBebidas.setBackground(new java.awt.Color(255, 255, 255));
        cbBebidas.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        cbBebidas.setForeground(new java.awt.Color(0, 0, 0));
        cbBebidas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BEBIDAS", "Inka Kola (Personal)", "Coca Cola (Personal)", "Chicha (un vaso)", "Limonada (un vaso)" }));
        cbBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBebidasActionPerformed(evt);
            }
        });
        getContentPane().add(cbBebidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, 140, -1));

        cbAdicionales.setBackground(new java.awt.Color(255, 255, 255));
        cbAdicionales.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        cbAdicionales.setForeground(new java.awt.Color(0, 0, 0));
        cbAdicionales.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADICIONALES", "Wantanes Fritos", "Sopa Wantan" }));
        cbAdicionales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAdicionalesActionPerformed(evt);
            }
        });
        getContentPane().add(cbAdicionales, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, -1, -1));

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 150, 50));

        SpinTaypa.setEnabled(false);
        SpinTaypa.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SpinTaypaStateChanged(evt);
            }
        });
        getContentPane().add(SpinTaypa, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 50, -1));

        SpinChaufa.setEnabled(false);
        SpinChaufa.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SpinChaufaStateChanged(evt);
            }
        });
        getContentPane().add(SpinChaufa, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, 40, -1));

        SpinLomo.setEnabled(false);
        SpinLomo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SpinLomoStateChanged(evt);
            }
        });
        getContentPane().add(SpinLomo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 50, -1));

        SpinAdicionales.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SpinAdicionalesStateChanged(evt);
            }
        });
        getContentPane().add(SpinAdicionales, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, 40, -1));

        SpinBebidas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SpinBebidasStateChanged(evt);
            }
        });
        getContentPane().add(SpinBebidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, 40, -1));

        cbTaypa.setForeground(new java.awt.Color(255, 255, 255));
        cbTaypa.setText("Taypa 9S/.");
        cbTaypa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTaypaActionPerformed(evt);
            }
        });
        getContentPane().add(cbTaypa, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 90, -1));

        cbChaufa.setForeground(new java.awt.Color(255, 255, 255));
        cbChaufa.setText("Chaufa de pollo 8S/.");
        cbChaufa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbChaufaActionPerformed(evt);
            }
        });
        getContentPane().add(cbChaufa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 140, -1));

        cbLomo1.setForeground(new java.awt.Color(255, 255, 255));
        cbLomo1.setText("Lomo Saltado 10S/.");
        cbLomo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLomo1ActionPerformed(evt);
            }
        });
        getContentPane().add(cbLomo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 140, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesIconos/comidas1.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        om.txtTotal.setText(String.valueOf(total()));
//        cbLomo1.setSelected(false);
//        cbAdicionales.setEnabled(false);
//        cbChaufa.setEnabled(false);
//        cbBebidas.setEnabled(false);
//        cbTaypa.setEnabled(false);
        om.setVisible(true);
        IngresarProducto();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void SpinLomoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SpinLomoStateChanged
        if (cbLomo1.isSelected()) {
            Nombre = "Lomo Saltado";
            s = pdao.AtraparProductos(Nombre);
            double spinRate1 = s.getPrecio();
            int preQty;
            preQty = (Integer) SpinLomo.getValue();
            if (preQty > qty) {
                qty = preQty;
                subSum1 = spinRate1 * preQty;
                totalFondo = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9;

            } else if (preQty <= qty) {
                qty = preQty;
                subSum1 = spinRate1 * preQty;
                totalFondo = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9;
            }
        }
        total();
    }//GEN-LAST:event_SpinLomoStateChanged

    private void SpinTaypaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SpinTaypaStateChanged

        if (cbTaypa.isSelected()) {
            Nombre = "Taypa";
            s = pdao.AtraparProductos(Nombre);
            double spinRate1 = s.getPrecio();
            int preQt1;
            preQt1 = (Integer) SpinTaypa.getValue();
            if (preQt1 > qty) {
                qty = preQt1;
                subSum2 = spinRate1 * preQt1;
                totalFondo = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9;

            } else if (preQt1 <= qty) {
                qty = preQt1;
                subSum2 = spinRate1 * preQt1;
                totalFondo = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9;
            }
        }
        total();
    }//GEN-LAST:event_SpinTaypaStateChanged

    private void SpinChaufaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SpinChaufaStateChanged

        if (cbChaufa.isSelected()) {
            Nombre = "Chaufa de Pollo";
            s = pdao.AtraparProductos(Nombre);
            double spinRate1 = s.getPrecio();
            int preQty2;
            preQty2 = (Integer) SpinChaufa.getValue();
            if (preQty2 > qty) {
                qty = preQty2;
                subSum3 = spinRate1 * preQty2;
                totalFondo = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9;

            } else if (preQty2 <= qty) {
                qty = preQty2;
                subSum3 = spinRate1 * preQty2;
                totalFondo = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9;
            }
        }
        total();
    }//GEN-LAST:event_SpinChaufaStateChanged

    private void cbAdicionalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAdicionalesActionPerformed

    }//GEN-LAST:event_cbAdicionalesActionPerformed

    private void cbBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBebidasActionPerformed


    }//GEN-LAST:event_cbBebidasActionPerformed

    private void SpinAdicionalesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SpinAdicionalesStateChanged
        String comp;
        comp = cbAdicionales.getSelectedItem().toString();

        if (comp.compareTo("Sopa Wantan") == 0) {
            Nombre = "Sopa Wantan";
            s = pdao.AtraparProductos(Nombre);
            double spinRate1 = s.getPrecio();
            int preQty2;
            preQty2 = (Integer) SpinAdicionales.getValue();
            if (preQty2 > qty) {
                qty = preQty2;
                subSum4 = spinRate1 * preQty2;
                totalComple = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9;

            } else if (preQty2 <= qty) {
                qty = preQty2;
                subSum4 = spinRate1 * preQty2;
                totalComple = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9;
            }
        } else {
            Nombre = "Wantanes Fritos";
            s = pdao.AtraparProductos(Nombre);
            double spinRate2 = s.getPrecio();
            int preQty3;
            preQty3 = (Integer) SpinAdicionales.getValue();
            if (preQty3 > qty) {
                qty = preQty3;
                subSum5 = spinRate2 * preQty3;
                totalComple = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9;

            } else if (preQty3 <= qty) {
                qty = preQty3;
                subSum5 = spinRate2 * preQty3;
                totalComple = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9;
            }

        }
        total();
    }//GEN-LAST:event_SpinAdicionalesStateChanged

    private void SpinBebidasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SpinBebidasStateChanged
        String beb;
        beb = cbBebidas.getSelectedItem().toString();

        if (beb.compareTo("Inka Kola (Personal)") == 0) {
            Nombre = "Inka Kola (Personal)";
            s = pdao.AtraparProductos(Nombre);
            double spinRate1 = s.getPrecio();
            int preQty2;
            preQty2 = (Integer) SpinAdicionales.getValue();
            if (preQty2 > qty) {
                qty = preQty2;
                subSum6 = spinRate1 * preQty2;
                totalComple = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9;

            } else if (preQty2 <= qty) {
                qty = preQty2;
                subSum6 = spinRate1 * preQty2;
                totalComple = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9;
            }

        } else if (beb.compareTo("Coca Cola (Personal)") == 0) {
            Nombre = "Coca Cola (Personal)";
            s = pdao.AtraparProductos(Nombre);
            double spinRate1 = s.getPrecio();
            int preQty2;
            preQty2 = (Integer) SpinAdicionales.getValue();
            if (preQty2 > qty) {
                qty = preQty2;
                subSum7 = spinRate1 * preQty2;
                totalComple = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9;

            } else if (preQty2 <= qty) {
                qty = preQty2;
                subSum7 = spinRate1 * preQty2;
                totalComple = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9;
            }

        } else if (beb.compareTo("Chicha (un vaso)") == 0) {
            Nombre = "Chicha (un vaso)";
            s = pdao.AtraparProductos(Nombre);
            double spinRate1 = s.getPrecio();
            int preQty2;
            preQty2 = (Integer) SpinAdicionales.getValue();
            if (preQty2 > qty) {
                qty = preQty2;
                subSum9 = spinRate1 * preQty2;
                totalComple = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9;

            } else if (preQty2 <= qty) {
                qty = preQty2;
                subSum9 = spinRate1 * preQty2;
                totalComple = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9;
            }

        } else {
            Nombre = "Limonada (un vaso)";
            s = pdao.AtraparProductos(Nombre);
            double spinRate1 = s.getPrecio();
            int preQty2;
            preQty2 = (Integer) SpinAdicionales.getValue();
            if (preQty2 > qty) {
                qty = preQty2;
                subSum9 = spinRate1 * preQty2;
                totalComple = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9;

            } else if (preQty2 <= qty) {
                qty = preQty2;
                subSum9 = spinRate1 * preQty2;
                totalComple = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9;
            }

        }
    }//GEN-LAST:event_SpinBebidasStateChanged

    private void cbTaypaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTaypaActionPerformed
        Nombre = "Taypa";
        s = pdao.AtraparProductos(Nombre);
        double prec = s.getPrecio();
        if (cbTaypa.isSelected()) {
            SpinTaypa.setEnabled(true);
            subSum2 = subSum2 + prec;
            totalComple = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9;
        } else {
            SpinTaypa.setEnabled(false);
            SpinTaypa.setValue(1);
            subSum2 = 0;
            totalComple = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9;
        }
        total();
    }//GEN-LAST:event_cbTaypaActionPerformed

    private void cbChaufaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbChaufaActionPerformed
        Nombre = "Chaufa de Pollo";
        s = pdao.AtraparProductos(Nombre);
        double prec = s.getPrecio();
        if (cbChaufa.isSelected()) {
            SpinChaufa.setEnabled(true);
            subSum3 = subSum3 + prec;
            totalComple = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9;
        } else {
            SpinChaufa.setEnabled(false);
            SpinChaufa.setValue(1);
            subSum3 = 0;
            totalComple = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9;
        }
        total();
    }//GEN-LAST:event_cbChaufaActionPerformed

    private void cbLomo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLomo1ActionPerformed
        Nombre = "Lomo Saltado";
        s = pdao.AtraparProductos(Nombre);
        double prec = s.getPrecio();
        if (cbLomo1.isSelected()) {
            SpinLomo.setEnabled(true);
            subSum1 = subSum1 + prec;
            totalComple = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9;
        } else {
            SpinLomo.setEnabled(false);
            SpinLomo.setValue(1);
            subSum1 = 0;
            totalComple = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9;
        }
        total();
    }//GEN-LAST:event_cbLomo1ActionPerformed

    public void IngresarProducto() {

        String nomp;

        int item = 0;
        model = (DefaultTableModel) om.TablaOrden.getModel();
        item = item + 1;
        idp = s.getId_Stock();
        double precio = s.getPrecio();
        if (cbLomo1.isSelected() || cbChaufa.isSelected() || cbTaypa.isSelected()) {
            nomp = "Plato de fondo";
        } else if (cbAdicionales.getSelectedItem().toString().compareTo("Wantanes Fritos") == 0 || cbAdicionales.getSelectedItem().toString().compareTo("Sopa Wantan") == 0) {
            nomp = "Adicionales";
        } else {
            nomp = "Bebidas";
        }
        int cant1 = Integer.parseInt(SpinChaufa.getValue().toString());
        int cant2 = Integer.parseInt(SpinLomo.getValue().toString());
        int cant3 = Integer.parseInt(SpinTaypa.getValue().toString());
        int cant4 = Integer.parseInt(SpinAdicionales.getValue().toString());
        int cant5 = Integer.parseInt(SpinBebidas.getValue().toString());
        int cantidad = s.getCantidad();
        canT = cant1 + cant2 + cant3 + cant4 + cant5;
        totalColum = total();
        ArrayList list = new ArrayList();
        if (cantidad > 0) {
            list.add(item);
            list.add(idp);
            list.add(nomp);
            list.add(canT);
            list.add(precio);
            list.add(totalColum);
            Object[] ob = new Object[6];
            ob[0] = list.get(0);
            ob[1] = list.get(1);
            ob[2] = list.get(2);
            ob[3] = list.get(3);
            ob[4] = list.get(4);
            ob[5] = list.get(5);
            model.addRow(ob);
            om.TablaOrden.setModel(model);
            calculartotal();
        } else {
            JOptionPane.showMessageDialog(this, "No Ha seleccionado articulos");
            om.setVisible(false);
        }

    }

    void calculartotal() {

        TotalP = 0;
        for (int i = 0; i < om.TablaOrden.getRowCount(); i++) {
            canT=Integer.parseInt(om.TablaOrden.getValueAt(i, 3).toString());
            totalColum=Double.parseDouble(om.TablaOrden.getValueAt(i, 5).toString());
            TotalP=TotalP+(canT*totalColum);
        }
        om.txtTotal.setText(""+TotalP);
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner SpinAdicionales;
    private javax.swing.JSpinner SpinBebidas;
    private javax.swing.JSpinner SpinChaufa;
    private javax.swing.JSpinner SpinLomo;
    private javax.swing.JSpinner SpinTaypa;
    private javax.swing.JComboBox<String> cbAdicionales;
    private javax.swing.JComboBox<String> cbBebidas;
    private javax.swing.JCheckBox cbChaufa;
    private javax.swing.JCheckBox cbLomo1;
    private javax.swing.JCheckBox cbTaypa;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
