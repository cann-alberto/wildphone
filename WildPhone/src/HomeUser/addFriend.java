/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * addFriend.java
 *
 * Created on 16-mag-2012, 17.53.39
 */
package HomeUser;

import org.jivesoftware.smack.Connection;

/**
 *
 * @author ninux
 */
public class addFriend extends javax.swing.JFrame {

    /** Creates new form addFriend */
    public addFriend(RosterManager rm,String host) {
        initComponents();
        this.rm = rm;
        this.host = host;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        Badd = new javax.swing.JButton();
        Bannulla = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nicknameField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome ");

        Badd.setText("Aggiungi");
        Badd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BaddActionPerformed(evt);
            }
        });

        Bannulla.setText("Annulla");
        Bannulla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BannullaActionPerformed(evt);
            }
        });

        jLabel2.setText("Nickname");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(231, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(387, Short.MAX_VALUE)
                .addComponent(Bannulla)
                .addGap(18, 18, 18)
                .addComponent(Badd)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nicknameField, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(231, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nicknameField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Badd)
                    .addComponent(Bannulla))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BannullaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BannullaActionPerformed
        dispose();
    }//GEN-LAST:event_BannullaActionPerformed

    private void BaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BaddActionPerformed
        
        if((nicknameField.getText().compareTo("") != 0) && (nameField.getText().compareTo("") != 0)){
            this.rm.addFriend(nameField.getText()+"@"+this.host,nicknameField.getText());
            dispose();
        }
    }//GEN-LAST:event_BaddActionPerformed
    
    private String host;
    private RosterManager rm;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Badd;
    private javax.swing.JButton Bannulla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField nicknameField;
    // End of variables declaration//GEN-END:variables
}
