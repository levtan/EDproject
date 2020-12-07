
package GUI.Ventana;

import Data.Evento;
import Data.LinkedStack;
import Data.Participante;
import Data.QueueArray;
import Data.Usuario;
import Data.TreeAVL;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class VentanaPrincipal extends javax.swing.JFrame {
    
    static HashMap<String, Usuario> userlist = new HashMap<>();
    
    static QueueArray<Evento> evento= new QueueArray(10000);
    static boolean bool;
    
    public VentanaPrincipal() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        setResizable(false);        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnInvitado = new javax.swing.JButton();
        btnUsuario = new javax.swing.JButton();
        btnRegistro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnPush = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/GUI/Imagenes/logo.png")).getImage());
        setMaximumSize(new java.awt.Dimension(600, 700));
        setMinimumSize(new java.awt.Dimension(600, 700));
        setPreferredSize(new java.awt.Dimension(600, 700));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnInvitado.setBackground(new java.awt.Color(0, 51, 51));
        btnInvitado.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        btnInvitado.setForeground(new java.awt.Color(255, 255, 255));
        btnInvitado.setActionCommand("invitados");
        btnInvitado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnInvitado.setLabel("Ingresar como invitado");
        btnInvitado.setMargin(new java.awt.Insets(5, 5, 5, 5));
        btnInvitado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInvitadoMouseClicked(evt);
            }
        });
        btnInvitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvitadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnInvitado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 200, 80));
        btnInvitado.getAccessibleContext().setAccessibleName("boton1");

        btnUsuario.setBackground(new java.awt.Color(0, 51, 51));
        btnUsuario.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        btnUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuario.setText("Ingresar como usuario");
        btnUsuario.setHideActionText(true);
        btnUsuario.setMaximumSize(new java.awt.Dimension(155, 35));
        btnUsuario.setMinimumSize(new java.awt.Dimension(155, 35));
        btnUsuario.setPreferredSize(new java.awt.Dimension(155, 35));
        btnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 200, 80));

        btnRegistro.setBackground(new java.awt.Color(0, 51, 51));
        btnRegistro.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        btnRegistro.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistro.setText("Registrarse");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, 200, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Imagenes/logo.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 190, 110));

        btnPush.setBackground(new java.awt.Color(51, 0, 0));
        btnPush.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        btnPush.setForeground(new java.awt.Color(255, 255, 255));
        btnPush.setText("Push");
        btnPush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPushActionPerformed(evt);
            }
        });
        getContentPane().add(btnPush, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 630, 110, 40));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Imagenes/CyTfondito.png"))); // NOI18N
        Fondo.setFocusTraversalPolicyProvider(true);
        Fondo.setMaximumSize(new java.awt.Dimension(600, 700));
        Fondo.setMinimumSize(new java.awt.Dimension(600, 700));
        Fondo.setPreferredSize(new java.awt.Dimension(600, 700));
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 740));
        Fondo.getAccessibleContext().setAccessibleName("Inicio");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInvitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvitadoActionPerformed
        VentanaMenú ventana = new VentanaMenú(bool=false); 
                      
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnInvitadoActionPerformed

    private void btnInvitadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInvitadoMouseClicked
      
    }//GEN-LAST:event_btnInvitadoMouseClicked

    private void btnPushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPushActionPerformed
       
        char userName = 'a';
                
        for(int i=0; i<26; i++)
        {
            Usuario user = new Usuario(String.valueOf(userName),String.valueOf(i));
            userlist.put(user.getUsername(), user);
 
            int asciivalue = (int) userName;
            System.out.println(userName+" = "+i);
            
            asciivalue++;
            userName = (char) asciivalue;
        }        
        JOptionPane.showMessageDialog(null, "Datos cargados correctamente");
    }//GEN-LAST:event_btnPushActionPerformed

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
        InicioSesión ventana = new InicioSesión(); 
        bool=true;
        ventana.setVisible(true);
        this.setVisible(false);
      
    }//GEN-LAST:event_btnUsuarioActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        Registro ventana = new Registro(); 
        ventana.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnRegistroActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                Usuario admin = new Usuario("admin", String.valueOf(1234));
                
                userlist.put(admin.getUsername(), admin);
                
                new VentanaPrincipal().setVisible(true);
            
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnInvitado;
    private javax.swing.JButton btnPush;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton btnUsuario;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
