package classes;

import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class Frame extends javax.swing.JFrame {
    
    Shutdown shutdown = new Shutdown();
    String appName = "Shutdown Timer";
    String appVersion = "V 2.0";
     
    public Frame() {
        initComponents();
        titleLbl.setText(appName);
        versionLbl.setText(appVersion);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        titleLbl = new javax.swing.JLabel();
        logoLbl = new javax.swing.JLabel();
        barPanel = new javax.swing.JPanel();
        versionLbl = new javax.swing.JLabel();
        instructionLbl = new javax.swing.JLabel();
        boxComboLbl = new javax.swing.JLabel();
        boxCombo = new javax.swing.JComboBox<>();
        cbMaintainSchedule = new javax.swing.JCheckBox();
        cbDisableHibernation = new javax.swing.JCheckBox();
        starAfterLbl = new javax.swing.JLabel();
        hourLbl = new javax.swing.JLabel();
        spinnerHour = new javax.swing.JSpinner();
        minuteLbl = new javax.swing.JLabel();
        spinnerMinute = new javax.swing.JSpinner();
        secondsLbl = new javax.swing.JLabel();
        spinnerSecond = new javax.swing.JSpinner();
        btnStart = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        MenuBar = new javax.swing.JMenuBar();
        MenuAbout = new javax.swing.JMenu();
        MenuHowToUse = new javax.swing.JMenu();
        MenuVisit = new javax.swing.JMenu();
        MenuMore = new javax.swing.JMenu();
        MenuTurnOffNow = new javax.swing.JMenu();
        MenuLogOffNow = new javax.swing.JMenu();
        MenuExit = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Shutdown Timer 2.0");
        setIconImage(new ImageIcon(getClass().getResource("/images/power-icon.png")).getImage());
        setName("Shutdown Timer"); // NOI18N
        setPreferredSize(null);
        setResizable(false);

        titleLbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titleLbl.setText("App Name");

        logoLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/power-icon.png"))); // NOI18N

        barPanel.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout barPanelLayout = new javax.swing.GroupLayout(barPanel);
        barPanel.setLayout(barPanelLayout);
        barPanelLayout.setHorizontalGroup(
            barPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        barPanelLayout.setVerticalGroup(
            barPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        versionLbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        versionLbl.setText("App Version");

        instructionLbl.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        instructionLbl.setText("What to do?");

        boxComboLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        boxComboLbl.setText("Select an Action:");

        boxCombo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        boxCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Turn Off", "Restart" }));

        cbMaintainSchedule.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbMaintainSchedule.setSelected(true);
        cbMaintainSchedule.setText("Maintain Action After Exiting the Program");
        cbMaintainSchedule.setEnabled(false);

        cbDisableHibernation.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbDisableHibernation.setText("Prevent the system from going into Hibernate mode");
        cbDisableHibernation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbDisableHibernationMouseClicked(evt);
            }
        });

        starAfterLbl.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        starAfterLbl.setText("Start After ");

        hourLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        hourLbl.setText("Hours");

        spinnerHour.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        spinnerHour.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        minuteLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        minuteLbl.setText("Minutes");

        spinnerMinute.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        spinnerMinute.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

        secondsLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        secondsLbl.setText("Seconds");

        spinnerSecond.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        spinnerSecond.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

        btnStart.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnStart.setText("Start");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        MenuAbout.setText("About");
        MenuAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuAboutMouseClicked(evt);
            }
        });
        MenuBar.add(MenuAbout);

        MenuHowToUse.setText("How To Use");
        MenuHowToUse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuHowToUseMouseClicked(evt);
            }
        });
        MenuBar.add(MenuHowToUse);

        MenuVisit.setText("Visit Us");
        MenuVisit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuVisitMouseClicked(evt);
            }
        });
        MenuBar.add(MenuVisit);

        MenuMore.setText("More");

        MenuTurnOffNow.setText("Turn Off");
        MenuTurnOffNow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuTurnOffNowMouseClicked(evt);
            }
        });
        MenuMore.add(MenuTurnOffNow);

        MenuLogOffNow.setText("Logoff Now");
        MenuLogOffNow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuLogOffNowMouseClicked(evt);
            }
        });
        MenuMore.add(MenuLogOffNow);

        MenuExit.setText("Exit");
        MenuExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuExitNowMouseClicked(evt);
            }
        });
        MenuMore.add(MenuExit);

        MenuBar.add(MenuMore);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(barPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(versionLbl))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(logoLbl)))
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbDisableHibernation, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(instructionLbl)
                                    .addComponent(cbMaintainSchedule)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(boxComboLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boxCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(starAfterLbl)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hourLbl)
                                    .addComponent(spinnerHour, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spinnerMinute, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(minuteLbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spinnerSecond, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(secondsLbl))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCancel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logoLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(versionLbl)
                .addGap(18, 18, 18)
                .addComponent(instructionLbl)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxComboLbl)
                    .addComponent(boxCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbMaintainSchedule)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbDisableHibernation)
                .addGap(38, 38, 38)
                .addComponent(starAfterLbl)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hourLbl)
                    .addComponent(minuteLbl)
                    .addComponent(secondsLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinnerHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerMinute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerSecond, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(btnStart)
                .addGap(18, 18, 18)
                .addComponent(btnCancel)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
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
                                  
    private void cbDisableHibernationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbDisableHibernationMouseClicked
        boolean boxIsSelected = cbDisableHibernation.isSelected();
        shutdown.HibernateConfig(boxIsSelected);
    }//GEN-LAST:event_cbDisableHibernationMouseClicked

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        int actionSelected = boxCombo.getSelectedIndex();
        int hourTyped = (int) spinnerHour.getValue();
        int minuteTyped = (int) spinnerMinute.getValue();
        int secondTyped = (int) spinnerSecond.getValue();

        boolean timeWasTyped = shutdown.verifyTime(hourTyped, minuteTyped, secondTyped);

        if (actionSelected == 0 && timeWasTyped == true) {
            shutdown.turnOff(hourTyped, minuteTyped, secondTyped);
        } else if (actionSelected == 1 && timeWasTyped == true) {
            shutdown.restart(hourTyped, minuteTyped, secondTyped);
        } else {

        }
    }//GEN-LAST:event_btnStartActionPerformed
    
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        shutdown.cancelAll();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void MenuExitNowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuExitNowMouseClicked
        int response = JOptionPane.showConfirmDialog(null,
              "Exit Program \n\n"
            + "• Do you want to exit the program ?"
            , "Exit Program", JOptionPane.INFORMATION_MESSAGE
        );
        
        if(response == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_MenuExitNowMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuAbout;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu MenuExit;
    private javax.swing.JMenu MenuHowToUse;
    private javax.swing.JMenu MenuLogOffNow;
    private javax.swing.JMenu MenuMore;
    private javax.swing.JMenu MenuTurnOffNow;
    private javax.swing.JMenu MenuVisit;
    private javax.swing.JPanel barPanel;
    private javax.swing.JComboBox<String> boxCombo;
    private javax.swing.JLabel boxComboLbl;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnStart;
    private javax.swing.JCheckBox cbDisableHibernation;
    private javax.swing.JCheckBox cbMaintainSchedule;
    private javax.swing.JLabel hourLbl;
    private javax.swing.JLabel instructionLbl;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel logoLbl;
    private javax.swing.JLabel minuteLbl;
    private javax.swing.JLabel secondsLbl;
    private javax.swing.JSpinner spinnerHour;
    private javax.swing.JSpinner spinnerMinute;
    private javax.swing.JSpinner spinnerSecond;
    private javax.swing.JLabel starAfterLbl;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JLabel versionLbl;
    // End of variables declaration//GEN-END:variables
}