package C_Clases;

import java.applet.AudioClip;

public class JP_Sistema_Muscular extends javax.swing.JPanel {
    
    public JP_Sistema_Muscular() {
        initComponents();
    }
    String TM_Inicial = 
    "Ponga el cursor sobre el órgano que quiera observar. Y dé clic\n" +
    "para escuchar la explicación.";
    String TM_Cabeza = 
    "Músculos de la cabeza:\n" +
    "Los músculos que se ubican en nuestra cabeza son pequeños en \n" +
    "tamaño, en donde estos se dividen en dos grupos, los utilizados\n" +
    "para la masticación y los de mímica. Estos nos permiten el \n" +
    "masticar alimentos,cuando se genera el movimiento de cerrado de \n" +
    "nuestra boca.";
    String TM_Tórax = 
    "Músculos del tórax: \n" +
    "Los principales músculos del cuerpo humano que se ubican en\n" +
    "el tórax, son nuestros pectorales, intercostales, además de los\n" +
    "serratos anteriores. Además, en esta zona se encuentra el \n" +
    "corazón, que también es considerado como un músculo.";
    String TM_Intercostales = 
    "Músculos Intercostales: \n" +
    "Se encargan de unir las costillas entre sí, además de unir la zona\n" +
    "con el hueso esternón. Principalmente nos ayudan en la inspiración\n" +
    "y espiración.";
    String TM_Abdomen = 
    "Músculo recto del abdomen: Este recubre la zona del vientre.\n" +
    "Su función es el permitir flexionar el tronco hacia adelante,\n" +
    "favoreciendo además la espiración. Transverso del abdomen: \n" +
    "Cuando se contrae este musculo desencadena un aumento en \n" +
    "la presión de nuestra cavidad abdominal, lo que contribuye a \n" +
    "la espiración, digestión, micción, etc.";
    
    AudioClip C_Intro1 = java.applet.Applet.newAudioClip(getClass().getResource("/P_Audios/M_Intro_1.wav"));
    AudioClip C_Intro2 = java.applet.Applet.newAudioClip(getClass().getResource("/P_Audios/M_Intro_2.wav"));
    AudioClip C_Cabeza = java.applet.Applet.newAudioClip(getClass().getResource("/P_Audios/M_Musculos de la Cabeza.wav"));
    AudioClip C_Tórax = java.applet.Applet.newAudioClip(getClass().getResource("/P_Audios/M_Musculos del Tórax.wav"));
    AudioClip C_Abdomen = java.applet.Applet.newAudioClip(getClass().getResource("/P_Audios/M_Musculos del Abdomen.wav"));
    AudioClip C_Extremidades = java.applet.Applet.newAudioClip(getClass().getResource("/P_Audios/M_Musculos de Extremidades.wav"));
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        JL_Tórax = new javax.swing.JLabel();
        JL_Abdomen = new javax.swing.JLabel();
        JL_Cabeza = new javax.swing.JLabel();
        JL_Intersocales = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Ponga el cursor sobre el órgano que quiera observar. Y dé clic\npara escuchar la explicación.");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 480, 140));

        jButton1.setText("INTRODUCCIÓN 1#");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 160, 40));

        jButton2.setText("INTRODUCCIÓN 2#");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 160, 40));

        JL_Tórax.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JL_TóraxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JL_TóraxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JL_TóraxMouseExited(evt);
            }
        });
        jPanel1.add(JL_Tórax, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 40, 50));

        JL_Abdomen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JL_AbdomenMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JL_AbdomenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JL_AbdomenMouseExited(evt);
            }
        });
        jPanel1.add(JL_Abdomen, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 40, 60));

        JL_Cabeza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JL_CabezaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JL_CabezaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JL_CabezaMouseExited(evt);
            }
        });
        jPanel1.add(JL_Cabeza, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 30, 40));

        JL_Intersocales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JL_IntersocalesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JL_IntersocalesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JL_IntersocalesMouseExited(evt);
            }
        });
        jPanel1.add(JL_Intersocales, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 20, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/P_Imagenes/spr_Sistema_Muscular.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 490));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 20, 490));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 490, 540, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JL_CabezaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JL_CabezaMouseEntered
    // CAMBIAR CABEZA //
    jTextArea1.setText(TM_Cabeza);
    }//GEN-LAST:event_JL_CabezaMouseEntered

    private void JL_CabezaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JL_CabezaMouseExited
    // DETENER CABEZA //
    jTextArea1.setText(TM_Inicial);
    }//GEN-LAST:event_JL_CabezaMouseExited

    private void JL_TóraxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JL_TóraxMouseEntered
    // CAMBIAR TÓRAX //
    jTextArea1.setText(TM_Tórax);
    }//GEN-LAST:event_JL_TóraxMouseEntered

    private void JL_TóraxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JL_TóraxMouseExited
    // DETENER TÓRAX //
    jTextArea1.setText(TM_Inicial);
    }//GEN-LAST:event_JL_TóraxMouseExited

    private void JL_IntersocalesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JL_IntersocalesMouseEntered
    // CAMBIAR INTERCOSTALES //
    jTextArea1.setText(TM_Intercostales);
    }//GEN-LAST:event_JL_IntersocalesMouseEntered

    private void JL_IntersocalesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JL_IntersocalesMouseExited
    // DETENER INTERCOSTALES //
    jTextArea1.setText(TM_Inicial);
    }//GEN-LAST:event_JL_IntersocalesMouseExited

    private void JL_AbdomenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JL_AbdomenMouseEntered
    // CAMBIAR ABDOMEN //
    jTextArea1.setText(TM_Abdomen);
    }//GEN-LAST:event_JL_AbdomenMouseEntered

    private void JL_AbdomenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JL_AbdomenMouseExited
    // DETENER ABDOMEN //
    jTextArea1.setText(TM_Inicial);
    }//GEN-LAST:event_JL_AbdomenMouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    // INTRO 1 //
    C_Intro1.play();
    C_Intro2.stop();
    C_Cabeza.stop();
    C_Tórax.stop();
    C_Abdomen.stop();
    C_Extremidades.stop();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    // INTRO 2 //
    C_Intro1.stop();
    C_Intro2.play();
    C_Cabeza.stop();
    C_Tórax.stop();
    C_Abdomen.stop();
    C_Extremidades.stop();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void JL_CabezaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JL_CabezaMouseClicked
    C_Intro1.stop();
    C_Intro2.stop();
    C_Cabeza.play();
    C_Tórax.stop();
    C_Abdomen.stop();
    C_Extremidades.stop();
    }//GEN-LAST:event_JL_CabezaMouseClicked

    private void JL_TóraxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JL_TóraxMouseClicked
    C_Intro1.stop();
    C_Intro2.stop();
    C_Cabeza.stop();
    C_Tórax.play();
    C_Abdomen.stop();
    C_Extremidades.stop();
    }//GEN-LAST:event_JL_TóraxMouseClicked

    private void JL_AbdomenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JL_AbdomenMouseClicked
    C_Intro1.stop();
    C_Intro2.stop();
    C_Cabeza.stop();
    C_Tórax.stop();
    C_Abdomen.play();
    C_Extremidades.stop();
    }//GEN-LAST:event_JL_AbdomenMouseClicked

    private void JL_IntersocalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JL_IntersocalesMouseClicked
    C_Intro1.stop();
    C_Intro2.stop();
    C_Cabeza.stop();
    C_Tórax.stop();
    C_Abdomen.stop();
    C_Extremidades.play();
    }//GEN-LAST:event_JL_IntersocalesMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JL_Abdomen;
    private javax.swing.JLabel JL_Cabeza;
    private javax.swing.JLabel JL_Intersocales;
    private javax.swing.JLabel JL_Tórax;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}