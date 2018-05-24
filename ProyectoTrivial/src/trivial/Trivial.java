package trivial;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author javpin
 */
public class Trivial extends javax.swing.JFrame {

    /**
     * Creates new form Trivial
     */
    
    Pregunta pr[]=new Pregunta[20];
    private int jugadores;
    private String categoria;
    private int numero;
    public int i=0;
    public Trivial(int j, String c, int n, int i) {
        initComponents();
        
        
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jLabel9.setVisible(false);
        jLabel10.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        jLabel14.setVisible(false);
        jLabel15.setVisible(false);
        jLabel16.setVisible(false);
        jLabel17.setVisible(false);
        jLabel18.setVisible(false);
        jLabel19.setVisible(false);
        jLabel20.setVisible(false);
        jCheckBox1.setVisible(false);
        jCheckBox2.setVisible(false);
        jCheckBox3.setVisible(false);
        jCheckBox4.setVisible(false);
        jCheckBox5.setVisible(false);
        jCheckBox6.setVisible(false);
        jCheckBox7.setVisible(false);
        jCheckBox8.setVisible(false);
        jCheckBox9.setVisible(false);
        jCheckBox10.setVisible(false);
        jCheckBox11.setVisible(false);
        jCheckBox12.setVisible(false);
        jCheckBox13.setVisible(false);
        jCheckBox14.setVisible(false);
        jCheckBox15.setVisible(false);
        jCheckBox16.setVisible(false);
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        correcto.setVisible(false);
        correcto1.setVisible(false);
        correcto2.setVisible(false);
        correcto3.setVisible(false);
        jSeparator1.setVisible(false);
        jSeparator5.setVisible(false);
        jSeparator6.setVisible(false);
        jSeparator7.setVisible(false);
        
        correcto.setVisible(false);
        jLabel5.setText("0");
        jugadores=j;
        categoria=c;
        numero=n;
        
        if(jugadores==1){
            jLabel1.setVisible(true);
            jLabel2.setVisible(true);
            jLabel3.setVisible(true);
            jLabel4.setVisible(true);
            jLabel5.setVisible(true);
            jCheckBox1.setVisible(true);
            jCheckBox2.setVisible(true);
            jCheckBox3.setVisible(true);
            jCheckBox4.setVisible(true);
            jButton1.setVisible(true);
        }else if (jugadores==2){
            jLabel1.setVisible(true);
            jLabel2.setVisible(true);
            jLabel3.setVisible(true);
            jLabel4.setVisible(true);
            jLabel5.setVisible(true);
            jLabel6.setVisible(true);
            jLabel7.setVisible(true);
            jLabel8.setVisible(true);
            jLabel9.setVisible(true);
            jLabel10.setVisible(true);
            jCheckBox1.setVisible(true);
            jCheckBox2.setVisible(true);
            jCheckBox3.setVisible(true);
            jCheckBox4.setVisible(true);
            jCheckBox5.setVisible(true);
            jCheckBox6.setVisible(true);
            jCheckBox7.setVisible(true);
            jCheckBox8.setVisible(true);
            jButton1.setVisible(true);
            jButton2.setVisible(true);
        }else if (jugadores==3){
            jLabel1.setVisible(true);
            jLabel2.setVisible(true);
            jLabel3.setVisible(true);
            jLabel4.setVisible(true);
            jLabel5.setVisible(true);
            jLabel6.setVisible(true);
            jLabel7.setVisible(true);
            jLabel8.setVisible(true);
            jLabel9.setVisible(true);
            jLabel10.setVisible(true);
            jLabel11.setVisible(true);
            jLabel12.setVisible(true);
            jLabel13.setVisible(true);
            jLabel14.setVisible(true);
            jLabel15.setVisible(true);
            jCheckBox1.setVisible(true);
            jCheckBox2.setVisible(true);
            jCheckBox3.setVisible(true);
            jCheckBox4.setVisible(true);
            jCheckBox5.setVisible(true);
            jCheckBox6.setVisible(true);
            jCheckBox7.setVisible(true);
            jCheckBox8.setVisible(true);
            jCheckBox9.setVisible(true);
            jCheckBox10.setVisible(true);
            jCheckBox11.setVisible(true);
            jCheckBox12.setVisible(true);
            jButton1.setVisible(true);
            jButton2.setVisible(true);
            jButton3.setVisible(true);
        }else if (jugadores==4){
            jLabel1.setVisible(true);
        jLabel2.setVisible(true);
        jLabel3.setVisible(true);
        jLabel4.setVisible(true);
        jLabel5.setVisible(true);
        jLabel6.setVisible(true);
        jLabel7.setVisible(true);
        jLabel8.setVisible(true);
        jLabel9.setVisible(true);
        jLabel10.setVisible(true);
        jLabel11.setVisible(true);
        jLabel12.setVisible(true);
        jLabel13.setVisible(true);
        jLabel14.setVisible(true);
        jLabel15.setVisible(true);
        jLabel16.setVisible(true);
        jLabel17.setVisible(true);
        jLabel18.setVisible(true);
        jLabel19.setVisible(true);
        jLabel20.setVisible(true);
        jCheckBox1.setVisible(true);
        jCheckBox2.setVisible(true);
        jCheckBox3.setVisible(true);
        jCheckBox4.setVisible(true);
        jCheckBox5.setVisible(true);
        jCheckBox6.setVisible(true);
        jCheckBox7.setVisible(true);
        jCheckBox8.setVisible(true);
        jCheckBox9.setVisible(true);
        jCheckBox10.setVisible(true);
        jCheckBox11.setVisible(true);
        jCheckBox12.setVisible(true);
        jCheckBox13.setVisible(true);
        jCheckBox14.setVisible(true);
        jCheckBox15.setVisible(true);
        jCheckBox16.setVisible(true);
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jButton3.setVisible(true);
        jButton4.setVisible(true);
        jSeparator1.setVisible(true);
        jSeparator5.setVisible(true);
        jSeparator6.setVisible(true);
        jSeparator7.setVisible(true);
        }
        
        if(categoria.equals("Musica")){
        pr=ApiManager.damePreguntasmusica(numero);
       // pr=Pregunta.leepreguntas();
       System.out.println("i:" + i);
       System.out.println("pr de i:" + pr[i].getPregunta());
        jLabel3.setText(pr[i].getPregunta());
        jCheckBox1.setText(Pregunta.respuestas[2]);
        jCheckBox2.setText(Pregunta.respuestas[3]);
        jCheckBox3.setText(Pregunta.respuestas[0]);
        jCheckBox4.setText(Pregunta.respuestas[1]);
        }
        if(categoria.equals("Peliculas")){
        ApiManager.damePreguntaspeliculas(numero);
        jLabel3.setText(Pregunta.pregunta);
        jCheckBox1.setText(Pregunta.respuestas[2]);
        jCheckBox2.setText(Pregunta.respuestas[3]);
        jCheckBox3.setText(Pregunta.respuestas[0]);
        jCheckBox4.setText(Pregunta.respuestas[1]);
        }
        if(categoria.equals("Libros")){
        ApiManager.damePreguntaslibros(numero);
        jLabel3.setText(Pregunta.pregunta);
        jCheckBox1.setText(Pregunta.respuestas[2]);
        jCheckBox2.setText(Pregunta.respuestas[3]);
        jCheckBox3.setText(Pregunta.respuestas[0]);
        jCheckBox4.setText(Pregunta.respuestas[1]);
        }
        
    }
    
    public static void voydandopreguntas(){
        
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jCheckBox4 = new javax.swing.JCheckBox();
        correcto = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        correcto1 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jCheckBox8 = new javax.swing.JCheckBox();
        correcto2 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();
        jCheckBox12 = new javax.swing.JCheckBox();
        correcto3 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jButton4 = new javax.swing.JButton();
        jCheckBox16 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Pregunta.-");

        jLabel2.setText("Respuestas.-");

        jLabel3.setText("jLabel3");

        jCheckBox1.setText("jCheckBox1");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("jCheckBox2");

        jCheckBox3.setText("jCheckBox3");

        jButton1.setText("Responder");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jCheckBox4.setText("jCheckBox4");

        correcto.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        correcto.setForeground(new java.awt.Color(238, 13, 13));
        correcto.setText("Has acertado! ;)");

        jLabel4.setText("Preguntas acertadas");

        jLabel5.setText("jLabel5");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        correcto1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        correcto1.setForeground(new java.awt.Color(238, 13, 13));
        correcto1.setText("Has acertado! ;)");

        jLabel6.setText("Preguntas acertadas");

        jLabel7.setText("Pregunta.-");

        jLabel8.setText("jLabel5");

        jLabel9.setText("Respuestas.-");

        jLabel10.setText("jLabel3");

        jCheckBox5.setText("jCheckBox1");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        jCheckBox6.setText("jCheckBox2");

        jCheckBox7.setText("jCheckBox3");

        jButton2.setText("Responder");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jCheckBox8.setText("jCheckBox4");

        correcto2.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        correcto2.setForeground(new java.awt.Color(238, 13, 13));
        correcto2.setText("Has acertado! ;)");

        jLabel11.setText("Preguntas acertadas");

        jLabel12.setText("Pregunta.-");

        jLabel13.setText("jLabel5");

        jLabel14.setText("Respuestas.-");

        jLabel15.setText("jLabel3");

        jCheckBox9.setText("jCheckBox1");
        jCheckBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox9ActionPerformed(evt);
            }
        });

        jCheckBox10.setText("jCheckBox2");

        jCheckBox11.setText("jCheckBox3");

        jButton3.setText("Responder");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jCheckBox12.setText("jCheckBox4");

        correcto3.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        correcto3.setForeground(new java.awt.Color(238, 13, 13));
        correcto3.setText("Has acertado! ;)");

        jLabel16.setText("Preguntas acertadas");

        jLabel17.setText("Pregunta.-");

        jLabel18.setText("jLabel5");

        jLabel19.setText("Respuestas.-");

        jLabel20.setText("jLabel3");

        jCheckBox13.setText("jCheckBox1");
        jCheckBox13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox13ActionPerformed(evt);
            }
        });

        jCheckBox14.setText("jCheckBox2");

        jCheckBox15.setText("jCheckBox3");

        jButton4.setText("Responder");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jCheckBox16.setText("jCheckBox4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(correcto))
                            .addComponent(jCheckBox4)
                            .addComponent(jCheckBox1)
                            .addComponent(jLabel12)
                            .addComponent(jLabel15)
                            .addComponent(jCheckBox10)
                            .addComponent(jCheckBox11)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(correcto2))
                            .addComponent(jCheckBox12)
                            .addComponent(jCheckBox9)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(179, 179, 179)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel13)
                                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(179, 179, 179)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 62, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox7)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(correcto1))
                    .addComponent(jCheckBox8)
                    .addComponent(jCheckBox5)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(179, 179, 179)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel17)
                    .addComponent(jLabel20)
                    .addComponent(jCheckBox14)
                    .addComponent(jCheckBox15)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(correcto3))
                    .addComponent(jCheckBox16)
                    .addComponent(jCheckBox13)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(179, 179, 179)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel18)
                            .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel7)
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel8))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox8)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(correcto1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel19))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox16)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(correcto3)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel1)
                                        .addGap(16, 16, 16)
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addComponent(jLabel5))
                                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox4)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1)
                                    .addComponent(correcto))
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel14))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel13))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox12)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton3)
                                    .addComponent(correcto2)))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox3.isSelected()){
            correcto.setVisible(true);
            int anterior=Integer.parseInt(jLabel5.getText());
            jLabel5.setText(Integer.toString(anterior+1));
        }
        i++;
        System.out.println("i: " + i);
        Trivial Tri = new Trivial(jugadores, categoria, numero, i);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox9ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jCheckBox13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox13ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Trivial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Trivial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Trivial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Trivial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.ButtonGroup buttonGroup1;
    private static javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel correcto;
    private javax.swing.JLabel correcto1;
    private javax.swing.JLabel correcto2;
    private javax.swing.JLabel correcto3;
    static javax.swing.JButton jButton1;
    static javax.swing.JButton jButton2;
    static javax.swing.JButton jButton3;
    static javax.swing.JButton jButton4;
    static javax.swing.JCheckBox jCheckBox1;
    static javax.swing.JCheckBox jCheckBox10;
    static javax.swing.JCheckBox jCheckBox11;
    static javax.swing.JCheckBox jCheckBox12;
    static javax.swing.JCheckBox jCheckBox13;
    static javax.swing.JCheckBox jCheckBox14;
    static javax.swing.JCheckBox jCheckBox15;
    static javax.swing.JCheckBox jCheckBox16;
    static javax.swing.JCheckBox jCheckBox2;
    static javax.swing.JCheckBox jCheckBox3;
    static javax.swing.JCheckBox jCheckBox4;
    static javax.swing.JCheckBox jCheckBox5;
    static javax.swing.JCheckBox jCheckBox6;
    static javax.swing.JCheckBox jCheckBox7;
    static javax.swing.JCheckBox jCheckBox8;
    static javax.swing.JCheckBox jCheckBox9;
    private static javax.swing.JLabel jLabel1;
    static javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private static javax.swing.JLabel jLabel12;
    private static javax.swing.JLabel jLabel13;
    static javax.swing.JLabel jLabel14;
    static javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private static javax.swing.JLabel jLabel17;
    private static javax.swing.JLabel jLabel18;
    static javax.swing.JLabel jLabel19;
    static javax.swing.JLabel jLabel2;
    static javax.swing.JLabel jLabel20;
    static javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private static javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private static javax.swing.JLabel jLabel7;
    private static javax.swing.JLabel jLabel8;
    static javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    // End of variables declaration//GEN-END:variables
}
