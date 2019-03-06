/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import clasesBD.usuariosDB;
import java.awt.HeadlessException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import org.edisoncor.gui.button.ButtonColoredAction;
import org.edisoncor.gui.label.LabelMetric;
import org.edisoncor.gui.panel.Panel;
import org.edisoncor.gui.panel.PanelRoundTranslucidoComplete;

/**
 *
 * @author Juan WT
 */
public class JFLogin extends javax.swing.JFrame {

    /**
     * Creates new form JFLogin
     */
    public JFLogin() {
        initComponents();
    }

    String contraseña;
    String tipo;
    JFMenu mp = new JFMenu();

    public void ValidarUsuarioBase() {
        contraseña = new String(txtpass.getPassword());
        String concod;

        Boolean concon = false;
        concod = usuariosDB.consultarUsuario(txtusu.getText());
        concon = usuariosDB.consultarContrasena(concod, txtpass.getText());

        if (concod == null) {
            JOptionPane.showMessageDialog(null, "Usuario No Encontrado ");
        } else {
            if (concon == false) {
                JOptionPane.showMessageDialog(null, "La contraseña no es válida ");
            } else {
                if (cboTipo.getSelectedItem().toString().equals("Administrador")) {
                    mp.getBtnResetearClave().setEnabled(false);
                    mp.setVisible(true);
                    dispose();
                } else {
                    if (cboTipo.getSelectedItem().toString().equals("Cajero")) {
                        mp.getBtnMantenimiento().setEnabled(false);
                        mp.getBtnContabilidad().setEnabled(false);
                        mp.getBtnReportesMenu().setEnabled(false);
                        mp.getBtnResetarClaveAdmin().setEnabled(false);
                        mp.getBtnUsuariosSistema().setEnabled(false);
                        mp.setVisible(true);
                        dispose();
                    } else {
                        if ((cboTipo.getSelectedItem().toString().equals("Contador"))) {
                            mp.getBtnMantenimiento().setEnabled(false);
                            mp.getBtnContabilidad().setEnabled(false);
                            mp.getBtnReportesMenu().setEnabled(false);
                            mp.getBtnResetarClaveAdmin().setEnabled(false);
                            mp.getBtnCompras().setEnabled(false);
                            mp.getBtnInvetarioBodega().setEnabled(false);
                            mp.getBtnUsuariosSistema().setEnabled(false);
                            mp.setVisible(true);
                            dispose();

                        } else {
                            if ((cboTipo.getSelectedItem().toString().equals("Gerente"))) {
                                mp.getBtnMantenimiento().setEnabled(false);
                                mp.getBtnContabilidad().setEnabled(false);
                                mp.getBtnResetarClaveAdmin().setEnabled(false);
                                mp.getBtnCompras().setEnabled(false);
                                mp.getBtnFacturacionMenu().setEnabled(false);
                                mp.getBtnUsuariosSistema().setEnabled(false);
                                mp.setVisible(true);
                                dispose();
                            }
                        }
                    }

                }

            }
        }
    }

    /*public void validar(){
        String usuario,clave,tipo;
        usuario=usuariosDB.conUsuario(txtusu.getText());
        clave=usuariosDB.conContra(txtpass.getText());
        tipo=usuariosDB.conTip( txtTipo.getText());
        if( usuario == null){
            JOptionPane.showMessageDialog(null,"Usuario No Encontrado ");
        }else{
            if( clave == null){
                JOptionPane.showMessageDialog(null,"La contraseña no es válida ");
            }else{
                if(tipo==null){
                 JOptionPane.showMessageDialog(null,"tipo de usuario no coincide ");   
                }
            else{
                JFMenu mp=new JFMenu();
                mp.setVisible(true);
                dispose();
            }
        }
    }}*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel2 = new org.edisoncor.gui.panel.Panel();
        panel1 = new org.edisoncor.gui.panel.Panel();
        btnCancelar = new org.edisoncor.gui.button.ButtonColoredAction();
        btnIngresar = new org.edisoncor.gui.button.ButtonColoredAction();
        panelRoundTranslucidoComplete2 = new org.edisoncor.gui.panel.PanelRoundTranslucidoComplete();
        labelMetric2 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric1 = new org.edisoncor.gui.label.LabelMetric();
        txtpass = new javax.swing.JPasswordField();
        txtusu = new javax.swing.JTextField();
        labelMetric3 = new org.edisoncor.gui.label.LabelMetric();
        cboTipo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/loginClar.jpg"))); // NOI18N

        panel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/access_key_login_open_security_password_unlock_secret-512.png"))); // NOI18N

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        btnCancelar.setBackground(new java.awt.Color(153, 255, 153));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnIngresar.setBackground(new java.awt.Color(153, 255, 153));
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        panelRoundTranslucidoComplete2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/loginClar.jpg"))); // NOI18N

        labelMetric2.setBackground(new java.awt.Color(51, 0, 255));
        labelMetric2.setText("Contraseña:");
        labelMetric2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N

        labelMetric1.setBackground(new java.awt.Color(51, 0, 255));
        labelMetric1.setText("Usuario: ");
        labelMetric1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N

        labelMetric3.setBackground(new java.awt.Color(51, 0, 255));
        labelMetric3.setText("Tipo");
        labelMetric3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N

        cboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Cajero", "Contador", "Gerente" }));
        cboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRoundTranslucidoComplete2Layout = new javax.swing.GroupLayout(panelRoundTranslucidoComplete2);
        panelRoundTranslucidoComplete2.setLayout(panelRoundTranslucidoComplete2Layout);
        panelRoundTranslucidoComplete2Layout.setHorizontalGroup(
            panelRoundTranslucidoComplete2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundTranslucidoComplete2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panelRoundTranslucidoComplete2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRoundTranslucidoComplete2Layout.createSequentialGroup()
                        .addComponent(labelMetric1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtusu, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRoundTranslucidoComplete2Layout.createSequentialGroup()
                        .addGroup(panelRoundTranslucidoComplete2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelMetric2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMetric3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelRoundTranslucidoComplete2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtpass, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(cboTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        panelRoundTranslucidoComplete2Layout.setVerticalGroup(
            panelRoundTranslucidoComplete2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRoundTranslucidoComplete2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panelRoundTranslucidoComplete2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtusu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetric1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRoundTranslucidoComplete2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMetric2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelRoundTranslucidoComplete2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMetric3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(panelRoundTranslucidoComplete2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelRoundTranslucidoComplete2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        ValidarUsuarioBase();
        dispose();
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        System.exit(WIDTH);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void cboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboTipoActionPerformed

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
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonColoredAction btnCancelar;
    private org.edisoncor.gui.button.ButtonColoredAction btnIngresar;
    private javax.swing.JComboBox<String> cboTipo;
    private org.edisoncor.gui.label.LabelMetric labelMetric1;
    private org.edisoncor.gui.label.LabelMetric labelMetric2;
    private org.edisoncor.gui.label.LabelMetric labelMetric3;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.panel.Panel panel2;
    private org.edisoncor.gui.panel.PanelRoundTranslucidoComplete panelRoundTranslucidoComplete2;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtusu;
    // End of variables declaration//GEN-END:variables
}
