/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voo.pkg2;

//import probal.Calander;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author turza
 */
public class Vooproject extends javax.swing.JFrame {

    /**
     * Creates new form Vooproject
     */
    String str1;
        String str2;
    public Vooproject() {
        initComponents();
//        showDate();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    int count = 0;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        m4 = new javax.swing.JTextField();
        b4 = new javax.swing.JTextField();
        m3 = new javax.swing.JTextField();
        b3 = new javax.swing.JTextField();
        m2 = new javax.swing.JTextField();
        b2 = new javax.swing.JTextField();
        m1 = new javax.swing.JTextField();
        b1 = new javax.swing.JTextField();
        m5 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        q = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setForeground(new java.awt.Color(0, 255, 204));
        jPanel1.setMinimumSize(new java.awt.Dimension(650, 648));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        m4.setBackground(new java.awt.Color(0, 0, 102));
        m4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        m4.setForeground(new java.awt.Color(255, 255, 255));
        m4.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(m4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 240, -1));

        b4.setBackground(new java.awt.Color(0, 51, 102));
        b4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b4.setForeground(new java.awt.Color(255, 255, 255));
        b4.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 240, -1));

        m3.setBackground(new java.awt.Color(0, 0, 102));
        m3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        m3.setForeground(new java.awt.Color(255, 255, 255));
        m3.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(m3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 250, -1));

        b3.setBackground(new java.awt.Color(0, 0, 102));
        b3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b3.setForeground(new java.awt.Color(255, 255, 255));
        b3.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 240, -1));

        m2.setBackground(new java.awt.Color(0, 0, 102));
        m2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        m2.setForeground(new java.awt.Color(255, 255, 255));
        m2.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(m2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 250, -1));

        b2.setBackground(new java.awt.Color(0, 0, 102));
        b2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b2.setForeground(new java.awt.Color(255, 255, 255));
        b2.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 240, -1));

        m1.setBackground(new java.awt.Color(0, 0, 102));
        m1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        m1.setForeground(new java.awt.Color(255, 255, 255));
        m1.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(m1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 540, 260, -1));

        b1.setBackground(new java.awt.Color(0, 0, 102));
        b1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b1.setForeground(new java.awt.Color(255, 255, 255));
        b1.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 250, -1));

        m5.setBackground(new java.awt.Color(0, 0, 102));
        m5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        m5.setForeground(new java.awt.Color(255, 255, 255));
        m5.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(m5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 240, -1));

        q.setBackground(new java.awt.Color(0, 0, 102));
        q.setColumns(20);
        q.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        q.setForeground(new java.awt.Color(255, 255, 255));
        q.setRows(5);
        q.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(q);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 586, 280, 80));

        jButton1.setBackground(new java.awt.Color(0, 0, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("ok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 620, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Voo");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 40, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Voo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 40, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Voo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 40, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Voo");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 40, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 204));
        jLabel1.setText("Me");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 380, 30, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 204));
        jLabel2.setText("Me");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 30, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 255, 204));
        jLabel7.setText("Me");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 30, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 255, 204));
        jLabel8.setText("Me");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 30, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 255, 204));
        jLabel9.setText("Me");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 510, 30, 20));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/voo/pkg2/2258077cc3bc5be.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 650, 660));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
//        String s = q.getText();
//        String [] temp = s.split(" ");
//        for (String p: temp)
//            if (p == "Date" || p == "date"){
//                showDate();
//                m1.setText(q.getText());
//            }
        
       
        if(count==1){
             m2.setText(m1.getText());
            b2.setText(b1.getText());
//             m1.setText(str1);
//            b1.setText(str2);
        }
        else if(count == 2)
        {
            m3.setText(m2.getText());
            b3.setText(b2.getText());
            m2.setText(m1.getText());
            b2.setText(b1.getText());
//             m1.setText(str1);
//            b1.setText(str2);
        }
         else if(count == 3)
        {
             m4.setText(m3.getText());
            b4.setText(b3.getText());
            m3.setText(m2.getText());
            b3.setText(b2.getText());
            m2.setText(m1.getText());
            b2.setText(b1.getText());
//             m1.setText(str1);
//           b1.setText(str2);
        }
         else if(count >=4)
        {   m5.setText(m4.getText());
            m4.setText(m3.getText());
            b4.setText(b3.getText());
            m3.setText(m2.getText());
            b3.setText(b2.getText());
            m2.setText(m1.getText());
            b2.setText(b1.getText());
//             m1.setText(str1);
//           b1.setText(str2);
        }
       { 
        String str = q.getText();
        String [] arrOfStr = str.split(" ",2);
        for (String p: arrOfStr)
            if (p.equalsIgnoreCase("Calander")|| p.equalsIgnoreCase("calander")){
               new Calander().setVisible(true);
                m1.setText(q.getText());
            }
         if (q.getText().equals("hi")) {
            m1.setText("hi");
            b1.setText("hello");
            
        }
        else if (q.getText().equals("Kemon acho?")) {
            b1.setText("valo achi");
            m1.setText("Kemon acho?");
           
        }
        else if (q.getText().equals("Tumi ke?")) {
            b1.setText("Ami Voo.Tumer vertual friend.");
            m1.setText("Tumi ke?");
            
        }
        else if (q.getText().equals("Tumar kaj ki?")) {
            b1.setText("Chat kora");
            m1.setText("Tumar kaj ki?");
            str1 = "Tumar kaj ki?";
            str2 = "Chat kora";
        }
        else if (q.getText().equals("Tumar bari koi?")) {
            b1.setText("Computer");
            m1.setText("Tumar bari koi?");

        }
        else if (q.getText().equals("Tumar num ki?")) {
            b1.setText("voo");
            m1.setText("Tumar num ki?");
        }
        else if (q.getText().equals("Ajker date ki?")) {
            m1.setText("Ajker date ki?");
//            b1.setText(s.format(d));
            showDate();
//         else if () {
//            m1.setText("Ajker date ki?");
////            b1.setText(s.format(d));
//            showDate();
            
            
        }
        else if (q.getText().equals("Show Calander")) {
            b1.setText("ok Boss");
            m1.setText("Show Calander");
            new Calander().setVisible(true);
           
        }
            else if (q.getText().equals("Start game")) {
            b1.setText("ok Boss");
            m1.setText("Start game");
            new Game().setVisible(true);
            }
        else{
            b1.setText("don't know");
            m1.setText(q.getText());
            
            
            }   }   
         count++;
         System.out.println(count);
    }//GEN-LAST:event_jButton1ActionPerformed

       void showDate(){
                Date d = new Date();
               SimpleDateFormat s =new SimpleDateFormat ("yyyy-MM-dd");
              b1.setText(s.format(d));
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
            java.util.logging.Logger.getLogger(Vooproject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vooproject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vooproject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vooproject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vooproject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField b1;
    private javax.swing.JTextField b2;
    private javax.swing.JTextField b3;
    private javax.swing.JTextField b4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField m1;
    private javax.swing.JTextField m2;
    private javax.swing.JTextField m3;
    private javax.swing.JTextField m4;
    private javax.swing.JTextField m5;
    private javax.swing.JTextArea q;
    // End of variables declaration//GEN-END:variables
}
