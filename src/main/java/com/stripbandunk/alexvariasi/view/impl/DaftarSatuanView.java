/*
 *  Copyright (c) 2011, StripBandunk and/or its affiliates. All rights reserved.
 * 
 *       http://stripbandunk.com/
 * 
 *  STRIPBANDUNK PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

/*
 * DaftarSatuanView.java
 *
 * Created on Nov 23, 2011, 3:51:20 PM
 */
package com.stripbandunk.alexvariasi.view.impl;

import com.stripbandunk.alexvariasi.entity.master.Satuan;
import com.stripbandunk.alexvariasi.manager.SpringManager;
import com.stripbandunk.alexvariasi.service.SatuanService;
import com.stripbandunk.alexvariasi.view.FormApp;
import com.stripbandunk.alexvariasi.view.View;
import com.stripbandunk.jwidget.JDynamicTable;
import com.stripbandunk.jwidget.model.DynamicTableModel;
import java.util.List;
import javax.swing.JComponent;

/**
 *
 * @author Eko Kurniawan Khannedy
 */
public class DaftarSatuanView extends javax.swing.JPanel implements View {

    private static final long serialVersionUID = 1L;

    private DynamicTableModel<Satuan> dynamicTableModel;

    private JDynamicTable jDynamicTable;

    /** Creates new form DaftarSatuanView */
    public DaftarSatuanView() {
        initComponents();

        dynamicTableModel = new DynamicTableModel<>(Satuan.class);
        jDynamicTable = new JDynamicTable(dynamicTableModel);
        jScrollPane.setViewportView(jDynamicTable);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();

        setLayout(new java.awt.BorderLayout());

        jToolBar.setRollover(true);
        jToolBar.setName("jToolBar"); // NOI18N

        jButton1.setText("Tambah Satuan Baru");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setName("jButton1"); // NOI18N
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar.add(jButton1);

        add(jToolBar, java.awt.BorderLayout.PAGE_START);

        jScrollPane.setName("jScrollPane"); // NOI18N
        add(jScrollPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JToolBar jToolBar;
    // End of variables declaration//GEN-END:variables

    @Override
    public void display(FormApp formApp) {
        SatuanService satuanService = SpringManager.getInstance().getBean(SatuanService.class);
        List<Satuan> list = satuanService.findAll();

        dynamicTableModel.clear();
        for (Satuan satuan : list) {
            dynamicTableModel.add(satuan);
        }
    }

    @Override
    public JComponent getComponent() {
        return this;
    }
}
