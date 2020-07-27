package C_Clases;

/* Desarrolladores:
    * Alejandro Ramos Herrera (@arhcoder).
    * Bryan Josue López López.
Voces utilizadas:
    * Liliana Alejandra Bonilla Salas.
    * Bryan Jossue Luevano García.
*/
// Imágenes utilizadas: Flaticon | Mercado de Vectores | https://www.flaticon.com.
// Licencia: GNU GPLv3.
// Desarrollado en octubre de 2018.
// Tiempo de desarrollo: 1 noche.
// Propósito: Educación.

import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import java.awt.Color;

public class JF_Frame_Principal extends javax.swing.JFrame {
    
    public JF_Frame_Principal() {
        initComponents();
        this.getContentPane().setBackground(new Color(225,236,239));
        this.setTitle("Biología - Sistema Muscular - Esquelético");
        this.setVisible(true);
        setLocationRelativeTo(null);
        setResizable(true);
    }  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_0 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        JM_Menú_Principal = new javax.swing.JMenuBar();
        JMI_Sistema_Muscular = new javax.swing.JMenu();
        JMI_Sistema_Esquelético = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        JMI_Salir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_0.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout Panel_0Layout = new javax.swing.GroupLayout(Panel_0);
        Panel_0.setLayout(Panel_0Layout);
        Panel_0Layout.setHorizontalGroup(
            Panel_0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        Panel_0Layout.setVerticalGroup(
            Panel_0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        getContentPane().add(Panel_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 600, 540));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 30, 600));

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 630, 30));

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 600, -1));

        JM_Menú_Principal.setOpaque(false);

        JMI_Sistema_Muscular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/P_Imagenes/spr_Icono_Muscular.png"))); // NOI18N
        JMI_Sistema_Muscular.setText("Sistema Muscular");
        JMI_Sistema_Muscular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMI_Sistema_MuscularMouseClicked(evt);
            }
        });
        JM_Menú_Principal.add(JMI_Sistema_Muscular);

        JMI_Sistema_Esquelético.setIcon(new javax.swing.ImageIcon(getClass().getResource("/P_Imagenes/spr_Icono_Esquelético.png"))); // NOI18N
        JMI_Sistema_Esquelético.setText("Sistema Esquelético");
        JMI_Sistema_Esquelético.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMI_Sistema_EsqueléticoMouseClicked(evt);
            }
        });
        JM_Menú_Principal.add(JMI_Sistema_Esquelético);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/P_Imagenes/spr_Icono_Créditos.png"))); // NOI18N
        jMenu1.setText("Créditos");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        JM_Menú_Principal.add(jMenu1);

        JMI_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/P_Imagenes/spr_Icono_Salir.png"))); // NOI18N
        JMI_Salir.setText("Salir");
        JMI_Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMI_SalirMouseClicked(evt);
            }
        });
        JM_Menú_Principal.add(JMI_Salir);

        setJMenuBar(JM_Menú_Principal);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMI_Sistema_MuscularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMI_Sistema_MuscularMouseClicked
    // JMENÚ - SISTÉMA MUSCULAR //
    // JMENÚ - SISTÉMA MUSCULAR //
    JP_Sistema_Muscular Panel_MU = new JP_Sistema_Muscular();
    Panel_MU.setSize(540, 510);
    Panel_MU.setLocation(5, 5);
    Panel_0.removeAll();
    Panel_0.add(Panel_MU, BorderLayout.CENTER);
    Panel_0.revalidate();
    Panel_0.repaint();
    }//GEN-LAST:event_JMI_Sistema_MuscularMouseClicked

    private void JMI_Sistema_EsqueléticoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMI_Sistema_EsqueléticoMouseClicked
    // JMENÚ - SISTÉMA ESQUELÉTICO //
    JP_Sistéma_Esquelético Panel_SE = new JP_Sistéma_Esquelético();
    Panel_SE.setSize(540, 510);
    Panel_SE.setLocation(5, 5);
    Panel_0.removeAll();
    Panel_0.add(Panel_SE, BorderLayout.CENTER);
    Panel_0.revalidate();
    Panel_0.repaint();
    }//GEN-LAST:event_JMI_Sistema_EsqueléticoMouseClicked

    private void JMI_SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMI_SalirMouseClicked
    // JMENÚ - SALIR //
    this.dispose();
    }//GEN-LAST:event_JMI_SalirMouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
    // JMENÚ - CRÉDITOS //
    JOptionPane.showMessageDialog(null, ""
    + "CRÉDITOS:\n" +
    "\n" +
    "Programación:\n" +
    "* Ramos Herrera Iván Alejandro.\n" +
    "* López López Bryan Josue.\n" +
    "\n" +
    "Investigación:\n" +
    "* Cisneros Oliva Daniela Alejandra.\n" +
    "* Hernández Magallanes Jorge Antonio.\n" +
    "\n" +
    "Audios:\n" +
    "*Bonilla Sálas Liliana Alejandra.\n" +
    "*Luevano García Bryan Jossue.\n" +
    "\n" +
    "EN AGRADECIMIENTO A LA MAESTRA ELOINA,\n" +
    "POR LOS BUENOS MOMENTOS VIVIDOS, Y POR\n" +
    "VIVIR. \n" +
    "\n" +
    "~ Aletz... :3");
    }//GEN-LAST:event_jMenu1MouseClicked
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JF_Frame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_Frame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_Frame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_Frame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_Frame_Principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JMI_Salir;
    private javax.swing.JMenu JMI_Sistema_Esquelético;
    private javax.swing.JMenu JMI_Sistema_Muscular;
    private javax.swing.JMenuBar JM_Menú_Principal;
    private javax.swing.JPanel Panel_0;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
