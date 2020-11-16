package GUI.Ventana;

import Data.Evento;
import Data.QueueArray;
import Data.Usuario;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VentanaMisActividades extends javax.swing.JFrame {

    public VentanaMisActividades() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaEventos = new javax.swing.JList<>();
        verEventos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 51));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Meiryo", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MIS ACTIVIDADES");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 230, 60));

        jLabel3.setFont(new java.awt.Font("Meiryo", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("EVENTOS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, 30));

        btnVolver.setBackground(new java.awt.Color(102, 0, 0));
        btnVolver.setFont(new java.awt.Font("Meiryo", 1, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("VOLVER");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 620, -1, -1));

        listaEventos.setBackground(new java.awt.Color(0, 51, 51));
        listaEventos.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        listaEventos.setForeground(new java.awt.Color(255, 255, 255));
        listaEventos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Seminario Ingenieros", "La importancia de evacuar", "Colombia", "Superaciones personales", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listaEventos);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 260, 300));

        verEventos.setBackground(new java.awt.Color(0, 0, 51));
        verEventos.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        verEventos.setForeground(new java.awt.Color(255, 255, 255));
        verEventos.setText("VER");
        verEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verEventosActionPerformed(evt);
            }
        });
        getContentPane().add(verEventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Imagenes/fondo.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 601, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        VentanaMenú ventana = new VentanaMenú(); 
         Usuario invitado = new Usuario("--", "--");
       ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void verEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verEventosActionPerformed
        QueueArray <Evento> eve = VentanaPrincipal.evento;
        QueueArray <Evento> even = RegistroEvento.evv;
        
        int i=0;
        JFrame parentFrame = new JFrame(); 
        if(even.empty()==true){
            JOptionPane.showMessageDialog(parentFrame, "No hay eventos disponibles");
        }else{
            while(i<5){
              Evento evento = eve.dequeue();
              Evento event = even.dequeue();
              JOptionPane.showMessageDialog(parentFrame, evento);
              JOptionPane.showMessageDialog(parentFrame, event);
              i++;
            } 
    }//GEN-LAST:event_verEventosActionPerformed
}
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listaEventos;
    private javax.swing.JButton verEventos;
    // End of variables declaration//GEN-END:variables
}

