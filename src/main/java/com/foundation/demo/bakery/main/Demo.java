/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foundation.demo.bakery.main;

import com.foundation.demo.bakery.model.Product;
import com.foundation.demo.bakery.util.IOHelper;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author baonguyen
 */
public class Demo extends javax.swing.JFrame {

    /**
     * Creates new form Demo
     */
    /* Duong dan truy cap file */
    public static final String listSaleProductPath = "data.csv";

    /* Bien khai bao so luong static */
    public static int saleProductAmount;

    public Demo() {
        initComponents();
        ldData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitle = new javax.swing.JLabel();
        lbType = new javax.swing.JLabel();
        cbxType = new javax.swing.JComboBox<>();
        lbQuantity = new javax.swing.JLabel();
        spnQuantity = new javax.swing.JSpinner();
        lbMaterials = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ckbFriedEgg = new javax.swing.JCheckBox();
        ckbPorkFloss = new javax.swing.JCheckBox();
        ckbPork = new javax.swing.JCheckBox();
        ckbBeef = new javax.swing.JCheckBox();
        ckbSpringRoll = new javax.swing.JCheckBox();
        ckbHam = new javax.swing.JCheckBox();
        ckbSalmon = new javax.swing.JCheckBox();
        ckbVegetable = new javax.swing.JCheckBox();
        ckbSpice = new javax.swing.JCheckBox();
        btnCheckout = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblArrayList = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Demo");
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(1000, 460));
        setResizable(false);

        lbTitle.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        lbTitle.setText("BAKERY DEMO");

        lbType.setText("Loại bánh mì");

        cbxType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bánh mì thịt", "Bánh mì không", "Bánh mì trứng chiên", "Bánh mì cá", "Bánh mì tùy chọn" }));
        cbxType.setSelectedIndex(1);
        cbxType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxTypeItemStateChanged(evt);
            }
        });

        lbQuantity.setText("Số lượng");

        spnQuantity.setToolTipText("");
        spnQuantity.setValue(1);

        lbMaterials.setText("Nguyên liệu:");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ckbFriedEgg.setText("Trứng chiên");
        ckbFriedEgg.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ckbFriedEggItemStateChanged(evt);
            }
        });

        ckbPorkFloss.setText("Chà bông");
        ckbPorkFloss.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ckbFriedEggItemStateChanged(evt);
            }
        });

        ckbPork.setText("Chả lụa");
        ckbPork.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ckbFriedEggItemStateChanged(evt);
            }
        });

        ckbBeef.setText("Chả bò");
        ckbBeef.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ckbFriedEggItemStateChanged(evt);
            }
        });

        ckbSpringRoll.setText("Nem");
        ckbSpringRoll.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ckbFriedEggItemStateChanged(evt);
            }
        });

        ckbHam.setText("Thịt");
        ckbHam.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ckbFriedEggItemStateChanged(evt);
            }
        });

        ckbSalmon.setText("Cá hồi");
        ckbSalmon.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ckbFriedEggItemStateChanged(evt);
            }
        });

        ckbVegetable.setText("Rau & dưa");
        ckbVegetable.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ckbFriedEggItemStateChanged(evt);
            }
        });

        ckbSpice.setText("Gia vị");
        ckbSpice.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ckbFriedEggItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ckbPorkFloss)
                    .addComponent(ckbPork)
                    .addComponent(ckbFriedEgg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ckbBeef)
                    .addComponent(ckbSpringRoll)
                    .addComponent(ckbHam))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ckbSalmon)
                    .addComponent(ckbVegetable)
                    .addComponent(ckbSpice))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ckbFriedEgg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbPorkFloss)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckbPork))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(ckbBeef)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ckbSpringRoll)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ckbHam))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(ckbSalmon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ckbVegetable)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ckbSpice)))))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        btnCheckout.setText("Mua bánh mì");
        btnCheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckoutActionPerformed(evt);
            }
        });

        tblArrayList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "No.", "Thời điểm bán", "Loại bánh mì", "Thành phần nguyên liệu", "Số lượng", "Giá", "Tổng tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblArrayList);
        if (tblArrayList.getColumnModel().getColumnCount() > 0) {
            tblArrayList.getColumnModel().getColumn(0).setResizable(false);
            tblArrayList.getColumnModel().getColumn(1).setResizable(false);
            tblArrayList.getColumnModel().getColumn(2).setResizable(false);
            tblArrayList.getColumnModel().getColumn(3).setResizable(false);
            tblArrayList.getColumnModel().getColumn(4).setResizable(false);
            tblArrayList.getColumnModel().getColumn(5).setResizable(false);
            tblArrayList.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(lbTitle))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lbType)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxType, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbQuantity)
                        .addGap(18, 18, 18)
                        .addComponent(spnQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lbMaterials)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(311, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(spnQuantity)
                        .addComponent(lbQuantity))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbType)
                        .addComponent(cbxType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(lbMaterials)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCheckout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckoutActionPerformed
        /* validate so luong */
        if (8 < validateMaterials()) {
            JOptionPane.showMessageDialog(new JFrame(), "Chỉ có thể chọn 8 nguyên liệu", "Thông báo",
                    JOptionPane.ERROR_MESSAGE);
        } else if (0 == JOptionPane.showConfirmDialog(null, "Bạn xác nhận mua " + cbxType.getSelectedItem() + "?", "Xác nhận", 2)) {
            if (Integer.parseInt(spnQuantity.getValue().toString()) < 1) {
                JOptionPane.showMessageDialog(new JFrame(), "Số lượng nhập không phù hợp", "Thông báo",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                Product product = new Product();
                product.setId(ldData());
                product.setTimeOfSale(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime()));
                product.setName(cbxType.getSelectedItem().toString());
                product.setMaterials(setMaterials());
                product.setQuantity(Integer.parseInt(spnQuantity.getValue().toString()));
                product.setPrice(setPrice());
                product.setTotalCost(product.getQuantity() * product.getPrice());
                if (IOHelper.writter(listSaleProductPath, product)) {
                    JOptionPane.showMessageDialog(new JFrame(), "Thành công");
                }
                ldData();
            }
        }
    }//GEN-LAST:event_btnCheckoutActionPerformed

    private void cbxTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxTypeItemStateChanged
        if (cbxType.getSelectedItem() == "Bánh mì không") {
            ckbFriedEgg.setSelected(false);
            ckbPorkFloss.setSelected(false);
            ckbPork.setSelected(false);
            ckbBeef.setSelected(false);
            ckbHam.setSelected(false);
            ckbSpringRoll.setSelected(false);
            ckbSalmon.setSelected(false);
            ckbVegetable.setSelected(false);
            ckbSpice.setSelected(false);
        } else if (cbxType.getSelectedItem() == "Bánh mì trứng chiên") {
            ckbFriedEgg.setSelected(true);
            ckbVegetable.setSelected(true);
            ckbSpice.setSelected(true);
            ckbPorkFloss.setSelected(false);
            ckbPork.setSelected(false);
            ckbBeef.setSelected(false);
            ckbHam.setSelected(false);
            ckbSpringRoll.setSelected(false);
            ckbSalmon.setSelected(false);
        } else if (cbxType.getSelectedItem() == "Bánh mì thịt") {
            ckbPork.setSelected(true);
            ckbBeef.setSelected(false);
            ckbHam.setSelected(true);
            ckbVegetable.setSelected(true);
            ckbSpice.setSelected(true);
            ckbFriedEgg.setSelected(false);
            ckbPorkFloss.setSelected(false);
            ckbSpringRoll.setSelected(false);
            ckbSalmon.setSelected(false);
        } else if (cbxType.getSelectedItem() == "Bánh mì cá") {
            ckbSalmon.setSelected(true);
            ckbVegetable.setSelected(true);
            ckbSpice.setSelected(true);
            ckbFriedEgg.setSelected(false);
            ckbPorkFloss.setSelected(false);
            ckbPork.setSelected(false);
            ckbBeef.setSelected(false);
            ckbHam.setSelected(false);
            ckbSpringRoll.setSelected(false);
        }
    }//GEN-LAST:event_cbxTypeItemStateChanged

    private void ckbFriedEggItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ckbFriedEggItemStateChanged
        boolean egg = ckbFriedEgg.isSelected();
        boolean floss = ckbPorkFloss.isSelected();
        boolean pork = ckbPork.isSelected();
        boolean beef = ckbBeef.isSelected();
        boolean ham = ckbHam.isSelected();
        boolean roll = ckbSpringRoll.isSelected();
        boolean salmon = ckbSalmon.isSelected();
        boolean vegetable = ckbVegetable.isSelected();
        boolean spice = ckbSpice.isSelected();
        if (!egg && !floss && !pork && !beef && !ham && !roll && !salmon && !vegetable && !spice) {
            cbxType.setSelectedItem("Bánh mì không");
        } else if (!egg && !floss && !pork && !beef && !ham && !roll && salmon && vegetable && spice) {
            cbxType.setSelectedItem("Bánh mì cá");
        } else if (egg && !floss && !pork && !beef && !ham && !roll && !salmon && vegetable && spice) {
            cbxType.setSelectedItem("Bánh mì trứng chiên");
        } else if (!egg && !floss && ham && !roll && !salmon && vegetable && spice) {
            if (pork && beef) {
                cbxType.setSelectedItem("Bánh mì tùy chọn");
            } else if (pork || beef) {
                cbxType.setSelectedItem("Bánh mì thịt");
            }
        } else {
            cbxType.setSelectedItem("Bánh mì tùy chọn");
        }
    }//GEN-LAST:event_ckbFriedEggItemStateChanged

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
            java.util.logging.Logger.getLogger(Demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Demo().setVisible(true);
        });
    }

    /**
     * validate so luong nguyen lieu toi da
     */
    private int validateMaterials() {
        int count = 0;
        List<JCheckBox> checkBoxs = lsJCheckBoxs();
        count = checkBoxs.stream().filter(checkBox -> (checkBox.isSelected())).map(_item -> 1).reduce(count, Integer::sum);
        return count;
    }

    /**
     * tao danh sach quan li check box
     */
    private List<JCheckBox> lsJCheckBoxs() {
        List<JCheckBox> checkBoxs = new ArrayList<>();
        checkBoxs.add(ckbFriedEgg);
        checkBoxs.add(ckbPorkFloss);
        checkBoxs.add(ckbPork);
        checkBoxs.add(ckbBeef);
        checkBoxs.add(ckbHam);
        checkBoxs.add(ckbSpringRoll);
        checkBoxs.add(ckbSalmon);
        checkBoxs.add(ckbVegetable);
        checkBoxs.add(ckbSpice);
        return checkBoxs;
    }

    /**
     * lay thong tin nguyen lieu ra string
     */
    private String setMaterials() {
        String s = "[Bánh mì không";
        s = lsJCheckBoxs().stream().filter(checkBox -> (checkBox.isSelected())).map(checkBox -> " + " + checkBox.getText()).reduce(s, String::concat);
        return s + "]";
    }

    /**
     * dat thong tin gia sp
     */
    private float setPrice() {
        float count = 8;
        for (JCheckBox checkBox : lsJCheckBoxs()) {
            if (null != checkBox.getText() && checkBox.isSelected()) {
                switch (checkBox.getText()) {
                    case "Trứng chiên":
                        count += 5;
                        break;
                    case "Gia vị":
                        count += 1;
                        break;
                    case "Chà bông":
                        count += 5;
                        break;
                    case "Chả lụa":
                        count += 5;
                        break;
                    case "Chả bò":
                        count += 5;
                        break;
                    case "Thịt":
                        count += 8;
                        break;
                    case "Nem":
                        count += 4;
                        break;
                    case "Cá hồi":
                        count += 5;
                        break;
                    case "Rau & dưa":
                        count += 1;
                        break;
                    default:
                        break;
                }
            }
        }
        return 1000 * count;
    }

    /**
     * Do data ra table
     */
    private int ldData() {
        DefaultTableModel tableModel = new DefaultTableModel();
        String[] colsName = {"No.", "Thời điểm bán", "Loại bánh mì", "Thành phần nguyên liệu", "Số lượng", "Giá", "Tổng tiền"};
        // đặt tiêu đề cột cho tableModel 
        tableModel.setColumnIdentifiers(colsName);
        List<Product> products = IOHelper.productReader(listSaleProductPath);
        Collections.sort(products, new Product());
        int count = 0;
        count = products.stream().map(product -> {
            String row[] = new String[7];
            row[0] = product.getId() + "";
            row[1] = product.getTimeOfSale();
            row[2] = product.getName();
            row[3] = product.getMaterials();
            row[4] = product.getQuantity() + "";
            row[5] = product.getPrice() + "";
            row[6] = product.getTotalCost() + "";
            return row;
        }).map(row -> {
            tableModel.addRow(row);
            return row;
        }).map(_item -> 1).reduce(count, Integer::sum);
        tblArrayList.setModel(tableModel);
        return 1 + count;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheckout;
    private javax.swing.JComboBox<String> cbxType;
    private javax.swing.JCheckBox ckbBeef;
    private javax.swing.JCheckBox ckbFriedEgg;
    private javax.swing.JCheckBox ckbHam;
    private javax.swing.JCheckBox ckbPork;
    private javax.swing.JCheckBox ckbPorkFloss;
    private javax.swing.JCheckBox ckbSalmon;
    private javax.swing.JCheckBox ckbSpice;
    private javax.swing.JCheckBox ckbSpringRoll;
    private javax.swing.JCheckBox ckbVegetable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbMaterials;
    private javax.swing.JLabel lbQuantity;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbType;
    private javax.swing.JSpinner spnQuantity;
    private javax.swing.JTable tblArrayList;
    // End of variables declaration//GEN-END:variables
}
