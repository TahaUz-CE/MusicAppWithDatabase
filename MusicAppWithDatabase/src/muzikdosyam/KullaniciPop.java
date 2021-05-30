
package muzikdosyam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class KullaniciPop extends javax.swing.JFrame {

    public String kullaniciAD;
    public String myUserName;
    public KullaniciPop kulp;
    public AnaProgram prog;
    public String mykullaniciType;
    public String kullaniciType;
    public int TakipYakala;
    public ArrayList<String> tblColmnData;
    public String Ulke;
    public int dinlenmeSayisiOnay=0;

    
    public KullaniciPop(String kullaniciad, String mykullanicitype, String myusername, String kullanicitype , String ulke) {
        initComponents();
        this.kullaniciAD = kullaniciad;
        this.mykullaniciType = mykullanicitype;
        this.myUserName = myusername;
        this.kullaniciType = kullanicitype;
        this.Ulke = ulke;
        musicekle.setVisible(false);
        jLabel2.setText("");
        jLabel3.setText("");
        jLabel4.setText("");
        jLabel1.setText(kullaniciAD.toUpperCase() + " MUSİC PROFILE ");
        jLabel6.setText(kullaniciAD.toUpperCase() + " PROFIL GORUNTULEMEK ISTIYORSANIZ TAKİP EDINIZ !");
        checkTakipListesi();
        takipBirak.setVisible(false);
        if (TakipYakala == 1) {
            jLabel6.setVisible(false);
            TakipEt.setVisible(false);
            musicekle.setVisible(true);
            profilGoster();
        }

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        takipBirak = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TakipEt = new javax.swing.JButton();
        musicekle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jPanel2.setBackground(new java.awt.Color(102, 0, 102));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("jLabel1");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SEKMEYİ KAPAT");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        takipBirak.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        takipBirak.setText("Takibi Birak");
        takipBirak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                takipBirakMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(366, 366, 366)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(takipBirak)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(takipBirak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTable1 = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex , int colIndex){
                return false;
            }
        };
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTable2 = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex , int colIndex){
                return false;
            }
        };
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jTable3 = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex , int colIndex){
                return false;
            }
        };
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("jLabel2");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("jLabel3");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("jLabel4");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("jLabel6");

        TakipEt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TakipEt.setText("Takip Et");
        TakipEt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TakipEtMouseClicked(evt);
            }
        });

        musicekle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        musicekle.setText("Muziklerime Ekle");
        musicekle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                musicekleMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(245, 245, 245)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TakipEt, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(musicekle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane3)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 22, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TakipEt, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(musicekle)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        kulp.setVisible(false);
        prog.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void TakipEtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TakipEtMouseClicked
        if (kullaniciType.toLowerCase().equals("premium")) {
            ekleTakipListesi();
            jLabel6.setVisible(false);
            TakipEt.setVisible(false);
            musicekle.setVisible(true);
            profilGoster();
        } else {
            JOptionPane.showMessageDialog(null, "SADECE PREMIUM KULLANICILAR TAKIP EDILEBILIR LUTFEN PREMIUM KULLANICILARI SECINIZ ! ");
        }
    }//GEN-LAST:event_TakipEtMouseClicked

    private void musicekleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_musicekleMouseClicked

        if (checkarrayfornull()) {

            try {
                Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/musicapidb", "root", "1234");

                String sorgu = "INSERT INTO " + myUserName + " values('" + tblColmnData.get(0) + "','" + tblColmnData.get(1) + "','" + tblColmnData.get(2) + "','" + tblColmnData.get(3) + "'," + Float.parseFloat(tblColmnData.get(4)) + ")";
                Statement sta = myConn.createStatement();

                int x = sta.executeUpdate(sorgu);

                if (x == 0) {
                    JOptionPane.showMessageDialog(null, "Sarki zaten var !");
                } else {
                    JOptionPane.showMessageDialog(null, "Sarki basariyla listenize eklendi !");
                    dinlenmeSayisiOnay = 1;
                }
            } catch (Exception e) {

                if (e.getMessage().indexOf("Duplicate") != -1) {
                    JOptionPane.showMessageDialog(null, "Bu  sarki listenizde zaten var !");
                } else {
                    JOptionPane.showMessageDialog(null, "Data Base Hatasi : " + e.getMessage());
                }

            }
        }
        
        if (dinlenmeSayisiOnay == 1) {
            
            try {
                Connection myConn2 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/musicapidb", "root", "1234");

                String sorgu2;

                if (Ulke.toLowerCase().equals("abd")) {
                    sorgu2 = "UPDATE dinlenmesayisi SET abd = abd+1  WHERE (sarkiad = '" + tblColmnData.get(0) + "')";
                } else if (Ulke.toLowerCase().equals("turkiye")) {
                    sorgu2 = "UPDATE dinlenmesayisi SET turkiye = turkiye+1  WHERE (sarkiad = '" + tblColmnData.get(0) + "')";
                } else if (Ulke.toLowerCase().equals("almanya")) {
                    sorgu2 = "UPDATE dinlenmesayisi SET almanya = almanya+1  WHERE (sarkiad = '" + tblColmnData.get(0) + "')";
                } else {
                    sorgu2 = "UPDATE dinlenmesayisi SET abd = abd+1 , turkiye = turkiye+1 , almanya = almanya+1  WHERE (sarkiad = '" + tblColmnData.get(0) + "')";
                }

                Statement sta2 = myConn2.createStatement();

                int x = sta2.executeUpdate(sorgu2);

                if (x == 0) {
                    JOptionPane.showMessageDialog(null, "Raiting zaten var !");
                } else {
                    JOptionPane.showMessageDialog(null, "Raiting basariyla guncellendi !");
                }
            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "Data Base Hatasi : " + e.getMessage());

            }
        }

        dinlenmeSayisiOnay = 0;
        tblColmnData = new ArrayList<>();
    }//GEN-LAST:event_musicekleMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
        int colmn_count = jTable1.getColumnCount();
        tblColmnData = new ArrayList<>();

        for (int i = 0; i < colmn_count; i++) {
            tblColmnData.add(tblModel.getValueAt(jTable1.getSelectedRow(), i).toString());
            //System.out.println(tblModel2.getValueAt(jTable2.getSelectedRow(), i).toString());
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        DefaultTableModel tblModel2 = (DefaultTableModel) jTable2.getModel();
        int colmn_count = jTable2.getColumnCount();
        tblColmnData = new ArrayList<>();

        for (int i = 0; i < colmn_count; i++) {
            tblColmnData.add(tblModel2.getValueAt(jTable2.getSelectedRow(), i).toString());
            //System.out.println(tblModel2.getValueAt(jTable2.getSelectedRow(), i).toString());
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        DefaultTableModel tblModel3 = (DefaultTableModel) jTable3.getModel();
        int colmn_count = jTable3.getColumnCount();
        tblColmnData = new ArrayList<>();

        for (int i = 0; i < colmn_count; i++) {
            tblColmnData.add(tblModel3.getValueAt(jTable3.getSelectedRow(), i).toString());
            //System.out.println(tblModel2.getValueAt(jTable2.getSelectedRow(), i).toString());
        }
    }//GEN-LAST:event_jTable3MouseClicked

    private void takipBirakMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_takipBirakMouseClicked
        silTakipListesi();
        takipBirak.setVisible(false);
        jLabel6.setVisible(true);
        TakipEt.setVisible(true);
        musicekle.setVisible(false);
        jLabel2.setText("");
        jLabel3.setText("");
        jLabel4.setText("");
        jTable1.setModel(new DefaultTableModel());
        jTable2.setModel(new DefaultTableModel());
        jTable3.setModel(new DefaultTableModel());
        jLabel1.setText(kullaniciAD.toUpperCase() + " MUSİC PROFILE ");
        jLabel6.setText(kullaniciAD.toUpperCase() + " PROFIL GORUNTULEMEK ISTIYORSANIZ TAKİP EDINIZ !");
    }//GEN-LAST:event_takipBirakMouseClicked

    public void profilGoster() {
        takipBirak.setVisible(true);
        jTable1.setModel(new DefaultTableModel());
        jTable2.setModel(new DefaultTableModel());
        jTable3.setModel(new DefaultTableModel());

        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
        DefaultTableModel tblModel2 = (DefaultTableModel) jTable2.getModel();
        DefaultTableModel tblModel3 = (DefaultTableModel) jTable3.getModel();

        ArrayList<String> ColmnName = new ArrayList<>();
        ArrayList<String> MusicType = new ArrayList<>();

        ColmnName.add("AD");
        ColmnName.add("Tarih");
        ColmnName.add("Album");
        ColmnName.add("Tur");
        ColmnName.add("Sure");

        MusicType.add("Pop");
        MusicType.add("Jazz");
        MusicType.add("Klasik");

        jLabel2.setText(MusicType.get(1));
        jLabel3.setText(MusicType.get(0));
        jLabel4.setText(MusicType.get(2));

        for (int i = 0; i < ColmnName.size(); i++) {
            tblModel.addColumn(ColmnName.get(i));
        }
        for (int i = 0; i < ColmnName.size(); i++) {
            tblModel2.addColumn(ColmnName.get(i));
        }
        for (int i = 0; i < ColmnName.size(); i++) {
            tblModel3.addColumn(ColmnName.get(i));
        }

        try {
            Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/musicapidb", "root", "1234");
            Statement myStat = (Statement) myConn.createStatement();
            ResultSet myRs = myStat.executeQuery("select * from " + kullaniciAD + " where tur = '" + MusicType.get(1) + "'");
            while (myRs.next()) {
                String sarkiad = myRs.getString("sarkiad");
                String tarih = myRs.getString("tarih");
                String album = myRs.getString("album");
                String tur = myRs.getString("tur");
                float sure = myRs.getFloat("sure");
                String tbData[] = {sarkiad, tarih, album, tur, sure + ""};

                tblModel.addRow(tbData);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Base Hatasi : " + e.getMessage());
        }

        try {
            Connection myConn2 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/musicapidb", "root", "1234");
            Statement myStat2 = (Statement) myConn2.createStatement();
            ResultSet myRs2 = myStat2.executeQuery("select * from " + kullaniciAD + " where tur = '" + MusicType.get(0) + "'");
            while (myRs2.next()) {
                String sarkiad2 = myRs2.getString("sarkiad");
                String tarih2 = myRs2.getString("tarih");
                String album2 = myRs2.getString("album");
                String tur2 = myRs2.getString("tur");
                float sure2 = myRs2.getFloat("sure");
                String tbData2[] = {sarkiad2, tarih2, album2, tur2, sure2 + ""};

                tblModel2.addRow(tbData2);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Base Hatasi : " + e.getMessage());
        }

        try {
            Connection myConn3 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/musicapidb", "root", "1234");
            Statement myStat3 = (Statement) myConn3.createStatement();
            ResultSet myRs3 = myStat3.executeQuery("select * from " + kullaniciAD + " where tur = '" + MusicType.get(2) + "'");
            while (myRs3.next()) {
                String sarkiad3 = myRs3.getString("sarkiad");
                String tarih3 = myRs3.getString("tarih");
                String album3 = myRs3.getString("album");
                String tur3 = myRs3.getString("tur");
                float sure3 = myRs3.getFloat("sure");
                String tbData3[] = {sarkiad3, tarih3, album3, tur3, sure3 + ""};

                tblModel3.addRow(tbData3);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Base Hatasi : " + e.getMessage());
        }
    }

    public void al(KullaniciPop kulp_temp, AnaProgram prog_temp) {
        kulp = kulp_temp;
        prog = prog_temp;
    }

    public void checkTakipListesi() {
        TakipYakala = 0;
        try {
            Connection myConn4 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/musicapidb", "root", "1234");
            Statement myStat4 = (Statement) myConn4.createStatement();
            ResultSet myRs4 = myStat4.executeQuery("select * from takiplistesi where kim = '" + myUserName + "'");
            while (myRs4.next()) {
                if (myRs4.getString("kimi").equals(kullaniciAD)) {
                    TakipYakala = 1;
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Base Hatasi : " + e.getMessage());
        }
    }

    public void ekleTakipListesi() {
        try {
            Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/musicapidb", "root", "1234");

            String sorgu = "INSERT INTO takiplistesi values('" + myUserName + "','" + kullaniciAD + "')";
            Statement sta = myConn.createStatement();

            int x = sta.executeUpdate(sorgu);

            if (x == 0) {
                JOptionPane.showMessageDialog(null, "Bu " + kullaniciAD + " zaten takip ediliyor !");
            }

        } catch (Exception e) {

            if (e.getMessage().indexOf("Duplicate") != -1) {
                JOptionPane.showMessageDialog(null, kullaniciAD + " zaten takip ediliyor !");
            } else {
                JOptionPane.showMessageDialog(null, "Data Base Hatasi : " + e.getMessage());
            }

        }
    }

    public void silTakipListesi() {
        try {
            Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/musicapidb", "root", "1234");

            String sorgu = "DELETE FROM takiplistesi WHERE (kim = '" + myUserName + "') and (kimi = '" + kullaniciAD + "')";
            Statement sta = myConn.createStatement();

            int x = sta.executeUpdate(sorgu);

            if (x == 0) {
                JOptionPane.showMessageDialog(null, "Islem Basariyla Gerceklestirilemedi !");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Base Hatasi : " + e.getMessage());

        }

    }

    public boolean checkarrayfornull() {

        if (tblColmnData == null) {
            return false;
        }

        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton TakipEt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JButton musicekle;
    private javax.swing.JButton takipBirak;
    // End of variables declaration//GEN-END:variables
}
