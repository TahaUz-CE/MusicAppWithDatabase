
package muzikdosyam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class AnaProgram extends javax.swing.JFrame {

    public String kullaniciAD;
    public String kullaniciID;
    public String kullaniciSifre;
    public AnaProgram anaprog;
    public ArrayList<String> tblColmnData;
    public ArrayList<JTextField> txtColmn;
    public ArrayList<JLabel> labelName;
    public LoginScreen logisc;
    public int checkforkullanicipop;
    public String abonelik;
    public int dinlenmeSayisiOnay = 0;
   

    
    public AnaProgram(String ad, String sifre, String id) {
        initComponents();
        this.kullaniciAD = ad;
        this.kullaniciID = id;
        this.kullaniciSifre = sifre;
        arayuz_musteri_info();
        muzikekle.setVisible(false);
        muzikSil.setVisible(false);
        top10(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Musteri_isim = new javax.swing.JLabel();
        Kullanici_turu = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        musteriulke = new javax.swing.JLabel();
        bitti = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Muziklerim = new javax.swing.JButton();
        top10slct = new javax.swing.JButton();
        TumMuzikler = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        TumKullanicilar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        tbllabel1 = new javax.swing.JLabel();
        tbllabel2 = new javax.swing.JLabel();
        tbllabel3 = new javax.swing.JLabel();
        tbllabel4 = new javax.swing.JLabel();
        tbltxt1 = new javax.swing.JTextField();
        tbltxt2 = new javax.swing.JTextField();
        tbltxt3 = new javax.swing.JTextField();
        tbltxt4 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        muzikekle = new javax.swing.JButton();
        ulke = new javax.swing.JComboBox<>();
        ulkeOnay = new javax.swing.JLabel();
        muzikSil = new javax.swing.JButton();
        albumsanatci = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jPanel3.setBackground(new java.awt.Color(204, 153, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Kullanıcı Adı");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Abonelik Türü");

        Musteri_isim.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Musteri_isim.setForeground(new java.awt.Color(255, 255, 255));
        Musteri_isim.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Kullanici_turu.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Kullanici_turu.setForeground(new java.awt.Color(255, 255, 255));
        Kullanici_turu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Ulke");

        musteriulke.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        musteriulke.setForeground(new java.awt.Color(255, 255, 255));
        musteriulke.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Musteri_isim, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(Kullanici_turu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(musteriulke, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Musteri_isim, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(Kullanici_turu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(musteriulke, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bitti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/exit_1.PNG"))); // NOI18N
        bitti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bittiMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(bitti)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bitti, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        Muziklerim.setText("Muziklerim");
        Muziklerim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MuziklerimMouseClicked(evt);
            }
        });

        top10slct.setText("Top 10");
        top10slct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                top10slctMouseClicked(evt);
            }
        });

        TumMuzikler.setText("Tum Muzikler");
        TumMuzikler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TumMuziklerMouseClicked(evt);
            }
        });

        jButton4.setText("Admin Mod");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        TumKullanicilar.setText("Tum Kullanıcılar");
        TumKullanicilar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TumKullanicilarMouseClicked(evt);
            }
        });

        jTable1 = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex , int colIndex){
                return false;
            }
        };
        jTable1.setBackground(new java.awt.Color(204, 153, 0));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
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

        tbllabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tbllabel1.setForeground(new java.awt.Color(255, 255, 255));

        tbllabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tbllabel2.setForeground(new java.awt.Color(255, 255, 255));

        tbllabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tbllabel3.setForeground(new java.awt.Color(255, 255, 255));

        tbllabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tbllabel4.setForeground(new java.awt.Color(255, 255, 255));

        jTable2 = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex , int colIndex){
                return false;
            }
        };
        jTable2.setBackground(new java.awt.Color(204, 153, 0));
        jTable2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
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
        jTable3.setBackground(new java.awt.Color(204, 153, 0));
        jTable3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
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

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        muzikekle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        muzikekle.setText("MUZIKLERIME EKLE");
        muzikekle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                muzikekleMouseClicked(evt);
            }
        });

        ulke.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ulke.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Turkiye", "Almanya", "ABD", "Genel" }));

        ulkeOnay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ulkeOnay.setForeground(new java.awt.Color(255, 255, 255));
        ulkeOnay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ulkeOnay.setText("OK");
        ulkeOnay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ulkeOnayMouseClicked(evt);
            }
        });

        muzikSil.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        muzikSil.setText("MUZIK SIL");
        muzikSil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                muzikSilMouseClicked(evt);
            }
        });

        albumsanatci.setText("Album ve Sanatci");
        albumsanatci.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                albumsanatciMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Muziklerim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TumMuzikler, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TumKullanicilar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(top10slct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(albumsanatci, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tbllabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tbltxt1, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tbllabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tbltxt2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(ulkeOnay, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(143, 143, 143)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tbllabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tbltxt3, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(muzikSil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(muzikekle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)))))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tbllabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tbltxt4, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ulke, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Muziklerim)
                .addGap(18, 18, 18)
                .addComponent(top10slct)
                .addGap(18, 18, 18)
                .addComponent(TumMuzikler)
                .addGap(18, 18, 18)
                .addComponent(TumKullanicilar)
                .addGap(18, 18, 18)
                .addComponent(albumsanatci)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(32, 32, 32))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ulke, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ulkeOnay, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(muzikekle)
                .addGap(7, 7, 7)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbllabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbllabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbllabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbllabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(muzikSil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbltxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbltxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbltxt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbltxt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void bittiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bittiMouseClicked
        anaprog.setVisible(false);
        logisc.setVisible(true);
    }//GEN-LAST:event_bittiMouseClicked

    private void TumKullanicilarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TumKullanicilarMouseClicked
        top10(false);
        checkforkullanicipop = 1;
        muzikekle.setVisible(false);
        muzikSil.setVisible(false);
        tumKullaniciOnOff(false);
        muziklerimOnOff(false);

        tbltxtress();

        jTable1.setModel(new DefaultTableModel());
        jTable2.setModel(new DefaultTableModel());
        jTable3.setModel(new DefaultTableModel());

        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
        txtColmn = new ArrayList<>();
        labelName = new ArrayList<>();
        ArrayList<String> ColmnName = new ArrayList<>();

        ColmnName.add("ID");
        ColmnName.add("AD");
        ColmnName.add("Mail");
        ColmnName.add("Abonelik");
        ColmnName.add("Ulke");

        for (int i = 0; i < ColmnName.size(); i++) {
            tblModel.addColumn(ColmnName.get(i));
        }

        txtColmn.add(tbltxt1);
        txtColmn.add(tbltxt2);
        txtColmn.add(tbltxt3);
        txtColmn.add(tbltxt4);

        labelName.add(tbllabel1);
        labelName.add(tbllabel2);
        labelName.add(tbllabel3);
        labelName.add(tbllabel4);

        for (int i = 0; i < labelName.size(); i++) {
            labelName.get(i).setText(ColmnName.get(i));
        }

        try {
            Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/musicapidb", "root", "1234");
            Statement myStat = (Statement) myConn.createStatement();
            ResultSet myRs = myStat.executeQuery("select * from kullanici order by kullaniciid ASC");
            while (myRs.next()) {
                String id = myRs.getString("kullaniciid");
                String ad = myRs.getString("kullaniciad");
                String email = myRs.getString("email");
                String abonelik = myRs.getString("abonelikturu");
                String ulke = myRs.getString("ulke");

                String tbData[] = {id, ad, email, abonelik, ulke};

                tblModel.addRow(tbData);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Base Hatasi : " + e.getMessage());
        }

    }//GEN-LAST:event_TumKullanicilarMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
        int colmn_count = jTable1.getColumnCount();
        tblColmnData = new ArrayList<>();

        for (int i = 0; i < colmn_count; i++) {
            tblColmnData.add(tblModel.getValueAt(jTable1.getSelectedRow(), i).toString());
            //System.out.println(tblModel.getValueAt(jTable1.getSelectedRow(), i).toString());

        }
        if (tblColmnData.size() <= txtColmn.size()) {
            for (int i = 0; i < tblColmnData.size(); i++) {
                txtColmn.get(i).setText(tblColmnData.get(i));

            }
        }

        if (checkforkullanicipop == 1) {

            KullaniciPop kulp = new KullaniciPop(tblColmnData.get(1), Kullanici_turu.getText(), kullaniciAD, tblColmnData.get(3),musteriulke.getText());
            kulp.al(kulp, anaprog);
            kulp.setVisible(true);
            anaprog.setVisible(false);
        }

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        AdminArayuz admin = new AdminArayuz();
        admin.al(admin, anaprog);
        admin.setVisible(true);
        anaprog.setVisible(false);
    }//GEN-LAST:event_jButton4MouseClicked

    private void MuziklerimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MuziklerimMouseClicked
        muziklerimTablo();
    }//GEN-LAST:event_MuziklerimMouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        DefaultTableModel tblModel2 = (DefaultTableModel) jTable2.getModel();
        int colmn_count = jTable2.getColumnCount();
        tblColmnData = new ArrayList<>();

        for (int i = 0; i < colmn_count; i++) {
            tblColmnData.add(tblModel2.getValueAt(jTable2.getSelectedRow(), i).toString());
            //System.out.println(tblModel2.getValueAt(jTable2.getSelectedRow(), i).toString());
        }

        if (tblColmnData.size() <= txtColmn.size()) {
            for (int i = 0; i < tblColmnData.size(); i++) {
                txtColmn.get(i).setText(tblColmnData.get(i));

            }
        }

    }//GEN-LAST:event_jTable2MouseClicked

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        DefaultTableModel tblModel3 = (DefaultTableModel) jTable3.getModel();
        int colmn_count = jTable3.getColumnCount();
        tblColmnData = new ArrayList<>();

        for (int i = 0; i < colmn_count; i++) {
            tblColmnData.add(tblModel3.getValueAt(jTable3.getSelectedRow(), i).toString());
            //System.out.println(tblModel3.getValueAt(jTable3.getSelectedRow(), i).toString());
        }
        if (tblColmnData.size() <= txtColmn.size()) {
            for (int i = 0; i < tblColmnData.size(); i++) {
                txtColmn.get(i).setText(tblColmnData.get(i));

            }
        }
    }//GEN-LAST:event_jTable3MouseClicked

    private void TumMuziklerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TumMuziklerMouseClicked
        top10(false);

        checkforkullanicipop = 0;
        muzikekle.setVisible(true);
        muzikSil.setVisible(false);
        tumKullaniciOnOff(false);
        muziklerimOnOff(true);

        //NULL HATASI VERMEMESI ICIN YAZDIM
        txtColmn = new ArrayList<>();
        labelName = new ArrayList<>();

        tbltxtress();

        jTable1.setModel(new DefaultTableModel());
        jTable2.setModel(new DefaultTableModel());
        jTable3.setModel(new DefaultTableModel());

        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
        DefaultTableModel tblModel2 = (DefaultTableModel) jTable2.getModel();
        DefaultTableModel tblModel3 = (DefaultTableModel) jTable3.getModel();
        int no = 1;
        ArrayList<String> ColmnName = new ArrayList<>();
        ArrayList<String> MusicType = new ArrayList<>();

        ColmnName.add("NO");
        ColmnName.add("Sarki AD");
        ColmnName.add("Tarih");
        ColmnName.add("Album");
        ColmnName.add("Tur");
        ColmnName.add("Sure");

        MusicType.add("Pop");
        MusicType.add("Jazz");
        MusicType.add("Klasik");

        jLabel3.setText(MusicType.get(0));
        jLabel4.setText(MusicType.get(1));
        jLabel5.setText(MusicType.get(2));

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
            ResultSet myRs = myStat.executeQuery("select * from sarki where tur = '" + MusicType.get(1) + "'");
            while (myRs.next()) {
                String sarkiad = myRs.getString("ad");
                String tarih = myRs.getString("tarih");
                String album = myRs.getString("album");
                String tur = myRs.getString("tur");
                String sure = myRs.getString("sure");

                String tbData[] = {no + "", sarkiad, tarih, album, tur, sure};

                tblModel.addRow(tbData);
                no++;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Base Hatasi : " + e.getMessage());
        }
        no = 1;
        try {
            Connection myConn2 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/musicapidb", "root", "1234");
            Statement myStat2 = (Statement) myConn2.createStatement();
            ResultSet myRs2 = myStat2.executeQuery("select * from sarki where tur = '" + MusicType.get(0) + "'");
            while (myRs2.next()) {
                String sarkiad = myRs2.getString("ad");
                String tarih = myRs2.getString("tarih");
                String album = myRs2.getString("album");
                String tur = myRs2.getString("tur");
                String sure = myRs2.getString("sure");

                String tbData2[] = {no + "", sarkiad, tarih, album, tur, sure};

                tblModel2.addRow(tbData2);
                no++;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Base Hatasi : " + e.getMessage());
        }
        no = 1;
        try {
            Connection myConn3 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/musicapidb", "root", "1234");
            Statement myStat3 = (Statement) myConn3.createStatement();
            ResultSet myRs3 = myStat3.executeQuery("select * from sarki where tur = '" + MusicType.get(2) + "'");
            while (myRs3.next()) {
                String sarkiad = myRs3.getString("ad");
                String tarih = myRs3.getString("tarih");
                String album = myRs3.getString("album");
                String tur = myRs3.getString("tur");
                String sure = myRs3.getString("sure");

                String tbData3[] = {no + "", sarkiad, tarih, album, tur, sure};

                tblModel3.addRow(tbData3);
                no++;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Base Hatasi : " + e.getMessage());
        }

    }//GEN-LAST:event_TumMuziklerMouseClicked

    private void muzikekleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_muzikekleMouseClicked
        
        if (checkarrayfornull()) {
            try {
                Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/musicapidb", "root", "1234");

                String sorgu = "INSERT INTO " + kullaniciAD + " values('" + tblColmnData.get(1) + "','" + tblColmnData.get(2) + "','" + tblColmnData.get(3) + "','" + tblColmnData.get(4) + "'," + Float.parseFloat(tblColmnData.get(5)) + ")";
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

                if (musteriulke.getText().toLowerCase().equals("abd")) {
                    sorgu2 = "UPDATE dinlenmesayisi SET abd = abd+1  WHERE (sarkiad = '" + tblColmnData.get(1) + "')";
                } else if (musteriulke.getText().toLowerCase().equals("turkiye")) {
                    sorgu2 = "UPDATE dinlenmesayisi SET turkiye = turkiye+1  WHERE (sarkiad = '" + tblColmnData.get(1) + "')";
                } else if (musteriulke.getText().toLowerCase().equals("almanya")) {
                    sorgu2 = "UPDATE dinlenmesayisi SET almanya = almanya+1  WHERE (sarkiad = '" + tblColmnData.get(1) + "')";
                } else {
                    sorgu2 = "UPDATE dinlenmesayisi SET abd = abd+1 , turkiye = turkiye+1 , almanya = almanya+1  WHERE (sarkiad = '" + tblColmnData.get(1) + "')";
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
    }//GEN-LAST:event_muzikekleMouseClicked

    private void ulkeOnayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ulkeOnayMouseClicked
        jTable1.setModel(new DefaultTableModel());
        jTable2.setModel(new DefaultTableModel());
        jTable3.setModel(new DefaultTableModel());

        String cou = ulke.getSelectedItem().toString();
        jLabel7.setVisible(true);
        jLabel7.setText(cou + " TOP 10");
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
        DefaultTableModel tblModel2 = (DefaultTableModel) jTable2.getModel();
        DefaultTableModel tblModel3 = (DefaultTableModel) jTable3.getModel();
        txtColmn = new ArrayList<>();
        labelName = new ArrayList<>();
        ArrayList<String> ColmnName = new ArrayList<>();
        int no = 1;

        ColmnName.add("NO");
        ColmnName.add("Sarkı AD");
        ColmnName.add("Tarih");
        ColmnName.add("Album");
        ColmnName.add("Tur");
        ColmnName.add("Süre");

        if (cou == "Turkiye") {
            ColmnName.add("Türkiye Dinlenme");
        }
        if (cou == "Almanya") {
            ColmnName.add("Almanya Dinlenme");
        }
        if (cou == "ABD") {
            ColmnName.add("ABD Dinlenme");
        }
        if (cou == "Genel") {
            ColmnName.add("Genel Dinlenme");
        }

        for (int i = 0; i < ColmnName.size(); i++) {
            tblModel.addColumn(ColmnName.get(i));
        }

        for (int i = 0; i < ColmnName.size(); i++) {
            tblModel2.addColumn(ColmnName.get(i));
        }

        for (int i = 0; i < ColmnName.size(); i++) {
            tblModel3.addColumn(ColmnName.get(i));
        }

        ArrayList<String> MusicType = new ArrayList<>();

        MusicType.add("Pop");
        MusicType.add("Jazz");
        MusicType.add("Klasik");

        jLabel3.setText(MusicType.get(0));
        jLabel4.setText(MusicType.get(1));
        jLabel5.setText(MusicType.get(2));

        try {
            Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/musicapidb", "root", "1234");
            Statement myStat = (Statement) myConn.createStatement();
            if (cou == "Turkiye") {
                ResultSet myRs = myStat.executeQuery("select * from sarki,dinlenmesayisi where sarki.ad = dinlenmesayisi.sarkiad and sarki.tur = '" + MusicType.get(1) + "' order by turkiye DESC");
                while (myRs.next() && no<=10) {

                    String ad = myRs.getString("ad");
                    String tarih = myRs.getString("tarih");
                    String sanatci = myRs.getString("album");
                    String tur = myRs.getString("tur");
                    String sure = myRs.getString("sure");
                    int trdinlenmesayi = myRs.getInt("turkiye");
                    String tbData[] = {no + "", ad, tarih, sanatci, tur, sure, trdinlenmesayi + ""};
                    tblModel.addRow(tbData);
                    no++;
                }
                no = 1;
                ResultSet myRs2 = myStat.executeQuery("select * from sarki,dinlenmesayisi where sarki.ad = dinlenmesayisi.sarkiad and sarki.tur = '" + MusicType.get(0) + "' order by turkiye DESC");
                while (myRs2.next() && no<=10) {

                    String ad = myRs2.getString("ad");
                    String tarih = myRs2.getString("tarih");
                    String sanatci = myRs2.getString("album");
                    String tur = myRs2.getString("tur");
                    String sure = myRs2.getString("sure");
                    int trdinlenmesayi = myRs2.getInt("turkiye");
                    String tbData2[] = {no + "", ad, tarih, sanatci, tur, sure, trdinlenmesayi + ""};
                    tblModel2.addRow(tbData2);
                    no++;
                }
                no = 1;
                ResultSet myRs3 = myStat.executeQuery("select * from sarki,dinlenmesayisi where sarki.ad = dinlenmesayisi.sarkiad and sarki.tur = '" + MusicType.get(2) + "' order by turkiye DESC");
                while (myRs3.next() && no<=10) {

                    String ad = myRs3.getString("ad");
                    String tarih = myRs3.getString("tarih");
                    String sanatci = myRs3.getString("album");
                    String tur = myRs3.getString("tur");
                    String sure = myRs3.getString("sure");
                    int trdinlenmesayi = myRs3.getInt("turkiye");
                    String tbData3[] = {no + "", ad, tarih, sanatci, tur, sure, trdinlenmesayi + ""};
                    tblModel3.addRow(tbData3);
                    no++;
                }
            }
            if (cou == "Almanya") {

                ResultSet myRs = myStat.executeQuery("select * from sarki,dinlenmesayisi where sarki.ad = dinlenmesayisi.sarkiad and sarki.tur = '" + MusicType.get(1) + "' order by almanya DESC");
                while (myRs.next() && no<=10) {

                    String ad = myRs.getString("ad");
                    String tarih = myRs.getString("tarih");
                    String sanatci = myRs.getString("album");
                    String tur = myRs.getString("tur");
                    String sure = myRs.getString("sure");
                    int aldinlenmesayi = myRs.getInt("almanya");
                    String tbData[] = {no + "", ad, tarih, sanatci, tur, sure, aldinlenmesayi + ""};
                    tblModel.addRow(tbData);
                    no++;
                }
                no = 1;
                ResultSet myRs2 = myStat.executeQuery("select * from sarki,dinlenmesayisi where sarki.ad = dinlenmesayisi.sarkiad and sarki.tur = '" + MusicType.get(0) + "' order by almanya DESC");
                while (myRs2.next() && no<=10) {

                    String ad = myRs2.getString("ad");
                    String tarih = myRs2.getString("tarih");
                    String sanatci = myRs2.getString("album");
                    String tur = myRs2.getString("tur");
                    String sure = myRs2.getString("sure");
                    int aldinlenmesayi = myRs2.getInt("almanya");
                    String tbData2[] = {no + "", ad, tarih, sanatci, tur, sure, aldinlenmesayi + ""};
                    tblModel2.addRow(tbData2);
                    no++;
                }
                no = 1;
                ResultSet myRs3 = myStat.executeQuery("select * from sarki,dinlenmesayisi where sarki.ad = dinlenmesayisi.sarkiad and sarki.tur = '" + MusicType.get(2) + "' order by almanya DESC");
                while (myRs3.next() && no<=10) {

                    String ad = myRs3.getString("ad");
                    String tarih = myRs3.getString("tarih");
                    String sanatci = myRs3.getString("album");
                    String tur = myRs3.getString("tur");
                    String sure = myRs3.getString("sure");
                    int aldinlenmesayi = myRs3.getInt("almanya");
                    String tbData3[] = {no + "", ad, tarih, sanatci, tur, sure, aldinlenmesayi + ""};
                    tblModel3.addRow(tbData3);
                    no++;
                }
            }

            if (cou == "ABD") {

                ResultSet myRs = myStat.executeQuery("select * from sarki,dinlenmesayisi where sarki.ad = dinlenmesayisi.sarkiad and sarki.tur = '" + MusicType.get(1) + "' order by abd DESC");
                while (myRs.next() && no<=10) {

                    String ad = myRs.getString("ad");
                    String tarih = myRs.getString("tarih");
                    String sanatci = myRs.getString("album");
                    String tur = myRs.getString("tur");
                    String sure = myRs.getString("sure");
                    int abdinlenmesayi = myRs.getInt("abd");
                    String tbData[] = {no + "", ad, tarih, sanatci, tur, sure, abdinlenmesayi + ""};
                    tblModel.addRow(tbData);
                    no++;
                }
                no = 1;
                ResultSet myRs2 = myStat.executeQuery("select * from sarki,dinlenmesayisi where sarki.ad = dinlenmesayisi.sarkiad and sarki.tur = '" + MusicType.get(0) + "' order by abd DESC");
                while (myRs2.next() && no<=10) {

                    String ad = myRs2.getString("ad");
                    String tarih = myRs2.getString("tarih");
                    String sanatci = myRs2.getString("album");
                    String tur = myRs2.getString("tur");
                    String sure = myRs2.getString("sure");
                    int abdinlenmesayi = myRs2.getInt("abd");
                    String tbData2[] = {no + "", ad, tarih, sanatci, tur, sure, abdinlenmesayi + ""};
                    tblModel2.addRow(tbData2);
                    no++;
                }
                no = 1;
                ResultSet myRs3 = myStat.executeQuery("select * from sarki,dinlenmesayisi where sarki.ad = dinlenmesayisi.sarkiad and sarki.tur = '" + MusicType.get(2) + "' order by abd DESC");
                while (myRs3.next() && no<=10) {

                    String ad = myRs3.getString("ad");
                    String tarih = myRs3.getString("tarih");
                    String sanatci = myRs3.getString("album");
                    String tur = myRs3.getString("tur");
                    String sure = myRs3.getString("sure");
                    int abdinlenmesayi = myRs3.getInt("abd");
                    String tbData3[] = {no + "", ad, tarih, sanatci, tur, sure, abdinlenmesayi + ""};
                    tblModel3.addRow(tbData3);
                    no++;
                }
            }
            if (cou == "Genel") {

                ResultSet myRs = myStat.executeQuery("select * from sarki,dinlenmesayisi where sarki.ad = dinlenmesayisi.sarkiad and sarki.tur = '" + MusicType.get(1) + "' order by abd+turkiye+almanya DESC");
                while (myRs.next() && no<=10) {

                    String ad = myRs.getString("ad");
                    String tarih = myRs.getString("tarih");
                    String sanatci = myRs.getString("album");
                    String tur = myRs.getString("tur");
                    String sure = myRs.getString("sure");
                    int geneldinlenmesayi = myRs.getInt("turkiye") + myRs.getInt("abd") + myRs.getInt("almanya");
                    String tbData[] = {no + "", ad, tarih, sanatci, tur, sure, geneldinlenmesayi + ""};
                    tblModel.addRow(tbData);
                    no++;
                }
                no = 1;
                ResultSet myRs2 = myStat.executeQuery("select * from sarki,dinlenmesayisi where sarki.ad = dinlenmesayisi.sarkiad and sarki.tur = '" + MusicType.get(0) + "' order by abd+turkiye+almanya DESC");
                while (myRs2.next() && no<=10) {

                    String ad = myRs2.getString("ad");
                    String tarih = myRs2.getString("tarih");
                    String sanatci = myRs2.getString("album");
                    String tur = myRs2.getString("tur");
                    String sure = myRs2.getString("sure");
                    int geneldinlenmesayi = myRs2.getInt("turkiye") + myRs2.getInt("abd") + myRs2.getInt("almanya");
                    String tbData2[] = {no + "", ad, tarih, sanatci, tur, sure, geneldinlenmesayi + ""};
                    tblModel2.addRow(tbData2);
                    no++;
                }
                no = 1;
                ResultSet myRs3 = myStat.executeQuery("select * from sarki,dinlenmesayisi where sarki.ad = dinlenmesayisi.sarkiad and sarki.tur = '" + MusicType.get(2) + "' order by abd+turkiye+almanya DESC");
                while (myRs3.next() && no<=10) {

                    String ad = myRs3.getString("ad");
                    String tarih = myRs3.getString("tarih");
                    String sanatci = myRs3.getString("album");
                    String tur = myRs3.getString("tur");
                    String sure = myRs3.getString("sure");
                    int geneldinlenmesayi = myRs3.getInt("turkiye") + myRs3.getInt("abd") + myRs3.getInt("almanya");
                    String tbData3[] = {no + "", ad, tarih, sanatci, tur, sure, geneldinlenmesayi + ""};
                    tblModel3.addRow(tbData3);
                    no++;
                }

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Base Hatasi : " + e.getMessage());
        }


    }//GEN-LAST:event_ulkeOnayMouseClicked

    private void top10slctMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_top10slctMouseClicked

        jTable1.setModel(new DefaultTableModel());
        jTable2.setModel(new DefaultTableModel());
        jTable3.setModel(new DefaultTableModel());
        muzikekle.setVisible(true);
        muzikSil.setVisible(false);
        tumKullaniciOnOff(false);
        muziklerimOnOff(true);

        top10standart();
        if (Kullanici_turu.getText().toLowerCase().equals("standart")) {
            top10(false);
        } else {
            top10(true);
        }
        jLabel7.setVisible(true);
    }//GEN-LAST:event_top10slctMouseClicked

    private void muzikSilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_muzikSilMouseClicked

        if (checkarrayfornull()) {
            try {
                Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/musicapidb", "root", "1234");

                String sorgu = "DELETE FROM " + kullaniciAD + " WHERE (sarkiad = '" + tblColmnData.get(0) + "') and (tarih = '" + tblColmnData.get(1) + "')";
                Statement sta = myConn.createStatement();

                int x = sta.executeUpdate(sorgu);

                if (x == 0) {
                    JOptionPane.showMessageDialog(null, "Sarki zaten yok !");
                } else {
                    JOptionPane.showMessageDialog(null, "Sarki listenizden silindi !");
                    muziklerimTablo();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data Base Hatasi : " + e.getMessage());

            }
        }
        tblColmnData = new ArrayList<>();
    }//GEN-LAST:event_muzikSilMouseClicked

    private void albumsanatciMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_albumsanatciMouseClicked
        jTable1.setModel(new DefaultTableModel());
        jTable2.setModel(new DefaultTableModel());
        jTable3.setModel(new DefaultTableModel());
        muzikekle.setVisible(false);
        muzikSil.setVisible(false);
        tumKullaniciOnOff(false);
        muziklerimOnOff(true);
        top10(false);
        jLabel3.setText("Album");
        jLabel4.setText("");
        jLabel5.setText("Sanatci");
        SanatciTablo();
        AlbumTablo();
    }//GEN-LAST:event_albumsanatciMouseClicked

    public void arayuz_musteri_info() {

        String abonelik = null;
        String ulke = null;
        try {
            Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/musicapidb", "root", "1234");
            Statement myStat = (Statement) myConn.createStatement();
            ResultSet myRs = myStat.executeQuery("select * from kullanici");
            while (myRs.next()) {

                if (myRs.getString("kullaniciid").equals(kullaniciID) && myRs.getString("sifre").equals(kullaniciSifre)) {
                    abonelik = myRs.getString("abonelikturu");
                    ulke = myRs.getString("ulke");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Base Hatasi : " + e.getMessage());
        }
        Musteri_isim.setText(kullaniciAD.toUpperCase());
        Kullanici_turu.setText(abonelik.toUpperCase());
        musteriulke.setText(ulke);

        tumKullaniciOnOff(false);
        muziklerimOnOff(false);

        if (abonelik.toLowerCase().equals("admin")) {
            jButton4.setVisible(true);
        } else {
            jButton4.setVisible(false);
        }

    }

    public void al(AnaProgram anaprog_temp, LoginScreen logisc_temp) {
        anaprog = anaprog_temp;
        logisc = logisc_temp;
    }

    public void tumKullaniciOnOff(boolean choose) {
        tbltxt1.setVisible(choose);
        tbltxt2.setVisible(choose);
        tbltxt3.setVisible(choose);
        tbltxt4.setVisible(choose);

        tbllabel1.setVisible(choose);
        tbllabel2.setVisible(choose);
        tbllabel3.setVisible(choose);
        tbllabel4.setVisible(choose);

    }

    public void muziklerimOnOff(boolean choose) {
        jLabel3.setVisible(choose);
        jLabel4.setVisible(choose);
        jLabel5.setVisible(choose);
    }

    public void tbltxtress() {
        tbltxt1.setText("");
        tbltxt2.setText("");
        tbltxt3.setText("");
        tbltxt4.setText("");
    }

    public void top10(boolean choose) {
        ulkeOnay.setVisible(choose);
        ulke.setVisible(choose);
        jLabel7.setVisible(choose);
    }

    public void top10standart() {
        jTable1.setModel(new DefaultTableModel());
        jTable2.setModel(new DefaultTableModel());
        jTable3.setModel(new DefaultTableModel());
        String cou = "Genel";
        jLabel7.setVisible(true);
        jLabel7.setText(cou + " TOP 10");
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
        DefaultTableModel tblModel2 = (DefaultTableModel) jTable2.getModel();
        DefaultTableModel tblModel3 = (DefaultTableModel) jTable3.getModel();
        txtColmn = new ArrayList<>();
        labelName = new ArrayList<>();
        ArrayList<String> ColmnName = new ArrayList<>();
        int no = 1;
        ColmnName.add("NO");
        ColmnName.add("Sarkı AD");
        ColmnName.add("Tarih");
        ColmnName.add("Album");
        ColmnName.add("Tur");
        ColmnName.add("Süre");

        ColmnName.add("Genel Dinlenme");

        for (int i = 0; i < ColmnName.size(); i++) {
            tblModel.addColumn(ColmnName.get(i));
        }

        for (int i = 0; i < ColmnName.size(); i++) {
            tblModel2.addColumn(ColmnName.get(i));
        }

        for (int i = 0; i < ColmnName.size(); i++) {
            tblModel3.addColumn(ColmnName.get(i));
        }

        ArrayList<String> MusicType = new ArrayList<>();

        MusicType.add("Pop");
        MusicType.add("Jazz");
        MusicType.add("Klasik");

        jLabel3.setText(MusicType.get(0));
        jLabel4.setText(MusicType.get(1));
        jLabel5.setText(MusicType.get(2));

        try {
            Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/musicapidb", "root", "1234");
            Statement myStat = (Statement) myConn.createStatement();

            ResultSet myRs = myStat.executeQuery("select * from sarki,dinlenmesayisi where sarki.ad = dinlenmesayisi.sarkiad and sarki.tur = '" + MusicType.get(1) + "' order by abd+turkiye+almanya DESC");
            while (myRs.next() && no<=10) {

                String ad = myRs.getString("ad");
                String tarih = myRs.getString("tarih");
                String sanatci = myRs.getString("album");
                String tur = myRs.getString("tur");
                String sure = myRs.getString("sure");
                int geneldinlenmesayi = myRs.getInt("turkiye") + myRs.getInt("abd") + myRs.getInt("almanya");
                String tbData[] = {no + "", ad, tarih, sanatci, tur, sure, geneldinlenmesayi + ""};
                tblModel.addRow(tbData);
                no++;
            }
            no = 1;
            ResultSet myRs2 = myStat.executeQuery("select * from sarki,dinlenmesayisi where sarki.ad = dinlenmesayisi.sarkiad and sarki.tur = '" + MusicType.get(0) + "' order by abd+turkiye+almanya DESC");
            while (myRs2.next() && no<=10) {

                String ad = myRs2.getString("ad");
                String tarih = myRs2.getString("tarih");
                String sanatci = myRs2.getString("album");
                String tur = myRs2.getString("tur");
                String sure = myRs2.getString("sure");
                int geneldinlenmesayi = myRs2.getInt("turkiye") + myRs2.getInt("abd") + myRs2.getInt("almanya");
                String tbData2[] = {no + "", ad, tarih, sanatci, tur, sure, geneldinlenmesayi + ""};
                tblModel2.addRow(tbData2);
                no++;
            }
            no = 1;
            ResultSet myRs3 = myStat.executeQuery("select * from sarki,dinlenmesayisi where sarki.ad = dinlenmesayisi.sarkiad and sarki.tur = '" + MusicType.get(2) + "' order by abd+turkiye+almanya DESC");
            while (myRs3.next() && no<=10) {

                String ad = myRs3.getString("ad");
                String tarih = myRs3.getString("tarih");
                String sanatci = myRs3.getString("album");
                String tur = myRs3.getString("tur");
                String sure = myRs3.getString("sure");
                int geneldinlenmesayi = myRs3.getInt("turkiye") + myRs3.getInt("abd") + myRs3.getInt("almanya");
                String tbData3[] = {no + "", ad, tarih, sanatci, tur, sure, geneldinlenmesayi + ""};
                tblModel3.addRow(tbData3);
                no++;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Base Hatasi : " + e.getMessage());
        }
    }

    public void muziklerimTablo() {
        top10(false);
        muzikekle.setVisible(false);
        muzikSil.setVisible(true);
        checkforkullanicipop = 0;
        tumKullaniciOnOff(false);
        muziklerimOnOff(true);

        tbltxtress();

        jTable1.setModel(new DefaultTableModel());
        jTable2.setModel(new DefaultTableModel());
        jTable3.setModel(new DefaultTableModel());

        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
        DefaultTableModel tblModel2 = (DefaultTableModel) jTable2.getModel();
        DefaultTableModel tblModel3 = (DefaultTableModel) jTable3.getModel();
        txtColmn = new ArrayList<>();
        labelName = new ArrayList<>();
        ArrayList<String> ColmnName = new ArrayList<>();
        ArrayList<String> MusicType = new ArrayList<>();

        ColmnName.add("Sarki AD");
        ColmnName.add("Tarih");
        ColmnName.add("Album");
        ColmnName.add("Tur");
        ColmnName.add("Sure");

        MusicType.add("Pop");
        MusicType.add("Jazz");
        MusicType.add("Klasik");

        jLabel3.setText(MusicType.get(0));
        jLabel4.setText(MusicType.get(1));
        jLabel5.setText(MusicType.get(2));

        for (int i = 0; i < ColmnName.size(); i++) {
            tblModel.addColumn(ColmnName.get(i));
        }
        for (int i = 0; i < ColmnName.size(); i++) {
            tblModel2.addColumn(ColmnName.get(i));
        }
        for (int i = 0; i < ColmnName.size(); i++) {
            tblModel3.addColumn(ColmnName.get(i));
        }

        txtColmn.add(tbltxt1);
        txtColmn.add(tbltxt2);
        txtColmn.add(tbltxt3);
        txtColmn.add(tbltxt4);

        labelName.add(tbllabel1);
        labelName.add(tbllabel2);
        labelName.add(tbllabel3);
        labelName.add(tbllabel4);

        for (int i = 0; i < labelName.size(); i++) {
            labelName.get(i).setText(ColmnName.get(i));
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

    public boolean checkarrayfornull() {

        if (tblColmnData == null) {
            return false;
        }

        return true;
    }

    public void SanatciTablo() {
        DefaultTableModel tblModel = (DefaultTableModel) jTable3.getModel();
        ArrayList<String> ColmnName = new ArrayList<>();

        ColmnName.add("NO");
        ColmnName.add("AD");
        ColmnName.add("ULKE");

        for (int i = 0; i < ColmnName.size(); i++) {
            tblModel.addColumn(ColmnName.get(i));
        }

        try {
            Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/musicapidb", "root", "1234");
            Statement myStat = (Statement) myConn.createStatement();
            ResultSet myRs = myStat.executeQuery("select * from sanatci order by id");
            while (myRs.next()) {
                int idsanatci = myRs.getInt("id");
                String sanatciad = myRs.getString("ad");
                String ulke = myRs.getString("ulke");

                String tbData[] = {idsanatci + "", sanatciad, ulke};

                tblModel.addRow(tbData);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Base Hatasi : " + e.getMessage());
        }
    }

    public void AlbumTablo() {
        DefaultTableModel tblModel = (DefaultTableModel) jTable2.getModel();
        ArrayList<String> ColmnName = new ArrayList<>();

        ColmnName.add("NO");
        ColmnName.add("AD");
        ColmnName.add("SANATCI");

        ColmnName.add("TARIH");
        ColmnName.add("TUR");

        for (int i = 0; i < ColmnName.size(); i++) {
            tblModel.addColumn(ColmnName.get(i));
        }

        try {
            Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/musicapidb", "root", "1234");
            Statement myStat = (Statement) myConn.createStatement();
            ResultSet myRs = myStat.executeQuery("select * from album order by id");
            while (myRs.next()) {
                int idalbum = myRs.getInt("id");
                String albumad = myRs.getString("ad");
                String sanatci = myRs.getString("sanatci");

                String tarih = myRs.getString("tarih");
                String tur = myRs.getString("tur");

                String tbData[] = {idalbum + "", albumad, sanatci, tarih, tur};

                tblModel.addRow(tbData);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Base Hatasi : " + e.getMessage());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Kullanici_turu;
    private javax.swing.JLabel Musteri_isim;
    private javax.swing.JButton Muziklerim;
    private javax.swing.JButton TumKullanicilar;
    private javax.swing.JButton TumMuzikler;
    private javax.swing.JButton albumsanatci;
    private javax.swing.JLabel bitti;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel musteriulke;
    private javax.swing.JButton muzikSil;
    private javax.swing.JButton muzikekle;
    private javax.swing.JLabel tbllabel1;
    private javax.swing.JLabel tbllabel2;
    private javax.swing.JLabel tbllabel3;
    private javax.swing.JLabel tbllabel4;
    private javax.swing.JTextField tbltxt1;
    private javax.swing.JTextField tbltxt2;
    private javax.swing.JTextField tbltxt3;
    private javax.swing.JTextField tbltxt4;
    private javax.swing.JButton top10slct;
    private javax.swing.JComboBox<String> ulke;
    private javax.swing.JLabel ulkeOnay;
    // End of variables declaration//GEN-END:variables
}
