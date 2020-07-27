package C_Clases;

import java.applet.*;
import java.io.BufferedInputStream;
import java.io.InputStream;
import javax.swing.JOptionPane;

public class JP_Sistéma_Esquelético extends javax.swing.JPanel {
    
    public JP_Sistéma_Esquelético() {
        initComponents();
    }
     AudioClip Articulacionsillas = java.applet.Applet.newAudioClip(getClass().getResource("/P_Audios/Articulaciones_wav.wav"));
     AudioClip Caderas_1 = java.applet.Applet.newAudioClip(getClass().getResource("/P_Audios/Caderas_1_wav.wav"));
     AudioClip Caderas_2 = java.applet.Applet.newAudioClip(getClass().getResource("/P_Audios/Caderas_2_wav.wav"));
     AudioClip Cajilla_Toracica = java.applet.Applet.newAudioClip(getClass().getResource("/P_Audios/Caja_Toracica_wav.wav"));
     AudioClip Columnilla_Vertebral = java.applet.Applet.newAudioClip(getClass().getResource("/P_Audios/Columna_Vertebral_wav.wav"));
     AudioClip Craneo_audio = java.applet.Applet.newAudioClip(getClass().getResource("/P_Audios/Craneo_wav.wav"));
     AudioClip Esqueleto_Gral_audio = java.applet.Applet.newAudioClip(getClass().getResource("/P_Audios/Esqueleto_Gral_wav.wav"));
     AudioClip Femur_audio = java.applet.Applet.newAudioClip(getClass().getResource("/P_Audios/Femur_wav.wav"));
     AudioClip Hombro_audio = java.applet.Applet.newAudioClip(getClass().getResource("/P_Audios/Hombro_wav.wav"));
     AudioClip Mano_audio = java.applet.Applet.newAudioClip(getClass().getResource("/P_Audios/Mano_wav.wav"));
     AudioClip Pie_audio = java.applet.Applet.newAudioClip(getClass().getResource("/P_Audios/Pie_wav.wav"));
     AudioClip Pierna_audio = java.applet.Applet.newAudioClip(getClass().getResource("/P_Audios/Pierna_wav.wav"));
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Craneo = new javax.swing.JLabel();
        Hombro2 = new javax.swing.JLabel();
        Hombro1 = new javax.swing.JLabel();
        Caja_Toracica = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Texto = new javax.swing.JTextArea();
        Mano = new javax.swing.JLabel();
        Mano1 = new javax.swing.JLabel();
        Columna = new javax.swing.JLabel();
        Cadera = new javax.swing.JLabel();
        Mano2 = new javax.swing.JLabel();
        Pierna = new javax.swing.JLabel();
        femur = new javax.swing.JLabel();
        Pie = new javax.swing.JLabel();
        Articulaciones = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        JLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Craneo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CraneoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CraneoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CraneoMouseExited(evt);
            }
        });
        add(Craneo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 40, 50));

        Hombro2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Hombro2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Hombro2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Hombro2MouseExited(evt);
            }
        });
        add(Hombro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 60, 30));

        Hombro1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Hombro1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Hombro1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Hombro1MouseExited(evt);
            }
        });
        add(Hombro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 50, 30));

        Caja_Toracica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Caja_ToracicaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Caja_ToracicaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Caja_ToracicaMouseExited(evt);
            }
        });
        add(Caja_Toracica, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 60, 70));

        Texto.setColumns(20);
        Texto.setFont(new java.awt.Font("Monospaced", 3, 11)); // NOI18N
        Texto.setRows(5);
        jScrollPane1.setViewportView(Texto);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 340, 140));

        Mano.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ManoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ManoMouseExited(evt);
            }
        });
        add(Mano, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 40, 40));
        add(Mano1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 40, 40));

        Columna.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ColumnaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ColumnaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ColumnaMouseExited(evt);
            }
        });
        add(Columna, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 40, 30));

        Cadera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CaderaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CaderaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CaderaMouseExited(evt);
            }
        });
        add(Cadera, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 70, 50));

        Mano2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Mano2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Mano2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Mano2MouseExited(evt);
            }
        });
        add(Mano2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 40, 40));

        Pierna.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PiernaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PiernaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PiernaMouseExited(evt);
            }
        });
        add(Pierna, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 40, 150));

        femur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                femurMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                femurMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                femurMouseExited(evt);
            }
        });
        add(femur, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 30, 60));

        Pie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PieMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PieMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PieMouseExited(evt);
            }
        });
        add(Pie, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 50, 30));

        Articulaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ArticulacionesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ArticulacionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ArticulacionesMouseExited(evt);
            }
        });
        add(Articulaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 40, 40));

        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 30, 20));

        JLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/P_Imagenes/spr_Sistema_Esquelético.jpg"))); // NOI18N
        JLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JLabel1MouseEntered(evt);
            }
        });
        add(JLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -40, 540, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void CraneoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CraneoMouseClicked
        Craneo_audio.play();
    }//GEN-LAST:event_CraneoMouseClicked

    private void CraneoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CraneoMouseEntered
        Texto.setText("CRÁNEO\nEl cráneo se compone de los\n huesos del cráneo y los huesos faciales,\n que incluyen la mandíbula. Las articulaciones\n de los huesos craneales y faciales\n se denominan suturas. ");
    }//GEN-LAST:event_CraneoMouseEntered

    private void CraneoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CraneoMouseExited
        Texto.setText("");
    }//GEN-LAST:event_CraneoMouseExited

    private void Hombro2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Hombro2MouseClicked
        Hombro_audio.play();
    }//GEN-LAST:event_Hombro2MouseClicked

    private void Hombro2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Hombro2MouseEntered
        Texto.setText("HOMBRO\n La función principal de esta\n articulación es el\n movimiento del brazo.\n Cada hombro tiene sólo\n 2 huesos, la clavícula\n y la escápula. ");
    }//GEN-LAST:event_Hombro2MouseEntered

    private void Hombro2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Hombro2MouseExited
        Texto.setText("");
    }//GEN-LAST:event_Hombro2MouseExited

    private void Hombro1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Hombro1MouseClicked
        Hombro_audio.play();
    }//GEN-LAST:event_Hombro1MouseClicked

    private void Hombro1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Hombro1MouseEntered
        Texto.setText("HOMBRO\n La función principal de esta\n articulación es el\n movimiento del brazo.\n Cada hombro tiene sólo\n 2 huesos, la clavícula\n y la escápula. ");
    }//GEN-LAST:event_Hombro1MouseEntered

    private void Hombro1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Hombro1MouseExited
        Texto.setText("");
    }//GEN-LAST:event_Hombro1MouseExited

    private void Caja_ToracicaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Caja_ToracicaMouseEntered
        Texto.setText("CAJA TORÁCICA \nLa función de la caja\n torácica es proteger\n el corazón y los pulmones.\n La caja torácica está\n formada por 12 pares\n de costillas curvas ");
    }//GEN-LAST:event_Caja_ToracicaMouseEntered

    private void Caja_ToracicaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Caja_ToracicaMouseExited
        Texto.setText("");
    }//GEN-LAST:event_Caja_ToracicaMouseExited

    private void ManoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManoMouseEntered
        Texto.setText("LA MANO\n La mano, con sus múltiples articulaciones,\n es flexible y ágil. Puede agarrar y\n levantar una maleta pesada tanto como recoger un alfiler.\n La mano incluye los huesos \ndel carpo, los metacarpianos\n y los falanges");
    }//GEN-LAST:event_ManoMouseEntered

    private void ManoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManoMouseExited
        Texto.setText("");
    }//GEN-LAST:event_ManoMouseExited

    private void ManoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManoMouseClicked
        Mano_audio.play();
    }//GEN-LAST:event_ManoMouseClicked

    private void ColumnaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ColumnaMouseEntered
         Texto.setText("COLUMNA VERTEBRAL\n Rodea y protege a la médula\n ósea en su interior, además\n sostiene la caja torácica y\n los fuertes músculos de\n la espalda que mantienen\n el cuerpo erguido.");
    }//GEN-LAST:event_ColumnaMouseEntered

    private void ColumnaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ColumnaMouseExited
        Texto.setText("");
    }//GEN-LAST:event_ColumnaMouseExited

    private void ColumnaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ColumnaMouseClicked
        Columnilla_Vertebral.play();
    }//GEN-LAST:event_ColumnaMouseClicked

    private void JLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLabel1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_JLabel1MouseEntered

    private void CaderaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CaderaMouseEntered
       Texto.setText("LAS CADERAS (PELVIS)\n La pelvis soporta y\n protege los órganos internos.\n La articulación de la cadera\n es muy importante para el\n movimiento de la pierna y\n está soportada por fuertes\n músculos y ligamentos. ");

    }//GEN-LAST:event_CaderaMouseEntered

    private void CaderaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CaderaMouseExited
        Texto.setText("");
    }//GEN-LAST:event_CaderaMouseExited

    private void CaderaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CaderaMouseClicked
        Caderas_1.play();
    }//GEN-LAST:event_CaderaMouseClicked

    private void PiernaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PiernaMouseEntered
        Texto.setText("LA PIERNA\n El miembro inferior incluye al fémur,\n la tibia y el peroné, así como los huesos del pie:\n tarsos, metatarsianos y falanges. ");
    }//GEN-LAST:event_PiernaMouseEntered

    private void PiernaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PiernaMouseExited
        Texto.setText("");
    }//GEN-LAST:event_PiernaMouseExited

    private void femurMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_femurMouseEntered
        Texto.setText(" El fémur es el hueso más grande\n y más fuerte del cuerpo. Es un hueso largo\n que representa aproximadamente\n una cuarta parte de tu altura\n y es el punto de unión para\n algunos músculos poderosos.");
    }//GEN-LAST:event_femurMouseEntered

    private void femurMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_femurMouseExited
        Texto.setText("");
    }//GEN-LAST:event_femurMouseExited

    private void femurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_femurMouseClicked
        Femur_audio.play();
    }//GEN-LAST:event_femurMouseClicked

    private void PieMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PieMouseEntered
        Texto.setText("El peso de todo el cuerpo recae en los pies.\n Ellos actúan como una palanca para mover el \ncuerpo hacia adelante \ncuando caminamos o corremos.");
    }//GEN-LAST:event_PieMouseEntered

    private void PieMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PieMouseExited
        Texto.setText("");
    }//GEN-LAST:event_PieMouseExited

    private void PieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PieMouseClicked
        Pie_audio.play();
    }//GEN-LAST:event_PieMouseClicked

    private void Mano2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mano2MouseEntered
        Texto.setText("LA MANO\n La mano, con sus múltiples articulaciones,\n es flexible y ágil. Puede agarrar y\n levantar una maleta pesada tanto como recoger un alfiler.\n La mano incluye los huesos \ndel carpo, los metacarpianos\n y los falanges");
    }//GEN-LAST:event_Mano2MouseEntered

    private void Mano2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mano2MouseExited
        Texto.setText("");
    }//GEN-LAST:event_Mano2MouseExited

    private void Mano2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mano2MouseClicked
        Mano_audio.play();
    }//GEN-LAST:event_Mano2MouseClicked

    private void ArticulacionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ArticulacionesMouseEntered
        Texto.setText("Cuando se unen dos huesos siempre hay una\n articulación. Existen más de 230 articulaciones en el cuerpo. \n" +
        " \n" +
        "Las articulaciones redondeadas y huecas \ntienen un rango completo de movimiento. \nEsto significa que permiten la rotación \ncircular de los huesos. ");
    }//GEN-LAST:event_ArticulacionesMouseEntered

    private void ArticulacionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ArticulacionesMouseExited
        Texto.setText("");
    }//GEN-LAST:event_ArticulacionesMouseExited

    private void ArticulacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ArticulacionesMouseClicked
        Articulacionsillas.play();     
    }//GEN-LAST:event_ArticulacionesMouseClicked

    private void Caja_ToracicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Caja_ToracicaMouseClicked
        Cajilla_Toracica.play();
    }//GEN-LAST:event_Caja_ToracicaMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
       Caderas_2.play();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void PiernaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PiernaMouseClicked
        Pierna_audio.play();
    }//GEN-LAST:event_PiernaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Articulaciones;
    private javax.swing.JLabel Cadera;
    private javax.swing.JLabel Caja_Toracica;
    private javax.swing.JLabel Columna;
    private javax.swing.JLabel Craneo;
    private javax.swing.JLabel Hombro1;
    private javax.swing.JLabel Hombro2;
    private javax.swing.JLabel JLabel1;
    private javax.swing.JLabel Mano;
    private javax.swing.JLabel Mano1;
    private javax.swing.JLabel Mano2;
    private javax.swing.JLabel Pie;
    private javax.swing.JLabel Pierna;
    private javax.swing.JTextArea Texto;
    private javax.swing.JLabel femur;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}