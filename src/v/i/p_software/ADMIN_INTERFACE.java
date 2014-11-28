/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package v.i.p_software;

import java.awt.Toolkit;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.Scanner;
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author chokayg3
 */
public class ADMIN_INTERFACE extends javax.swing.JFrame {
    public static DefaultTableModel table_model;
    private final JFileChooser filechooser;
     private final Vector vector;
     RouteTable tab;
     PrintWriter print;
     Scanner input;
     Connection connection;
     Admin_Controller admincontrol = new Admin_Controller();
     TableRowSorter <TableModel> rowSorter;

    /**
     * Creates new form ADMIN_INTERFACE
     */
    public ADMIN_INTERFACE() {
        tab = new RouteTable();
        vector = new Vector ();
        vector.add("TICKET NUMBER");
        vector.add("FIRSTNAME");
        vector.add("SURNAME");
        vector.add("PHONE");
        vector.add("EMAIL");
        vector.add("GENDER");
        vector.add("TRAVEL");
        vector.add("Departure");
        vector.add("PRICE");
        vector.add("TRAVEL DATE");
        vector.add("AGE");
        table_model = new DefaultTableModel (new Vector(), vector);
        filechooser = new JFileChooser();
        initComponents();
        
        rowSorter = new TableRowSorter<>(admin_table.getModel());
        admin_table.setRowSorter( rowSorter);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        admin_table = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        addrow_icon = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        deleterow_icon = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        import_icon = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        export_icon = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        connect_icon = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        delete_icon = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        display_icon = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        jLabel7 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        search_field = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
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
        update_menuitem = new javax.swing.JMenuItem();
        insert_menuItem = new javax.swing.JMenuItem();
        delete_menuitem = new javax.swing.JMenuItem();
        display_menuitem = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        keyboard_menuitem = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        about_menuitem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADMINISTRATOR");
        setIconImage(Toolkit.getDefaultToolkit ( ).getImage(getClass().getResource("vip-48.png")));

        admin_table.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        admin_table.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        admin_table.setModel(table_model);
        admin_table.setRowHeight(30);
        jScrollPane1.setViewportView(admin_table);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1234, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jToolBar1.setRollover(true);

        addrow_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/i/p_software/Add_Row-26.png"))); // NOI18N
        addrow_icon.setToolTipText("Add Row");
        addrow_icon.setFocusable(false);
        addrow_icon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addrow_icon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addrow_icon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addrow_iconActionPerformed(evt);
            }
        });
        jToolBar1.add(addrow_icon);

        jLabel1.setText("      ");
        jToolBar1.add(jLabel1);

        deleterow_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/i/p_software/Delete_Row-26.png"))); // NOI18N
        deleterow_icon.setToolTipText("Delete Row");
        deleterow_icon.setFocusable(false);
        deleterow_icon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deleterow_icon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        deleterow_icon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleterow_iconActionPerformed(evt);
            }
        });
        jToolBar1.add(deleterow_icon);
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

        import_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/i/p_software/import-26.png"))); // NOI18N
        import_icon.setToolTipText("Import");
        import_icon.setFocusable(false);
        import_icon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        import_icon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        import_icon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                import_iconActionPerformed(evt);
            }
        });
        jToolBar1.add(import_icon);

        jLabel3.setText("      ");
        jToolBar1.add(jLabel3);

        export_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/i/p_software/export-26.png"))); // NOI18N
        export_icon.setToolTipText("Export");
        export_icon.setFocusable(false);
        export_icon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        export_icon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        export_icon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                export_iconActionPerformed(evt);
            }
        });
        jToolBar1.add(export_icon);
        jToolBar1.add(jSeparator3);

        connect_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/i/p_software/accept_database-26.png"))); // NOI18N
        connect_icon.setToolTipText("Connect To Database");
        connect_icon.setFocusable(false);
        connect_icon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        connect_icon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        connect_icon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connect_iconActionPerformed(evt);
            }
        });
        jToolBar1.add(connect_icon);

        jLabel4.setText("   ");
        jToolBar1.add(jLabel4);

        delete_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/i/p_software/delete_database-26.png"))); // NOI18N
        delete_icon.setToolTipText("Delete From Database");
        delete_icon.setFocusable(false);
        delete_icon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        delete_icon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        delete_icon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_iconActionPerformed(evt);
            }
        });
        jToolBar1.add(delete_icon);

        jLabel5.setText("   ");
        jToolBar1.add(jLabel5);

        display_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/i/p_software/data_backup-26.png"))); // NOI18N
        display_icon.setToolTipText("Display Database");
        display_icon.setFocusable(false);
        display_icon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        display_icon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        display_icon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                display_iconActionPerformed(evt);
            }
        });
        jToolBar1.add(display_icon);
        jToolBar1.add(jSeparator5);

        jLabel7.setText("                                                                                                                                                                                                                                   ");
        jLabel7.setToolTipText("");
        jToolBar1.add(jLabel7);

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/i/p_software/search-26.png"))); // NOI18N
        jButton10.setFocusable(false);
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton10);

        search_field.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        search_field.setText("search");
        search_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_fieldActionPerformed(evt);
            }
        });
        jToolBar1.add(search_field);
        jToolBar1.add(jSeparator4);

        jMenu1.setMnemonic('F');
        jMenu1.setText("File");

        export_menuitem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        export_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/i/p_software/export-26.png"))); // NOI18N
        export_menuitem.setText("Export");
        export_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                export_menuitemActionPerformed(evt);
            }
        });
        jMenu1.add(export_menuitem);

        import_menuitem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        import_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/i/p_software/import-26.png"))); // NOI18N
        import_menuitem.setText("Import");
        import_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                import_menuitemActionPerformed(evt);
            }
        });
        jMenu1.add(import_menuitem);

        jMenuBar1.add(jMenu1);

        jMenu2.setMnemonic('E');
        jMenu2.setText("Edit");

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/i/p_software/plus-26.png"))); // NOI18N
        jMenu3.setText("Add");

        addrow_menuitem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        addrow_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/i/p_software/Add_Row-26.png"))); // NOI18N
        addrow_menuitem.setText("Row");
        addrow_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addrow_menuitemActionPerformed(evt);
            }
        });
        jMenu3.add(addrow_menuitem);

        jMenu2.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/i/p_software/delete-26.png"))); // NOI18N
        jMenu4.setText("Delete");

        deleterow_menuitem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        deleterow_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/i/p_software/Delete_Row-26.png"))); // NOI18N
        deleterow_menuitem.setText("Row");
        deleterow_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleterow_menuitemActionPerformed(evt);
            }
        });
        jMenu4.add(deleterow_menuitem);

        jMenu2.add(jMenu4);

        clear_menuitem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        clear_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/i/p_software/erase-26.png"))); // NOI18N
        clear_menuitem.setText("Clear");
        clear_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_menuitemActionPerformed(evt);
            }
        });
        jMenu2.add(clear_menuitem);

        jMenuBar1.add(jMenu2);

        jMenu5.setMnemonic('L');
        jMenu5.setText("Link");

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/i/p_software/database-26.png"))); // NOI18N
        jMenu6.setText("Connect");

        connectdatabase_menuitem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        connectdatabase_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/i/p_software/accept_database-26.png"))); // NOI18N
        connectdatabase_menuitem.setText("Database");
        connectdatabase_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectdatabase_menuitemActionPerformed(evt);
            }
        });
        jMenu6.add(connectdatabase_menuitem);

        jMenu5.add(jMenu6);

        update_menuitem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        update_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/i/p_software/data_protection-26.png"))); // NOI18N
        update_menuitem.setText("Update");
        update_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_menuitemActionPerformed(evt);
            }
        });
        jMenu5.add(update_menuitem);

        insert_menuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        insert_menuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/i/p_software/data_configuration-26.png"))); // NOI18N
        insert_menuItem.setText("Insert");
        insert_menuItem.setToolTipText("");
        insert_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_menuItemActionPerformed(evt);
            }
        });
        jMenu5.add(insert_menuItem);

        delete_menuitem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        delete_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/i/p_software/delete_database-26.png"))); // NOI18N
        delete_menuitem.setText("Delete");
        delete_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_menuitemActionPerformed(evt);
            }
        });
        jMenu5.add(delete_menuitem);

        display_menuitem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        display_menuitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/i/p_software/data_backup-26.png"))); // NOI18N
        display_menuitem.setText("Display");
        display_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                display_menuitemActionPerformed(evt);
            }
        });
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void about_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_about_menuitemActionPerformed
        // TODO add your handling code here:
        new About_Software().setVisible(true);
    }//GEN-LAST:event_about_menuitemActionPerformed

    private void export_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_export_menuitemActionPerformed
        save();
    }//GEN-LAST:event_export_menuitemActionPerformed

    private void import_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_import_menuitemActionPerformed
       open();
    }//GEN-LAST:event_import_menuitemActionPerformed

    private void addrow_iconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addrow_iconActionPerformed
        admincontrol.addRow();
    }//GEN-LAST:event_addrow_iconActionPerformed

    private void display_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_display_menuitemActionPerformed
        // TODO add your handling code here:
        admincontrol.display();
    }//GEN-LAST:event_display_menuitemActionPerformed

    private void connect_iconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connect_iconActionPerformed
        // TODO add your handling code here:
        admincontrol.initialize();
    }//GEN-LAST:event_connect_iconActionPerformed

    private void delete_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_menuitemActionPerformed
        // TODO add your handling code here:
        admincontrol.delete();
    }//GEN-LAST:event_delete_menuitemActionPerformed

    private void deleterow_iconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleterow_iconActionPerformed
        // TODO add your handling code here:
        admincontrol.deleteRow();
    }//GEN-LAST:event_deleterow_iconActionPerformed

    private void import_iconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_import_iconActionPerformed
        // TODO add your handling code here:
        open();
    }//GEN-LAST:event_import_iconActionPerformed

    private void export_iconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_export_iconActionPerformed
        // TODO add your handling code here:
        save();
    }//GEN-LAST:event_export_iconActionPerformed

    private void update_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_menuitemActionPerformed
        // TODO add your handling code here:
        admincontrol.update();
    }//GEN-LAST:event_update_menuitemActionPerformed

    private void addrow_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addrow_menuitemActionPerformed
        admincontrol.addRow();
    }//GEN-LAST:event_addrow_menuitemActionPerformed

    private void deleterow_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleterow_menuitemActionPerformed
        // TODO add your handling code here:
        admincontrol.deleteRow();
    }//GEN-LAST:event_deleterow_menuitemActionPerformed

    private void clear_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_menuitemActionPerformed
        // TODO add your handling code here:
        admincontrol.clearTable();
    }//GEN-LAST:event_clear_menuitemActionPerformed

    private void connectdatabase_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectdatabase_menuitemActionPerformed
        admincontrol.initialize();
    }//GEN-LAST:event_connectdatabase_menuitemActionPerformed

    private void search_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_fieldActionPerformed
        // TODO add your handling code here:
//        admincontrol.search();
        if ( search_field.getText().trim().length() == 0 )
           rowSorter.setRowFilter( null );
        else
         rowSorter.setRowFilter ( RowFilter.regexFilter ( search_field.getText( ) ) );
    }//GEN-LAST:event_search_fieldActionPerformed

    private void insert_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_menuItemActionPerformed
        // TODO add your handling code here:
        admincontrol.insert();
    }//GEN-LAST:event_insert_menuItemActionPerformed

    private void delete_iconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_iconActionPerformed
        // TODO add your handling code here:
        admincontrol.delete();
    }//GEN-LAST:event_delete_iconActionPerformed

    private void display_iconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_display_iconActionPerformed
        // TODO add your handling code here:
        admincontrol.display();
    }//GEN-LAST:event_display_iconActionPerformed

    
    /**
     * A method to display the open filechooser dialog
     */
    public void open ( )
    {
        if ( filechooser.showOpenDialog ( this ) == JFileChooser.APPROVE_OPTION )
            admincontrol.open ( filechooser.getSelectedFile ( ) );
    }//End Of Method
    
    
    /**
     * A method to display the save filechooser dialog
     */
    private void save ( )
    {
        if ( filechooser.showSaveDialog ( this ) == JFileChooser.APPROVE_OPTION )
            admincontrol.save ( filechooser.getSelectedFile ( ) );
    }//End Of Method
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem about_menuitem;
    private javax.swing.JButton addrow_icon;
    private javax.swing.JMenuItem addrow_menuitem;
    public static javax.swing.JTable admin_table;
    private javax.swing.JMenuItem clear_menuitem;
    private javax.swing.JButton connect_icon;
    private javax.swing.JMenuItem connectdatabase_menuitem;
    private javax.swing.JButton delete_icon;
    private javax.swing.JMenuItem delete_menuitem;
    private javax.swing.JButton deleterow_icon;
    private javax.swing.JMenuItem deleterow_menuitem;
    private javax.swing.JButton display_icon;
    private javax.swing.JMenuItem display_menuitem;
    private javax.swing.JButton export_icon;
    private javax.swing.JMenuItem export_menuitem;
    private javax.swing.JButton import_icon;
    private javax.swing.JMenuItem import_menuitem;
    private javax.swing.JMenuItem insert_menuItem;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem keyboard_menuitem;
    public static javax.swing.JTextField search_field;
    private javax.swing.JMenuItem update_menuitem;
    // End of variables declaration//GEN-END:variables
}
