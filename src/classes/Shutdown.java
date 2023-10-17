package classes;

import java.io.IOException;
import javax.swing.JOptionPane;

public class Shutdown {
    
    public void turnOffNow(){
        try {
            Runtime.getRuntime().exec("shutdown -p");
            JOptionPane.showMessageDialog(null, 
                    "Turn Off\n\n"
                  + "• Your System is turn off now."
                  , "Turn Off", JOptionPane.INFORMATION_MESSAGE
            );
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
    public void logOffNow(){
        try {
            Runtime.getRuntime().exec("shutdown -l");
            JOptionPane.showMessageDialog(null, 
                    "LogOff\n\n"
                  + "• Your System is LogOff now."
                  , "LogOff", JOptionPane.INFORMATION_MESSAGE
            );
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
    public void HibernateConfig(boolean boxIsSelected){
        if (boxIsSelected == true) {
            try {
                Runtime.getRuntime().exec("powercfg.exe /hibernate off");
                JOptionPane.showMessageDialog(null, 
                        "Disabling Hibernate\n\n"
                      + "• Disabling Hibernate Successfully."
                      , "Disabling Hibernate", JOptionPane.INFORMATION_MESSAGE
                );
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, 
                        "Administrator Mode\n\n"
                      + "• You need to enable this program\n"
                      + "as Administrator Mode."
                      , "Administrator Mode", JOptionPane.WARNING_MESSAGE
                );
            }
        } else {
            try {
                Runtime.getRuntime().exec("powercfg.exe /hibernate on");
                JOptionPane.showMessageDialog(null, 
                        "Enabling Hibernate\n\n"
                      + "•Enabling Hibernate Successfully."
                      , "Enabling Hibernate", JOptionPane.INFORMATION_MESSAGE
                );
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, 
                        "Administrator Mode\n\n"
                      + "• You need to enable this program\n"
                      + "as Administrator Mode."
                      , "Administrator Mode", JOptionPane.WARNING_MESSAGE
                );
            }
        }
    }
    
    public boolean verifyTime(int hour, int minute, int second){
        if (hour == 0 && minute == 0 && second == 0) {
            JOptionPane.showMessageDialog(null, 
                    "Enter the time to schedule an action\n\n"
                  + "• Please provide the time so that an action can be scheduled."
                  , "Report the time", JOptionPane.WARNING_MESSAGE 
            );
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
    
    public void turnOff(int hour, int minute, int second){
        int time = convertTime(hour, minute, second);

        try {
            Runtime.getRuntime().exec("shutdown -a");
            Runtime.getRuntime().exec("shutdown -s -t " + time);
            JOptionPane.showMessageDialog(null, 
                    "Your System Will Turn Off\n\n"
                  + "• Time to Turn off: " + hour + " Hour " + minute + " Minutes And " + second + " Seconds."
                  , "Time to Turn Off", JOptionPane.INFORMATION_MESSAGE 
            );
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
    public void restart(int hour, int minute, int second){
         int time = convertTime(hour, minute, second);

        try {
            Runtime.getRuntime().exec("shutdown -a");
            Runtime.getRuntime().exec("shutdown -r -t " + time);
            JOptionPane.showMessageDialog(null, 
                    "Your System Will Restart\n\n"
                  + "• Time to Restart: " + hour + " Hour " + minute + " Minutes And " + second + " Seconds."
                  , "Time to Restart", JOptionPane.INFORMATION_MESSAGE
            );
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
    public void cancelAll(){
        try {
            Runtime.getRuntime().exec("shutdown -a");
            JOptionPane.showMessageDialog(null,
                    "Cancel All \n\n"
                  + "• all actions were successfully cancelled."
                  , "Cancel All", JOptionPane.INFORMATION_MESSAGE
            );  
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }    
}