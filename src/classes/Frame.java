package classes;

import java.io.IOException;
import javax.swing.JOptionPane;

public class Frame extends javax.swing.JFrame {
    
    Shutdown shutdown = new Shutdown();
    
    public Frame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BoxCombo = new javax.swing.JComboBox<>();
        CbDisableHibernation = new javax.swing.JCheckBox();
        CbMaintainSchedule = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        SpinnerHour = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        SpinnerMinute = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        SpinnerSecond = new javax.swing.JSpinner();
        BtnStart = new javax.swing.JButton();
        BtnCancel = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        MenuAbout = new javax.swing.JMenu();
        MenuHowToUse = new javax.swing.JMenu();
        MenuVisit = new javax.swing.JMenu();
        MenuHelp1 = new javax.swing.JMenu();
        MenuTurnOffNow = new javax.swing.JMenu();
        MenuLogOffNow = new javax.swing.JMenu();
        MenuExit = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Shutdown Timer");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Shutdown Timer");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/power-icon.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("V 1.5");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jLabel4.setText("What to do?");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Select an Action:");

        BoxCombo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BoxCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Turn Off", "Restart" }));

        CbDisableHibernation.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CbDisableHibernation.setText("Prevent the system from going into Hibernate mode");
        CbDisableHibernation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CbDisableHibernationMouseClicked(evt);
            }
        });

        CbMaintainSchedule.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CbMaintainSchedule.setSelected(true);
        CbMaintainSchedule.setText("Maintain Action After Exiting the Program");
        CbMaintainSchedule.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jLabel6.setText("Start After ");

        SpinnerHour.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SpinnerHour.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Hours");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Minutes");

        SpinnerMinute.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SpinnerMinute.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Seconds");

        SpinnerSecond.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SpinnerSecond.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

        BtnStart.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        BtnStart.setText("Start");
        BtnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnStartActionPerformed(evt);
            }
        });

        BtnCancel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        BtnCancel.setText("Cancel");
        BtnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelActionPerformed(evt);
            }
        });

        MenuAbout.setText("About");
        MenuAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuAboutMouseClicked(evt);
            }
        });
        jMenuBar2.add(MenuAbout);

        MenuHowToUse.setText("How To Use");
        MenuHowToUse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuHowToUseMouseClicked(evt);
            }
        });
        jMenuBar2.add(MenuHowToUse);

        MenuVisit.setText("Visit Us");
        MenuVisit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuVisitMouseClicked(evt);
            }
        });
        jMenuBar2.add(MenuVisit);

        MenuHelp1.setText("More");

        MenuTurnOffNow.setText("Turn Off");
        MenuTurnOffNow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuTurnOffNowMouseClicked(evt);
            }
        });
        MenuHelp1.add(MenuTurnOffNow);

        MenuLogOffNow.setText("Logoff Now");
        MenuLogOffNow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuLogOffNowMouseClicked(evt);
            }
        });
        MenuHelp1.add(MenuLogOffNow);

        MenuExit.setText("Exit");
        MenuExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuExitNowMouseClicked(evt);
            }
        });
        MenuHelp1.add(MenuExit);

        jMenuBar2.add(MenuHelp1);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)))
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CbDisableHibernation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(CbMaintainSchedule)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BoxCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(SpinnerHour, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SpinnerMinute, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SpinnerSecond, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnCancel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(BoxCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CbMaintainSchedule)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CbDisableHibernation)
                .addGap(38, 38, 38)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SpinnerHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpinnerMinute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpinnerSecond, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(BtnStart)
                .addGap(18, 18, 18)
                .addComponent(BtnCancel)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
      
    private void MenuAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuAboutMouseClicked
        JOptionPane.showMessageDialog(null, ""
                + "Shutdown Timer © 1.5\n\n"
                + "• Shutdown Timer is software designed to schedule Windows\n"
                + "functions, such as shutting down, restarting,\n"
                + "among other actions."
                , "About", JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_MenuAboutMouseClicked

    private void MenuHowToUseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuHowToUseMouseClicked
        JOptionPane.showMessageDialog(null, ""
                + "How To Use\n\n"
                + "• To use it, it's very simple, enter which action\n"
                + "you want to perform, for example: Schedule Turn Off\n"
                + "or Restart action. Then enter the hours, minutes or\n"
                + "seconds, after that just click Start."
                , "How To Use", JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_MenuHowToUseMouseClicked

    private void MenuVisitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuVisitMouseClicked
        try {
            Runtime.getRuntime().exec("cmd.exe /C start " + "https://github.com/jtas20/shutdownTimer");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ""
                + "Error when trying to open link!\n\n"
                + "• An error occurred when trying to open\n"
                + "the link in your browser, try accessing\n"
                + "it yourself. link:\n"
                + "'https://github.com/jtas20/shutdownTimer'.\n"
                , "How To Use", JOptionPane.WARNING_MESSAGE
            );
        }
    }//GEN-LAST:event_MenuVisitMouseClicked

    private void MenuTurnOffNowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuTurnOffNowMouseClicked
        shutdown.turnOffNow();
    }//GEN-LAST:event_MenuTurnOffNowMouseClicked

    private void MenuLogOffNowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuLogOffNowMouseClicked
        shutdown.logOffNow();
    }//GEN-LAST:event_MenuLogOffNowMouseClicked
                                  
    private void CbDisableHibernationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CbDisableHibernationMouseClicked
        boolean boxIsSelected = CbDisableHibernation.isSelected();
        shutdown.HibernateConfig(boxIsSelected);
    }//GEN-LAST:event_CbDisableHibernationMouseClicked

    private void BtnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnStartActionPerformed
        int actionSelected = BoxCombo.getSelectedIndex();
        int hourTyped = (int) SpinnerHour.getValue();
        int minuteTyped = (int) SpinnerMinute.getValue();
        int secondTyped = (int) SpinnerSecond.getValue();

        boolean timeWasTyped = shutdown.verifyTime(hourTyped, minuteTyped, secondTyped);

        if (actionSelected == 0 && timeWasTyped == true) {
            shutdown.turnOff(hourTyped, minuteTyped, secondTyped);
        } else if (actionSelected == 1 && timeWasTyped == true) {
            shutdown.restart(hourTyped, minuteTyped, secondTyped);
        } else {

        }
    }//GEN-LAST:event_BtnStartActionPerformed
    
    private void BtnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelActionPerformed
        shutdown.cancelAll();
    }//GEN-LAST:event_BtnCancelActionPerformed

    private void MenuExitNowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuExitNowMouseClicked
        shutdown.exitProgram();
    }//GEN-LAST:event_MenuExitNowMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BoxCombo;
    private javax.swing.JButton BtnCancel;
    private javax.swing.JButton BtnStart;
    private javax.swing.JCheckBox CbDisableHibernation;
    private javax.swing.JCheckBox CbMaintainSchedule;
    private javax.swing.JMenu MenuAbout;
    private javax.swing.JMenu MenuExit;
    private javax.swing.JMenu MenuHelp1;
    private javax.swing.JMenu MenuHowToUse;
    private javax.swing.JMenu MenuLogOffNow;
    private javax.swing.JMenu MenuTurnOffNow;
    private javax.swing.JMenu MenuVisit;
    private javax.swing.JSpinner SpinnerHour;
    private javax.swing.JSpinner SpinnerMinute;
    private javax.swing.JSpinner SpinnerSecond;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}