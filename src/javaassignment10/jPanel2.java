/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment10;

import javax.swing.JFrame;

/**
 *
 * @author Owner
 */
public class jPanel2 extends javax.swing.JPanel {

    /**
     * Creates new form jPanel2
     */
    public jPanel2() {
        initComponents();
    }
    public static void main(String[] args) {
         JFrame jf=new JFrame();
        jf.setContentPane(new NewJPanel1());
        jf.setBounds(10, 10, 200, 200);
        jf.setVisible(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();

        setLayout(new java.awt.BorderLayout());

        jTabbedPane2.add("P1", new NewJPanel1());
        jTabbedPane2.add("P2", new NewJPanel2());
        jTabbedPane2.add("P2", new NewJPanel3());
        add(jTabbedPane2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane jTabbedPane2;
    // End of variables declaration//GEN-END:variables
}
