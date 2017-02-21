  
/**
 * @author Thembalakhe Ngcongo
 *         213511376
 */
 
public class SettingsPanel extends javax.swing.JPanel {

    Playing playing;
    
    public SettingsPanel() {
        initComponents();
        buttonGroup2.add(cntrlOn);
        buttonGroup2.add(cntrlOff);
    }
    
    public void initPlaying(Playing play)
    {
      playing=play;
    }  
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        typeOfCount = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        numberOfEllipse = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        cntrlOn = new javax.swing.JRadioButton();
        cntrlOff = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(0, 150, 255));
        setPreferredSize(new java.awt.Dimension(204, 355));

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 2, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Settings");

        jLabel2.setText("Count Down By");

        typeOfCount.setMaximumRowCount(2);
        typeOfCount.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Time", "Moves" }));
        typeOfCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeOfCountActionPerformed(evt);
            }
        });

        jLabel3.setText("Number of Ellipse");

        numberOfEllipse.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "3", "4", "5", "6", "7" }));
        numberOfEllipse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberOfEllipseActionPerformed(evt);
            }
        });

        jLabel4.setText("Control Buttons");

        cntrlOn.setBackground(new java.awt.Color(0, 150, 255));
        buttonGroup2.add(cntrlOn);
        cntrlOn.setSelected(true);
        cntrlOn.setText("on");
        cntrlOn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cntrlOnActionPerformed(evt);
            }
        });

        cntrlOff.setBackground(new java.awt.Color(0, 150, 255));
        buttonGroup2.add(cntrlOff);
        cntrlOff.setText("off");
        cntrlOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cntrlOnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(numberOfEllipse, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(cntrlOn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cntrlOff))
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(typeOfCount, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(typeOfCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numberOfEllipse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cntrlOff)
                    .addComponent(cntrlOn))
                .addContainerGap(36, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void typeOfCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeOfCountActionPerformed

        int get=typeOfCount.getSelectedIndex();
        String type=(get==0)?"Time":"Moves";
        playing.typeOfCountIs(type);
        
    }//GEN-LAST:event_typeOfCountActionPerformed

    private void numberOfEllipseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberOfEllipseActionPerformed
       playing.numberOfEllipseIs(numberOfEllipse.getSelectedIndex()+3);
       
    }//GEN-LAST:event_numberOfEllipseActionPerformed

    private void cntrlOnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cntrlOnActionPerformed
        
        javax.swing.JRadioButton fire=(javax.swing.JRadioButton)evt.getSource();
        if(fire.getText().equalsIgnoreCase("On"))
            playing.cntrl(true);
        else
            playing.cntrl(false);
        
    }//GEN-LAST:event_cntrlOnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton cntrlOff;
    private javax.swing.JRadioButton cntrlOn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox numberOfEllipse;
    private javax.swing.JComboBox typeOfCount;
    // End of variables declaration//GEN-END:variables
}
