/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package v.i.p_software;

import java.awt.Color;
import java.awt.Toolkit;

/**
 *
 * @author chokayg3
 */
public class WELCOME_INTERFACE extends javax.swing.JFrame {

    /**
     * Creates new form WELCOME_INTERFACE
     */
    public WELCOME_INTERFACE() {
        this.getContentPane().setBackground(Color.darkGray);
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        newbooking_button = new javax.swing.JButton();
        admin_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WELCOME");
        setIconImage(Toolkit.getDefaultToolkit ( ).getImage(getClass().getResource("vip-48.png")));
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\fred\\Desktop\\VIP_PROJECT\\VIP_PROJECT\\src\\v\\i\\p_software\\vipwelcome.png")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-10, 0, 700, 380);

        newbooking_button.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        newbooking_button.setIcon(new javax.swing.ImageIcon("C:\\Users\\fred\\Pictures\\add_user-48.png")); // NOI18N
        newbooking_button.setMnemonic('N');
        newbooking_button.setText("New Booking");
        newbooking_button.setToolTipText("Create a new booking by entering your details");
        newbooking_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        newbooking_button.setRolloverEnabled(true);
        newbooking_button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        newbooking_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newbooking_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(newbooking_button);
        newbooking_button.setBounds(70, 150, 110, 80);

        admin_button.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        admin_button.setIcon(new javax.swing.ImageIcon("C:\\Users\\fred\\Pictures\\administrator2-48.png")); // NOI18N
        admin_button.setMnemonic('A');
        admin_button.setText("Administrator");
        admin_button.setToolTipText("Restricted to only admin only");
        admin_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        admin_button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        admin_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(admin_button);
        admin_button.setBounds(500, 150, 118, 80);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void newbooking_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newbooking_buttonActionPerformed
        // TODO add your handling code here:
        new BOOKING_VIEW().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_newbooking_buttonActionPerformed

    private void admin_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_buttonActionPerformed
        // TODO add your handling code here:
        new ADMIN_LOGIN().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_admin_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(WELCOME_INTERFACE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WELCOME_INTERFACE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WELCOME_INTERFACE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WELCOME_INTERFACE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new WELCOME_INTERFACE().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admin_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton newbooking_button;
    // End of variables declaration//GEN-END:variables
}
