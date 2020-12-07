package GUI.Ventana;

import Data.*;
import static GUI.Ventana.VentanaPrincipal.userlist;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.swing.JOptionPane;

public class InicioSesión extends javax.swing.JFrame {   
    
    public InicioSesión() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtusuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnvalidar = new javax.swing.JButton();
        txtcontraseña = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 160, 30));

        jLabel3.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, -1, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Inicio Sesión");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));

        btnVolver.setBackground(new java.awt.Color(102, 0, 0));
        btnVolver.setFont(new java.awt.Font("Meiryo", 1, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("VOLVER");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 607, 90, 30));

        jLabel2.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        btnvalidar.setBackground(new java.awt.Color(0, 0, 51));
        btnvalidar.setFont(new java.awt.Font("Meiryo", 1, 14)); // NOI18N
        btnvalidar.setForeground(new java.awt.Color(255, 255, 255));
        btnvalidar.setText("VALIDAR");
        btnvalidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvalidarActionPerformed(evt);
            }
        });
        getContentPane().add(btnvalidar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 607, 100, 30));

        txtcontraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontraseñaActionPerformed(evt);
            }
        });
        getContentPane().add(txtcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 160, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Imagenes/fondo.jpg"))); // NOI18N
        jLabel1.setText("Inicio Sesión");
        jLabel1.setMaximumSize(new java.awt.Dimension(600, 700));
        jLabel1.setMinimumSize(new java.awt.Dimension(600, 700));
        jLabel1.setPreferredSize(new java.awt.Dimension(600, 700));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 610, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed

    }//GEN-LAST:event_txtusuarioActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnvalidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvalidarActionPerformed
        Usuario df;
        
        String user = txtusuario.getText();
        String pass = txtcontraseña.getText();
        
        Iterator hmIterator = VentanaPrincipal.userlist.entrySet().iterator();
                
        System.out.println(VentanaPrincipal.userlist.size());
        
        while(hmIterator.hasNext())
        {
            Map.Entry mapElement = (Map.Entry) hmIterator.next();
  
            Usuario us = (Usuario) mapElement.getValue();
            
            System.out.println(us.getPass());
            System.out.println(mapElement.getKey());
            
            if(mapElement.getKey()==user && pass==us.getPass())
            {
                VentanaMenú ventana = new VentanaMenú(VentanaPrincipal.bool);
                ventana.setVisible(true);
                this.setVisible(false);
            }else
            {
                JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrectos");
                break;
            }
        }
        
        /*// Consider the hashmap contains 
        // student name and their marks 
        HashMap<String, Integer> hm =  
                    new HashMap<String, Integer>(); 
  
        // Adding mappings to HashMap 
        hm.put("GeeksforGeeks", 54); 
        hm.put("A computer portal", 80); 
        hm.put("For geeks", 82); 
  
        // Printing the HashMap 
        System.out.println("Created hashmap is" + hm); 
  
        // Getting an iterator 
        Iterator hmIterator = hm.entrySet().iterator(); 
  
        // Iterate through the hashmap 
        // and add some bonus marks for every student 
        System.out.println("HashMap after adding bonus marks:"); 
  
        while (hmIterator.hasNext()) { 
            Map.Entry mapElement = (Map.Entry)hmIterator.next(); 
            int marks = ((int)mapElement.getValue() + 10); 
            System.out.println(mapElement.getKey() + " : " + marks); 
        } */
        
        
    }//GEN-LAST:event_btnvalidarActionPerformed

    private void txtcontraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontraseñaActionPerformed
      
    }//GEN-LAST:event_txtcontraseñaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton btnvalidar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txtcontraseña;
    public static javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
