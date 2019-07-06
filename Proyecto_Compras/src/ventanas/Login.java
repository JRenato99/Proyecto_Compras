/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import archivos_cuenta_usuario.CuentaUsuario;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author pierr
 */
public class Login extends javax.swing.JFrame {
    
    
    /**
     * Creates new form Login
     */ 
    public Login() {
        
        initComponents();
        
        setSize(490,330);//tamaño de la ventana
        setResizable(false);//no pueden modificar
        setTitle("NIERFREE");//nombre del titulo
        setLocationRelativeTo(null);//para que aparesca en el medio
        
        ImageIcon wallpaper =new ImageIcon("src/imagenes/casj8NM2k.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(RAMyREM.getWidth(),
                RAMyREM.getHeight(), Image.SCALE_DEFAULT));
        RAMyREM.setIcon(icono);
        this.repaint();
    }

    public static String id="";
    public static String pass="";
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        btIngresar = new javax.swing.JButton();
        btCrear = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btAdmin = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();
        RAMyREM = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btIngresar.setBackground(new java.awt.Color(204, 102, 255));
        btIngresar.setText("INGRESAR");
        btIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, -1, -1));

        btCrear.setBackground(new java.awt.Color(102, 153, 255));
        btCrear.setText("CREAR CUENTA");
        btCrear.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btCrear.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        btCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCrearActionPerformed(evt);
            }
        });
        getContentPane().add(btCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, -1, -1));

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 180, -1));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre del Usurario:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 150, -1));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        btAdmin.setText("admin");
        btAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdminActionPerformed(evt);
            }
        });
        getContentPane().add(btAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 180, -1));
        getContentPane().add(RAMyREM, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIngresarActionPerformed
        
        CuentaUsuario cuentausuario = new CuentaUsuario();//para poder llamar ala clase, primero importamos el paquete(archivos_cuenta_usuario)    
        id=txtId.getText();
        pass=txtPass.getText();
        
        if((id.compareTo("")==0)&&(pass.compareTo("")==0)){
                JOptionPane.showMessageDialog(null,"no se ha ingresado ningun digito ");
        }
        else
        {
             String nombre=cuentausuario.llamarId(id);
             String contra=cuentausuario.llamarContra(id);
                 if((nombre.compareTo(id)==0)&&(contra.compareTo(pass)==0))
                    { 
                      JOptionPane.showMessageDialog(null,"hola");
                      
                      Interfaz_Tienda interfaz = new Interfaz_Tienda();
                      interfaz.setVisible(true);
                      this.dispose();//cerrar esta ventana.
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"has introducido tu contraseña o nombre de la cuenta de forma incorrecta. \n por favor, revisalos y vuelve a intentarlo");  
                        txtPass.setText("");
                        txtPass.requestFocus();
                    }
      
        }
        
    }//GEN-LAST:event_btIngresarActionPerformed

    private void btAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdminActionPerformed
        Admin admin = new Admin();
        admin.setVisible(true);
        this.dispose();//se cierra esta ventana(login).
    }//GEN-LAST:event_btAdminActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
       
    }//GEN-LAST:event_txtIdActionPerformed

    private void btCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCrearActionPerformed
        Crear crear = new Crear();
        crear.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btCrearActionPerformed
    
   
    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RAMyREM;
    private javax.swing.JButton btAdmin;
    private javax.swing.JButton btCrear;
    private javax.swing.JButton btIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JTextField txtId;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}
