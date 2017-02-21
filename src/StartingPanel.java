
/**
 * @author ngcongo
 */
public class StartingPanel extends javax.swing.JPanel implements java.awt.event.ActionListener {

    /**
     * Creates new form StartingPanel
     */
    javax.swing.Timer time;
    
    private Playing playing;
    
    public StartingPanel(Playing playing) {
        initComponents();
        this.playing=playing;
        time=new javax.swing.Timer(20,this);
    }
    
    public void actionPerformed(java.awt.event.ActionEvent evt)
    {
        int x=(int)getSize().getWidth()-2;
        int y=(int)getSize().getHeight();//-10;
        if(y>1 && x>1)
            setSize(x,y);
        else
        {
            setVisible(false);
            time.stop();
            playing.userName(userTf.getText());
        }    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        userTf = new javax.swing.JTextField();
        player = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 150, 255));
        setPreferredSize(new java.awt.Dimension(900, 430));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/towering.png"))); // NOI18N

        startButton.setBackground(new java.awt.Color(220, 226, 225));
        startButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        startButton.setForeground(new java.awt.Color(0, 204, 250));
        startButton.setText("start ");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        userTf.setBackground(new java.awt.Color(220, 226, 225));
        userTf.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        userTf.setForeground(new java.awt.Color(147, 145, 145));
        userTf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userTf.setText("player1");
        userTf.setToolTipText("");
        userTf.setMaximumSize(new java.awt.Dimension(8, 8));

        player.setText("Player :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(player)
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userTf, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(213, 213, 213)))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(player))
                .addContainerGap(32, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        time.start();
    }//GEN-LAST:event_startButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel player;
    private javax.swing.JButton startButton;
    public javax.swing.JTextField userTf;
    // End of variables declaration//GEN-END:variables
}
