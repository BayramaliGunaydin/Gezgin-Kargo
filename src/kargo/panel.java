
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kargo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author bayram
 */
public class panel extends javax.swing.JFrame {

   ArrayList <Integer> secilensehirler=new ArrayList();
   
        int[] sehirler=new int[11];
   
  
    public panel() {
        initComponents();
        jComboBox1.setVisible(false);
        jComboBox2.setVisible(false);
        jComboBox3.setVisible(false);
        jComboBox4.setVisible(false);
        jComboBox5.setVisible(false);
        jComboBox6.setVisible(false);
        jComboBox7.setVisible(false);
        jComboBox8.setVisible(false);
        jComboBox9.setVisible(false);
        jComboBox10.setVisible(false);
        jLabel3.setVisible(false);
        jButton1.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jComboBox7 = new javax.swing.JComboBox<>();
        jComboBox8 = new javax.swing.JComboBox<>();
        jComboBox9 = new javax.swing.JComboBox<>();
        jComboBox10 = new javax.swing.JComboBox<>();
        jComboBox11 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 1024));
        addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
                formAncestorMoved(evt);
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
            }
        });
        getContentPane().setLayout(null);

        jButton1.setText("Yolu ??iz");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 530, 260, 109);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(1111, 224, 0, 0);

        jButton2.setText("Tamam");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(510, 260, 120, 23);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Ka?? Adet ??ehir Gireceksiniz?");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(470, 170, 220, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("??ehirleri ??e??iniz");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(520, 380, 108, 30);

        jLabel1.setText("Kocaeli Kargo Teslimat Sistemi");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(465, 65, 242, 80);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADANA", "ADIYAMAN", "AFYONKARAH??SAR", "A??RI", "AMASYA", "ANKARA", "ANTALYA", "ARTV??N", "AYDIN", "BALIKES??R", "B??LEC??K", "B??NG??L", "B??TL??S", "BOLU", "BURDUR", "BURSA", "??ANAKKALE", "??ANKIRI", "??ORUM", "DEN??ZL??", "D??YARBAKIR", "ED??RNE", "ELAZI??", "ERZ??NCAN", "ERZURUM", "ESK????EH??R", "GAZ??ANTEP", "G??RESUN", "G??M????HANE", "HAKKAR??", "HATAY", "ISPARTA", "MERS??N", "??STANBUL", "??ZM??R", "KARS", "KASTAMONU", "KAYSER??", "KIRKLAREL??", "KIR??EH??R", "KOCAEL??", "KONYA", "K??TAHYA", "MALATYA", "MAN??SA", "KAHRAMANMARA??", "MARD??N", "MU??LA", "MU??", "NEV??EH??R", "N????DE", "ORDU", "R??ZE", "SAKARYA", "SAMSUN", "S????RT", "S??NOP", "S??VAS", "TEK??RDA??", "TOKAT", "TRABZON", "TUNCEL??", "??ANLIURFA", "U??AK", "VAN", "YOZGAT", "ZONGULDAK", "AKSARAY", "BAYBURT", "KARAMAN", "KIRIKKALE", "BATMAN", "??IRNAK", "BARTIN", "ARDAHAN", "I??DIR", "YALOVA", "KARAB??K", "K??L??S", "OSMAN??YE", "D??ZCE" }));
        jComboBox1.setPreferredSize(new java.awt.Dimension(80, 20));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(30, 480, 100, 20);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADANA", "ADIYAMAN", "AFYONKARAH??SAR", "A??RI", "AMASYA", "ANKARA", "ANTALYA", "ARTV??N", "AYDIN", "BALIKES??R", "B??LEC??K", "B??NG??L", "B??TL??S", "BOLU", "BURDUR", "BURSA", "??ANAKKALE", "??ANKIRI", "??ORUM", "DEN??ZL??", "D??YARBAKIR", "ED??RNE", "ELAZI??", "ERZ??NCAN", "ERZURUM", "ESK????EH??R", "GAZ??ANTEP", "G??RESUN", "G??M????HANE", "HAKKAR??", "HATAY", "ISPARTA", "MERS??N", "??STANBUL", "??ZM??R", "KARS", "KASTAMONU", "KAYSER??", "KIRKLAREL??", "KIR??EH??R", "KOCAEL??", "KONYA", "K??TAHYA", "MALATYA", "MAN??SA", "KAHRAMANMARA??", "MARD??N", "MU??LA", "MU??", "NEV??EH??R", "N????DE", "ORDU", "R??ZE", "SAKARYA", "SAMSUN", "S????RT", "S??NOP", "S??VAS", "TEK??RDA??", "TOKAT", "TRABZON", "TUNCEL??", "??ANLIURFA", "U??AK", "VAN", "YOZGAT", "ZONGULDAK", "AKSARAY", "BAYBURT", "KARAMAN", "KIRIKKALE", "BATMAN", "??IRNAK", "BARTIN", "ARDAHAN", "I??DIR", "YALOVA", "KARAB??K", "K??L??S", "OSMAN??YE", "D??ZCE" }));
        jComboBox2.setPreferredSize(new java.awt.Dimension(180, 20));
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(140, 480, 100, 20);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADANA", "ADIYAMAN", "AFYONKARAH??SAR", "A??RI", "AMASYA", "ANKARA", "ANTALYA", "ARTV??N", "AYDIN", "BALIKES??R", "B??LEC??K", "B??NG??L", "B??TL??S", "BOLU", "BURDUR", "BURSA", "??ANAKKALE", "??ANKIRI", "??ORUM", "DEN??ZL??", "D??YARBAKIR", "ED??RNE", "ELAZI??", "ERZ??NCAN", "ERZURUM", "ESK????EH??R", "GAZ??ANTEP", "G??RESUN", "G??M????HANE", "HAKKAR??", "HATAY", "ISPARTA", "MERS??N", "??STANBUL", "??ZM??R", "KARS", "KASTAMONU", "KAYSER??", "KIRKLAREL??", "KIR??EH??R", "KOCAEL??", "KONYA", "K??TAHYA", "MALATYA", "MAN??SA", "KAHRAMANMARA??", "MARD??N", "MU??LA", "MU??", "NEV??EH??R", "N????DE", "ORDU", "R??ZE", "SAKARYA", "SAMSUN", "S????RT", "S??NOP", "S??VAS", "TEK??RDA??", "TOKAT", "TRABZON", "TUNCEL??", "??ANLIURFA", "U??AK", "VAN", "YOZGAT", "ZONGULDAK", "AKSARAY", "BAYBURT", "KARAMAN", "KIRIKKALE", "BATMAN", "??IRNAK", "BARTIN", "ARDAHAN", "I??DIR", "YALOVA", "KARAB??K", "K??L??S", "OSMAN??YE", "D??ZCE" }));
        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(250, 480, 100, 20);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADANA", "ADIYAMAN", "AFYONKARAH??SAR", "A??RI", "AMASYA", "ANKARA", "ANTALYA", "ARTV??N", "AYDIN", "BALIKES??R", "B??LEC??K", "B??NG??L", "B??TL??S", "BOLU", "BURDUR", "BURSA", "??ANAKKALE", "??ANKIRI", "??ORUM", "DEN??ZL??", "D??YARBAKIR", "ED??RNE", "ELAZI??", "ERZ??NCAN", "ERZURUM", "ESK????EH??R", "GAZ??ANTEP", "G??RESUN", "G??M????HANE", "HAKKAR??", "HATAY", "ISPARTA", "MERS??N", "??STANBUL", "??ZM??R", "KARS", "KASTAMONU", "KAYSER??", "KIRKLAREL??", "KIR??EH??R", "KOCAEL??", "KONYA", "K??TAHYA", "MALATYA", "MAN??SA", "KAHRAMANMARA??", "MARD??N", "MU??LA", "MU??", "NEV??EH??R", "N????DE", "ORDU", "R??ZE", "SAKARYA", "SAMSUN", "S????RT", "S??NOP", "S??VAS", "TEK??RDA??", "TOKAT", "TRABZON", "TUNCEL??", "??ANLIURFA", "U??AK", "VAN", "YOZGAT", "ZONGULDAK", "AKSARAY", "BAYBURT", "KARAMAN", "KIRIKKALE", "BATMAN", "??IRNAK", "BARTIN", "ARDAHAN", "I??DIR", "YALOVA", "KARAB??K", "K??L??S", "OSMAN??YE", "D??ZCE" }));
        getContentPane().add(jComboBox4);
        jComboBox4.setBounds(360, 480, 100, 20);

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADANA", "ADIYAMAN", "AFYONKARAH??SAR", "A??RI", "AMASYA", "ANKARA", "ANTALYA", "ARTV??N", "AYDIN", "BALIKES??R", "B??LEC??K", "B??NG??L", "B??TL??S", "BOLU", "BURDUR", "BURSA", "??ANAKKALE", "??ANKIRI", "??ORUM", "DEN??ZL??", "D??YARBAKIR", "ED??RNE", "ELAZI??", "ERZ??NCAN", "ERZURUM", "ESK????EH??R", "GAZ??ANTEP", "G??RESUN", "G??M????HANE", "HAKKAR??", "HATAY", "ISPARTA", "MERS??N", "??STANBUL", "??ZM??R", "KARS", "KASTAMONU", "KAYSER??", "KIRKLAREL??", "KIR??EH??R", "KOCAEL??", "KONYA", "K??TAHYA", "MALATYA", "MAN??SA", "KAHRAMANMARA??", "MARD??N", "MU??LA", "MU??", "NEV??EH??R", "N????DE", "ORDU", "R??ZE", "SAKARYA", "SAMSUN", "S????RT", "S??NOP", "S??VAS", "TEK??RDA??", "TOKAT", "TRABZON", "TUNCEL??", "??ANLIURFA", "U??AK", "VAN", "YOZGAT", "ZONGULDAK", "AKSARAY", "BAYBURT", "KARAMAN", "KIRIKKALE", "BATMAN", "??IRNAK", "BARTIN", "ARDAHAN", "I??DIR", "YALOVA", "KARAB??K", "K??L??S", "OSMAN??YE", "D??ZCE" }));
        getContentPane().add(jComboBox5);
        jComboBox5.setBounds(470, 480, 100, 20);

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADANA", "ADIYAMAN", "AFYONKARAH??SAR", "A??RI", "AMASYA", "ANKARA", "ANTALYA", "ARTV??N", "AYDIN", "BALIKES??R", "B??LEC??K", "B??NG??L", "B??TL??S", "BOLU", "BURDUR", "BURSA", "??ANAKKALE", "??ANKIRI", "??ORUM", "DEN??ZL??", "D??YARBAKIR", "ED??RNE", "ELAZI??", "ERZ??NCAN", "ERZURUM", "ESK????EH??R", "GAZ??ANTEP", "G??RESUN", "G??M????HANE", "HAKKAR??", "HATAY", "ISPARTA", "MERS??N", "??STANBUL", "??ZM??R", "KARS", "KASTAMONU", "KAYSER??", "KIRKLAREL??", "KIR??EH??R", "KOCAEL??", "KONYA", "K??TAHYA", "MALATYA", "MAN??SA", "KAHRAMANMARA??", "MARD??N", "MU??LA", "MU??", "NEV??EH??R", "N????DE", "ORDU", "R??ZE", "SAKARYA", "SAMSUN", "S????RT", "S??NOP", "S??VAS", "TEK??RDA??", "TOKAT", "TRABZON", "TUNCEL??", "??ANLIURFA", "U??AK", "VAN", "YOZGAT", "ZONGULDAK", "AKSARAY", "BAYBURT", "KARAMAN", "KIRIKKALE", "BATMAN", "??IRNAK", "BARTIN", "ARDAHAN", "I??DIR", "YALOVA", "KARAB??K", "K??L??S", "OSMAN??YE", "D??ZCE" }));
        getContentPane().add(jComboBox6);
        jComboBox6.setBounds(580, 480, 100, 20);

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADANA", "ADIYAMAN", "AFYONKARAH??SAR", "A??RI", "AMASYA", "ANKARA", "ANTALYA", "ARTV??N", "AYDIN", "BALIKES??R", "B??LEC??K", "B??NG??L", "B??TL??S", "BOLU", "BURDUR", "BURSA", "??ANAKKALE", "??ANKIRI", "??ORUM", "DEN??ZL??", "D??YARBAKIR", "ED??RNE", "ELAZI??", "ERZ??NCAN", "ERZURUM", "ESK????EH??R", "GAZ??ANTEP", "G??RESUN", "G??M????HANE", "HAKKAR??", "HATAY", "ISPARTA", "MERS??N", "??STANBUL", "??ZM??R", "KARS", "KASTAMONU", "KAYSER??", "KIRKLAREL??", "KIR??EH??R", "KOCAEL??", "KONYA", "K??TAHYA", "MALATYA", "MAN??SA", "KAHRAMANMARA??", "MARD??N", "MU??LA", "MU??", "NEV??EH??R", "N????DE", "ORDU", "R??ZE", "SAKARYA", "SAMSUN", "S????RT", "S??NOP", "S??VAS", "TEK??RDA??", "TOKAT", "TRABZON", "TUNCEL??", "??ANLIURFA", "U??AK", "VAN", "YOZGAT", "ZONGULDAK", "AKSARAY", "BAYBURT", "KARAMAN", "KIRIKKALE", "BATMAN", "??IRNAK", "BARTIN", "ARDAHAN", "I??DIR", "YALOVA", "KARAB??K", "K??L??S", "OSMAN??YE", "D??ZCE" }));
        getContentPane().add(jComboBox7);
        jComboBox7.setBounds(690, 480, 117, 20);

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADANA", "ADIYAMAN", "AFYONKARAH??SAR", "A??RI", "AMASYA", "ANKARA", "ANTALYA", "ARTV??N", "AYDIN", "BALIKES??R", "B??LEC??K", "B??NG??L", "B??TL??S", "BOLU", "BURDUR", "BURSA", "??ANAKKALE", "??ANKIRI", "??ORUM", "DEN??ZL??", "D??YARBAKIR", "ED??RNE", "ELAZI??", "ERZ??NCAN", "ERZURUM", "ESK????EH??R", "GAZ??ANTEP", "G??RESUN", "G??M????HANE", "HAKKAR??", "HATAY", "ISPARTA", "MERS??N", "??STANBUL", "??ZM??R", "KARS", "KASTAMONU", "KAYSER??", "KIRKLAREL??", "KIR??EH??R", "KOCAEL??", "KONYA", "K??TAHYA", "MALATYA", "MAN??SA", "KAHRAMANMARA??", "MARD??N", "MU??LA", "MU??", "NEV??EH??R", "N????DE", "ORDU", "R??ZE", "SAKARYA", "SAMSUN", "S????RT", "S??NOP", "S??VAS", "TEK??RDA??", "TOKAT", "TRABZON", "TUNCEL??", "??ANLIURFA", "U??AK", "VAN", "YOZGAT", "ZONGULDAK", "AKSARAY", "BAYBURT", "KARAMAN", "KIRIKKALE", "BATMAN", "??IRNAK", "BARTIN", "ARDAHAN", "I??DIR", "YALOVA", "KARAB??K", "K??L??S", "OSMAN??YE", "D??ZCE" }));
        getContentPane().add(jComboBox8);
        jComboBox8.setBounds(810, 480, 117, 20);

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADANA", "ADIYAMAN", "AFYONKARAH??SAR", "A??RI", "AMASYA", "ANKARA", "ANTALYA", "ARTV??N", "AYDIN", "BALIKES??R", "B??LEC??K", "B??NG??L", "B??TL??S", "BOLU", "BURDUR", "BURSA", "??ANAKKALE", "??ANKIRI", "??ORUM", "DEN??ZL??", "D??YARBAKIR", "ED??RNE", "ELAZI??", "ERZ??NCAN", "ERZURUM", "ESK????EH??R", "GAZ??ANTEP", "G??RESUN", "G??M????HANE", "HAKKAR??", "HATAY", "ISPARTA", "MERS??N", "??STANBUL", "??ZM??R", "KARS", "KASTAMONU", "KAYSER??", "KIRKLAREL??", "KIR??EH??R", "KOCAEL??", "KONYA", "K??TAHYA", "MALATYA", "MAN??SA", "KAHRAMANMARA??", "MARD??N", "MU??LA", "MU??", "NEV??EH??R", "N????DE", "ORDU", "R??ZE", "SAKARYA", "SAMSUN", "S????RT", "S??NOP", "S??VAS", "TEK??RDA??", "TOKAT", "TRABZON", "TUNCEL??", "??ANLIURFA", "U??AK", "VAN", "YOZGAT", "ZONGULDAK", "AKSARAY", "BAYBURT", "KARAMAN", "KIRIKKALE", "BATMAN", "??IRNAK", "BARTIN", "ARDAHAN", "I??DIR", "YALOVA", "KARAB??K", "K??L??S", "OSMAN??YE", "D??ZCE" }));
        getContentPane().add(jComboBox9);
        jComboBox9.setBounds(930, 480, 100, 20);

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADANA", "ADIYAMAN", "AFYONKARAH??SAR", "A??RI", "AMASYA", "ANKARA", "ANTALYA", "ARTV??N", "AYDIN", "BALIKES??R", "B??LEC??K", "B??NG??L", "B??TL??S", "BOLU", "BURDUR", "BURSA", "??ANAKKALE", "??ANKIRI", "??ORUM", "DEN??ZL??", "D??YARBAKIR", "ED??RNE", "ELAZI??", "ERZ??NCAN", "ERZURUM", "ESK????EH??R", "GAZ??ANTEP", "G??RESUN", "G??M????HANE", "HAKKAR??", "HATAY", "ISPARTA", "MERS??N", "??STANBUL", "??ZM??R", "KARS", "KASTAMONU", "KAYSER??", "KIRKLAREL??", "KIR??EH??R", "KOCAEL??", "KONYA", "K??TAHYA", "MALATYA", "MAN??SA", "KAHRAMANMARA??", "MARD??N", "MU??LA", "MU??", "NEV??EH??R", "N????DE", "ORDU", "R??ZE", "SAKARYA", "SAMSUN", "S????RT", "S??NOP", "S??VAS", "TEK??RDA??", "TOKAT", "TRABZON", "TUNCEL??", "??ANLIURFA", "U??AK", "VAN", "YOZGAT", "ZONGULDAK", "AKSARAY", "BAYBURT", "KARAMAN", "KIRIKKALE", "BATMAN", "??IRNAK", "BARTIN", "ARDAHAN", "I??DIR", "YALOVA", "KARAB??K", "K??L??S", "OSMAN??YE", "D??ZCE" }));
        jComboBox10.setSelectedItem(null);
        getContentPane().add(jComboBox10);
        jComboBox10.setBounds(1040, 480, 117, 20);

        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        getContentPane().add(jComboBox11);
        jComboBox11.setBounds(540, 210, 50, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents
int a;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        secilensehirler.add(40);
      if(a==1){
          secilensehirler.add(jComboBox1.getSelectedIndex());
          
          
      }
      if(a==2){
          secilensehirler.add(jComboBox1.getSelectedIndex());
          secilensehirler.add(jComboBox2.getSelectedIndex());
      }
      if(a==3){
          secilensehirler.add(jComboBox1.getSelectedIndex());
          secilensehirler.add(jComboBox2.getSelectedIndex());
          secilensehirler.add(jComboBox3.getSelectedIndex());        
      }
      if(a==4){
          secilensehirler.add(jComboBox1.getSelectedIndex());
          secilensehirler.add(jComboBox2.getSelectedIndex());
          secilensehirler.add(jComboBox3.getSelectedIndex());
          secilensehirler.add(jComboBox4.getSelectedIndex());   
      }
      if(a==5){
          secilensehirler.add(jComboBox1.getSelectedIndex());
          secilensehirler.add(jComboBox2.getSelectedIndex());
          secilensehirler.add(jComboBox3.getSelectedIndex());
          secilensehirler.add(jComboBox4.getSelectedIndex());
          secilensehirler.add(jComboBox5.getSelectedIndex());
      }
      if(a==6){
         
          secilensehirler.add(jComboBox1.getSelectedIndex());
          secilensehirler.add(jComboBox2.getSelectedIndex());
          secilensehirler.add(jComboBox3.getSelectedIndex());
          secilensehirler.add(jComboBox4.getSelectedIndex());
          secilensehirler.add(jComboBox5.getSelectedIndex());
          secilensehirler.add(jComboBox6.getSelectedIndex());
      }
      if(a==7){
          secilensehirler.add(jComboBox1.getSelectedIndex());
          secilensehirler.add(jComboBox2.getSelectedIndex());
          secilensehirler.add(jComboBox3.getSelectedIndex());
          secilensehirler.add(jComboBox4.getSelectedIndex());
          secilensehirler.add(jComboBox5.getSelectedIndex());
          secilensehirler.add(jComboBox6.getSelectedIndex());
          secilensehirler.add(jComboBox7.getSelectedIndex());
         
      }
      if(a==8){
         secilensehirler.add(jComboBox1.getSelectedIndex());
          secilensehirler.add(jComboBox2.getSelectedIndex());
          secilensehirler.add(jComboBox3.getSelectedIndex());
          secilensehirler.add(jComboBox4.getSelectedIndex());
          secilensehirler.add(jComboBox5.getSelectedIndex());
          secilensehirler.add(jComboBox6.getSelectedIndex());
          secilensehirler.add(jComboBox7.getSelectedIndex());
          secilensehirler.add(jComboBox8.getSelectedIndex());
      }
      if(a==9){
            secilensehirler.add(jComboBox1.getSelectedIndex());
          secilensehirler.add(jComboBox2.getSelectedIndex());
          secilensehirler.add(jComboBox3.getSelectedIndex());
          secilensehirler.add(jComboBox4.getSelectedIndex());
          secilensehirler.add(jComboBox5.getSelectedIndex());
          secilensehirler.add(jComboBox6.getSelectedIndex());
          secilensehirler.add(jComboBox7.getSelectedIndex());
          secilensehirler.add(jComboBox8.getSelectedIndex());
          secilensehirler.add(jComboBox9.getSelectedIndex());
         
      }
      if(a==10){
           secilensehirler.add(jComboBox1.getSelectedIndex());
          secilensehirler.add(jComboBox2.getSelectedIndex());
          secilensehirler.add(jComboBox3.getSelectedIndex());
          secilensehirler.add(jComboBox4.getSelectedIndex());
          secilensehirler.add(jComboBox5.getSelectedIndex());
          secilensehirler.add(jComboBox6.getSelectedIndex());
          secilensehirler.add(jComboBox7.getSelectedIndex());
          secilensehirler.add(jComboBox8.getSelectedIndex());
          secilensehirler.add(jComboBox9.getSelectedIndex());
          secilensehirler.add(jComboBox10.getSelectedIndex());
        
        
      }
        
      for(int i=0;i<secilensehirler.size();i++){
            sehirler[i]=secilensehirler.get(i);           
        }
       int a=secilensehirler.size();
       Harita harita=new Harita();
        harita.setVisible(true);
        harita.verilerial(a, secilensehirler);
        dispose();
        
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       a = jComboBox11.getSelectedIndex()+1;
      
      jButton1.setVisible(true);
      jButton2.setVisible(false);
      jComboBox11.setVisible(false);
      jLabel2.setVisible(false);
      jLabel3.setVisible(true);

      if(a==1){
          jComboBox1.setVisible(true);
      }
      if(a==2){
          jComboBox1.setVisible(true);
          jComboBox2.setVisible(true);
      }
      if(a==3){
          jComboBox1.setVisible(true);
          jComboBox2.setVisible(true);
          jComboBox3.setVisible(true);
      }
      if(a==4){
          jComboBox1.setVisible(true);
          jComboBox2.setVisible(true);
          jComboBox3.setVisible(true);
          jComboBox4.setVisible(true);
      }
      if(a==5){
          jComboBox1.setVisible(true);
          jComboBox2.setVisible(true);
          jComboBox3.setVisible(true);
          jComboBox4.setVisible(true);
          jComboBox5.setVisible(true);
      }
      if(a==6){
          jComboBox1.setVisible(true);
          jComboBox2.setVisible(true);
          jComboBox3.setVisible(true);
          jComboBox4.setVisible(true);
          jComboBox5.setVisible(true);
          jComboBox6.setVisible(true);
      }
      if(a==7){
          jComboBox1.setVisible(true);
          jComboBox2.setVisible(true);
          jComboBox3.setVisible(true);
          jComboBox4.setVisible(true);
          jComboBox5.setVisible(true);
          jComboBox6.setVisible(true);
          jComboBox7.setVisible(true);
      }
      if(a==8){
          jComboBox1.setVisible(true);
          jComboBox2.setVisible(true);
          jComboBox3.setVisible(true);
          jComboBox4.setVisible(true);
          jComboBox5.setVisible(true);
          jComboBox6.setVisible(true);
          jComboBox7.setVisible(true);
          jComboBox8.setVisible(true);
      }
      if(a==9){
          jComboBox1.setVisible(true);
          jComboBox2.setVisible(true);
          jComboBox3.setVisible(true);
          jComboBox4.setVisible(true);
          jComboBox5.setVisible(true);
          jComboBox6.setVisible(true);
          jComboBox7.setVisible(true);
          jComboBox8.setVisible(true);
          jComboBox9.setVisible(true);
      }
      if(a==10){
          jComboBox1.setVisible(true);
          jComboBox2.setVisible(true);
          jComboBox3.setVisible(true);
          jComboBox4.setVisible(true);
          jComboBox5.setVisible(true);
          jComboBox6.setVisible(true);
          jComboBox7.setVisible(true);
          jComboBox8.setVisible(true);
          jComboBox9.setVisible(true);
          jComboBox10.setVisible(true);
      }
         
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formAncestorMoved(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_formAncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_formAncestorMoved

    public ArrayList<Integer> getsecilensehirler(){
    return secilensehirler;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
         //panel panel=new panel();
                new panel().setVisible(true);
            }
        });
        
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
