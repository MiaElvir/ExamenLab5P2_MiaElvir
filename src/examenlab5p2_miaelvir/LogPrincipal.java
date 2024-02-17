
package examenlab5p2_miaelvir;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class LogPrincipal extends javax.swing.JFrame {

    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
    static ArrayList<Usuario> usuarios = new ArrayList<>(); 
    
    
    
    public LogPrincipal() {
        initComponents();
        usuarios.add(new Empleado("Gastro", "chef", "22", "Mario", "Vallejo",
            "papas", "Masculino", "Francscio Morazan", new Date("02/03/2006"))); 
        usuarios.add(new Civil("Mauri", "Pardo", "salsa", "femenino", "Cortes", new Date("12/01/1996"))); 
        usuarios.add(new Empleado("Ingeniero", "programador", "19", "Emilio", "Cantarero", 
            "pato", "Masculino", "Comayagua", new Date("15/06/2004"))); 
        llenarTabla();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEmpleado = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        tabCiviles = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaInfoCiviles = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaTramites1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        comboBox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        modContra = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        modApellido = new javax.swing.JTextField();
        modNombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        modSexo = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        modDepa = new javax.swing.JComboBox<>();
        modFecha = new com.toedter.calendar.JDateChooser();
        modBoton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cerrarSesion = new javax.swing.JButton();
        NomUser = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Entradacontra = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        entradaNombre = new javax.swing.JTextField();
        BotonIngresar = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        tabCiviles.setBackground(new java.awt.Color(255, 255, 255));
        tabCiviles.setForeground(new java.awt.Color(0, 0, 0));
        tabCiviles.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabCivilesStateChanged(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Informacion de los civiles: ");

        TablaInfoCiviles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre Completo", "No. de identidad", "Fecha de Nacimiento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(TablaInfoCiviles);

        tablaTramites1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre de Tramite", "Descripcion", "Fecha", "Numero de Identidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tablaTramites1);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Tramites: ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        tabCiviles.addTab("Informacion Civiles", jPanel3);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.add(comboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 19, 202, -1));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Fecha de Nacimiento:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 140, 25));

        modContra.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.add(modContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 241, -1));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Contraseña: ");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 88, 25));

        modApellido.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.add(modApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 241, -1));

        modNombre.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.add(modNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 241, -1));

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Nombre: ");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 73, 88, 25));

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Apellido: ");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 88, 25));

        modSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino", " " }));
        jPanel4.add(modSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 180, -1));

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Contraseña: ");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 88, 25));

        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Contraseña: ");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 88, 25));

        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Contraseña: ");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 88, 25));

        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Sexo: ");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, 20));

        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Departamento: ");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        modDepa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Francisco Morazan", "Cortes ", "Comayagua", " " }));
        jPanel4.add(modDepa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 180, -1));
        jPanel4.add(modFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, -1, -1));

        modBoton.setText("Modificar");
        modBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modBotonMouseClicked(evt);
            }
        });
        modBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modBotonActionPerformed(evt);
            }
        });
        jPanel4.add(modBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 180, 60));

        tabCiviles.addTab("Modificar Civiles", jPanel4);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Bienvenido : ");

        cerrarSesion.setText("Cerrar Sesion");
        cerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarSesionMouseClicked(evt);
            }
        });

        NomUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        NomUser.setText("jLabel5");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabCiviles)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(NomUser, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NomUser, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(tabCiviles, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelEmpleadoLayout = new javax.swing.GroupLayout(panelEmpleado.getContentPane());
        panelEmpleado.getContentPane().setLayout(panelEmpleadoLayout);
        panelEmpleadoLayout.setHorizontalGroup(
            panelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelEmpleadoLayout.setVerticalGroup(
            panelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Nombre: ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Log - In ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ingrese su Contraseña: ");

        Entradacontra.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Ingrese su Nombre Completo: ");

        entradaNombre.setBackground(new java.awt.Color(255, 255, 255));

        BotonIngresar.setBackground(new java.awt.Color(102, 102, 255));
        BotonIngresar.setForeground(new java.awt.Color(0, 0, 0));
        BotonIngresar.setText("Ingresar");
        BotonIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonIngresarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Entradacontra, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                            .addComponent(entradaNombre)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(BotonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(12, 12, 12)
                .addComponent(entradaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Entradacontra, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(BotonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonIngresarMouseClicked
        String nombre = entradaNombre.getText(); 
        String contra = Entradacontra.getText(); 
        Object user = ""; 
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getContraseña().equalsIgnoreCase(contra)){
                user = usuarios.get(i); 
            }
        }
        DefaultComboBoxModel ids = (DefaultComboBoxModel)comboBox.getModel();
        ids.addElement(usuarios.get(1).getId());
        
        
        if (Ingreso(nombre, contra) == true){
            entradaNombre.setText("");
            Entradacontra.setText("");
            
            if (user instanceof Empleado){
                this.setVisible(false);
                panelEmpleado.pack();
                //bread
                panelEmpleado.setVisible(true);
                NomUser.setText(((Empleado) user).getNombre()+" "+((Empleado) user).getApellido());
                
            
            }else if (user instanceof Civil){
                //mostrar pestañas de civiles
                
            }
        }else{
            JOptionPane.showMessageDialog(null, "Usuario no encontrado"); 
        }
        
        
    }//GEN-LAST:event_BotonIngresarMouseClicked

    private void cerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarSesionMouseClicked
        panelEmpleado.setVisible(false);
        this.setVisible(true);
        
    }//GEN-LAST:event_cerrarSesionMouseClicked

    private void tabCivilesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabCivilesStateChanged
        
    }//GEN-LAST:event_tabCivilesStateChanged

    private void modBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modBotonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modBotonActionPerformed

    private void modBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modBotonMouseClicked
        Civil us = (Civil)usuarios.get(1); 
        us.setNombre(modNombre.getText());
        us.setApellido(modApellido.getText());
        us.setContraseña(modContra.getText());
        us.setDepartamento((String)modDepa.getSelectedItem());
        us.setSexo((String)modSexo.getSelectedItem());
        us.setFechaN(modFecha.getDate());  
        modNombre.setText("");
        modApellido.setText("");
        modContra.setText("");
    }//GEN-LAST:event_modBotonMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LogPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogPrincipal().setVisible(true);
            }
        });
    }
    
    public static String n_completo(String n, String a){
        String completo = n+" "+a; 
        return completo; 
    }
    
    public static boolean Ingreso(String n, String c){
        
        for (int i = 0; i < usuarios.size(); i++) {
            String nombre = n_completo(usuarios.get(i).getNombre(), usuarios.get(i).getApellido()); 
            if (n.equalsIgnoreCase(nombre) && c.equalsIgnoreCase(usuarios.get(i).getContraseña())){
                return true; 
            }
        }
        return false; 
    }
    
    public void llenarTabla(){
        DefaultTableModel model1 = (DefaultTableModel)TablaInfoCiviles.getModel(); 
        for (int i = 0; i < usuarios.size(); i++) {
            Object [] modelo = {usuarios.get(i).getNombre()+" "+usuarios.get(i).getApellido(), usuarios.get(i).getId(),
                usuarios.get(i).getFechaN()}; 
            model1.addRow(modelo);
        }
    
    }
    public void llenarTramite(){
        DefaultTableModel model1 = (DefaultTableModel)tablaTramites1.getModel(); 
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i) instanceof Civil){
                Civil p = (Civil)usuarios.get(i); 
                for (int j = 0; j < p.getTramites().size(); j++) {
                    Object [] modelo = {p.getTramites().get(i).getNombre(), p.getTramites().get(i).getDescripcion(),
                        p.getTramites().get(i).getFecha(), p.getTramites().get(i).getDni()}; 
                    model1.addRow(modelo);
                }
                
            }
        }
        tablaTramites1.setModel(model1);
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonIngresar;
    private javax.swing.JTextField Entradacontra;
    private javax.swing.JLabel NomUser;
    private javax.swing.JTable TablaInfoCiviles;
    private javax.swing.JButton cerrarSesion;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JTextField entradaNombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField modApellido;
    private javax.swing.JButton modBoton;
    private javax.swing.JTextField modContra;
    private javax.swing.JComboBox<String> modDepa;
    private com.toedter.calendar.JDateChooser modFecha;
    private javax.swing.JTextField modNombre;
    private javax.swing.JComboBox<String> modSexo;
    private javax.swing.JFrame panelEmpleado;
    private javax.swing.JTabbedPane tabCiviles;
    private javax.swing.JTable tablaTramites1;
    // End of variables declaration//GEN-END:variables
}
