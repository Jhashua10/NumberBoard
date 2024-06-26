/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.josh.numberboard;

import static com.josh.numberboard.StartMenu.boardWindow;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Josh
 */
public class AddBoard extends javax.swing.JFrame {
    /**
     * Creates new form AddBoard
     */
    public AddBoard() {
        initComponents();
        
        setImageLabel(fontLabel, "src/main/java/com/josh/resources/LandscapeWP.png");
    }

    private void setImageLabel(JLabel label, String imageRute){
        ImageIcon font = new ImageIcon(imageRute);
        Icon image = new ImageIcon(font.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
        label.setIcon(image);
        this.repaint();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fontPanel = new javax.swing.JPanel();
        Owner = new javax.swing.JLabel();
        Day = new javax.swing.JLabel();
        Month = new javax.swing.JLabel();
        Year = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        Numbers = new javax.swing.JLabel();
        Winners = new javax.swing.JLabel();
        Value = new javax.swing.JLabel();
        Prize = new javax.swing.JLabel();
        Description = new javax.swing.JLabel();
        BoardDesc = new javax.swing.JScrollPane();
        BoardDescText = new javax.swing.JTextArea();
        BoardOwner = new javax.swing.JTextField();
        BoardDay = new javax.swing.JTextField();
        BoardMonth = new javax.swing.JTextField();
        BoardYear = new javax.swing.JTextField();
        BoardName = new javax.swing.JTextField();
        BoardNumbers = new javax.swing.JTextField();
        BoardWinners = new javax.swing.JTextField();
        BoardValue = new javax.swing.JTextField();
        BoardPrize = new javax.swing.JTextField();
        ConfirmButton = new javax.swing.JButton();
        fontLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);

        fontPanel.setPreferredSize(new java.awt.Dimension(360, 440));
        fontPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Owner.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Owner.setText("Propietario:");
        fontPanel.add(Owner, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 90, -1));

        Day.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Day.setText("Dia:");
        fontPanel.add(Day, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 30, 20));

        Month.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Month.setText("Mes:");
        fontPanel.add(Month, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 30, 20));

        Year.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Year.setText("Año:");
        fontPanel.add(Year, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 30, 20));

        Date.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Date.setText("Fecha Limite:");
        fontPanel.add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 90, -1));

        name.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        name.setText("Nombre:");
        fontPanel.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, -1));

        Numbers.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Numbers.setText("Cantidad de numeros:");
        fontPanel.add(Numbers, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 140, -1));
        Numbers.getAccessibleContext().setAccessibleName("Valor:");

        Winners.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Winners.setText("Cantidad de ganadores:");
        fontPanel.add(Winners, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 140, -1));

        Value.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Value.setText("Valor por numero:");
        fontPanel.add(Value, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 140, -1));

        Prize.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Prize.setText("Premio:");
        fontPanel.add(Prize, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 140, -1));

        Description.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Description.setText("Descripcion:");
        fontPanel.add(Description, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 140, -1));

        BoardDescText.setColumns(20);
        BoardDescText.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        BoardDescText.setLineWrap(true);
        BoardDescText.setRows(5);
        BoardDescText.setWrapStyleWord(true);
        BoardDescText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BoardDescTextKeyTyped(evt);
            }
        });
        BoardDesc.setViewportView(BoardDescText);

        fontPanel.add(BoardDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 370, 100));

        BoardOwner.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BoardOwnerKeyTyped(evt);
            }
        });
        fontPanel.add(BoardOwner, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 220, -1));

        BoardDay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BoardDayKeyTyped(evt);
            }
        });
        fontPanel.add(BoardDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 70, -1));

        BoardMonth.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BoardMonthKeyTyped(evt);
            }
        });
        fontPanel.add(BoardMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 70, -1));

        BoardYear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BoardYearKeyTyped(evt);
            }
        });
        fontPanel.add(BoardYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 70, -1));

        BoardName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BoardNameKeyTyped(evt);
            }
        });
        fontPanel.add(BoardName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 220, -1));

        BoardNumbers.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BoardNumbersKeyTyped(evt);
            }
        });
        fontPanel.add(BoardNumbers, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 150, -1));

        BoardWinners.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BoardWinnersKeyTyped(evt);
            }
        });
        fontPanel.add(BoardWinners, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 180, -1));

        BoardValue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BoardValueKeyTyped(evt);
            }
        });
        fontPanel.add(BoardValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 150, -1));

        BoardPrize.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BoardPrizeKeyTyped(evt);
            }
        });
        fontPanel.add(BoardPrize, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 180, -1));

        ConfirmButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        ConfirmButton.setText("Confirmar");
        ConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmButtonActionPerformed(evt);
            }
        });
        fontPanel.add(ConfirmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 90, 30));
        fontPanel.add(fontLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fontPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fontPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmButtonActionPerformed

        boardWindow.addElementList(BoardName.getText());
        
        this.dispose();
        //clean form
        BoardName.setText("");
        BoardNumbers.setText("");
        BoardOwner.setText("");
        BoardPrize.setText("");
        BoardValue.setText("");
        BoardWinners.setText("");
        BoardDescText.setText("");
        //
    }//GEN-LAST:event_ConfirmButtonActionPerformed

    private void BoardNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BoardNameKeyTyped
        if(BoardName.getText().length() >= 32){
            evt.consume();
        }
    }//GEN-LAST:event_BoardNameKeyTyped

    private void BoardOwnerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BoardOwnerKeyTyped
        if(BoardOwner.getText().length() >= 32){
            evt.consume();
        }
    }//GEN-LAST:event_BoardOwnerKeyTyped

    private void BoardDescTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BoardDescTextKeyTyped
        if(BoardDescText.getText().length() >= 256){
            evt.consume();
        }
    }//GEN-LAST:event_BoardDescTextKeyTyped

    private void BoardPrizeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BoardPrizeKeyTyped
        if(BoardPrize.getText().length() >= 24){
            evt.consume();
        }
    }//GEN-LAST:event_BoardPrizeKeyTyped

    private void BoardValueKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BoardValueKeyTyped
        isNumber(evt);
    }//GEN-LAST:event_BoardValueKeyTyped

    private void BoardWinnersKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BoardWinnersKeyTyped
        isNumber(evt);
    }//GEN-LAST:event_BoardWinnersKeyTyped

    private void BoardNumbersKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BoardNumbersKeyTyped
        isNumber(evt);
    }//GEN-LAST:event_BoardNumbersKeyTyped

    private void BoardDayKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BoardDayKeyTyped
        if(BoardDay.getText().length() >= 2){
            evt.consume();
        }
    }//GEN-LAST:event_BoardDayKeyTyped

    private void BoardMonthKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BoardMonthKeyTyped
        if(BoardMonth.getText().length() >= 2){
            evt.consume();
        }
    }//GEN-LAST:event_BoardMonthKeyTyped

    private void BoardYearKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BoardYearKeyTyped
        if(BoardYear.getText().length() >= 4){
            evt.consume();
        }
    }//GEN-LAST:event_BoardYearKeyTyped
    
    private void isNumber(java.awt.event.KeyEvent evt){
        int key = evt.getKeyChar();
        boolean isNum = key >= 48 && key <= 57;
        
        if(!isNum){
            evt.consume();
        }
    }
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
            java.util.logging.Logger.getLogger(AddBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BoardDay;
    private javax.swing.JScrollPane BoardDesc;
    private javax.swing.JTextArea BoardDescText;
    private javax.swing.JTextField BoardMonth;
    private javax.swing.JTextField BoardName;
    private javax.swing.JTextField BoardNumbers;
    private javax.swing.JTextField BoardOwner;
    private javax.swing.JTextField BoardPrize;
    private javax.swing.JTextField BoardValue;
    private javax.swing.JTextField BoardWinners;
    private javax.swing.JTextField BoardYear;
    private javax.swing.JButton ConfirmButton;
    private javax.swing.JLabel Date;
    private javax.swing.JLabel Day;
    private javax.swing.JLabel Description;
    private javax.swing.JLabel Month;
    private javax.swing.JLabel Numbers;
    private javax.swing.JLabel Owner;
    private javax.swing.JLabel Prize;
    private javax.swing.JLabel Value;
    private javax.swing.JLabel Winners;
    private javax.swing.JLabel Year;
    private javax.swing.JLabel fontLabel;
    private javax.swing.JPanel fontPanel;
    private javax.swing.JLabel name;
    // End of variables declaration//GEN-END:variables
}