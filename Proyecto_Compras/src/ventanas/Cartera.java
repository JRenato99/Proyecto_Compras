

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
public class Cartera extends javax.swing.JFrame {
    Login login=new Login();
    CuentaUsuario cantsaldo=new CuentaUsuario();

    /**
     * Creates new form Cartera
     */
    public Cartera() {
        initComponents();
         
        setSize(500, 600);
        setResizable(false);
        setTitle("NIERFREE");
        setLocationRelativeTo(null);
        
        ImageIcon wallpaper =new ImageIcon("src/imagenes/CYBERPUNK3.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(CYBER3.getWidth(),
                CYBER3.getHeight(), Image.SCALE_DEFAULT));
        CYBER3.setIcon(icono);
        this.repaint();
        
        
        
        Saldo.setText(cantsaldo.llamarcant(login.id));//para poder ver cantidad total(archivo- saldo)
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Saldo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CYBER3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("añadir S/.300.00");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 460, 190, 28);

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("añadir fondos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(270, 450, 190, 40);

        jButton6.setBackground(new java.awt.Color(0, 102, 102));
        jButton6.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("añadir fondos");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(270, 170, 190, 40);

        jButton7.setBackground(new java.awt.Color(0, 102, 102));
        jButton7.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("añadir fondos");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(270, 240, 190, 40);

        jButton8.setBackground(new java.awt.Color(0, 102, 102));
        jButton8.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("añadir fondos");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(270, 310, 190, 40);

        jButton9.setBackground(new java.awt.Color(0, 102, 102));
        jButton9.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("añadir fondos");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(270, 380, 190, 40);

        jLabel8.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("click en \"añadir fondos\".");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 120, 460, 28);

        jLabel9.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("añadir S/.30.00");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(40, 250, 190, 28);

        jLabel10.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("añadir S/.75.00");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(40, 320, 190, 28);

        jLabel11.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Añadir fondos a tu cartera");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(20, 20, 350, 40);

        jLabel12.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("añadir S/.15.00");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(40, 180, 190, 28);

        jLabel13.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("podras añadir fondos a tu cuenta de nierfree haciendo ");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(20, 100, 460, 16);

        jLabel14.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("añadir S/.150.00");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(40, 390, 190, 28);

        Saldo.setBackground(new java.awt.Color(255, 255, 255));
        Saldo.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        Saldo.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Saldo);
        Saldo.setBounds(380, 20, 80, 60);

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("X");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(470, 10, 20, 20);
        getContentPane().add(CYBER3);
        CYBER3.setBounds(0, 0, 500, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        double aux;
        String total;
         
        
         aux=Double.parseDouble(cantsaldo.llamarcant(login.id));//almacenar y convertir el archivo a doubler.     
         aux+=15.00;//acumulador
         total=String.valueOf(aux);//convertir aux a string para poder almacenarlo al archivo         
        cantsaldo.cant(login.id,total);//almacenar el nuevo dato.
        Saldo.setText(total);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        double aux;
        String total;
      
         aux=Double.parseDouble(cantsaldo.llamarcant(login.id));
         aux+=30.00;
         total=String.valueOf(aux);         
        cantsaldo.cant(login.id,total);
        Saldo.setText(total);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
     double aux;
        String total;
        
         aux=Double.parseDouble(cantsaldo.llamarcant(login.id));
         aux+=75.00;
         total=String.valueOf(aux);         
        cantsaldo.cant(login.id,total);
        Saldo.setText(total);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       double aux;
        String total;
       
         aux=Double.parseDouble(cantsaldo.llamarcant(login.id));
         aux+=150.00;
         total=String.valueOf(aux);         
        cantsaldo.cant(login.id,total);
        Saldo.setText(total);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      double aux;
        String total;
        
         aux=Double.parseDouble(cantsaldo.llamarcant(login.id));
         aux+=300.00;
         total=String.valueOf(aux);         
        cantsaldo.cant(login.id,total);
        Saldo.setText(total);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(Cartera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cartera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cartera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cartera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cartera().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CYBER3;
    private javax.swing.JLabel Saldo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
