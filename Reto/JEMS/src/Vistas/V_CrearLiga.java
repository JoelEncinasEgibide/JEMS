/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import jems.JEMS;

/**
 *
 * @author migue
 */
public class V_CrearLiga extends javax.swing.JFrame {

    /**
     * Creates new form V_CraerLiga
     */
    public V_CrearLiga() {
        setUndecorated(true);
        initComponents();
        myInitComponents();
    }
    
    public void myInitComponents() {
        setSize(1280, 720);
        setLocationRelativeTo(null);
        tfFechaInicio.setBorder(BorderFactory.createCompoundBorder(
                tfFechaInicio.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfFechaInicio = new javax.swing.JTextField();
        bCrear = new javax.swing.JButton();
        lbRiot = new javax.swing.JLabel();
        lbVersion = new javax.swing.JLabel();
        lbCodigoDueño = new javax.swing.JLabel();
        bVolver = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        lbBorde = new javax.swing.JLabel();
        lbSubtitulo = new javax.swing.JLabel();
        lbFiller = new javax.swing.JLabel();
        lbBackgroundEquipo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        tfFechaInicio.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        tfFechaInicio.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(tfFechaInicio);
        tfFechaInicio.setBounds(510, 310, 250, 30);

        bCrear.setBackground(new java.awt.Color(252, 124, 0));
        bCrear.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        bCrear.setForeground(new java.awt.Color(255, 255, 255));
        bCrear.setText("CREAR");
        bCrear.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bCrear.setBorderPainted(false);
        bCrear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bCrear.setFocusPainted(false);
        bCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCrearActionPerformed(evt);
            }
        });
        getContentPane().add(bCrear);
        bCrear.setBounds(500, 540, 280, 50);

        lbRiot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/riotLogo.png"))); // NOI18N
        getContentPane().add(lbRiot);
        lbRiot.setBounds(10, 670, 100, 50);

        lbVersion.setFont(new java.awt.Font("Source Serif Pro Black", 3, 12)); // NOI18N
        lbVersion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVersion.setText("FINAL_BUILD_V1.0.0");
        getContentPane().add(lbVersion);
        lbVersion.setBounds(1100, 680, 180, 30);

        lbCodigoDueño.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lbCodigoDueño.setForeground(new java.awt.Color(255, 255, 255));
        lbCodigoDueño.setText("Selecciona la Fecha de Inicio de la Liga");
        getContentPane().add(lbCodigoDueño);
        lbCodigoDueño.setBounds(480, 260, 310, 40);

        bVolver.setBackground(new java.awt.Color(86, 88, 149));
        bVolver.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        bVolver.setForeground(new java.awt.Color(255, 255, 255));
        bVolver.setText("VOLVER");
        bVolver.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bVolver.setBorderPainted(false);
        bVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bVolver.setFocusPainted(false);
        bVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVolverActionPerformed(evt);
            }
        });
        getContentPane().add(bVolver);
        bVolver.setBounds(560, 630, 170, 30);

        bSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/error.png"))); // NOI18N
        bSalir.setBorderPainted(false);
        bSalir.setContentAreaFilled(false);
        bSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bSalir.setFocusPainted(false);
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });
        getContentPane().add(bSalir);
        bSalir.setBounds(1230, 10, 40, 40);

        lbBorde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/blur.png"))); // NOI18N
        lbBorde.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(86, 88, 149), 1, true));
        getContentPane().add(lbBorde);
        lbBorde.setBounds(450, 220, 360, 170);

        lbSubtitulo.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        lbSubtitulo.setForeground(new java.awt.Color(86, 88, 149));
        lbSubtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSubtitulo.setText("CREAR LIGA");
        getContentPane().add(lbSubtitulo);
        lbSubtitulo.setBounds(470, 70, 330, 60);

        lbFiller.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/crear_liga_background.jpg"))); // NOI18N
        getContentPane().add(lbFiller);
        lbFiller.setBounds(0, 0, 1280, 720);

        lbBackgroundEquipo.setBackground(new java.awt.Color(13, 9, 32));
        lbBackgroundEquipo.setForeground(new java.awt.Color(13, 9, 32));
        lbBackgroundEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/background_main_color.png"))); // NOI18N
        getContentPane().add(lbBackgroundEquipo);
        lbBackgroundEquipo.setBounds(0, 0, 1280, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCrearActionPerformed
        try {
           String mensaje = JEMS.crearLigaVacia(tfFechaInicio.getText());
           ControladorVistas.abrirVentanaAviso("Liga creada en la fecha " + mensaje);
        } catch (Exception ex) {
            Logger.getLogger(V_CrearLiga.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bCrearActionPerformed

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bSalirActionPerformed

    private void bVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVolverActionPerformed
        ControladorVistas.cerrarVentanaCreacion();
    }//GEN-LAST:event_bVolverActionPerformed

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
            java.util.logging.Logger.getLogger(V_CrearLiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_CrearLiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_CrearLiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_CrearLiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_CrearLiga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCrear;
    private javax.swing.JButton bSalir;
    private javax.swing.JButton bVolver;
    private javax.swing.JLabel lbBackgroundEquipo;
    private javax.swing.JLabel lbBorde;
    private javax.swing.JLabel lbCodigoDueño;
    private javax.swing.JLabel lbFiller;
    private javax.swing.JLabel lbRiot;
    private javax.swing.JLabel lbSubtitulo;
    private javax.swing.JLabel lbVersion;
    private javax.swing.JTextField tfFechaInicio;
    // End of variables declaration//GEN-END:variables
}
