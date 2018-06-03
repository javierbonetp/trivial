package trivial;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author javpin
 */
public class VentanaJuegoTrivial extends javax.swing.JFrame {

    /**
     * Creates new form Trivial
     */
    Pregunta pr[] = null;
    private int jugadores;
    private String categoria;
    private int numero;
    public int i = 0;
    JuegoTrivial jt;

    public VentanaJuegoTrivial(int j, String c, int n) {

        initComponents();
        jugadores = j;
        categoria = c;
        numero = n;
        try {
            //cambio n por 2
            jt = new JuegoTrivial(j, c, 2);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error desconocido");
        }
        MostrarInformaciondeljuego();
    }

    //TODO todo el codigo necesario para mostrar la informacion del juego que se le pide al objeto jt
    private void MostrarInformaciondeljuego() {
        jlabelpregunta.setText(jt.getpreguntaactual().getPregunta());
        jlnumpregunta.setText(Integer.toString(jt.getnumpreguntaactual() + 1));
        jlnumjugador.setText(Integer.toString(jt.getjugadoractual() + 1));

        jlacertadas1.setText(Integer.toString(jt.acertadas[0]));
        jlacertadas2.setText(Integer.toString(jt.acertadas[1]));
        jlacertadas3.setText(Integer.toString(jt.acertadas[2]));
        jlacertadas4.setText(Integer.toString(jt.acertadas[3]));

        //Hacemos una copia, la crea el método, de las respuestas para no modificar el vector de las respuestas
        String[] respuestasaleatorias = Reordenarrespuestasaleatoriamente(jt.getpreguntaactual().getRespuestas());
        jcr1.setText(respuestasaleatorias[0]);
        jcr2.setText(respuestasaleatorias[1]);
        jcr3.setText(respuestasaleatorias[2]);
        jcr4.setText(respuestasaleatorias[3]);
    }

    private String[] Reordenarrespuestasaleatoriamente(String[] respuestas) {

        ArrayList<String> solution = new ArrayList<>();
        for (int i = 0; i < respuestas.length; i++) {
            solution.add(respuestas[i]);
        }
        Collections.shuffle(solution);
        
        String respuestasfinales[]=new String[respuestas.length];
        for(int i=0;i<respuestas.length;i++){
            respuestasfinales[i]=solution.get(i);
        }
        return respuestasfinales;
    }

    public static void voydandopreguntas() {

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlabelpregunta = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jlacertadas1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jlacertadas2 = new javax.swing.JLabel();
        jlacertadas3 = new javax.swing.JLabel();
        jlacertadas4 = new javax.swing.JLabel();
        jlnumpregunta = new javax.swing.JLabel();
        jlnumjugador = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jcr1 = new javax.swing.JCheckBox();
        jcr2 = new javax.swing.JCheckBox();
        jcr3 = new javax.swing.JCheckBox();
        jcr4 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Pregunta.-");

        jLabel2.setText("Respuestas.-");

        jlabelpregunta.setText("jLabel3");

        jButton1.setText("Responder");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Preguntas acertadas");

        jlacertadas1.setText("jLabel5");

        jLabel21.setText("Número de pregunta");

        jLabel22.setText("Número de jugador");

        jLabel23.setText("Jugador 1");

        jLabel24.setText("Jugador 2");

        jLabel25.setText("Jugador 3");

        jLabel26.setText("Jugador 4");

        jlacertadas2.setText("jLabel27");

        jlacertadas3.setText("jLabel28");

        jlacertadas4.setText("jLabel29");

        jlnumpregunta.setText("jLabel30");

        jlnumjugador.setText("jLabel31");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel3.setText("Trivial");

        jLabel6.setText("Y aprende inglés");

        buttonGroup1.add(jcr1);
        jcr1.setText("jCheckBox1");

        buttonGroup1.add(jcr2);
        jcr2.setText("jCheckBox1");

        buttonGroup1.add(jcr3);
        jcr3.setText("jCheckBox1");

        buttonGroup1.add(jcr4);
        jcr4.setText("jCheckBox1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcr4)
                    .addComponent(jcr3)
                    .addComponent(jcr2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jlacertadas1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jlacertadas2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jlacertadas3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlacertadas4)
                            .addComponent(jLabel26)))
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jlabelpregunta)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel22)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlnumjugador))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel21)
                            .addGap(18, 18, 18)
                            .addComponent(jlnumpregunta)))
                    .addComponent(jcr1)
                    .addComponent(jButton1))
                .addContainerGap(577, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlacertadas1)
                    .addComponent(jlacertadas2)
                    .addComponent(jlacertadas3)
                    .addComponent(jlacertadas4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jlnumpregunta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jlnumjugador))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addComponent(jlabelpregunta)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcr1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcr2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcr3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcr4)
                .addGap(15, 15, 15)
                .addComponent(jButton1)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO opción marcada y pasarla a jt.compruebarespuesta segun lo que
        //devuelva mostrar si correcto ó incorrecto y mostrar la información
        // y comprobar si juego finalizado en tal caso mostrar lo que sea
        boolean acertada = false;
        if (jcr1.isSelected() == true) {
            if (jt.comprobarrespuesta(jcr1.getText())) {
                //Devuelve true
                acertada = true;
            }
        } else if (jcr2.isSelected() == true) {
            if (jt.comprobarrespuesta(jcr2.getText())) {
                //Devuelve true
                acertada = true;
            }

        } else if (jcr3.isSelected() == true) {
            if (jt.comprobarrespuesta(jcr3.getText())) {
                //Devuelve true
                acertada = true;
            }

        } else if (jcr4.isSelected() == true) {
            if (jt.comprobarrespuesta(jcr4.getText())) {
                //Devuelve true
                acertada = true;
            }

        }
        if (acertada) {
            JOptionPane.showMessageDialog(null, "Respuesta correcta");
        } else {
            JOptionPane.showMessageDialog(null, "Respuesta incorrecta");
        }

        if (jt.hafinalizado()) {
            boolean ganador[] = jt.getquienhaganado();
            String ganadores = "";
            for (int i = 0; i < jugadores; i++) {
                if (ganador[i] == true) {
                    ganadores += " | Jugador " + (i + 1);
                }
            }
            JOptionPane.showMessageDialog(null, "Jugadores ganadores: " + ganadores);
            this.dispose();
        }
        buttonGroup1.clearSelection();
        jcr1.setSelected(false);
        jcr2.setSelected(false);
        jcr3.setSelected(false);
        jcr4.setSelected(false);
        MostrarInformaciondeljuego();


    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaJuegoTrivial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaJuegoTrivial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaJuegoTrivial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaJuegoTrivial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    static javax.swing.JButton jButton1;
    private static javax.swing.JLabel jLabel1;
    static javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JCheckBox jcr1;
    private javax.swing.JCheckBox jcr2;
    private javax.swing.JCheckBox jcr3;
    private javax.swing.JCheckBox jcr4;
    static javax.swing.JLabel jlabelpregunta;
    private static javax.swing.JLabel jlacertadas1;
    private javax.swing.JLabel jlacertadas2;
    private javax.swing.JLabel jlacertadas3;
    private javax.swing.JLabel jlacertadas4;
    private javax.swing.JLabel jlnumjugador;
    private javax.swing.JLabel jlnumpregunta;
    // End of variables declaration//GEN-END:variables
}
