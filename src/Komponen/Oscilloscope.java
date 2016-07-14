/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Komponen;

//import java.awt.BasicStroke;
import Komponen.Hitung;
import Komponen.Resistor.NilaiResistor;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.image.ImageObserver;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.TransferHandler;
import simulatorrangkaianlistrik.Home;
import simulatorrangkaianlistrik.RangkaianRC;

//import java.awt.Color;
//import java.awt.Graphics;
//import java.awt.Graphics2D;
//import java.awt.Polygon;
//import java.awt.geom.Line2D;
//import javax.swing.JPanel;

/**
 *
 * @author Agung DP
 */
public class Oscilloscope extends javax.swing.JFrame {
    /**
     * Creates new form Oscilloscope
     */
    int aksi = 0;
    int plotsinusoidal = 0;
    int plotdiskret = 0;
    int plotkapasitor = 0;
    int plotresistor = 0;
    static JPanel layarRC = RangkaianRC.layar;
    
    public Oscilloscope() {
        initComponents();
        this.setLocationRelativeTo(null);
        Plot.setFrekuensi(10);
        Plot.setAmplitudo(100);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        SliderTegangan = new javax.swing.JSlider();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        backbutton = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        SliderFrekuensi = new javax.swing.JSlider();
        ok = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("10");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, -1));

        jLabel6.setText("5");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));

        jLabel5.setText("0");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, -1, -1));

        SliderTegangan.setMajorTickSpacing(1);
        SliderTegangan.setMaximum(10);
        SliderTegangan.setPaintLabels(true);
        SliderTegangan.setPaintTicks(true);
        SliderTegangan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SliderTeganganMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SliderTeganganMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                SliderTeganganMouseReleased(evt);
            }
        });
        getContentPane().add(SliderTegangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 70, 30));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 80, 30));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 290, 220));

        backbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/BACK_ICON.png"))); // NOI18N
        backbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backbuttonMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backbuttonMousePressed(evt);
            }
        });
        backbutton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                backbuttonMouseDragged(evt);
            }
        });
        getContentPane().add(backbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Sinyal", "Sinusoidal", "Kotak" }));
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jComboBox1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox1PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/oscilloscope.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 600, -1));

        SliderFrekuensi.setMajorTickSpacing(1);
        SliderFrekuensi.setMaximum(10);
        SliderFrekuensi.setPaintLabels(true);
        SliderFrekuensi.setPaintTicks(true);
        SliderFrekuensi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SliderFrekuensiMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                SliderFrekuensiMouseReleased(evt);
            }
        });
        getContentPane().add(SliderFrekuensi, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, -1, -1));

        ok.setText("OK");
        ok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                okMouseClicked(evt);
            }
        });
        getContentPane().add(ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Menentukan Tegangan Input");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void backbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbuttonMouseClicked
        // TODO add your handling code here:
        setVisible(false);
        double nilaitegangan = Plot.getAmplitudo();
        Hitung.setTegangan(nilaitegangan);
        //Rangkaian.labelnilaihambatan.setText(Long.toString(NilaiResistor.getHambatanMinimum())+" volt");
    }//GEN-LAST:event_backbuttonMouseClicked

    private void backbuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbuttonMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_backbuttonMousePressed

    private void backbuttonMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbuttonMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_backbuttonMouseDragged

    private void SliderTeganganMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SliderTeganganMouseReleased
        // TODO add your handling code here:
        double a = Double.valueOf(SliderTegangan.getValue());
        String z = Double.toString(a);
        jLabel2.setText(z);
        Plot.setAmplitudo(a*10);
        Hitung.setTegangan(a);
        if(plotdiskret == 1) {
            Plot.KurvaDiskret();
            plotsinusoidal = 0;
        }
        else if(plotsinusoidal == 1) {
            Plot.KurvaSinusoidal();
            plotdiskret = 0;
        }
    }//GEN-LAST:event_SliderTeganganMouseReleased

    private void SliderTeganganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SliderTeganganMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_SliderTeganganMouseClicked

    private void SliderTeganganMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SliderTeganganMousePressed
        // TODO add your handling code here:
        jPanel1.repaint();
        layarRC.repaint();
    }//GEN-LAST:event_SliderTeganganMousePressed

    private void SliderFrekuensiMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SliderFrekuensiMouseReleased
        // TODO add your handling code here:
        double a = Double.valueOf(SliderFrekuensi.getValue());
        String z = Double.toString(a);
        jLabel4.setText(z);
        Plot.setFrekuensi(a);
        
        if(plotdiskret == 1) {
            Plot.KurvaDiskret();
            plotsinusoidal = 0;
        }
        else if(plotsinusoidal == 1) {
            Plot.KurvaSinusoidal();
            plotdiskret = 0;
        }
    }//GEN-LAST:event_SliderFrekuensiMouseReleased

    private void SliderFrekuensiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SliderFrekuensiMousePressed
        // TODO add your handling code here:
        jPanel1.repaint();
        layarRC.repaint();
    }//GEN-LAST:event_SliderFrekuensiMousePressed

    private void jComboBox1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox1PopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        int p = jComboBox1.getSelectedIndex();
        switch (p) {
            case 1:
                plotsinusoidal = 1;
                plotdiskret = 0;
//                if(Plot.getStatus() == 1) 
                    Plot.KurvaSinusoidal();
                
                break;
            case 2:
                plotsinusoidal = 0;
                plotdiskret = 1;
                Plot.KurvaDiskret();
                break;
            
            default:
                break;
        }
    }//GEN-LAST:event_jComboBox1PopupMenuWillBecomeInvisible

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
        // TODO add your handling code here:
        jPanel1.repaint();
    }//GEN-LAST:event_jComboBox1MouseClicked

    private void okMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okMouseClicked
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_okMouseClicked

//    public static class Terima{
//        private static double amplitudo;
//        private static double frekuensi;
//        
//        public static void setAmplitudo(double nilai){
//            Terima.amplitudo = nilai;
//        }
//        public static void setFrekuensi(double nilai){
//            Terima.frekuensi = nilai/50;
//        }
//        public static double getFrekuensi(){
//            return frekuensi;
//        }
//        public static double getAmplitudo(){
//            return amplitudo;
//        }
//    }
    

//        @Override
//    public void paint (Graphics g) {
//        super.paint(g);
//        double amplitudo1 = Plot.getAmplitudo();
//        double frekuensi1 = Plot.getFrekuensi();
////        g.drawLine(10, 100, 380, 100);
////        g.drawLine(200, 30, 200, 190);
////
////        g.drawLine(380, 100, 370, 90);
////        g.drawLine(380, 100, 370, 110);
////        g.drawLine(200, 30, 190, 40);
////        g.drawLine(200, 30, 210, 40);
////
////        g.drawString("X", 360, 80);
////        g.drawString("Y", 220, 40);
//
//        Polygon p = new Polygon();
//        Polygon p2 = new Polygon();
//
//       for (int x = -144; x <= 144; x++) {
//            p.addPoint(x + 197, 192 - (int) (amplitudo1 * Math.sin((x / 100.0) * frekuensi1 * Math.PI)));
//
//        }
//
////        for (int x = -170; x <= 170; x++) {
////            p2.addPoint(x + 200, 100 - (int) (50 * Math.cos((x / 100.0) * 2 * Math.PI)));
////
////        }
//        
//        //g.setStroke(new BasicStroke(10));
//        g.setColor(Color.red);
//        g.drawPolyline(p.xpoints, p.ypoints, p.npoints);
//        
////        g.drawString("-2\u03c0", 95, 115);
////        g.drawString("2\u03c0", 305, 115);
////        g.drawString("0", 200, 115);
////
////        g.setColor(Color.blue);
////        g.drawPolyline(p2.xpoints, p2.ypoints, p2.npoints);
//        
//        
////        Graphics2D g2=(Graphics2D)g;
////        int x=250;
////        int y=200;
////        g2.setColor(Color.YELLOW);
////        g2.setStroke(new BasicStroke(10));
////        g2.draw(new Line2D.Float(300, 200, 800, 90));
////        Polygon panah = new Polygon();
////        panah.addPoint(350,300);
////        panah.addPoint(370,250);
////        panah.addPoint(420,250);
////        panah.addPoint(420,220);
////        panah.addPoint(440,220);
////        panah.addPoint(440,120);
////        panah.addPoint(410,100);
////        panah.addPoint(440,80);
////        panah.addPoint(450,80);
////        panah.addPoint(450,220);
////        panah.addPoint(490,220);
////        panah.addPoint(490,250);
////        panah.addPoint(530,250);
////        panah.addPoint(540,270);
////        panah.addPoint(840,270);
////        panah.addPoint(840,290);
////        panah.addPoint(570,290);
////        panah.addPoint(570,300);
////        g2.draw(panah);
////        g2.fill(panah);
//        
//        //for(int i=0;i<250;i=i+50){
////            g.drawLine(x,y,x,y);
////            g.drawLine(x,y,50+i,y-i);
////            g.drawLine(x,y,450-i,y+i);
////            g.drawLine(x,y,450-i,y-i);
////        }
//    }
    
     
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
            java.util.logging.Logger.getLogger(Oscilloscope.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Oscilloscope.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Oscilloscope.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Oscilloscope.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Oscilloscope().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider SliderFrekuensi;
    private javax.swing.JSlider SliderTegangan;
    private javax.swing.JLabel backbutton;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JButton ok;
    // End of variables declaration//GEN-END:variables
}
