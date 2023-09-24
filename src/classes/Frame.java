package classes;

import java.io.IOException;
import javax.swing.JOptionPane;

public class Frame extends javax.swing.JFrame {

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
        MenuHelp = new javax.swing.JMenu();
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
        jLabel3.setText("V 1.1");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jLabel4.setText("O Quê Fazer?");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Selecione uma Ação:");

        BoxCombo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BoxCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Desligar", "Reiniciar" }));

        CbDisableHibernation.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CbDisableHibernation.setText("Impedir que o sistema entre no modo Hibernar");
        CbDisableHibernation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CbDisableHibernationMouseClicked(evt);
            }
        });

        CbMaintainSchedule.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CbMaintainSchedule.setSelected(true);
        CbMaintainSchedule.setText("Manter Agendamento Apos Sair Do Programa");
        CbMaintainSchedule.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jLabel6.setText("Começar Após");

        SpinnerHour.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SpinnerHour.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Horas");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Minutos");

        SpinnerMinute.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SpinnerMinute.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Segundos");

        SpinnerSecond.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SpinnerSecond.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

        BtnStart.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        BtnStart.setText("Começar");
        BtnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnStartActionPerformed(evt);
            }
        });

        BtnCancel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        BtnCancel.setText("Cancelar");
        BtnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelActionPerformed(evt);
            }
        });

        MenuAbout.setText("Sobre");
        MenuAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuAboutMouseClicked(evt);
            }
        });
        jMenuBar2.add(MenuAbout);

        MenuHelp.setText("Ajuda");
        MenuHelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuHelpMouseClicked(evt);
            }
        });
        jMenuBar2.add(MenuHelp);

        MenuVisit.setText("Visitar");
        MenuVisit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuVisitMouseClicked(evt);
            }
        });
        jMenuBar2.add(MenuVisit);

        MenuHelp1.setText("Mais");

        MenuTurnOffNow.setText("Desligar Agora");
        MenuTurnOffNow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuTurnOffNowMouseClicked(evt);
            }
        });
        MenuHelp1.add(MenuTurnOffNow);

        MenuLogOffNow.setText("Logoff Agora");
        MenuLogOffNow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuLogOffNowMouseClicked(evt);
            }
        });
        MenuHelp1.add(MenuLogOffNow);

        MenuExit.setText("Sair");
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
                            .addComponent(CbDisableHibernation, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(CbMaintainSchedule)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BoxCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                                    .addComponent(jLabel9)))
                            .addComponent(BtnStart, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                            .addComponent(BtnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
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
                .addGap(42, 42, 42)
                .addComponent(BtnStart)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnCancel)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
      
    private void MenuAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuAboutMouseClicked
        JOptionPane.showMessageDialog(null, "'Shuwdown Timer' é um software para agendar a ação de\n Desligar e Reiniciar Seu Sistema. Além de Fazer Logoff\n ou Desligar de Imediato!");
    }//GEN-LAST:event_MenuAboutMouseClicked

    private void MenuHelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuHelpMouseClicked
        JOptionPane.showMessageDialog(null, "Para usar é bem simples, informe qual ação deseja fazer exemplo: Agendar ação de Desligar ou Reiniciar.\n em seguida informe as horas minutos ou segundos, após isso basta clicar em Começar!");
    }//GEN-LAST:event_MenuHelpMouseClicked

    private void MenuVisitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuVisitMouseClicked
        try {
            Runtime.getRuntime().exec("cmd.exe /C start " + "https://github.com/jtas20/shutdown-timer");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "O Projeto 'Shutdown Timer' é um projeto Código aberto. \n caso deseje retomar o projeto ou melhoralo basta acessar: 'https://github.com/jtas20/shutdown-Timer'!");
        }
    }//GEN-LAST:event_MenuVisitMouseClicked

    private void MenuTurnOffNowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuTurnOffNowMouseClicked
        try {
            Runtime.getRuntime().exec("shutdown -p");
            JOptionPane.showMessageDialog(null, "Seu Sistema Irá Desligar Agora!");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + ex);
        }
    }//GEN-LAST:event_MenuTurnOffNowMouseClicked

    private void MenuLogOffNowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuLogOffNowMouseClicked
        try {
            Runtime.getRuntime().exec("shutdown -l");
            JOptionPane.showMessageDialog(null, "Fazendo LogOff em seu sistema Agora!");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + ex);
        }
    }//GEN-LAST:event_MenuLogOffNowMouseClicked
                                  
    private void CbDisableHibernationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CbDisableHibernationMouseClicked
        boolean boxIsSelected = CbDisableHibernation.isSelected();

        if (boxIsSelected == true) {
            try {
                Runtime.getRuntime().exec("powercfg.exe /hibernate off");
                JOptionPane.showMessageDialog(null, "Desabilitação de Hibernar Com Sucesso!");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Você precisa usar no modo administrador esse programa!");
            }
        } else {
            try {
                Runtime.getRuntime().exec("powercfg.exe /hibernate on");
                JOptionPane.showMessageDialog(null, "Abilitação de Hibernar Com Sucesso!");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Você precisa usar no modo administrador esse programa!");
            }
        }
    }//GEN-LAST:event_CbDisableHibernationMouseClicked

    private boolean verifyIfTimeWasTyped(int hour, int minute, int second) {
        if (hour == 0 && minute == 0 && second == 0) {
            JOptionPane.showMessageDialog(null, "Ops! Por favor, informe em quanto tempo deseja agendar alguma ação!");
            return false;
        } else {
            return true;
        }
    }

    private int convertTime(int hour, int minute, int second) {
        int hourConverted = hour * 60 * 60;
        int minuteConverted = minute * 60;
        int secondConverted = second;

        int convertedTime = hourConverted + minuteConverted + secondConverted;

        return convertedTime;
    }

    private void turnOff(int hour, int minute, int second) {
        int time = convertTime(hour, minute, second);

        try {
            Runtime.getRuntime().exec("shutdown -a");
            Runtime.getRuntime().exec("shutdown -s -t " + time);
            JOptionPane.showMessageDialog(null, "Seu Sistema Irá Desligar em: " + hour + " Horas " + minute + " Minutos e " + second + " Segundos.");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um Erro: " + ex);
        }
    }

    private void restart(int hour, int minute, int second) {
        int time = convertTime(hour, minute, second);

        try {
            Runtime.getRuntime().exec("shutdown -a");
            Runtime.getRuntime().exec("shutdown -r -t " + time);
            JOptionPane.showMessageDialog(null, "Seu Sistema Irá Reiniciar em: " + hour + " Horas " + minute + " Minutos e " + second + " Segundos.");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um Erro: " + ex);
        }
    }

    private void BtnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnStartActionPerformed
        int actionSelected = BoxCombo.getSelectedIndex();
        int hourTyped = (int) SpinnerHour.getValue();
        int minuteTyped = (int) SpinnerMinute.getValue();
        int secondTyped = (int) SpinnerSecond.getValue();

        boolean timeWasTyped = verifyIfTimeWasTyped(hourTyped, minuteTyped, secondTyped);

        if (actionSelected == 0 && timeWasTyped == true) {
            turnOff(hourTyped, minuteTyped, secondTyped);
        } else if (actionSelected == 1 && timeWasTyped == true) {
            restart(hourTyped, minuteTyped, secondTyped);
        } else {

        }
    }//GEN-LAST:event_BtnStartActionPerformed
    
    private void BtnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelActionPerformed
        try {
            Runtime.getRuntime().exec("shutdown -a");
            JOptionPane.showMessageDialog(null, "Agendamento de todas as ações foram canceladas com sucesso!");  
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + ex);
        }
    }//GEN-LAST:event_BtnCancelActionPerformed

    private void MenuExitNowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuExitNowMouseClicked
        System.exit(0);
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
    private javax.swing.JMenu MenuHelp;
    private javax.swing.JMenu MenuHelp1;
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