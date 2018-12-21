
package university;

import java.awt.ComponentOrientation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static university.ConnectionDataBase.conn;

public class MainMenu extends javax.swing.JFrame {

   public static int ch;
   public static int chC;
   public static int chD;
   public static int changePassS_D;
   static int sem;
    public MainMenu() {
        initComponents();
        RightToLeft();
        selectSemester();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        A = new javax.swing.JMenu();
        student = new javax.swing.JMenu();
        addS = new javax.swing.JMenuItem();
        updateS = new javax.swing.JMenuItem();
        deleteS = new javax.swing.JMenuItem();
        doctor = new javax.swing.JMenu();
        addD = new javax.swing.JMenuItem();
        updateD = new javax.swing.JMenuItem();
        deleteD = new javax.swing.JMenuItem();
        courses = new javax.swing.JMenu();
        addC = new javax.swing.JMenuItem();
        updateC = new javax.swing.JMenuItem();
        deleteC = new javax.swing.JMenuItem();
        selectSemester = new javax.swing.JMenuItem();
        tsdeedFees = new javax.swing.JMenuItem();
        addOrRemoveCourse = new javax.swing.JMenuItem();
        D = new javax.swing.JMenu();
        filePersonD = new javax.swing.JMenuItem();
        displayStudent = new javax.swing.JMenuItem();
        addMark = new javax.swing.JMenuItem();
        changePasswordD = new javax.swing.JMenuItem();
        S = new javax.swing.JMenu();
        filePersonS = new javax.swing.JMenuItem();
        registerCourse = new javax.swing.JMenuItem();
        marks = new javax.swing.JMenuItem();
        avg = new javax.swing.JMenuItem();
        changePasswordS = new javax.swing.JMenuItem();
        H = new javax.swing.JMenu();
        changeStyle = new javax.swing.JMenu();
        s1 = new javax.swing.JMenuItem();
        s2 = new javax.swing.JMenuItem();
        s3 = new javax.swing.JMenuItem();
        s4 = new javax.swing.JMenuItem();
        s5 = new javax.swing.JMenuItem();
        s6 = new javax.swing.JMenuItem();
        help = new javax.swing.JMenuItem();
        about = new javax.swing.JMenuItem();
        L = new javax.swing.JMenu();
        loggOff = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/universityIMG.jpg"))); // NOI18N

        A.setText("الادارة");
        A.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        student.setText("طلاب");
        student.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        addS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addStudent.png"))); // NOI18N
        addS.setText("إضافة طالب");
        addS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSActionPerformed(evt);
            }
        });
        student.add(addS);

        updateS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        updateS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/editStudent.jpg"))); // NOI18N
        updateS.setText("تعديل طالب");
        updateS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateSActionPerformed(evt);
            }
        });
        student.add(updateS);

        deleteS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Delete.png"))); // NOI18N
        deleteS.setText("حذف طالب");
        deleteS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteSActionPerformed(evt);
            }
        });
        student.add(deleteS);

        A.add(student);

        doctor.setText("دكتور");
        doctor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        addD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        addD.setText("إضافة دكتور");
        addD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDActionPerformed(evt);
            }
        });
        doctor.add(addD);

        updateD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        updateD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.jpg"))); // NOI18N
        updateD.setText("تعديل دكتور");
        updateD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateDActionPerformed(evt);
            }
        });
        doctor.add(updateD);

        deleteD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Delete.png"))); // NOI18N
        deleteD.setText("حذف دكتور");
        deleteD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteDActionPerformed(evt);
            }
        });
        doctor.add(deleteD);

        A.add(doctor);

        courses.setText("كورسات");
        courses.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        addC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        addC.setText("إضافة كورس");
        addC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCActionPerformed(evt);
            }
        });
        courses.add(addC);

        updateC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.jpg"))); // NOI18N
        updateC.setText("تعديل كورس");
        updateC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCActionPerformed(evt);
            }
        });
        courses.add(updateC);

        deleteC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Delete.png"))); // NOI18N
        deleteC.setText("حذف كورس");
        deleteC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCActionPerformed(evt);
            }
        });
        courses.add(deleteC);

        A.add(courses);

        selectSemester.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/term.jpg"))); // NOI18N
        selectSemester.setText("تحديد الفصل الدراسى ");
        selectSemester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectSemesterActionPerformed(evt);
            }
        });
        A.add(selectSemester);

        tsdeedFees.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/money1.png"))); // NOI18N
        tsdeedFees.setText("تسديد الرسوم");
        tsdeedFees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tsdeedFeesActionPerformed(evt);
            }
        });
        A.add(tsdeedFees);

        addOrRemoveCourse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        addOrRemoveCourse.setText("تسجيل أو حذف كورس الطالب");
        addOrRemoveCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrRemoveCourseActionPerformed(evt);
            }
        });
        A.add(addOrRemoveCourse);

        jMenuBar1.add(A);

        D.setText("الدكتور");
        D.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        filePersonD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        filePersonD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profile.jpg"))); // NOI18N
        filePersonD.setText("الملف الشخصى");
        filePersonD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filePersonDActionPerformed(evt);
            }
        });
        D.add(filePersonD);

        displayStudent.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        displayStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/showRegisterStudent.png"))); // NOI18N
        displayStudent.setText("عرض الطلاب المسجلين بالمادة");
        displayStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayStudentActionPerformed(evt);
            }
        });
        D.add(displayStudent);

        addMark.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addMark.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        addMark.setText("إضافة الدرجات");
        D.add(addMark);

        changePasswordD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        changePasswordD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/changepass.png"))); // NOI18N
        changePasswordD.setText("تغيير كلمة السر");
        changePasswordD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordDActionPerformed(evt);
            }
        });
        D.add(changePasswordD);

        jMenuBar1.add(D);

        S.setText("الطالب");
        S.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        filePersonS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        filePersonS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profile.jpg"))); // NOI18N
        filePersonS.setText("الملف الشخصى");
        filePersonS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filePersonSActionPerformed(evt);
            }
        });
        S.add(filePersonS);

        registerCourse.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        registerCourse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        registerCourse.setText("تسجيل كورس");
        registerCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerCourseActionPerformed(evt);
            }
        });
        S.add(registerCourse);

        marks.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        marks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/showDegree.jpg"))); // NOI18N
        marks.setText("كشف الدرجات");
        S.add(marks);

        avg.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        avg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Degree.jpg"))); // NOI18N
        avg.setText("المعدل التراكمى");
        S.add(avg);

        changePasswordS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/changepass.png"))); // NOI18N
        changePasswordS.setText("تغير كلمة السر");
        changePasswordS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordSActionPerformed(evt);
            }
        });
        S.add(changePasswordS);

        jMenuBar1.add(S);

        H.setText("مساعد");
        H.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        H.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HActionPerformed(evt);
            }
        });

        changeStyle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/changeStyle.jpeg"))); // NOI18N
        changeStyle.setText("تغير الستايل");
        changeStyle.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        s1.setText("ستايل1");
        changeStyle.add(s1);

        s2.setText("ستايل2");
        changeStyle.add(s2);

        s3.setText("ستايل3");
        changeStyle.add(s3);

        s4.setText("ستايل4");
        s4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s4ActionPerformed(evt);
            }
        });
        changeStyle.add(s4);

        s5.setText("ستايل5");
        s5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s5ActionPerformed(evt);
            }
        });
        changeStyle.add(s5);

        s6.setText("الافتراضى");
        changeStyle.add(s6);

        H.add(changeStyle);

        help.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        help.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/help.jpg"))); // NOI18N
        help.setText("مساعدة");
        help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpActionPerformed(evt);
            }
        });
        H.add(help);

        about.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        about.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/about.jpg"))); // NOI18N
        about.setText("عنى");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });
        H.add(about);

        jMenuBar1.add(H);

        L.setText("تسجيل الخروج");
        L.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        loggOff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        loggOff.setText("تسجيل الخروج");
        loggOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loggOffActionPerformed(evt);
            }
        });
        L.add(loggOff);

        jMenuBar1.add(L);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
        About a =new About();
        a.setVisible(true);

    }//GEN-LAST:event_aboutActionPerformed

    private void HActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HActionPerformed
       
    }//GEN-LAST:event_HActionPerformed

    private void helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpActionPerformed
        JOptionPane.showMessageDialog(null, "عذرا غير فعالة الان");
    }//GEN-LAST:event_helpActionPerformed

    private void loggOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loggOffActionPerformed
        try {
            Thread.sleep(1000);
            this.setVisible(false);
            Login login =new Login();
            login.setVisible(true);
        } catch (InterruptedException ex) {
            
        }
    }//GEN-LAST:event_loggOffActionPerformed

    private void addSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSActionPerformed
        ch=1;
        Student s =new Student();
        s.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addSActionPerformed

    private void updateSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateSActionPerformed
        ch=2;
        Student s =new Student();
        s.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_updateSActionPerformed

    private void deleteSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteSActionPerformed
        ch=3;
        Student s =new Student();
        s.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_deleteSActionPerformed

    private void changePasswordSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordSActionPerformed
        changePassS_D=1;
        ChangePassword cp =new ChangePassword();
        cp.setLocationRelativeTo(null);
        cp.setVisible(true);
        cp.setTitle("تغيير كلمة السر لطالب");
        this.dispose();
    }//GEN-LAST:event_changePasswordSActionPerformed

    private void changePasswordDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordDActionPerformed
       changePassS_D=2;
        ChangePassword cp =new ChangePassword();
        cp.setLocationRelativeTo(null);
        cp.setVisible(true);
        cp.setTitle("تغيير كلمة السر لدكتور");
        this.dispose();
       
    }//GEN-LAST:event_changePasswordDActionPerformed

    private void registerCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerCourseActionPerformed
        Course course=new Course();
        course.setLocationRelativeTo(null);
        course.setVisible(true);
        
    }//GEN-LAST:event_registerCourseActionPerformed

    private void addCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCActionPerformed
        chC=1;
        new Course().setVisible(true);
        new Course().setLocationRelativeTo(null);
    }//GEN-LAST:event_addCActionPerformed

    private void updateCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCActionPerformed
        chC=2;
        new Course().setVisible(true);
        new Course().setLocationRelativeTo(null);
    }//GEN-LAST:event_updateCActionPerformed

    private void deleteCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCActionPerformed
        chC=3;
        new Course().setVisible(true);
        new Course().setLocationRelativeTo(null);
    }//GEN-LAST:event_deleteCActionPerformed

    private void addDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDActionPerformed
        chD=1;
       new Doctor().setLocationRelativeTo(null);
        new Doctor().setVisible(true);
    }//GEN-LAST:event_addDActionPerformed

    private void updateDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateDActionPerformed
        chD=2;
        new Doctor().setLocationRelativeTo(null);
        new Doctor().setVisible(true);
    }//GEN-LAST:event_updateDActionPerformed

    private void deleteDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDActionPerformed
        chD=3;
        new Doctor().setVisible(true);
        new Doctor().setLocationRelativeTo(null);
    }//GEN-LAST:event_deleteDActionPerformed

    private void filePersonSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filePersonSActionPerformed
        ProfilePersonal p =new ProfilePersonal();
        p.setVisible(true);
    }//GEN-LAST:event_filePersonSActionPerformed

    private void filePersonDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filePersonDActionPerformed
       FileDoctor f =new FileDoctor();
       f.setVisible(true);
    }//GEN-LAST:event_filePersonDActionPerformed

    private void selectSemesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectSemesterActionPerformed
        SelectSemester s = new SelectSemester();
        s.setVisible(true);
    }//GEN-LAST:event_selectSemesterActionPerformed

    private void tsdeedFeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tsdeedFeesActionPerformed
       TsdedRsom ts =new TsdedRsom();
       ts.setVisible(true);
    }//GEN-LAST:event_tsdeedFeesActionPerformed

    private void addOrRemoveCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrRemoveCourseActionPerformed
        RegDelCourse r =new RegDelCourse();
        r.setVisible(true);
    }//GEN-LAST:event_addOrRemoveCourseActionPerformed

    private void displayStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayStudentActionPerformed
        DisplayAllStudent d =new DisplayAllStudent();
        d.setVisible(true);
    }//GEN-LAST:event_displayStudentActionPerformed

    private void s4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s4ActionPerformed

    private void s5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s5ActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenu A;
    public javax.swing.JMenu D;
    private javax.swing.JMenu H;
    private javax.swing.JMenu L;
    public javax.swing.JMenu S;
    private javax.swing.JMenuItem about;
    private javax.swing.JMenuItem addC;
    private javax.swing.JMenuItem addD;
    private javax.swing.JMenuItem addMark;
    private javax.swing.JMenuItem addOrRemoveCourse;
    private javax.swing.JMenuItem addS;
    private javax.swing.JMenuItem avg;
    private javax.swing.JMenuItem changePasswordD;
    private javax.swing.JMenuItem changePasswordS;
    private javax.swing.JMenu changeStyle;
    private javax.swing.JMenu courses;
    private javax.swing.JMenuItem deleteC;
    private javax.swing.JMenuItem deleteD;
    private javax.swing.JMenuItem deleteS;
    private javax.swing.JMenuItem displayStudent;
    private javax.swing.JMenu doctor;
    private javax.swing.JMenuItem filePersonD;
    private javax.swing.JMenuItem filePersonS;
    private javax.swing.JMenuItem help;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem loggOff;
    private javax.swing.JMenuItem marks;
    private javax.swing.JMenuItem registerCourse;
    private javax.swing.JMenuItem s1;
    private javax.swing.JMenuItem s2;
    private javax.swing.JMenuItem s3;
    private javax.swing.JMenuItem s4;
    private javax.swing.JMenuItem s5;
    private javax.swing.JMenuItem s6;
    private javax.swing.JMenuItem selectSemester;
    private javax.swing.JMenu student;
    private javax.swing.JMenuItem tsdeedFees;
    private javax.swing.JMenuItem updateC;
    private javax.swing.JMenuItem updateD;
    private javax.swing.JMenuItem updateS;
    // End of variables declaration//GEN-END:variables
    private void RightToLeft()
    {
        //jMenuBar
        jMenuBar1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        //jMenu
        A.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        D.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        S.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        H.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        L.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        //submenu
        doctor.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        student.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        courses.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        changeStyle.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        //jMenuItems ADMIN
        addS.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        updateS.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        deleteS.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        addD.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        updateD.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        deleteD.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        addC.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        updateC.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        deleteC.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        addOrRemoveCourse.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        tsdeedFees.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        selectSemester.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        //jMenuItems Doctor
        changePasswordD.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        displayStudent.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        filePersonD.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        addMark.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        //jmenuItems Doctor
        changePasswordS.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        registerCourse.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        filePersonS.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        marks.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        avg.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        //jmenuItems helping
        changeStyle.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        s1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        s2.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        s3.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        s4.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT); 
        s5.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT); 
        s6.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        help.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        about.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        //jMenuITEMS LOGoff
        loggOff.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        
    }

    private void selectSemester() {
       try {
           Connection conn=ConnectionDataBase.connect();
           PreparedStatement ps=conn.prepareStatement("select * from semester");
           ResultSet rst=ps.executeQuery();
           rst.next();
           if(Integer.parseInt(rst.getString("first")) == 1)
               sem=1;
           else
               sem=2;
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage());
       }finally{
           try {
               conn.close();
           } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, ex.getMessage());
           }          
       }
        
        
    }
}
