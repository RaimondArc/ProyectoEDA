/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author valer
 */
public class jifrmAvionesEnHangar extends javax.swing.JInternalFrame {

    /**
     * Creates new form jifrmAvionesEnHangar
     */
    public jifrmAvionesEnHangar() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAñadir = new javax.swing.JButton();
        btnBoton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("AVIONES EN HANGAR");

        jLabel2.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Lista de Aviones");

        jLabel3.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Opciones");

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Orden", "Nombre de avión"
            }
        ));
        jTable1.setRowHeight(22);
        jScrollPane1.setViewportView(jTable1);

        btnAñadir.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        btnAñadir.setText("Añadir avión");
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });

        btnBoton.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        btnBoton.setText("Despegar avión");
        btnBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBotonActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(95, 104, 143));
        jSeparator1.setForeground(new java.awt.Color(95, 104, 143));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBoton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAñadir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(102, 102, 102))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(131, 131, 131))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(222, 222, 222)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(31, 31, 31)
                        .addComponent(btnAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))))
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

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void btnBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBotonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBotonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnBoton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
