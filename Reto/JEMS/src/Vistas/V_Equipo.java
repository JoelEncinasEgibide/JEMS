/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

/**
 *
 * @author Miguel Barros
 */
public class V_Equipo extends javax.swing.JFrame {

    /**
     * Creates new form V_Equipo
     */
    public V_Equipo() {
        initComponents();
    }
    public V_Equipo(String operacion) {
        initComponents();
        operacion = ope;
        if (operacion == "modificar") 
            tfNombre.setEditable(false);
            tfPuntuacion.setEditable(false);
            tfNacionalidad.setEditable(false);
            tfPresupuesto.setEditable(false);
            cbDueño
            bAceptar.setEditable(false);
            
        if (operacion == "baja") 
            tfNombre.setEditable(false);
            tfApellido.setEditable(false);
            tfNacionalidad.setEditable(false);
            tfPresupuesto.setEditable(false);
            cbDueño
            bAceptar.setEditable(false);
        if (operacion == "alta")   
            tfCodigoEquipo.setVisible(false);
            bAceptar.setEditable(false);
    }
    public boolean validarDatos() {
        if (validarNombre(tfNombre.getText()) && validarPuntuacion(tfPuntuacion.getText()) && validarNacionalidad(tfNacionalidad.getText()) && validarPresupuesto(tfPresupuesto.getText()) && validarDueño(cbDueño.getSelectedIndex()) )
            return true;
        else 
            return false;
    }
    public boolean validarNombre(String nombre) {
        return true;
    }
    public boolean validarPuntuacion(String puntuacion) {
        return true;
    }
    public boolean validarNacionalidad(String nacionalidad) {
        return true;
    }
    public boolean validarPresupuesto(String presupuesto) {
        return true;
    }
    public boolean validarDueño(int posicion) {
        if (posicion == -1)
            return false;
        else
            return true;
    }
    private static String ope;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bAceptar = new javax.swing.JButton();
        bVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bAceptar.setText("Aceptar");
        bAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAceptarActionPerformed(evt);
            }
        });

        bVolver.setText("Volver");
        bVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(bAceptar)
                .addGap(79, 79, 79)
                .addComponent(bVolver)
                .addContainerGap(128, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(251, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAceptar)
                    .addComponent(bVolver))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
        if (validarDatos())
            if(ope == "modificar")
                ControladorVistas.modificarEquipo(tfNombre.getText(),tfNacionalidad.getText(),Integer.parseInt(tfPresupuesto.getText()),Integer.parseInt(tfPuntuacion.getText()),cbDueño.getSelectedItem());
            else if (ope == "alta")
                ControladorVistas.altaEquipo(tfNombre.getText(),tfNacionalidad.getText(),Integer.parseInt(tfPresupuesto.getText()),Integer.parseInt(tfPuntuacion.getText()),cbDueño.getSelectedItem());
            else if (ope == "baja")
                ControladorVistas.bajaEquipo(tfCodigoEquipo.getText());
    }//GEN-LAST:event_bAceptarActionPerformed

    private void bVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVolverActionPerformed
        ControladorVistas.cerrarVentanaEquipo();
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
            java.util.logging.Logger.getLogger(V_Equipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_Equipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_Equipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_Equipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_Equipo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bVolver;
    // End of variables declaration//GEN-END:variables
}
