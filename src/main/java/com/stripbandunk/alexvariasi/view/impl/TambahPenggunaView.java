/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stripbandunk.alexvariasi.view.impl;

import com.stripbandunk.alexvariasi.entity.master.Karyawan;
import com.stripbandunk.alexvariasi.entity.user.Grup;
import com.stripbandunk.alexvariasi.entity.user.Pengguna;
import com.stripbandunk.alexvariasi.manager.SpringManager;
import com.stripbandunk.alexvariasi.service.GrupService;
import com.stripbandunk.alexvariasi.service.KaryawanService;
import com.stripbandunk.alexvariasi.service.PenggunaService;
import com.stripbandunk.alexvariasi.validator.ValidatorException;
import com.stripbandunk.alexvariasi.validator.impl.PenggunaValidator;
import com.stripbandunk.alexvariasi.view.DialogView;
import com.stripbandunk.alexvariasi.view.FormApp;
import java.awt.Window;
import java.util.Date;
import org.springframework.dao.DataAccessException;

/**
 *
 * @author Eko Kurniawan Khannedy
 */
public class TambahPenggunaView extends DialogView {

    private Pengguna pengguna;

    /**
     * Creates new form TambahPenggunaView
     */
    public TambahPenggunaView(FormApp formApp) {
        super(formApp);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldKode = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldKataSandi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxGrup = new javax.swing.JComboBox();
        jCheckBoxAktif = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jButtonSimpan = new javax.swing.JButton();
        jButtonBatal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(jLabel1.getFont().deriveFont(jLabel1.getFont().getStyle() | java.awt.Font.BOLD, 24));
        jLabel1.setText("Tambah Pengguna Baru");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Pengguna"));

        jLabel2.setText("Kode Karyawan :");

        jLabel3.setText("Kata Sandi :");

        jLabel4.setText("Grup :");

        jCheckBoxAktif.setSelected(true);
        jCheckBoxAktif.setText("Aktif");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldKode)
                    .addComponent(jTextFieldKataSandi)
                    .addComponent(jComboBoxGrup, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jCheckBoxAktif))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldKataSandi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxGrup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxAktif)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonSimpan.setText("Simpan");
        jButtonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSimpanActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonSimpan);

        jButtonBatal.setText("Batal");
        jButtonBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBatalActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonBatal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 167, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-510)/2, (screenSize.height-351)/2, 510, 351);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBatalActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonBatalActionPerformed

    private void jButtonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSimpanActionPerformed

        KaryawanService karyawanService = SpringManager.getInstance().getBean(KaryawanService.class);
        Karyawan karyawan = karyawanService.find(jTextFieldKode.getText());
        if (karyawan == null) {
            showWarning("Karyawan tidak ditemukan");
        } else {
            pengguna = new Pengguna();
            pengguna.setId(jTextFieldKode.getText());
            pengguna.setKaryawan(karyawan);
            pengguna.setKataSandi(jTextFieldKataSandi.getText());
            pengguna.setGrup((Grup) jComboBoxGrup.getSelectedItem());
            pengguna.setTerakhirDirubah(new Date());
            pengguna.setWaktuDibuat(new Date());
            pengguna.setAktif(jCheckBoxAktif.isSelected());

            PenggunaValidator validator = SpringManager.getInstance().getBean(PenggunaValidator.class);
            PenggunaService service = SpringManager.getInstance().getBean(PenggunaService.class);

            try {
                validator.validate(pengguna);
                service.save(pengguna);
                dispose();
            } catch (ValidatorException ex) {
                showWarning(ex.getMessage());
            } catch (DataAccessException ex) {
                showError(ex.getRootCause().getMessage());
            }
        }
    }//GEN-LAST:event_jButtonSimpanActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBatal;
    private javax.swing.JButton jButtonSimpan;
    private javax.swing.JCheckBox jCheckBoxAktif;
    private javax.swing.JComboBox jComboBoxGrup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldKataSandi;
    private javax.swing.JTextField jTextFieldKode;
    // End of variables declaration//GEN-END:variables

    @Override
    public void display(Window formApp, Object parameter) {
        
        GrupService grupService = SpringManager.getInstance().getBean(GrupService.class);
        for(Grup grup : grupService.findAll()){
            jComboBoxGrup.addItem(grup);
        }
        
        setLocationRelativeTo(formApp);
        setVisible(true);
    }
}
