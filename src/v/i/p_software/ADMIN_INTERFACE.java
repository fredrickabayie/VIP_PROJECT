/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package v.i.p_software;

import java.awt.Color;

/**
 *
 * @author chokayg3
 */
public class ADMIN_INTERFACE extends javax.swing.JFrame {

    /**
     * Creates new form ADMIN_INTERFACE
     */
    public ADMIN_INTERFACE() {
//        this.getContentPane().setBackground(Color.green);
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jButton7 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        jLabel7 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jButton10 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        new_menuitem = new javax.swing.JMenuItem();
        export_menuitem = new javax.swing.JMenuItem();
        import_menuitem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        addrow_menuitem = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        deleterow_menuitem = new javax.swing.JMenuItem();
        clear_menuitem = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        connectdatabase_menuitem = new javax.swing.JMenuItem();
        connecttable_menuitem = new javax.swing.JMenuItem();
        update_menuitem = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        delete_menuitem = new javax.swing.JMenuItem();
        display_menuitem = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        keyboard_menuitem = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        about_menuitem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADMINISTRATOR");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1234, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );

        jToolBar1.setRollover(true);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/i/p_software/Add_Row-26.png"))); // NOI18N
        jButton1.setToolTipText("Add Row");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton1);

        jLabel1.setText("      ");
        jToolBar1.add(jLabel1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/i/p_software/Delete_Row-26.png"))); // NOI18N
        jButton2.setToolTipText("Delete Row");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton2);
        jToolBar1.add(jSeparator1);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/i/p_software/undo-26.png"))); // NOI18N
        jButton4.setToolTipText("Undo");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton4);

        jLabel2.setText("      ");
        jToolBar1.add(jLabel2);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/i/p_software/redo-26.png"))); // NOI18N
        jButton3.setToolTipText("Redo");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton3);
        jToolBar1.add(jSeparator2);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/i/p_software/import-26.png"))); // NOI18N
        jButton5.setToolTipText("Import");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton5);

        jLabel3.setText("      ");
        jToolBar1.add(jLabel3);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/i/p_software/export-26.png"))); // NOI18N
        jButton6.setToolTipText("Export");
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton6);
        jToolBar1.add(jSeparator3);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/i/p_software/accept_database-26.png"))); // NOI18N
        jButton7.setToolTipText("Connect To Database");
        jButton7.setFocusable(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton7);

        jLabel4.setText("   ");
        jToolBar1.add(jLabel4);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/i/p_software/delete_database-26.png"))); // NOI18N
        jButton8.setToolTipText("Delete From Database");
        jButton8.setFocusable(false);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton8);

        jLabel5.setText("   ");
        jToolBar1.add(jLabel5);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/i/p_software/data_backup-26.png"))); // NOI18N
        jButton9.setToolTipText("Update Database");
        jButton9.setFocusable(false);
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton9);
        jToolBar1.add(jSeparator5);

        jLabel7.setText("                                                                                                                                                                                                    ");
        jLabel7.setToolTipText("");
        jToolBar1.add(jLabel7);
        jToolBar1.add(jSeparator4);

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/i/p_software/search-26.png"))); // NOI18N
        jButton10.setFocusable(false);
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton10);
        jToolBar1.add(jTextField1);

        jLabel6.setFont(new java.awt.Font("Khmer UI", 1, 48)); // NOI18N
        jLabel6.setText("    WELCOME TO V I P ADMINISTRATOR INTERFACE");

        jMenu1.setMnemonic('F');
        jMenu1.setText("File");

        new_menuitem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        new_menuitem.setText("New");
        jMenu1.add(new_menuitem);

        export_menuitem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        export_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/i/p_software/export-26.png"))); // NOI18N
        export_menuitem.setText("Export");
        jMenu1.add(export_menuitem);

        import_menuitem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        import_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/i/p_software/import-26.png"))); // NOI18N
        import_menuitem.setText("Import");
        jMenu1.add(import_menuitem);

        jMenuBar1.add(jMenu1);

        jMenu2.setMnemonic('E');
        jMenu2.setText("Edit");

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/i/p_software/plus-26.png"))); // NOI18N
        jMenu3.setText("Add");

        addrow_menuitem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        addrow_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/i/p_software/Add_Row-26.png"))); // NOI18N
        addrow_menuitem.setText("Row");
        jMenu3.add(addrow_menuitem);

        jMenu2.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/i/p_software/delete-26.png"))); // NOI18N
        jMenu4.setText("Delete");

        deleterow_menuitem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        deleterow_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/i/p_software/Delete_Row-26.png"))); // NOI18N
        deleterow_menuitem.setText("Row");
        jMenu4.add(deleterow_menuitem);

        jMenu2.add(jMenu4);

        clear_menuitem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        clear_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/i/p_software/erase-26.png"))); // NOI18N
        clear_menuitem.setText("Clear");
        jMenu2.add(clear_menuitem);

        jMenuBar1.add(jMenu2);

        jMenu5.setMnemonic('L');
        jMenu5.setText("Link");

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/i/p_software/database-26.png"))); // NOI18N
        jMenu6.setText("Connect");

        connectdatabase_menuitem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        connectdatabase_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/i/p_software/accept_database-26.png"))); // NOI18N
        connectdatabase_menuitem.setText("Database");
        jMenu6.add(connectdatabase_menuitem);

        connecttable_menuitem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        connecttable_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/i/p_software/grid-26.png"))); // NOI18N
        connecttable_menuitem.setText("Table");
        jMenu6.add(connecttable_menuitem);

        jMenu5.add(jMenu6);

        update_menuitem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        update_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/i/p_software/data_protection-26.png"))); // NOI18N
        update_menuitem.setText("Update");
        jMenu5.add(update_menuitem);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/i/p_software/data_configuration-26.png"))); // NOI18N
        jMenuItem1.setText("Insert");
        jMenuItem1.setToolTipText("");
        jMenu5.add(jMenuItem1);

        delete_menuitem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        delete_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/i/p_software/delete_database-26.png"))); // NOI18N
        delete_menuitem.setText("Delete");
        jMenu5.add(delete_menuitem);

        display_menuitem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        display_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/i/p_software/data_backup-26.png"))); // NOI18N
        display_menuitem.setText("Display");
        jMenu5.add(display_menuitem);

        jMenuBar1.add(jMenu5);

        jMenu7.setMnemonic('A');
        jMenu7.setText("About");

        keyboard_menuitem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        keyboard_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/i/p_software/keyboard-26.png"))); // NOI18N
        keyboard_menuitem.setText("Keyboard Short");
        jMenu7.add(keyboard_menuitem);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("How To Use");
        jMenu7.add(jMenuItem2);

        about_menuitem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        about_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/i/p_software/about-26.png"))); // NOI18N
        about_menuitem.setText("About Software");
        about_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                about_menuitemActionPerformed(evt);
            }
        });
        jMenu7.add(about_menuitem);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
            .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(179, 179, 179)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(272, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void about_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_about_menuitemActionPerformed
        // TODO add your handling code here:
        new About_Software().setVisible(true);
    }//GEN-LAST:event_about_menuitemActionPerformed

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
            java.util.logging.Logger.getLogger(ADMIN_INTERFACE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ADMIN_INTERFACE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ADMIN_INTERFACE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ADMIN_INTERFACE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ADMIN_INTERFACE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem about_menuitem;
    private javax.swing.JMenuItem addrow_menuitem;
    private javax.swing.JMenuItem clear_menuitem;
    private javax.swing.JMenuItem connectdatabase_menuitem;
    private javax.swing.JMenuItem connecttable_menuitem;
    private javax.swing.JMenuItem delete_menuitem;
    private javax.swing.JMenuItem deleterow_menuitem;
    private javax.swing.JMenuItem display_menuitem;
    private javax.swing.JMenuItem export_menuitem;
    private javax.swing.JMenuItem import_menuitem;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem keyboard_menuitem;
    private javax.swing.JMenuItem new_menuitem;
    private javax.swing.JMenuItem update_menuitem;
    // End of variables declaration//GEN-END:variables
}
