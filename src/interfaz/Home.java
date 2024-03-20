/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author camilafermosoiglesias
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        this.setVisible(true);
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
        buscarcliente = new javax.swing.JButton();
        buscarreserva = new javax.swing.JButton();
        historialhabitacion = new javax.swing.JButton();
        checkin = new javax.swing.JButton();
        checkout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        buscarcliente.setBackground(null);
        buscarcliente.setForeground(null);
        buscarcliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscarcliente.png"))); // NOI18N
        buscarcliente.setBorder(null);
        buscarcliente.setBorderPainted(false);
        buscarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarclienteActionPerformed(evt);
            }
        });
        getContentPane().add(buscarcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, -1, -1));

        buscarreserva.setBackground(null);
        buscarreserva.setForeground(null);
        buscarreserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscarreservacion.png"))); // NOI18N
        buscarreserva.setBorder(null);
        buscarreserva.setBorderPainted(false);
        buscarreserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarreservaActionPerformed(evt);
            }
        });
        buscarreserva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buscarreservaKeyTyped(evt);
            }
        });
        getContentPane().add(buscarreserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, -1, -1));

        historialhabitacion.setBackground(null);
        historialhabitacion.setForeground(null);
        historialhabitacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/historialhabitacion.png"))); // NOI18N
        historialhabitacion.setBorder(null);
        historialhabitacion.setBorderPainted(false);
        historialhabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historialhabitacionActionPerformed(evt);
            }
        });
        getContentPane().add(historialhabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, -1, 110));

        checkin.setBackground(null);
        checkin.setForeground(null);
        checkin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/checkin.png"))); // NOI18N
        checkin.setBorder(null);
        checkin.setBorderPainted(false);
        checkin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkinActionPerformed(evt);
            }
        });
        getContentPane().add(checkin, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, -1, -1));

        checkout.setBackground(null);
        checkout.setForeground(null);
        checkout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/checkout.png"))); // NOI18N
        checkout.setBorder(null);
        checkout.setBorderPainted(false);
        checkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutActionPerformed(evt);
            }
        });
        getContentPane().add(checkout, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/t1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 150, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/t2.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 150, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/t3.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 160, 60));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/t4.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 140, 60));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/t5.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 460, 150, 80));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guestlink.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/background.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarclienteActionPerformed
        // Permite que el usuario ingrese el primer y segundo nombre, convirtiendolos en un string
        String primer_nombre = JOptionPane.showInputDialog(this, "Ingrese el primer nombre");
        String segundo_nombre = JOptionPane.showInputDialog(this, "Ingrese el segundo nombre");
        
        // Buscar la reservacion usando el primer y segundo nombre
        
        // 
    }//GEN-LAST:event_buscarclienteActionPerformed

    private void buscarreservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarreservaActionPerformed
        // Ingresar la cedula
        String cedulaString = JOptionPane.showInputDialog(this, "Ingrese la cedula del cliente");
        
        // Convertir la cedula de string a int, validando que sea numerica
        int cedula;
        try {
            cedula = Integer.parseInt(cedulaString);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "La cedula solo puede contener numeros");
            return;
        }
        
        // Buscar la reservacion usando la cedula
        // Reservacion reserva = buscar reserva por cedula(cedula);
                
        // Mostrar reserva encontrada
        /*
        if (reserva == null){
            // Si no se encuentra ninguna reserva para la cedula
            JOptionPane.showMessageDialog(this, "No se encontraron reservas para esa cedula");
        } else {
            // Mostrar las reservas encontradas
            String display = "Reservas encontradas: \n";
            for (Reserva r : reserva){
                mensaje += r.getCi + "\n"
            }
            JOptionPane.showMessageDialog(this, display);
        }
        */
    }//GEN-LAST:event_buscarreservaActionPerformed

    private void historialhabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historialhabitacionActionPerformed
        // Ingresar numero de habitacion
        String num_habString = JOptionPane.showInputDialog(this, "Ingrese el numero de habitacion");
        
        // Convertir el numero de habitacion de string a int, validando que sea numerica
        int num_hab;
        try {
            num_hab = Integer.parseInt(num_habString);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "El numero de habitacion debe ser numerico");
            return;
        }
    }//GEN-LAST:event_historialhabitacionActionPerformed

    private void checkinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkinActionPerformed
        // Ingresar la cedula
        String cedulaString = JOptionPane.showInputDialog(this, "Ingrese la cedula del cliente");
        
        // Convertir la cedula de string a int, validando que sea numerica
        int cedula;
        try {
            cedula = Integer.parseInt(cedulaString);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "La cedula solo puede contener numeros");
            return;
        }
        
        // Se le asigna una habitacion 
        
    }//GEN-LAST:event_checkinActionPerformed

    private void checkoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutActionPerformed
        // Ingresar la cedula
        String cedulaString = JOptionPane.showInputDialog(this, "Ingrese la cedula del cliente");
        
        // Convertir la cedula de string a int, validando que sea numerica
        int cedula;
        try {
            cedula = Integer.parseInt(cedulaString);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "La cedula solo puede contener numeros");
            return;
        }
    }//GEN-LAST:event_checkoutActionPerformed

    private void buscarreservaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarreservaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarreservaKeyTyped

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarcliente;
    private javax.swing.JButton buscarreserva;
    private javax.swing.JButton checkin;
    private javax.swing.JButton checkout;
    private javax.swing.JButton historialhabitacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
