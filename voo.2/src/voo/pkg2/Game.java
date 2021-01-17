/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voo.pkg2;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author turza
 */
public class Game extends javax.swing.JFrame {

    /**
     * Creates new form Game
     */
    private String whosTurn = "x";
    private Object JOptionPane;

    public Game() {

        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }

    @Override
    public void setLocationRelativeTo(Component cmpnt) {
        super.setLocationRelativeTo(null); //To change body of generated methods, choose Tools | Templates.
    }

    private void determainwhosTurn() {
        if (whosTurn.equalsIgnoreCase("x")) {
            whosTurn = "o";
        } else {
            whosTurn = "x";
        }
    }
    private void xWins(){
        JOptionPane.showMessageDialog(this,
                    "Player one is win",
                    "Winer",
                    JOptionPane.INFORMATION_MASSAGE);
        resetGame();
    }
    private void oWins(){
        JOptionPane.showMessageDialog(this,
                    "Player two is win",
                    "Winer",
                    JOptionPane.INFORMATION_MESSAGE);
        resetGame();
    }

    private void tieGame() {
        //Strings And Buttons Used For If Game Is A Tie
        String one = jButton1.getText();
        String two = jButton2.getText();
        String three = jButton3.getText();
        String four = jButton4.getText();
        String five = jButton5.getText();
        String six = jButton6.getText();
        String seven = jButton7.getText();
        String eight = jButton8.getText();
        String nine = jButton9.getText();

        //Code To Determine To Tie Game
        if (!one.equals("") && !two.equals("") && !three.equals("") && !four.equals("")
                && !five.equals("") && !six.equals("") && !seven.equals("")
                && !eight.equals("") && !nine.equals("")) {
            
            resetGame();
        }
    }
    private void resetGame(){
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        
        
        
        
    }

    //Winning Conditions
    private void determineIfWin() {
        String one = jButton1.getText();
        String two = jButton2.getText();
        String three = jButton3.getText();
        String four = jButton4.getText();
        String five = jButton5.getText();
        String six = jButton6.getText();
        String seven = jButton7.getText();
        String eight = jButton8.getText();
        String nine = jButton9.getText();
        
        

        if (one.equals("X") && two.equals("X") && three.equals("X")) {
            xWins();

        }

        if (four.equals("X") && five.equals("X") && six.equals("X")) {
            xWins();

        }

        if (seven.equals("X") && eight.equals("X") && nine.equals("X")) {
            xWins();;

        }

        if (one.equals("X") && four.equals("X") && seven.equals("X")) {
            xWins();

        }

        if (two.equals("X") && five.equals("X") && eight.equals("X")) {
            xWins();

        }

        if (three.equals("X") && six.equals("X") && nine.equals("X")) {
            xWins();

        }

        if (seven.equals("X") && five.equals("X") && three.equals("X")) {
            xWins();

        }

        if (one.equals("X") && five.equals("X") && nine.equals("X")) {
            xWins();

        }
        //If O Wins

        if (one.equals("O") && two.equals("O") && three.equals("O")) {
            oWins();

        }

        if (four.equals("O") && five.equals("O") && six.equals("O")) {
            oWins();

        }

        if (seven.equals("O") && eight.equals("O") && nine.equals("O")) {
            oWins();

        }

        if (one.equals("O") && four.equals("O") && seven.equals("O")) {
            oWins();

        }

        if (two.equals("O") && five.equals("O") && eight.equals("O")) {
            oWins();

        }

        if (three.equals("O") && six.equals("O") && nine.equals("O")) {
            oWins();

        }

        if (seven.equals("O") && five.equals("O") && three.equals("O")) {
            oWins();

        }

        if (one.equals("O") && five.equals("O") && nine.equals("O")) {
            oWins();
        } 

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
        glay = new javax.swing.JPanel();
        jp1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jp2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jp3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jp4 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jp5 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jp6 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jp7 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jp8 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jp9 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 600));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new java.awt.BorderLayout());

        glay.setBackground(new java.awt.Color(204, 204, 204));
        glay.setLayout(new java.awt.GridLayout(3, 3, 1, 1));

        jp1.setBackground(new java.awt.Color(255, 255, 255));
        jp1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jp1.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jp1.add(jButton1, java.awt.BorderLayout.CENTER);

        glay.add(jp1);

        jp2.setBackground(new java.awt.Color(255, 255, 255));
        jp2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jp2.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jp2.add(jButton2, java.awt.BorderLayout.CENTER);

        glay.add(jp2);

        jp3.setBackground(new java.awt.Color(255, 255, 255));
        jp3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jp3.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jp3.add(jButton3, java.awt.BorderLayout.CENTER);

        glay.add(jp3);

        jp4.setBackground(new java.awt.Color(255, 255, 255));
        jp4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jp4.setLayout(new java.awt.BorderLayout());

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jp4.add(jButton4, java.awt.BorderLayout.CENTER);

        glay.add(jp4);

        jp5.setBackground(new java.awt.Color(255, 255, 255));
        jp5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jp5.setLayout(new java.awt.BorderLayout());

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jp5.add(jButton5, java.awt.BorderLayout.CENTER);

        glay.add(jp5);

        jp6.setBackground(new java.awt.Color(255, 255, 255));
        jp6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jp6.setLayout(new java.awt.BorderLayout());

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jp6.add(jButton6, java.awt.BorderLayout.CENTER);

        glay.add(jp6);

        jp7.setBackground(new java.awt.Color(255, 255, 255));
        jp7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jp7.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jp7.add(jButton7, java.awt.BorderLayout.CENTER);

        glay.add(jp7);

        jp8.setBackground(new java.awt.Color(255, 255, 255));
        jp8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jp8.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jp8.add(jButton8, java.awt.BorderLayout.CENTER);

        glay.add(jp8);

        jp9.setBackground(new java.awt.Color(255, 255, 255));
        jp9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jp9.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jp9.add(jButton9, java.awt.BorderLayout.CENTER);

        glay.add(jp9);

        jPanel1.add(glay, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton1.setText(whosTurn);
        if (whosTurn.equalsIgnoreCase("x")) {
            jButton1.setForeground(Color.red);
        } else {
            jButton1.setForeground(Color.blue);
        }
        determainwhosTurn();
        determineIfWin();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jButton2.setText(whosTurn);
        if (whosTurn.equalsIgnoreCase("x")) {
            jButton2.setForeground(Color.red);
        } else {
            jButton2.setForeground(Color.blue);
        }
        determainwhosTurn();
        determineIfWin();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jButton3.setText(whosTurn);
        if (whosTurn.equalsIgnoreCase("x")) {
            jButton3.setForeground(Color.red);
        } else {
            jButton3.setForeground(Color.blue);
        }
        determainwhosTurn();
        determineIfWin();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jButton4.setText(whosTurn);
        if (whosTurn.equalsIgnoreCase("x")) {
            jButton4.setForeground(Color.red);
        } else {
            jButton4.setForeground(Color.blue);
        }
        determainwhosTurn();
        determineIfWin();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jButton5.setText(whosTurn);
        if (whosTurn.equalsIgnoreCase("x")) {
            jButton5.setForeground(Color.red);
        } else {
            jButton5.setForeground(Color.blue);
        }
        determainwhosTurn();
        determineIfWin();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jButton6.setText(whosTurn);
        if (whosTurn.equalsIgnoreCase("x")) {
            jButton6.setForeground(Color.red);
        } else {
            jButton6.setForeground(Color.blue);
        }
        determainwhosTurn();
        determineIfWin();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        jButton7.setText(whosTurn);
        if (whosTurn.equalsIgnoreCase("x")) {
            jButton7.setForeground(Color.red);
        } else {
            jButton7.setForeground(Color.blue);
        }
        determainwhosTurn();
        determineIfWin();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        jButton8.setText(whosTurn);
        if (whosTurn.equalsIgnoreCase("x")) {
            jButton8.setForeground(Color.red);
        } else {
            jButton8.setForeground(Color.blue);
        }
        determainwhosTurn();
        determineIfWin();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        jButton9.setText(whosTurn);
        if (whosTurn.equalsIgnoreCase("x")) {
            jButton9.setForeground(Color.red);
        } else {
            jButton9.setForeground(Color.blue);
        }
        determainwhosTurn();
        determineIfWin();
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel glay;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jp1;
    private javax.swing.JPanel jp2;
    private javax.swing.JPanel jp3;
    private javax.swing.JPanel jp4;
    private javax.swing.JPanel jp5;
    private javax.swing.JPanel jp6;
    private javax.swing.JPanel jp7;
    private javax.swing.JPanel jp8;
    private javax.swing.JPanel jp9;
    // End of variables declaration//GEN-END:variables

    private void setLocationrelativeTo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setLocationrelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
