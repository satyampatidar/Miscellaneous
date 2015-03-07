/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment10;

import javax.swing.JApplet;

/**
 *
 * @author Owner
 */
public class NewJApplet1 extends JApplet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
    setContentPane(new NewJPanel1());   
    }
    // TODO overwrite start(), stop() and destroy() methods
}
