
package muzikdosyam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class AdminArayuz extends javax.swing.JFrame {

    public ArrayList<String> tblColmnData;
    public ArrayList<JTextField> txtColmn;
    public ArrayList<String> TemptxtColmnData;
    public AdminArayuz admaryz;
    public AnaProgram anaprog;

    
    public AdminArayuz() {
        initComponents();
        SarkiTablo();
        SanatciTablo();
        AlbumTablo();
        DinlenmeSayisiTablo();

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Sarkitxt1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Sarkitxt2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Sarkitxt3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Sarkitxt4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Sarkitxt5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Sarkitxt6 = new javax.swing.JTextField();
        SarkiEkle = new javax.swing.JButton();
        SarkiSil = new javax.swing.JButton();
        SarkiGuncelle = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Sanatcitxt1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        Sanatcitxt2 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        Sanatcitxt3 = new javax.swing.JTextField();
        SanatciEkle = new javax.swing.JButton();
        SanatciSil = new javax.swing.JButton();
        SanatciGuncelle = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        Albumtxt1 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        Albumtxt6 = new javax.swing.JTextField();
        AlbumEkle = new javax.swing.JButton();
        AlbumSil = new javax.swing.JButton();
        AlbumGuncelle = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Albumtxt3 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Albumtxt5 = new javax.swing.JTextField();
        Albumtxt2 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        Ditxt1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        Ditxt2 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        Ditxt3 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        Ditxt4 = new javax.swing.JTextField();
        DiEkle = new javax.swing.JButton();
        DiSil = new javax.swing.JButton();
        DiGuncelle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Music Api DataBase ");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("GERI");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(204, 153, 0));

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

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sarki DataBase");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("ID Sarki");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Sarki AD");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Tarih");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Album");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Tur");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Sure");

        SarkiEkle.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SarkiEkle.setText("EKLE");
        SarkiEkle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SarkiEkleMouseClicked(evt);
            }
        });

        SarkiSil.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SarkiSil.setText("SIL");
        SarkiSil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SarkiSilMouseClicked(evt);
            }
        });

        SarkiGuncelle.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SarkiGuncelle.setText("GUNCELLE");
        SarkiGuncelle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SarkiGuncelleMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(Sarkitxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Sarkitxt3)
                            .addComponent(Sarkitxt6)
                            .addComponent(Sarkitxt5)
                            .addComponent(Sarkitxt4)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Sarkitxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(SarkiEkle)
                                .addGap(45, 45, 45)
                                .addComponent(SarkiSil, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SarkiGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)))
                        .addGap(107, 107, 107))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Sarkitxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(15, 15, 15)
                .addComponent(Sarkitxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Sarkitxt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(9, 9, 9)
                .addComponent(Sarkitxt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Sarkitxt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel7)
                .addGap(9, 9, 9)
                .addComponent(Sarkitxt6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SarkiGuncelle)
                    .addComponent(SarkiSil)
                    .addComponent(SarkiEkle))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 153, 0));

        jTable4 = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex , int colIndex){
                return false;
            }
        };
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable4);

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Sanatci DataBase");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("ID Sanatci");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("Sanatci AD");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("Ulke");

        SanatciEkle.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SanatciEkle.setText("EKLE");
        SanatciEkle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SanatciEkleMouseClicked(evt);
            }
        });

        SanatciSil.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SanatciSil.setText("SIL");
        SanatciSil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SanatciSilMouseClicked(evt);
            }
        });

        SanatciGuncelle.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SanatciGuncelle.setText("GUNCELLE");
        SanatciGuncelle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SanatciGuncelleMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Sanatcitxt3)
                            .addComponent(Sanatcitxt1)
                            .addComponent(Sanatcitxt2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SanatciEkle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SanatciSil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SanatciGuncelle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel22)
                            .addComponent(jLabel25))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Sanatcitxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(SanatciEkle)
                .addGap(62, 62, 62)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sanatcitxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SanatciSil))
                .addGap(92, 92, 92)
                .addComponent(SanatciGuncelle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sanatcitxt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(204, 153, 0));

        jTable5 = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex , int colIndex){
                return false;
            }
        };
        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable5MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTable5);

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Album DataBase");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setText("ID Album");

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel33.setText("Tur");

        AlbumEkle.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        AlbumEkle.setText("EKLE");
        AlbumEkle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AlbumEkleMouseClicked(evt);
            }
        });

        AlbumSil.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        AlbumSil.setText("SIL");
        AlbumSil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AlbumSilMouseClicked(evt);
            }
        });

        AlbumGuncelle.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        AlbumGuncelle.setText("GUNCELLE");
        AlbumGuncelle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AlbumGuncelleMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Album AD");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Sanatci");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Tarih");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Albumtxt1)
                                    .addComponent(Albumtxt5)
                                    .addComponent(Albumtxt3)
                                    .addComponent(Albumtxt6)
                                    .addComponent(Albumtxt2))
                                .addGap(6, 6, 6))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AlbumGuncelle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AlbumSil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AlbumEkle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel33)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Albumtxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AlbumEkle)
                    .addComponent(jLabel10))
                .addGap(7, 7, 7)
                .addComponent(Albumtxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AlbumSil)
                            .addComponent(Albumtxt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(92, 92, 92)
                        .addComponent(AlbumGuncelle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(Albumtxt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)))
                .addComponent(jLabel33)
                .addGap(18, 18, 18)
                .addComponent(Albumtxt6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        jPanel4.setBackground(new java.awt.Color(204, 153, 0));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("DinlemeSayisi DataBase");

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

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("Sarki AD");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("ABD");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Turkiye");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("Almanya");

        DiEkle.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        DiEkle.setText("EKLE");
        DiEkle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DiEkleMouseClicked(evt);
            }
        });

        DiSil.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        DiSil.setText("SIL");
        DiSil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DiSilMouseClicked(evt);
            }
        });

        DiGuncelle.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        DiGuncelle.setText("GUNCELLE");
        DiGuncelle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DiGuncelleMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Ditxt1)
                                    .addComponent(Ditxt2)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Ditxt3)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Ditxt4, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(DiEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(DiSil, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(DiGuncelle)
                        .addGap(20, 20, 20))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ditxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ditxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ditxt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ditxt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DiEkle)
                    .addComponent(DiSil)
                    .addComponent(DiGuncelle))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked

        DefaultTableModel tblModel = (DefaultTableModel) jTable2.getModel();
        int colmn_count = jTable2.getColumnCount();
        tblColmnData = new ArrayList<>();

        txtColmn = new ArrayList<>();
        TemptxtColmnData = new ArrayList<>();

        txtColmn.add(Sarkitxt1);
        txtColmn.add(Sarkitxt2);
        txtColmn.add(Sarkitxt3);
        txtColmn.add(Sarkitxt4);
        txtColmn.add(Sarkitxt6);
        txtColmn.add(Sarkitxt5);

        for (int i = 0; i < colmn_count; i++) {
            tblColmnData.add(tblModel.getValueAt(jTable2.getSelectedRow(), i).toString());
        }
        for (int i = 0; i < tblColmnData.size(); i++) {
            txtColmn.get(i).setText(tblColmnData.get(i));

        }

        for (int i = 0; i < txtColmn.size(); i++) {
            TemptxtColmnData.add(txtColmn.get(i).getText());
        }

    }//GEN-LAST:event_jTable2MouseClicked

    private void SarkiEkleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SarkiEkleMouseClicked
        int idSarki = Integer.parseInt(Sarkitxt1.getText());
        String sarkiad = Sarkitxt2.getText();
        String tarih = Sarkitxt3.getText();
        String sanatciAlbum = Sarkitxt4.getText();
        float sure = Float.parseFloat(Sarkitxt5.getText());
        String tur = Sarkitxt6.getText();

        boolean check = sarkiEkleCheck(sanatciAlbum, tur);
        boolean albumcheck = sarkialbumCheck(sanatciAlbum);

        if (albumcheck) {
            if (check) {
                if (idSarki > 0 && sarkiad.length() >= 2 && tarih.length() >= 2 && sanatciAlbum.length() >= 2 && tur.length() >= 2 && sure > 0) {
                    try {
                        Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/musicapidb", "root", "1234");

                        String sorgu = "INSERT INTO sarki values('" + idSarki + "','" + sarkiad + "','" + tarih + "','" + sanatciAlbum + "'," + sure + ",'" + tur + "')";
                        Statement sta = myConn.createStatement();

                        int x = sta.executeUpdate(sorgu);

                        if (x == 0) {
                            JOptionPane.showMessageDialog(null, "Sarki zaten var !");
                        } else {
                            JOptionPane.showMessageDialog(null, "Sarki basariyla olusturuldu !");
                            jTable2.setModel(new DefaultTableModel());
                            SarkiTablo();

                        }
                    } catch (Exception e) {

                        if (e.getMessage().indexOf("Duplicate") != -1) {
                            JOptionPane.showMessageDialog(null, "Bu  sarki zaten var !");
                        } else {
                            JOptionPane.showMessageDialog(null, "Data Base Hatasi : " + e.getMessage());
                        }

                    }
                } else {
                    JOptionPane.showMessageDialog(null, "idSarki/sarkiad/tarih/sanatciAlbum/tur/sure/dinlenmeSayisi kutularini kontrol et !");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Girilen Sarki Turu Eklendigi Album Turu ile Aynı Olmak Zorundadır !");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Girilen Album , DataBase'de Bulunamadi Ilk Once Album Database'e Album'u Ekleyip Yeniden Deneyiniz !");
        }
    }//GEN-LAST:event_SarkiEkleMouseClicked

    private void SarkiSilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SarkiSilMouseClicked
        int idSarki = Integer.parseInt(Sarkitxt1.getText());
        String sarkiad = Sarkitxt2.getText();
        String tarih = Sarkitxt3.getText();
        String sanatciAlbum = Sarkitxt4.getText();
        float sure = Float.parseFloat(Sarkitxt5.getText());
        String tur = Sarkitxt6.getText();

        if (idSarki > 0 && sarkiad.length() >= 2 && tarih.length() >= 2 && sanatciAlbum.length() >= 2 && tur.length() >= 2 && sure > 0) {
            try {
                Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/musicapidb", "root", "1234");
                //DELETE FROM `musicapidb`.`sarki` WHERE (`sarkiad` = 'Winter') and (`tarih` = '04/08/2008') and (`sanatcialbum` = 'Winter');

                String sorgu = "DELETE FROM sarki WHERE (ad = '" + sarkiad + "')";
                Statement sta = myConn.createStatement();

                int x = sta.executeUpdate(sorgu);

                if (x == 0) {
                    JOptionPane.showMessageDialog(null, "Böyle bir sarki mevcut degil !");
                } else {
                    JOptionPane.showMessageDialog(null, "Sarki basariyla silindi !");
                    jTable2.setModel(new DefaultTableModel());
                    SarkiTablo();
                    kullanicilarSilSarki(sarkiad);

                }
            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "Data Base Hatasi : " + e.getMessage());

            }
        } else {
            JOptionPane.showMessageDialog(null, "idSarki/sarkiad/tarih/sanatciAlbum/tur/sure/dinlenmeSayisi kutularini kontrol et !");
        }
    }//GEN-LAST:event_SarkiSilMouseClicked

    private void SarkiGuncelleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SarkiGuncelleMouseClicked
        int idSarki = Integer.parseInt(Sarkitxt1.getText());
        String sarkiad = Sarkitxt2.getText();
        String tarih = Sarkitxt3.getText();
        String sanatciAlbum = Sarkitxt4.getText();
        float sure = Float.parseFloat(Sarkitxt5.getText());
        String tur = Sarkitxt6.getText();

        boolean check = sarkiEkleCheck(sanatciAlbum, tur);
        boolean albumcheck = sarkialbumCheck(sanatciAlbum);

        if (albumcheck) {
            if (check) {
                if (idSarki > 0 && sarkiad.length() >= 2 && tarih.length() >= 2 && sanatciAlbum.length() >= 2 && tur.length() >= 2 && sure > 0) {
                    try {
                        Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/musicapidb", "root", "1234");
                        //UPDATE sarki SET sarkiad = 'Summer Times' WHERE (sarkiad = 'Summer Time') and (tarih = 10/04/2014) and (sanatcialbum = Summer) and (idsarki = '1');

                        String sorgu = "UPDATE sarki SET id = " + idSarki + ",ad = '" + sarkiad + "',tarih = '" + tarih
                                + "',album = '" + sanatciAlbum + "',sure = " + sure + ",tur = '" + tur + "' WHERE (ad = '" + TemptxtColmnData.get(1) + "')";
                        Statement sta = myConn.createStatement();

                        int x = sta.executeUpdate(sorgu);

                        if (x == 0) {
                            JOptionPane.showMessageDialog(null, "Sarki zaten var !");
                        } else {
                            JOptionPane.showMessageDialog(null, "Sarki basariyla guncellendi !");
                            jTable2.setModel(new DefaultTableModel());
                            SarkiTablo();

                        }
                    } catch (Exception e) {

                        JOptionPane.showMessageDialog(null, "Data Base Hatasi : " + e.getMessage());

                    }
                } else {
                    JOptionPane.showMessageDialog(null, "idSarki/sarkiad/tarih/sanatciAlbum/tur/sure/dinlenmeSayisi kutularini kontrol et !");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Girilen Sarki Turu Eklendigi Album Turu ile Aynı Olmak Zorundadır !");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Girilen Album , DataBase'de Bulunamadi Ilk Once Album Database'e Album'u Ekleyip Yeniden Deneyiniz !");
        }
    }//GEN-LAST:event_SarkiGuncelleMouseClicked

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        DefaultTableModel tblModel = (DefaultTableModel) jTable4.getModel();
        int colmn_count = jTable4.getColumnCount();
        tblColmnData = new ArrayList<>();

        txtColmn = new ArrayList<>();
        TemptxtColmnData = new ArrayList<>();

        txtColmn.add(Sanatcitxt1);
        txtColmn.add(Sanatcitxt2);
        txtColmn.add(Sanatcitxt3);

        for (int i = 0; i < colmn_count; i++) {
            tblColmnData.add(tblModel.getValueAt(jTable4.getSelectedRow(), i).toString());
        }
        for (int i = 0; i < tblColmnData.size(); i++) {
            txtColmn.get(i).setText(tblColmnData.get(i));

        }

        for (int i = 0; i < txtColmn.size(); i++) {
            TemptxtColmnData.add(txtColmn.get(i).getText());
        }
    }//GEN-LAST:event_jTable4MouseClicked

    private void jTable5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable5MouseClicked
        DefaultTableModel tblModel = (DefaultTableModel) jTable5.getModel();
        int colmn_count = jTable5.getColumnCount();
        tblColmnData = new ArrayList<>();

        txtColmn = new ArrayList<>();
        TemptxtColmnData = new ArrayList<>();

        txtColmn.add(Albumtxt1);
        txtColmn.add(Albumtxt2);
        txtColmn.add(Albumtxt3);

        txtColmn.add(Albumtxt5);
        txtColmn.add(Albumtxt6);

        for (int i = 0; i < colmn_count; i++) {
            tblColmnData.add(tblModel.getValueAt(jTable5.getSelectedRow(), i).toString());
        }
        for (int i = 0; i < tblColmnData.size(); i++) {
            txtColmn.get(i).setText(tblColmnData.get(i));

        }

        for (int i = 0; i < txtColmn.size(); i++) {
            TemptxtColmnData.add(txtColmn.get(i).getText());
        }
    }//GEN-LAST:event_jTable5MouseClicked

    private void SanatciEkleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SanatciEkleMouseClicked
        int idsanatci = Integer.parseInt(Sanatcitxt1.getText());
        String sanatciad = Sanatcitxt2.getText();
        String ulke = Sanatcitxt3.getText();

        if (idsanatci > 0 && sanatciad.length() >= 2 && ulke.length() >= 2) {
            try {
                Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/musicapidb", "root", "1234");

                String sorgu = "INSERT INTO sanatci values('" + idsanatci + "','" + sanatciad + "','" + ulke + "')";
                Statement sta = myConn.createStatement();

                int x = sta.executeUpdate(sorgu);

                if (x == 0) {
                    JOptionPane.showMessageDialog(null, "Sanatci zaten var !");
                } else {
                    JOptionPane.showMessageDialog(null, "Sanatci basariyla olusturuldu !");
                    jTable4.setModel(new DefaultTableModel());
                    SanatciTablo();

                }
            } catch (Exception e) {

                if (e.getMessage().indexOf("Duplicate") != -1) {
                    JOptionPane.showMessageDialog(null, "Bu  Sanatci zaten var !");
                } else {
                    JOptionPane.showMessageDialog(null, "Data Base Hatasi : " + e.getMessage());
                }

            }
        } else {
            JOptionPane.showMessageDialog(null, "idsanatci/sanatciad/ulke kutularini kontrol et !");
        }
    }//GEN-LAST:event_SanatciEkleMouseClicked

    private void SanatciSilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SanatciSilMouseClicked
        int idsanatci = Integer.parseInt(Sanatcitxt1.getText());
        String sanatciad = Sanatcitxt2.getText();
        String ulke = Sanatcitxt3.getText();

        if (idsanatci > 0 && sanatciad.length() >= 2 && ulke.length() >= 2) {
            try {
                Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/musicapidb", "root", "1234");

                String sorgu = "DELETE FROM sanatci WHERE (id = " + idsanatci + ") and (ad = '" + sanatciad + "')";

                Statement sta = myConn.createStatement();

                int x = sta.executeUpdate(sorgu);

                if (x == 0) {
                    JOptionPane.showMessageDialog(null, "Sanatci zaten yok !");
                } else {
                    JOptionPane.showMessageDialog(null, "Sanatci basariyla silindi !");
                    jTable4.setModel(new DefaultTableModel());
                    SanatciTablo();

                }
            } catch (Exception e) {

                if (e.getMessage().indexOf("Duplicate") != -1) {
                    JOptionPane.showMessageDialog(null, "Bu  Sanatci zaten var !");
                } else {
                    JOptionPane.showMessageDialog(null, "Data Base Hatasi : " + e.getMessage());
                }

            }
        } else {
            JOptionPane.showMessageDialog(null, "idsanatci/sanatciad/ulke kutularini kontrol et !");
        }
    }//GEN-LAST:event_SanatciSilMouseClicked

    private void SanatciGuncelleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SanatciGuncelleMouseClicked
        int idsanatci = Integer.parseInt(Sanatcitxt1.getText());
        String sanatciad = Sanatcitxt2.getText();
        String ulke = Sanatcitxt3.getText();

        if (idsanatci > 0 && sanatciad.length() >= 2 && ulke.length() >= 2) {
            try {
                Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/musicapidb", "root", "1234");
                //UPDATE `musicapidb`.`sanatci` SET `idsanatci` = '13', `sanatciad` = 'Alec3', `ulke` = 'Holland3' WHERE (`sanatciad` = 'Alec') and (`ulke` = 'Holland');

                String sorgu = "UPDATE sanatci SET id = " + idsanatci + ",ad = '" + sanatciad + "',ulke = '" + ulke
                        + "' WHERE (id = " + TemptxtColmnData.get(0) + ") and (ad = '" + TemptxtColmnData.get(1) + "')";

                Statement sta = myConn.createStatement();

                int x = sta.executeUpdate(sorgu);

                if (x == 0) {
                    JOptionPane.showMessageDialog(null, "Sanatci zaten var !");
                } else {
                    JOptionPane.showMessageDialog(null, "Sanatci basariyla guncellendi !");
                    jTable4.setModel(new DefaultTableModel());
                    SanatciTablo();

                }
            } catch (Exception e) {

                if (e.getMessage().indexOf("Duplicate") != -1) {
                    JOptionPane.showMessageDialog(null, "Bu  Sanatci zaten var !");
                } else {
                    JOptionPane.showMessageDialog(null, "Data Base Hatasi : " + e.getMessage());
                }

            }
        } else {
            JOptionPane.showMessageDialog(null, "idsanatci/sanatciad/ulke kutularini kontrol et !");
        }
    }//GEN-LAST:event_SanatciGuncelleMouseClicked

    private void AlbumEkleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlbumEkleMouseClicked
        int idalbum = Integer.parseInt(Albumtxt1.getText());
        String albumad = Albumtxt2.getText();
        String sanatci = Albumtxt3.getText();

        String tarih = Albumtxt5.getText();
        String tur = Albumtxt6.getText();

        boolean checkSanatci = albumsanatci(sanatci);

        if (checkSanatci) {
            if (idalbum > 0 && albumad.length() >= 2 && sanatci.length() >= 2 && tarih.length() >= 2 && tur.length() >= 2) {
                try {
                    Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/musicapidb", "root", "1234");

                    String sorgu = "INSERT INTO album values('" + idalbum + "','" + albumad + "','" + sanatci + "','" + tarih + "','" + tur + "')";
                    Statement sta = myConn.createStatement();

                    int x = sta.executeUpdate(sorgu);

                    if (x == 0) {
                        JOptionPane.showMessageDialog(null, "Album zaten var !");
                    } else {
                        JOptionPane.showMessageDialog(null, "Album basariyla olusturuldu !");
                        jTable5.setModel(new DefaultTableModel());
                        AlbumTablo();

                    }
                } catch (Exception e) {

                    if (e.getMessage().indexOf("Duplicate") != -1) {
                        JOptionPane.showMessageDialog(null, "Bu  Album zaten var !");
                    } else {
                        JOptionPane.showMessageDialog(null, "Data Base Hatasi : " + e.getMessage());
                    }

                }
            } else {
                JOptionPane.showMessageDialog(null, "idalbum/albumad/sanatci/sarki/tarih/tur kutularini kontrol et !");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Girilen Sanatci , DataBase'de Bulunamadi Ilk Once Sanatci Database'e Sanatci'yi Ekleyip Yeniden Deneyiniz !");
        }
    }//GEN-LAST:event_AlbumEkleMouseClicked

    private void AlbumSilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlbumSilMouseClicked
        int idalbum = Integer.parseInt(Albumtxt1.getText());
        String albumad = Albumtxt2.getText();
        String sanatci = Albumtxt3.getText();

        String tarih = Albumtxt5.getText();
        String tur = Albumtxt6.getText();

        if (idalbum > 0 && albumad.length() >= 2 && sanatci.length() >= 2 && tarih.length() >= 2 && tur.length() >= 2) {
            try {
                Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/musicapidb", "root", "1234");

                String sorgu = "DELETE FROM album WHERE (ad = '" + albumad + "') and (sanatci = '" + sanatci + "')";
                Statement sta = myConn.createStatement();

                int x = sta.executeUpdate(sorgu);

                if (x == 0) {
                    JOptionPane.showMessageDialog(null, "Album zaten yok !");
                } else {
                    JOptionPane.showMessageDialog(null, "Album basariyla silindi !");
                    jTable5.setModel(new DefaultTableModel());
                    AlbumTablo();

                }
            } catch (Exception e) {

                if (e.getMessage().indexOf("Duplicate") != -1) {
                    JOptionPane.showMessageDialog(null, "Bu  Album zaten var !");
                } else {
                    JOptionPane.showMessageDialog(null, "Data Base Hatasi : " + e.getMessage());
                }

            }
        } else {
            JOptionPane.showMessageDialog(null, "idalbum/albumad/sanatci/sarki/tarih/tur kutularini kontrol et !");
        }
    }//GEN-LAST:event_AlbumSilMouseClicked

    private void AlbumGuncelleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlbumGuncelleMouseClicked
        int idalbum = Integer.parseInt(Albumtxt1.getText());
        String albumad = Albumtxt2.getText();
        String sanatci = Albumtxt3.getText();

        String tarih = Albumtxt5.getText();
        String tur = Albumtxt6.getText();

        boolean checkSanatci = albumsanatci(sanatci);

        if (checkSanatci) {
            if (idalbum > 0 && albumad.length() >= 2 && sanatci.length() >= 2 && tarih.length() >= 2 && tur.length() >= 2) {
                try {
                    Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/musicapidb", "root", "1234");

                    String sorgu = "UPDATE album SET id = " + idalbum + ",ad = '" + albumad + "',sanatci = '" + sanatci
                            + "',tarih = '" + tarih + "',tur = '" + tur + "' WHERE (ad = '" + TemptxtColmnData.get(1) + "') and (sanatci = '" + TemptxtColmnData.get(2) + "')";
                    Statement sta = myConn.createStatement();

                    int x = sta.executeUpdate(sorgu);

                    if (x == 0) {
                        JOptionPane.showMessageDialog(null, "Album zaten var !");
                    } else {
                        JOptionPane.showMessageDialog(null, "Album basariyla guncellendi !");
                        jTable5.setModel(new DefaultTableModel());
                        AlbumTablo();

                    }
                } catch (Exception e) {

                    if (e.getMessage().indexOf("Duplicate") != -1) {
                        JOptionPane.showMessageDialog(null, "Bu  Album zaten var !");
                    } else {
                        JOptionPane.showMessageDialog(null, "Data Base Hatasi : " + e.getMessage());
                    }

                }
            } else {
                JOptionPane.showMessageDialog(null, "idalbum/albumad/sanatci/sarki/tarih/tur kutularini kontrol et !");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Girilen Sanatci , DataBase'de Bulunamadi Ilk Once Sanatci Database'e Sanatci'yi Ekleyip Yeniden Deneyiniz !");
        }
    }//GEN-LAST:event_AlbumGuncelleMouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        if (sanatciAlbumTabloCheck()) {
            if (sarkiAlbumTabloCheck()) {
                if (sarkiDinlenmeTabloCheck()) {
                    admaryz.setVisible(false);
                    anaprog.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Dinlenmesayisi Tablosu ya da Sarki Tablosu Tekrar Kontrol Et !");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Sarki Tablosu ya da Album Tablosu Tekrar Kontrol Et !");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Sanatci Tablosu ya da Album Tablosu Tekrar Kontrol Et !");
        }
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
        int colmn_count = jTable1.getColumnCount();
        tblColmnData = new ArrayList<>();

        txtColmn = new ArrayList<>();
        TemptxtColmnData = new ArrayList<>();

        txtColmn.add(Ditxt1);
        txtColmn.add(Ditxt2);
        txtColmn.add(Ditxt3);
        txtColmn.add(Ditxt4);

        for (int i = 0; i < colmn_count; i++) {
            tblColmnData.add(tblModel.getValueAt(jTable1.getSelectedRow(), i).toString());
        }
        for (int i = 0; i < tblColmnData.size(); i++) {
            txtColmn.get(i).setText(tblColmnData.get(i));

        }

        for (int i = 0; i < txtColmn.size(); i++) {
            TemptxtColmnData.add(txtColmn.get(i).getText());
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void DiEkleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DiEkleMouseClicked

        String sarkiad = Ditxt1.getText();
        int abd = Integer.parseInt(Ditxt2.getText());
        int turkiye = Integer.parseInt(Ditxt3.getText());
        int almanya = Integer.parseInt(Ditxt4.getText());

        boolean check = dinlenmeSarkicheck(sarkiad);

        if (check) {
            if (abd > 0 && turkiye > 0 && almanya > 0 && sarkiad.length() >= 2) {
                try {
                    Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/musicapidb", "root", "1234");

                    String sorgu = "INSERT INTO dinlenmesayisi values('" + sarkiad + "'," + abd + "," + turkiye + "," + almanya + ")";
                    Statement sta = myConn.createStatement();

                    int x = sta.executeUpdate(sorgu);

                    if (x == 0) {
                        JOptionPane.showMessageDialog(null, "Zaten var !");
                    } else {
                        JOptionPane.showMessageDialog(null, "Basariyla olusturuldu !");
                        jTable1.setModel(new DefaultTableModel());
                        DinlenmeSayisiTablo();

                    }
                } catch (Exception e) {

                    if (e.getMessage().indexOf("Duplicate") != -1) {
                        JOptionPane.showMessageDialog(null, "Bu  Zaten var !");
                    } else {
                        JOptionPane.showMessageDialog(null, "Data Base Hatasi : " + e.getMessage());
                    }

                }
            } else {
                JOptionPane.showMessageDialog(null, "sarkiad/abd/turkiye/almanya kutularini kontrol et !");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Girilen Sarki , DataBase'de Bulunamadi Ilk Once Sarki Database'e Sarki'yi Ekleyip Yeniden Deneyiniz !");
        }
    }//GEN-LAST:event_DiEkleMouseClicked

    private void DiSilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DiSilMouseClicked
        String sarkiad = Ditxt1.getText();
        int abd = Integer.parseInt(Ditxt2.getText());
        int turkiye = Integer.parseInt(Ditxt3.getText());
        int almanya = Integer.parseInt(Ditxt4.getText());

        if (abd > 0 && turkiye > 0 && almanya > 0 && sarkiad.length() >= 2) {
            try {
                Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/musicapidb", "root", "1234");

                String sorgu = "DELETE FROM dinlenmesayisi WHERE (sarkiad = '" + sarkiad + "')";
                Statement sta = myConn.createStatement();

                int x = sta.executeUpdate(sorgu);

                if (x == 0) {
                    JOptionPane.showMessageDialog(null, "Boyle Bir Sarki Zaten yok !");
                } else {
                    JOptionPane.showMessageDialog(null, "Basariyla silindi !");
                    jTable1.setModel(new DefaultTableModel());
                    DinlenmeSayisiTablo();

                }
            } catch (Exception e) {

                if (e.getMessage().indexOf("Duplicate") != -1) {
                    JOptionPane.showMessageDialog(null, "Bu  Zaten var !");
                } else {
                    JOptionPane.showMessageDialog(null, "Data Base Hatasi : " + e.getMessage());
                }

            }
        } else {
            JOptionPane.showMessageDialog(null, "sarkiad/abd/turkiye/almanya kutularini kontrol et !");
        }
    }//GEN-LAST:event_DiSilMouseClicked

    private void DiGuncelleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DiGuncelleMouseClicked
        String sarkiad = Ditxt1.getText();
        int abd = Integer.parseInt(Ditxt2.getText());
        int turkiye = Integer.parseInt(Ditxt3.getText());
        int almanya = Integer.parseInt(Ditxt4.getText());

        boolean check = dinlenmeSarkicheck(sarkiad);

        if (check) {
            if (abd > 0 && turkiye > 0 && almanya > 0 && sarkiad.length() >= 2) {
                try {
                    Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/musicapidb", "root", "1234");

                    String sorgu = "UPDATE dinlenmesayisi SET sarkiad = '" + sarkiad + "',abd = " + abd + ",turkiye = " + turkiye
                            + ",almanya = " + almanya + " WHERE (sarkiad = '" + TemptxtColmnData.get(0) + "')";
                    Statement sta = myConn.createStatement();

                    int x = sta.executeUpdate(sorgu);

                    if (x == 0) {
                        JOptionPane.showMessageDialog(null, "Zaten var !");
                    } else {
                        JOptionPane.showMessageDialog(null, "Basariyla guncellendi !");
                        jTable1.setModel(new DefaultTableModel());
                        DinlenmeSayisiTablo();

                    }
                } catch (Exception e) {

                    if (e.getMessage().indexOf("Duplicate") != -1) {
                        JOptionPane.showMessageDialog(null, "Bu  Zaten var !");
                    } else {
                        JOptionPane.showMessageDialog(null, "Data Base Hatasi : " + e.getMessage());
                    }

                }
            } else {
                JOptionPane.showMessageDialog(null, "sarkiad/abd/turkiye/almanya kutularini kontrol et !");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Girilen Sarki , DataBase'de Bulunamadi Ilk Once Sarki Database'e Sarki'yi Ekleyip Yeniden Deneyiniz !");
        }
    }//GEN-LAST:event_DiGuncelleMouseClicked

    public void SarkiTablo() {
        DefaultTableModel tblModel = (DefaultTableModel) jTable2.getModel();
        ArrayList<String> ColmnName = new ArrayList<>();

        ColmnName.add("ID");
        ColmnName.add("AD");
        ColmnName.add("TARIH");
        ColmnName.add("ALBUM");
        ColmnName.add("TUR");
        ColmnName.add("SURE");

        for (int i = 0; i < ColmnName.size(); i++) {
            tblModel.addColumn(ColmnName.get(i));
        }

        try {
            Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/musicapidb", "root", "1234");
            Statement myStat = (Statement) myConn.createStatement();
            ResultSet myRs = myStat.executeQuery("select * from sarki order by id");
            while (myRs.next()) {
                int idSarki = myRs.getInt("id");
                String sarkiad = myRs.getString("ad");
                String tarih = myRs.getString("tarih");
                String sanatciAlbum = myRs.getString("album");
                String tur = myRs.getString("tur");
                float sure = myRs.getFloat("sure");

                String tbData[] = {idSarki + "", sarkiad, tarih, sanatciAlbum, tur, sure + ""};

                tblModel.addRow(tbData);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Base Hatasi : " + e.getMessage());
        }

    }

    public void SanatciTablo() {
        DefaultTableModel tblModel = (DefaultTableModel) jTable4.getModel();
        ArrayList<String> ColmnName = new ArrayList<>();

        ColmnName.add("ID");
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
        DefaultTableModel tblModel = (DefaultTableModel) jTable5.getModel();
        ArrayList<String> ColmnName = new ArrayList<>();

        ColmnName.add("ID");
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

    public void DinlenmeSayisiTablo() {
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
        ArrayList<String> ColmnName = new ArrayList<>();

        ColmnName.add("SARKIAD");
        ColmnName.add("ABD");
        ColmnName.add("TURKIYE");
        ColmnName.add("ALMANYA");

        for (int i = 0; i < ColmnName.size(); i++) {
            tblModel.addColumn(ColmnName.get(i));
        }

        try {
            Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/musicapidb", "root", "1234");
            Statement myStat = (Statement) myConn.createStatement();
            ResultSet myRs = myStat.executeQuery("select * from dinlenmesayisi ");
            while (myRs.next()) {

                String sarkiad = myRs.getString("sarkiad");
                int abd = myRs.getInt("abd");
                int turkiye = myRs.getInt("turkiye");
                int almanya = myRs.getInt("almanya");

                String tbData[] = {sarkiad, abd + "", turkiye + "", almanya + ""};

                tblModel.addRow(tbData);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Base Hatasi : " + e.getMessage());
        }

    }

    public void al(AdminArayuz admaryz_temp, AnaProgram anaprog_temp) {
        admaryz = admaryz_temp;
        anaprog = anaprog_temp;
    }

    public boolean sarkiEkleCheck(String album, String sarkiTur) {

        try {
            Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/musicapidb", "root", "1234");
            Statement myStat = (Statement) myConn.createStatement();
            ResultSet myRs = myStat.executeQuery("select ad,tur from album ");
            while (myRs.next()) {
                if (myRs.getString("ad").equals(album) && myRs.getString("tur").equals(sarkiTur)) {
                    return true;
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Base Hatasi : " + e.getMessage());
        }

        return false;
    }

    public boolean sarkialbumCheck(String album) {

        try {
            Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/musicapidb", "root", "1234");
            Statement myStat = (Statement) myConn.createStatement();
            ResultSet myRs = myStat.executeQuery("select ad from album ");
            while (myRs.next()) {
                if (myRs.getString("ad").equals(album)) {
                    //System.out.println("Album check edildi ve bulundu");
                    return true;
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Base Hatasi : " + e.getMessage());
        }

        return false;
    }

    public boolean albumsanatci(String sanatciad) {

        try {
            Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/musicapidb", "root", "1234");
            Statement myStat = (Statement) myConn.createStatement();
            ResultSet myRs = myStat.executeQuery("select ad from sanatci ");
            while (myRs.next()) {
                if (myRs.getString("ad").equals(sanatciad)) {
                    //System.out.println("Sanatci check edildi ve bulundu");
                    return true;
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Base Hatasi : " + e.getMessage());
        }

        return false;
    }

    public boolean dinlenmeSarkicheck(String sarkiad) {

        try {
            Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/musicapidb", "root", "1234");
            Statement myStat = (Statement) myConn.createStatement();
            ResultSet myRs = myStat.executeQuery("select ad from sarki ");
            while (myRs.next()) {
                if (myRs.getString("ad").equals(sarkiad)) {
                    //System.out.println("Sarki check edildi ve bulundu");
                    return true;
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Base Hatasi : " + e.getMessage());
        }

        return false;
    }

    public boolean sarkiDinlenmeTabloCheck() {
        int sarkiad = 0, ad = 0;
        try {

            Connection myConn3 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/musicapidb", "root", "1234");

            String sorgu3 = "select count(sarkiad) from dinlenmesayisi";
            Statement sta3 = myConn3.prepareStatement(sorgu3);
            ResultSet rs = sta3.executeQuery(sorgu3);
            while (rs.next()) {
                sarkiad = Integer.parseInt(rs.getString("count(sarkiad)"));
            }

            String sorgu4 = "select count(ad) from sarki";
            Statement sta4 = myConn3.prepareStatement(sorgu4);
            ResultSet rs2 = sta4.executeQuery(sorgu4);
            while (rs2.next()) {
                ad = Integer.parseInt(rs2.getString("count(ad)"));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Base Hatasi : " + e.getMessage());
        }

        if (sarkiad == ad) {
            //System.out.println("Birbirine esit");
            return true;
        }

        return false;
    }

    public boolean sarkiAlbumTabloCheck() {

        int album = 0, ad = 0;
        try {

            Connection myConn3 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/musicapidb", "root", "1234");

            String sorgu3 = "select count(DISTINCT ad) from album";
            Statement sta3 = myConn3.prepareStatement(sorgu3);
            ResultSet rs = sta3.executeQuery(sorgu3);
            while (rs.next()) {
                ad = Integer.parseInt(rs.getString("count(DISTINCT ad)"));
            }

            String sorgu4 = "select count(DISTINCT album) from sarki";
            Statement sta4 = myConn3.prepareStatement(sorgu4);
            ResultSet rs2 = sta4.executeQuery(sorgu4);
            while (rs2.next()) {
                album = Integer.parseInt(rs2.getString("count(DISTINCT album)"));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Base Hatasi : " + e.getMessage());
        }

        if (album <= ad) {
            //System.out.println("Birbirine esit");
            return true;
        }

        return false;
    }

    public boolean sanatciAlbumTabloCheck() {

        int sanatci = 0, ad = 0;
        try {

            Connection myConn3 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/musicapidb", "root", "1234");

            String sorgu3 = "select count(DISTINCT ad) from sanatci";
            Statement sta3 = myConn3.prepareStatement(sorgu3);
            ResultSet rs = sta3.executeQuery(sorgu3);
            while (rs.next()) {
                ad = Integer.parseInt(rs.getString("count(DISTINCT ad)"));
            }

            String sorgu4 = "select count(DISTINCT sanatci) from album";
            Statement sta4 = myConn3.prepareStatement(sorgu4);
            ResultSet rs2 = sta4.executeQuery(sorgu4);
            while (rs2.next()) {
                sanatci = Integer.parseInt(rs2.getString("count(DISTINCT sanatci)"));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Base Hatasi : " + e.getMessage());
        }

        if (sanatci <= ad) {
            //System.out.println("Birbirine esit");
            return true;
        }

        return false;
    }

    public void kullanicilarSilSarki(String sarkiad) {
        ArrayList<String> dataKullaniciad = new ArrayList<>();
        
        try {

            Connection myConn3 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/musicapidb", "root", "1234");

            String sorgu3 = "select kullaniciad from kullanici";
            Statement sta3 = myConn3.prepareStatement(sorgu3);
            ResultSet rs = sta3.executeQuery(sorgu3);
            while (rs.next()) {
                dataKullaniciad.add(rs.getString("kullaniciad"));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Base Hatasi : " + e.getMessage());
        }
        
        for (int i = 0; i < dataKullaniciad.size(); i++) {
            try {
                Connection myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/musicapidb", "root", "1234");

                String sorgu = "DELETE FROM " + dataKullaniciad.get(i) + " WHERE (sarkiad = '" + sarkiad + "')";
                Statement sta = myConn.createStatement();

                int x = sta.executeUpdate(sorgu);

                if (x == 0) {
                    //JOptionPane.showMessageDialog(null, "Boyle Bir Sarki Zaten yok !");
                } else {
                    JOptionPane.showMessageDialog(null, dataKullaniciad.get(i)+" Basariyla silindi !");
                }
            } catch (Exception e) {
                if (e.getMessage().indexOf("doesn't exist") != -1) {
                    //JOptionPane.showMessageDialog(null, "Bu  Zaten yok !");
                } else {
                    JOptionPane.showMessageDialog(null, "Data Base Hatasi : " + e.getMessage());
                }
            }

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AlbumEkle;
    private javax.swing.JButton AlbumEkle1;
    private javax.swing.JButton AlbumGuncelle;
    private javax.swing.JButton AlbumGuncelle1;
    private javax.swing.JButton AlbumSil;
    private javax.swing.JButton AlbumSil1;
    private javax.swing.JTextField Albumtxt1;
    private javax.swing.JTextField Albumtxt10;
    private javax.swing.JTextField Albumtxt2;
    private javax.swing.JTextField Albumtxt3;
    private javax.swing.JTextField Albumtxt4;
    private javax.swing.JTextField Albumtxt5;
    private javax.swing.JTextField Albumtxt6;
    private javax.swing.JTextField Albumtxt7;
    private javax.swing.JTextField Albumtxt8;
    private javax.swing.JTextField Albumtxt9;
    private javax.swing.JButton DiEkle;
    private javax.swing.JButton DiGuncelle;
    private javax.swing.JButton DiSil;
    private javax.swing.JTextField Ditxt1;
    private javax.swing.JTextField Ditxt2;
    private javax.swing.JTextField Ditxt3;
    private javax.swing.JTextField Ditxt4;
    private javax.swing.JButton SanatciEkle;
    private javax.swing.JButton SanatciGuncelle;
    private javax.swing.JButton SanatciSil;
    private javax.swing.JTextField Sanatcitxt1;
    private javax.swing.JTextField Sanatcitxt2;
    private javax.swing.JTextField Sanatcitxt3;
    private javax.swing.JButton SarkiEkle;
    private javax.swing.JButton SarkiGuncelle;
    private javax.swing.JButton SarkiSil;
    private javax.swing.JTextField Sarkitxt1;
    private javax.swing.JTextField Sarkitxt2;
    private javax.swing.JTextField Sarkitxt3;
    private javax.swing.JTextField Sarkitxt4;
    private javax.swing.JTextField Sarkitxt5;
    private javax.swing.JTextField Sarkitxt6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    // End of variables declaration//GEN-END:variables
}
