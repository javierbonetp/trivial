package trivial;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Clase Ventana de configuración del juego
 * @author javpin
 */
public class VentanaConfigJuego extends javax.swing.JFrame {

    public int i = 0;

    /**
     * Constructor de la clase
     */
    public VentanaConfigJuego() {
        initComponents();
        this.setSize(600, 300);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        categoria = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jugadores = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        numero = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1000, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Numero de jugadores:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Peliculas", "Musica", "Libros" }));
        categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriaActionPerformed(evt);
            }
        });
        getContentPane().add(categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        jLabel6.setText("Categoria:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, -1));

        jugadores.setEditable(true);
        jugadores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        jugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugadoresActionPerformed(evt);
            }
        });
        getContentPane().add(jugadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        jLabel1.setText("Numero de preguntas:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        numero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "20", "30" }));
        getContentPane().add(numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel7.setText("Juega al Trivial y aprende Inglés ;)");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoriaActionPerformed

    private void jugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugadoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jugadoresActionPerformed

    /**
     * Llama a la clase VentanaJuegoTrivial con los parametros elegidos por el jugador
     * @param evt No utilizo este parámetro
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int j = Integer.parseInt(jugadores.getItemAt(jugadores.getSelectedIndex()));
        String c = categoria.getItemAt(categoria.getSelectedIndex());
        int n = Integer.parseInt(numero.getItemAt(numero.getSelectedIndex()));
        
        VentanaJuegoTrivial t = new VentanaJuegoTrivial(j, c, n);
        t.setVisible(true);


    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> categoria;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<String> jugadores;
    private static javax.swing.JComboBox<String> numero;
    // End of variables declaration//GEN-END:variables
}
