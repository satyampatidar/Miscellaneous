/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment10;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JWindow;

/**
 *
 * @author Owner
 */
public class SPLASH1 extends javax.swing.JPanel {
    
     

public static void main(String[] args) {
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width - 428) / 2;
        int y = (screen.height - 243) / 2;
        JWindow win = new JWindow();
        SPLASH s = new SPLASH();
        win.setContentPane(s);
        win.setBounds(x, y, 428, 243);
        win.setVisible(true);
        try {
            for (int i = 1; i <= 100; i++) {
                Thread.sleep(50);
                s.abc(i);
            }
        } catch (Exception e) {
        }
        win.setVisible(false);
        //System.exit(0);
        Q4 q = new Q4();
        q.setVisible(true);
    }
  }