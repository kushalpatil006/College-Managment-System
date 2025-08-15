
import javax.swing.JFrame;


public class MainForm extends javax.swing.JFrame {
    public MainForm() {
        Login l = new Login();
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        label_scount = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        label_ccount = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu_managestd = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu_Course = new javax.swing.JMenu();
        jMenuItem_addCourse = new javax.swing.JMenuItem();
        jMenuItem_manageCourse = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem_addscore = new javax.swing.JMenuItem();
        jMenuItem_Addscore = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        jMenuItem5.setText("jMenuItem5");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setFocusable(false);

        label_scount.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_scount.setText("Student Count =");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(label_scount, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_scount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
        );

        label_ccount.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_ccount.setText("Course Count =");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_ccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(label_ccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(39, 39, 39))
        );

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        label1.setText("WELCOME    TO   GOVERNMENT POLYTECNIC JALGAON");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
            .addComponent(label1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1101, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(341, 341, 341)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jMenu_managestd.setText("Student");

        jMenuItem1.setText("ADD");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu_managestd.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem2.setText("Manage Student");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu_managestd.add(jMenuItem2);

        jMenuBar2.add(jMenu_managestd);

        jMenu_Course.setText("Course");

        jMenuItem_addCourse.setText("Add Course");
        jMenuItem_addCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_addCourseActionPerformed(evt);
            }
        });
        jMenu_Course.add(jMenuItem_addCourse);

        jMenuItem_manageCourse.setBackground(new java.awt.Color(153, 153, 153));
        jMenuItem_manageCourse.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem_manageCourse.setText("Manage Course");
        jMenuItem_manageCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_manageCourseActionPerformed(evt);
            }
        });
        jMenu_Course.add(jMenuItem_manageCourse);

        jMenuBar2.add(jMenu_Course);

        jMenu1.setText("Score");

        jMenuItem_addscore.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem_addscore.setText("Add Score");
        jMenuItem_addscore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_addscoreActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_addscore);

        jMenuItem_Addscore.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem_Addscore.setText("Manage Score");
        jMenuItem_Addscore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_AddscoreActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_Addscore);

        jMenuBar2.add(jMenu1);

        setJMenuBar(jMenuBar2);

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

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // Open add student form
        
                  Newstudent n = new Newstudent();
                    n.setVisible(true);
                    n.pack();
                    n.setLocationRelativeTo(null);
                    n.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        
                 managestudent m = new managestudent();
                    m.setVisible(true);
                    m.pack();
                    m.setLocationRelativeTo(null);
                    m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem_addCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_addCourseActionPerformed
                   Add_Course a = new Add_Course();
                    a.setVisible(true);
                    a.pack();
                    a.setLocationRelativeTo(null);
                    a.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenuItem_addCourseActionPerformed

    private void jMenuItem_manageCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_manageCourseActionPerformed
        Manage_Course manageC = new Manage_Course();
                    manageC .setVisible(true);
                    manageC .pack();
                    manageC .setLocationRelativeTo(null);
                    manageC .setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                                                     
        
    }//GEN-LAST:event_jMenuItem_manageCourseActionPerformed

    private void jMenuItem_addscoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_addscoreActionPerformed
                
                   AddScore s = new AddScore();
                    s .setVisible(true);
                    s .pack();
                    s .setLocationRelativeTo(null);
                    s.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                                 
    }//GEN-LAST:event_jMenuItem_addscoreActionPerformed

    private void jMenuItem_AddscoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_AddscoreActionPerformed
                  
                  EditdeleteScore s = new  EditdeleteScore();
                    s .setVisible(true);
                    s .pack();
                    s .setLocationRelativeTo(null);
                    s.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                                 
    }//GEN-LAST:event_jMenuItem_AddscoreActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame jFrame1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem_Addscore;
    private javax.swing.JMenuItem jMenuItem_addCourse;
    private javax.swing.JMenuItem jMenuItem_addscore;
    private javax.swing.JMenuItem jMenuItem_manageCourse;
    private javax.swing.JMenu jMenu_Course;
    private javax.swing.JMenu jMenu_managestd;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private java.awt.Label label1;
    public static javax.swing.JLabel label_ccount;
    public static javax.swing.JLabel label_scount;
    // End of variables declaration//GEN-END:variables
}
