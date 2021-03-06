
package Vista;

import Controlador.ControladorReservas;
import Controlador.ControladorP;
import Modelo.Sqlusuarios;
import Modelo.usuarios;


public class opciones extends javax.swing.JFrame {

    public opciones() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnReserva = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        btnPedido = new javax.swing.JButton();
        btnFactura = new javax.swing.JButton();
        btnFinanzas = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNivel = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesIconos/reserva1.png"))); // NOI18N
        btnReserva.setBorderPainted(false);
        btnReserva.setContentAreaFilled(false);
        btnReserva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservaActionPerformed(evt);
            }
        });
        jPanel1.add(btnReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 150));

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesIconos/menu1.png"))); // NOI18N
        btnMenu.setBorderPainted(false);
        btnMenu.setContentAreaFilled(false);
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 140, 150));

        btnPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesIconos/pedido2.png"))); // NOI18N
        btnPedido.setBorderPainted(false);
        btnPedido.setContentAreaFilled(false);
        btnPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidoActionPerformed(evt);
            }
        });
        jPanel1.add(btnPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 150, 140));

        btnFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesIconos/factura.png"))); // NOI18N
        btnFactura.setBorderPainted(false);
        btnFactura.setContentAreaFilled(false);
        btnFactura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturaActionPerformed(evt);
            }
        });
        jPanel1.add(btnFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 140, 150));

        btnFinanzas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesIconos/estadistica2.png"))); // NOI18N
        btnFinanzas.setBorderPainted(false);
        btnFinanzas.setContentAreaFilled(false);
        btnFinanzas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinanzas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinanzasActionPerformed(evt);
            }
        });
        jPanel1.add(btnFinanzas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 140, 140));

        jButton5.setText("Mantenimiento");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 120, -1));

        jButton6.setText("SALIR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 80, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesIconos/opciones.jpeg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 430));

        txtNivel.setEditable(false);
        txtNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNivelActionPerformed(evt);
            }
        });
        jPanel1.add(txtNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 80, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservaActionPerformed
        Reserva r = new Reserva();
        ControladorReservas c = new ControladorReservas(r);
        r.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnReservaActionPerformed

    private void btnFinanzasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinanzasActionPerformed
       estadisticas e=new estadisticas();
       e.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnFinanzasActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        menu m = new menu();

        m.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidoActionPerformed
        Ganancias g = new Ganancias();
        ControladorP cp = new ControladorP(g);
        g.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPedidoActionPerformed

    private void btnFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturaActionPerformed
        Factura f = new Factura();
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnFacturaActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        OpcionesMantenimiento om=new OpcionesMantenimiento();
        om.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txtNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNivelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new opciones().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFactura;
    private javax.swing.JButton btnFinanzas;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnPedido;
    private javax.swing.JButton btnReserva;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField txtNivel;
    // End of variables declaration//GEN-END:variables
}
