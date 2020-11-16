
package GUI.Ventana;

import Data.*;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VentanaMenú extends javax.swing.JFrame {

String [] botones= {"Volver","Guardar"};
InicioSesión user = new InicioSesión();

    public VentanaMenú() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.btPerfil.setEnabled(false);
        this.btnBuscar.setEnabled(false);
        this.btnLugares.setEnabled(false);
        this.btnMisActividades.setEnabled(false);
        this.btnCrearEvento.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btPerfil = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnCrearEvento = new javax.swing.JButton();
        btnActividades = new javax.swing.JButton();
        btnMisActividades = new javax.swing.JButton();
        btnLugares = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtrecibe = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btPerfil.setBackground(new java.awt.Color(0, 0, 51));
        btPerfil.setFont(new java.awt.Font("Meiryo", 1, 12)); // NOI18N
        btPerfil.setForeground(new java.awt.Color(255, 255, 255));
        btPerfil.setText("PERFIL");
        btPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPerfilActionPerformed(evt);
            }
        });
        getContentPane().add(btPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 90, 40));

        btnSalir.setBackground(new java.awt.Color(51, 0, 0));
        btnSalir.setFont(new java.awt.Font("Meiryo", 1, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 650, 90, 40));

        jButton3.setBackground(new java.awt.Color(0, 0, 51));
        jButton3.setFont(new java.awt.Font("Meiryo", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("VOLVER");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 650, 90, 40));

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 250, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Imagenes/lugares.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 170, 160));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Imagenes/mislugares.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 170, 160));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Imagenes/misactividades.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 170, 160));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Imagenes/actividades.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 170, 160));

        btnCrearEvento.setBackground(new java.awt.Color(0, 51, 51));
        btnCrearEvento.setFont(new java.awt.Font("Meiryo", 1, 12)); // NOI18N
        btnCrearEvento.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearEvento.setText("CREAR EVENTO");
        btnCrearEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearEventoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCrearEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 540, 150, 40));

        btnActividades.setBackground(new java.awt.Color(0, 51, 51));
        btnActividades.setFont(new java.awt.Font("Meiryo", 1, 12)); // NOI18N
        btnActividades.setForeground(new java.awt.Color(255, 255, 255));
        btnActividades.setText("Eventos");
        btnActividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActividadesActionPerformed(evt);
            }
        });
        getContentPane().add(btnActividades, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 150, 40));

        btnMisActividades.setBackground(new java.awt.Color(0, 51, 51));
        btnMisActividades.setFont(new java.awt.Font("Meiryo", 1, 12)); // NOI18N
        btnMisActividades.setForeground(new java.awt.Color(255, 255, 255));
        btnMisActividades.setText("MIS EVENTOS");
        btnMisActividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMisActividadesActionPerformed(evt);
            }
        });
        getContentPane().add(btnMisActividades, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 540, 150, 40));

        btnLugares.setBackground(new java.awt.Color(0, 51, 51));
        btnLugares.setFont(new java.awt.Font("Meiryo", 1, 12)); // NOI18N
        btnLugares.setForeground(new java.awt.Color(255, 255, 255));
        btnLugares.setText("LUGARES");
        btnLugares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLugaresActionPerformed(evt);
            }
        });
        getContentPane().add(btnLugares, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 130, 40));

        btnBuscar.setBackground(new java.awt.Color(0, 0, 51));
        btnBuscar.setFont(new java.awt.Font("Meiryo", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 90, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Imagenes/fondo.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 700));
        getContentPane().add(txtrecibe, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 124, 120, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPerfilActionPerformed
        
    }//GEN-LAST:event_btPerfilActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnCrearEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearEventoActionPerformed
        RegistroEvento ventana = new RegistroEvento();
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCrearEventoActionPerformed

    private void btnActividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActividadesActionPerformed
        VentanaActividades ventana = new VentanaActividades(); 
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnActividadesActionPerformed

    private void btnMisActividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMisActividadesActionPerformed
        VentanaMisActividades ventana = new VentanaMisActividades();
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMisActividadesActionPerformed

    private void btnLugaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLugaresActionPerformed
      /*VentanaLugares ventana = new VentanaLugares(); 
        ventana.setVisible(true);
        this.setVisible(false);*/
    }//GEN-LAST:event_btnLugaresActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
      
       /*String valor = this.txtBuscar.getText();
      
       Inventario inventario= new Inventario();
       ArrayList<Lugar> listaLugares = new ArrayList<>(inventario.CrearLugar());
       ArrayList<Actividad> listaActividades = new ArrayList<>(inventario.CrearActividades());
       
        for (Lugar lista : listaLugares) {
            if (lista.getNombre().equalsIgnoreCase(valor)){
                  JFrame parentFrame = new JFrame(); 
           Icon icono=new ImageIcon (getClass().getResource("/GUI/Imagenes/logo.png"));
 
                   
                    int variable= JOptionPane.showOptionDialog(parentFrame, lista.toString() 
                     , "Edificio", JOptionPane.YES_NO_CANCEL_OPTION,
                      JOptionPane.WARNING_MESSAGE, icono, botones, botones[0]);
                    if (variable==0){
                        
                    }else{
                        
                    }
               
       
       
       
            }else{
            if (lista instanceof Edificio){
                if (((Edificio) lista).getCódigo().contains(valor)){
                    JFrame parentFrame = new JFrame();
                    
                      Icon icono=new ImageIcon (getClass().getResource("/GUI/Imagenes/logo.png"));
 
                   
                    int variable= JOptionPane.showOptionDialog(parentFrame, lista.toString() 
                     , "Edificio", JOptionPane.YES_NO_CANCEL_OPTION,
                      JOptionPane.WARNING_MESSAGE, icono, botones, botones[0]);
                    if (variable==0){
                        
                    }else{
                        
                    }
                }
            } 
        } 
        } 
        for (Actividad alista : listaActividades) {
            if (alista.getNombre().equalsIgnoreCase(valor)){
                  JFrame parentFrame = new JFrame(); 
                    Icon icono=new ImageIcon (getClass().getResource("/GUI/Imagenes/logo.png"));
 
                   
                    int variable= JOptionPane.showOptionDialog(parentFrame, listaActividades.toString() 
                     , "Edificio", JOptionPane.YES_NO_CANCEL_OPTION,
                      JOptionPane.WARNING_MESSAGE, icono, botones, botones[0]);
                    if (variable==0){
                        
                    }else{
                        
                    }
     
            }
        
        }*/


        
       
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

     
   public void Verificar(Usuario usuario){
        Usuario invitado = new Usuario("--", "--");
        if ( usuario.equals(invitado)){
            deshabilitar();
            
        }else{
            habilitar();
        }
    }
    
    private void deshabilitar() 
    {
       this.btnMisActividades.setEnabled(false);
       this.btnCrearEvento.setEnabled(false);
       this.btnMisActividades.setEnabled(false);
    }  

    private void habilitar() 
    {
      
      this.btnMisActividades.setEnabled(true);
      this.btnCrearEvento.setEnabled(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btPerfil;
    private javax.swing.JButton btnActividades;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCrearEvento;
    private javax.swing.JButton btnLugares;
    private javax.swing.JButton btnMisActividades;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtBuscar;
    public static javax.swing.JLabel txtrecibe;
    // End of variables declaration//GEN-END:variables
}
