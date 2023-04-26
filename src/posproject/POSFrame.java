/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package posproject;


import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.Random;

/**
 *
 * @author NALDO
 */
public class POSFrame extends javax.swing.JFrame {

    ArrayList <Barang> daftarBarang;
    Transaksi transaksi = new Transaksi();
    DetailTransaksi transaksi2 = new DetailTransaksi();
    
    TableModel daftarModel;
    
    Random rdm = new Random();
    
    int txId;
    
    int jumlahBelanja = 0;
    
    /**
     * Creates new form POSFrame
     */
    public POSFrame() {
        
        DBConnector.initDBConnection();
        
        Barang.loadBarangFromDB();
        System.out.println(Barang.daftarBarang.size());
        
        daftarBarang = Barang.daftarBarang;
        
        System.out.println(daftarBarang.size());
        
        initComponents();
        
        daftarModel = daftarTable.getModel();
        daftarModel.addTableModelListener(new TableModelListener()
            {
                @Override
                public void tableChanged(TableModelEvent e) {
                    
                    if(e.getColumn() == 4) 
                    {
                        int baris = e.getFirstRow();
                        int kolom = e.getColumn();
                        
                        float harga = (float)daftarModel .getValueAt(baris, 3);
                        int jumlah = (int)daftarModel.getValueAt(baris, 4);
                        
                        float total = harga * jumlah;
                        daftarModel. setValueAt(total, baris, 5);
                        
                        //update harga dan jumlah barang
                        
                        transaksi2.detailQTYBarang.set(baris,jumlah);
                        transaksi2.detailHargaBarang.set(baris,total);
                        
                        float totalBelanja = 0.0f;
                        total = 0.0f;
                        
                        for (int i = 0; i < jumlahBelanja; i++)
                        {
                            total = (float)daftarModel.getValueAt(i, 5);
                            totalBelanja = totalBelanja + total;
                        }
                        
                       
                        int totalBelanjaInt = (int)totalBelanja;
                        
                        
                        
                        totalBelanjaTextField.setText(String.format("%,d",totalBelanjaInt));
                     
                    }
                }
                    
            }
        );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        kodeTextField = new javax.swing.JTextField();
        namaTextField = new javax.swing.JTextField();
        hargaTextField = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        daftarTable = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        totalBelanjaTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dibayarTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        kembalianTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Kode");

        jLabel2.setText("Nama");

        jLabel3.setText("Harga");

        kodeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodeTextFieldActionPerformed(evt);
            }
        });

        namaTextField.setEditable(false);
        namaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaTextFieldActionPerformed(evt);
            }
        });

        hargaTextField.setEditable(false);

        daftarTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No", "Kode", "Nama", "Harga Satuan", "Jumlah", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(daftarTable);
        if (daftarTable.getColumnModel().getColumnCount() > 0) {
            daftarTable.getColumnModel().getColumn(0).setResizable(false);
            daftarTable.getColumnModel().getColumn(0).setPreferredWidth(10);
            daftarTable.getColumnModel().getColumn(1).setResizable(false);
            daftarTable.getColumnModel().getColumn(1).setPreferredWidth(50);
            daftarTable.getColumnModel().getColumn(2).setResizable(false);
            daftarTable.getColumnModel().getColumn(2).setPreferredWidth(300);
            daftarTable.getColumnModel().getColumn(3).setResizable(false);
            daftarTable.getColumnModel().getColumn(3).setPreferredWidth(50);
            daftarTable.getColumnModel().getColumn(4).setResizable(false);
            daftarTable.getColumnModel().getColumn(4).setPreferredWidth(20);
            daftarTable.getColumnModel().getColumn(5).setResizable(false);
            daftarTable.getColumnModel().getColumn(5).setPreferredWidth(50);
        }

        totalBelanjaTextField.setEditable(false);

        jLabel4.setText("Total Belanja");

        dibayarTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dibayarTextFieldActionPerformed(evt);
            }
        });
        dibayarTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dibayarTextFieldKeyReleased(evt);
            }
        });

        jLabel5.setText("Jumlah yang Dibayar");

        kembalianTextField.setEditable(false);
        kembalianTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembalianTextFieldActionPerformed(evt);
            }
        });

        jLabel6.setText("Kembalian");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(kodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(namaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(hargaTextField))))
                    .addComponent(jSeparator2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(kembalianTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dibayarTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(totalBelanjaTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(kodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(namaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3)
                    .addComponent(hargaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalBelanjaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dibayarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kembalianTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(736, 708));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void kodeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodeTextFieldActionPerformed
        
        String kodeInput = kodeTextField.getText();
        boolean found = false;
        
        Barang tempBarang;
        for (int i = 0; i < daftarBarang.size(); i++)
        {
            tempBarang = daftarBarang.get(i);
            
            // WARNING : TempIndex digunakan untuk indexing baris
            // dimulai dari index 0
            int tempIndex = 0;
            
            if (tempBarang.kode.equals(kodeInput))
            {
                found = true;
                               
                tempIndex = jumlahBelanja;
                jumlahBelanja++;
                
                System.out.println("Barang ditemukan");
                i = daftarBarang.size();
                
                
                transaksi2.detailIdBarang.add(Integer.valueOf(tempBarang.kode));
                transaksi2.detailQTYBarang.add(jumlahBelanja);
                transaksi2.detailHargaBarang.add(tempBarang.harga);
                
                namaTextField.setText(tempBarang.nama); 
                hargaTextField.setText(Float.toString(tempBarang.harga));
                
                daftarModel.setValueAt(jumlahBelanja, tempIndex, 0 );
                daftarModel.setValueAt(kodeInput, tempIndex, 1);
                daftarModel.setValueAt(tempBarang.nama, tempIndex, 2);
                daftarModel.setValueAt(tempBarang.harga, tempIndex, 3);
                daftarModel.setValueAt(1, tempIndex, 4);
         
                int brgIdentifier = 1;
                
                
            }
        }
        
        if (!found) {
            JOptionPane.showMessageDialog(rootPane, "Kode yang diinput tidak sesuai ! ");
        }
        
        kodeTextField.setText("");
        
        
    }//GEN-LAST:event_kodeTextFieldActionPerformed

    private void namaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaTextFieldActionPerformed

    private void kembalianTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembalianTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kembalianTextFieldActionPerformed

    private void dibayarTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dibayarTextFieldActionPerformed
        // TODO add your handling code here:
        
//        float totalBelanja = Float.valueOf(totalBelanjaTextField.getText());
//        int totalBelanjaInt = (int)totalBelanja;
//        
//        float dibayar = Float.valueOf(dibayarTextField.getText());
//        int dibayarInt = (int)dibayar;
//        
//        int kembalianInt = dibayarInt - totalBelanjaInt;
//        
//        kembalianTextField.setText(String.format("%,d", kembalianInt));

        String totalBelanjaString = totalBelanjaTextField.getText();
        totalBelanjaString = totalBelanjaString.replace(",", ""); 
        float totalBelanja = Float.parseFloat(totalBelanjaString);
        
        
        String dibayarString = dibayarTextField.getText();
        dibayarString = dibayarString.replace(",", "");
        float dibayar = Float.parseFloat(dibayarString);
        
        if (dibayar < totalBelanja)
        {
            JOptionPane.showMessageDialog(null, "Nilai yang diinput tidak cukup untuk membayar total belanja ! ");
            dibayarTextField.setText("");
            kembalianTextField.setText("");
            return;
        } else {
            
            transaksi.total_harga = totalBelanja;
            transaksi.total_dibayar = dibayar;
        }
        
        int kembalian = (int) (dibayar - totalBelanja);
        

        transaksi.kembalian = (float) kembalian;
        kembalianTextField.setText(String.format("%,d", kembalian));
        
        transaksi.simpanData();
        transaksi2.simpanDetailTransaksi();
        
    }//GEN-LAST:event_dibayarTextFieldActionPerformed

    private void dibayarTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dibayarTextFieldKeyReleased
        // TODO add your handling code here:
        
        String dibayarString = dibayarTextField.getText();
        dibayarString = dibayarString.replace(",", "");
        
        int dibayarInput = Integer.valueOf(dibayarString);
        dibayarTextField.setText(String.format("%,d", dibayarInput));
    }//GEN-LAST:event_dibayarTextFieldKeyReleased

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
            java.util.logging.Logger.getLogger(POSFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(POSFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(POSFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(POSFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new POSFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable daftarTable;
    private javax.swing.JTextField dibayarTextField;
    private javax.swing.JTextField hargaTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField kembalianTextField;
    private javax.swing.JTextField kodeTextField;
    private javax.swing.JTextField namaTextField;
    private javax.swing.JTextField totalBelanjaTextField;
    // End of variables declaration//GEN-END:variables
}
