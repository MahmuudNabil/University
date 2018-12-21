
package university;

import java.awt.ComponentOrientation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
   static String id="";
   static String user="";
    
    Connection con=null;
    ResultSet rst= null;
    PreparedStatement ps =null;
    
    MainMenu mainMenu =new MainMenu();
    public Login() {
        initComponents();
        this.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        jMenuBar1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        file.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        h1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        
        changeStyle.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        s1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        s2.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        s3.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        s4.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT); 
        s5.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT); 
        s6.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        help.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        about.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        
        idOrName.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        show_pass.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        select_person.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        password.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        selectLabel = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        idOrName = new javax.swing.JTextField();
        select_person = new javax.swing.JComboBox<>();
        show_pass = new javax.swing.JCheckBox();
        enter = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        h1 = new javax.swing.JMenu();
        changeStyle = new javax.swing.JMenu();
        s1 = new javax.swing.JMenuItem();
        s2 = new javax.swing.JMenuItem();
        s3 = new javax.swing.JMenuItem();
        s4 = new javax.swing.JMenuItem();
        s5 = new javax.swing.JMenuItem();
        s6 = new javax.swing.JMenuItem();
        changeStyle1 = new javax.swing.JMenu();
        s7 = new javax.swing.JMenuItem();
        s8 = new javax.swing.JMenuItem();
        s9 = new javax.swing.JMenuItem();
        s10 = new javax.swing.JMenuItem();
        s11 = new javax.swing.JMenuItem();
        s12 = new javax.swing.JMenuItem();
        help = new javax.swing.JMenuItem();
        about = new javax.swing.JMenuItem();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("تسجيل الدخول");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 255), new java.awt.Color(51, 102, 255)));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png"))); // NOI18N

        idLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        idLabel.setForeground(new java.awt.Color(255, 255, 255));
        idLabel.setText("رقم التعريف");

        selectLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        selectLabel.setForeground(new java.awt.Color(255, 255, 255));
        selectLabel.setText("تحديد الشخص");

        passLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        passLabel.setForeground(new java.awt.Color(255, 255, 255));
        passLabel.setText("كلمة المرور");

        idOrName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        idOrName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idOrNameActionPerformed(evt);
            }
        });

        select_person.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "الادارة ", "دكتور ", "طالب", " " }));
        select_person.setSelectedIndex(-1);
        select_person.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                select_personItemStateChanged(evt);
            }
        });

        show_pass.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        show_pass.setText("اظهار كلمة المرور");
        show_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_passActionPerformed(evt);
            }
        });

        enter.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        enter.setText("دخول");
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });

        exit.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        exit.setText("خروج");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(show_pass, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(exit)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(idOrName, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(select_person, 0, 259, Short.MAX_VALUE)))
                            .addComponent(password, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(passLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(selectLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(enter))
                .addGap(42, 42, 42)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idLabel)
                            .addComponent(idOrName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passLabel)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(show_pass)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(selectLabel)
                            .addComponent(select_person, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enter)
                            .addComponent(exit))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("لوحة تسجيل الدخول");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(76, 76, 76))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        file.setText("ملف");
        file.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/enter.jpg"))); // NOI18N
        jMenuItem3.setText("دخول");
        file.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        jMenuItem4.setText("خروج");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        file.add(jMenuItem4);

        jMenuBar1.add(file);

        h1.setText("مساعد");
        h1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        h1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h1ActionPerformed(evt);
            }
        });

        changeStyle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/changeStyle.jpeg"))); // NOI18N
        changeStyle.setText("تغير الستايل");
        changeStyle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        s1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        s1.setText("أحمر");
        changeStyle.add(s1);

        s2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        s2.setText("أصفر");
        changeStyle.add(s2);

        s3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        s3.setText("أخضر");
        changeStyle.add(s3);

        s4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        s4.setText("رمادى");
        changeStyle.add(s4);

        s5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        s5.setText("فضى -رمادى");
        changeStyle.add(s5);

        s6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        s6.setText("الافتراضى");
        changeStyle.add(s6);

        changeStyle1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/changeStyle.jpeg"))); // NOI18N
        changeStyle1.setText("تغير الستايل");
        changeStyle1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        s7.setText("ستايل1");
        changeStyle1.add(s7);

        s8.setText("ستايل2");
        changeStyle1.add(s8);

        s9.setText("ستايل3");
        changeStyle1.add(s9);

        s10.setText("ستايل4");
        s10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s10ActionPerformed(evt);
            }
        });
        changeStyle1.add(s10);

        s11.setText("ستايل5");
        s11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s11ActionPerformed(evt);
            }
        });
        changeStyle1.add(s11);

        s12.setText("الافتراضى");
        changeStyle1.add(s12);

        changeStyle.add(changeStyle1);

        h1.add(changeStyle);

        help.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        help.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/help.jpg"))); // NOI18N
        help.setText("مساعدة");
        help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpActionPerformed(evt);
            }
        });
        h1.add(help);

        about.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        about.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/about.jpg"))); // NOI18N
        about.setText("عنى");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });
        h1.add(about);

        jMenuBar1.add(h1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(842, 459));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void idOrNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idOrNameActionPerformed
        
    }//GEN-LAST:event_idOrNameActionPerformed

    private void show_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_passActionPerformed
       if(show_pass.isSelected())
           password.setEchoChar((char)0);
    }//GEN-LAST:event_show_passActionPerformed

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
        About a =new About();
        a.setVisible(true);    
    }//GEN-LAST:event_aboutActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void h1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h1ActionPerformed
        
    }//GEN-LAST:event_h1ActionPerformed

    private void helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpActionPerformed
       JOptionPane.showMessageDialog(about, "عذرا غير فعالة الان");
    }//GEN-LAST:event_helpActionPerformed

    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed
        String miss ="لقد نسيت ادخال البيانات التالية"+"\n";
        if(idOrName.getText().equals(""))
            miss+=idLabel.getText()+"\n";
        if(password.getText().equals(""))
            miss+=passLabel.getText()+"\n";
        if(select_person.getSelectedIndex()==-1)
            miss+=selectLabel.getText()+"\n";
        if(!idOrName.getText().equals("") && !password.getText().equals("") && select_person.getSelectedIndex()!=-1 )
        {
            if(select_person.getSelectedIndex()==0)
                adminLogin();
            if(select_person.getSelectedIndex()==1)
                doctorLogin();
            if(select_person.getSelectedIndex()==2)
                studentLogin();
        }
        else
            JOptionPane.showMessageDialog(null, miss,"فقدت البيانات",2);
    }//GEN-LAST:event_enterActionPerformed

    private void select_personItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_select_personItemStateChanged
        if(select_person.getSelectedIndex()==0)
            idLabel.setText("إسم المستخدم");
        else
            idLabel.setText("رقم التعريف");
    }//GEN-LAST:event_select_personItemStateChanged

    private void s10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s10ActionPerformed

    private void s11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s11ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JMenuItem about;
    private javax.swing.JMenu changeStyle;
    private javax.swing.JMenu changeStyle1;
    private javax.swing.JButton enter;
    private javax.swing.JButton exit;
    private javax.swing.JMenu file;
    private javax.swing.JMenu h1;
    private javax.swing.JMenuItem help;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idOrName;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel passLabel;
    private javax.swing.JPasswordField password;
    private javax.swing.JMenuItem s1;
    private javax.swing.JMenuItem s10;
    private javax.swing.JMenuItem s11;
    private javax.swing.JMenuItem s12;
    private javax.swing.JMenuItem s2;
    private javax.swing.JMenuItem s3;
    private javax.swing.JMenuItem s4;
    private javax.swing.JMenuItem s5;
    private javax.swing.JMenuItem s6;
    private javax.swing.JMenuItem s7;
    private javax.swing.JMenuItem s8;
    private javax.swing.JMenuItem s9;
    private javax.swing.JLabel selectLabel;
    private javax.swing.JComboBox<String> select_person;
    private javax.swing.JCheckBox show_pass;
    // End of variables declaration//GEN-END:variables

    private void adminLogin() {
        
        user=idOrName.getText().trim();
        String passwordA=password.getText().trim();
        if(user.equals("admin") && passwordA.equals("12345"))
        {
            mainMenu.setVisible(true);
            mainMenu.D.setEnabled(false);
            mainMenu.S.setEnabled(false);
            mainMenu.setVisible(true);
            mainMenu.setLocationRelativeTo(null);
            this.setVisible(false);
            JOptionPane.showMessageDialog(null, user+"مرحبا");
        }
        else
            JOptionPane.showMessageDialog(null, "تأكد من صحة البيانات المدخلة", "معلومات خاطئة",JOptionPane.ERROR_MESSAGE);
    }

    private void doctorLogin() {
       id=idOrName.getText().trim();
      String pass=password.getText().trim();
     // String st="SELECT * FROM `doctor` WHERE id=1 and passwordD=123";
        String st ="SELECT * FROM `doctor` WHERE id='"+Integer.parseInt(id)+"'and password='"+pass+"'";
    try {
         con =ConnectionDataBase.connect();
         ps=con.prepareStatement(st);
         rst=ps.executeQuery();
         if(rst.next())
         {
             String userD=rst.getString("nameD");
            mainMenu.setVisible(true);
            mainMenu.A.setEnabled(false);
            mainMenu.S.setEnabled(false);
            mainMenu.setVisible(true);
            mainMenu.setLocationRelativeTo(null);
            this.setVisible(false);
            JOptionPane.showMessageDialog(null,"مرحبا دكتور  "+userD );
         }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }finally{
           try {
               con.close();
           } catch (SQLException ex) {
               
           }
        }
        
    }

    private void studentLogin() {
         id=idOrName.getText().trim();
      String pass=password.getText().trim();
     // String st="SELECT * FROM `doctor` WHERE id=1 and passwordD=123";
        String st ="SELECT * FROM `student` WHERE id='"+Integer.parseInt(id)+"'and password='"+pass+"'";
    try {
         con =ConnectionDataBase.connect();
         ps=con.prepareStatement(st);
         rst=ps.executeQuery();
         if(rst.next())
         {
             String userD=rst.getString("name");
            mainMenu.setVisible(true);
            mainMenu.A.setEnabled(false);
            mainMenu.D.setEnabled(false);
            mainMenu.setVisible(true);
            mainMenu.setLocationRelativeTo(null);
            this.setVisible(false);
            JOptionPane.showMessageDialog(null,"مرحبا  "+userD );
         }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }finally{
           try {
               con.close();
           } catch (SQLException ex) {
               
           }
        }
    }
}
