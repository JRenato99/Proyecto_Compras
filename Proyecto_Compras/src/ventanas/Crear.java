/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import archivos_cuenta_usuario.CuentaUsuario;
import com.sun.glass.events.KeyEvent;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author pierr
 */
public class Crear extends javax.swing.JFrame {

    /**
     * Creates new form Crear
     */
    public Crear() {
        initComponents();
        setSize(490,330);
        setResizable(false);
        setTitle("CREAR USUARIO");
        setLocationRelativeTo(null);
        
        ImageIcon wallpaper =new ImageIcon("src/imagenes/SUBARUxREM.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(SUBARUyREM.getWidth(),
                SUBARUyREM.getHeight(), Image.SCALE_DEFAULT));
        SUBARUyREM.setIcon(icono);
        this.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btCrearUser = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        SUBARUyREM = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("nombre de usuario:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 100, 120, 14);
        getContentPane().add(txtId);
        txtId.setBounds(180, 90, 200, 30);

        jLabel2.setText("ingresar contraseña:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 140, 110, 14);

        btCrearUser.setText("CREAR");
        btCrearUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCrearUserActionPerformed(evt);
            }
        });
        getContentPane().add(btCrearUser);
        btCrearUser.setBounds(180, 220, 100, 40);

        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        getContentPane().add(txtPass);
        txtPass.setBounds(180, 140, 200, 30);

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(390, 270, 73, 23);
        getContentPane().add(SUBARUyREM);
        SUBARUyREM.setBounds(0, 0, 490, 320);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCrearUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCrearUserActionPerformed
        // TODO add your handling code here:
        CuentaUsuario cuentausuario=new CuentaUsuario();//para llamar a la clase para la creacion de archvos
        String id=txtId.getText();
        String pass=txtPass.getText();
       
        
        if((id.compareTo("")==0)||(pass.compareTo("")==0))
        {   
           JOptionPane.showMessageDialog(null,"no se a rellenado correctamente los cuadros");
        }else{
        cuentausuario.crear(id,pass);//llamamos al metodo que se encuetra en la clase llamada antes( CuentaUsuario )
        
         txtId.setText("");
        txtPass.setText("");
        txtId.requestFocus();
        }
        
              
    }//GEN-LAST:event_btCrearUserActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Login login =new Login();
           login.setVisible(true);
           this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
 
      
    }//GEN-LAST:event_txtPassActionPerformed

    
   
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
            java.util.logging.Logger.getLogger(Crear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crear().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SUBARUyREM;
    private javax.swing.JButton btCrearUser;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtId;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}
