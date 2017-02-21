
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

/**
 * @author Thembalakhe Ngcongo
 *         213511376
 */

public class Playing extends javax.swing.JPanel implements java.awt.event.ActionListener{

   
   String typeOfCount;         // Count using Time or Moves 
   int numberOfEllipse;        // Number Of Ellipse
   SidePane pane;              // SidePane holding Settings,Pause and Moves
   int max;                    // Maximum count
   int count;                  // count move/time
    
   public Playing(SidePane pane) {
    
      this.pane=pane;          
      initComponents();            // Create the JPanel Components
        
      typeOfCount="Moves";         // Default typeofcount use moves
      numberOfEllipse=3;           // Start by three ellipse 
        
      sidePane.add(pane);
      count=0;                               // time or move
      countByLabel.setText(typeOfCount);
      countLabel.setText(""+count);
      display.setEnabled(false);             // User cannot move Ellipse must press play first 
      max=(int)Math.pow(2,numberOfEllipse)-1;
      cntrlButtonActive(false);             // Deactivate cntrlsButton reason same as above
      pauseActive(false);                   // Deactivate pauseButton
   }

    // Get Type Of Count
   public  void typeOfCountIs(String type)   // Event Activate by "combobox"(Count BY) on Settings Panel 
   {    
      typeOfCount=type;
        //call count
      this.countByLabel.setText(type);
   }
    
    // Get Number Of Ellipse
   public  void numberOfEllipseIs(int number) // event for "NumberOfEllipse" dropButton on Settings Panel
   {
      numberOfEllipse=number;
      display.changeLevel(numberOfEllipse);
        //call display
      display.setEnabled(true);
      display.makeDefault();                       // Put all Ellipses on Blue Tower
      display.setEnabled(false); 
      max=(int)Math.pow(2,numberOfEllipse)-1;      // Calculate Maximum moves
          
   }
    
    // Control button Off/On
   public void cntrl(boolean power)     // Event for "RadioButton On and Off" on Settings Panel
   {
      lcButton.setVisible(power);clButton.setVisible(power);rlButton.setVisible(power);
      lrButton.setVisible(power);crButton.setVisible(power);rcButton.setVisible(power);
   }
    
   // Set User Name
   public void userName(String user)
   {
       userNameLabel.setText(user);
       pane.userName(user);
   }
   
    // Change the Panel(pause,settings,moves) holded by SidePane
   public void sidePaneHold(String what)
   {
      switch (what) 
      {
         case "setting":
            pane.showSettings();
            break;
         case "moves":
            pane.showMoves();
            break;
         default:
            pane.showPause();
            break;
      }
   }
    
    // Display this "msg" on MessageTf
   public void messageOutput(Color color,String msg)
   {
      messageTf.setForeground(color);
      messageTf.setText(msg);
   }
    
    // Return all Ellipse to Blue Tower
   public void GuiMakeDefault()
   {
      display.makeDefault();
   }
    
    // Pause Button Enable
   public void pauseActive(boolean activate)
   {
      pauseButton.setEnabled(activate);
   }
    
    // Play Button Enable
   public void playActive(boolean activate)
   {
      playButton.setEnabled(activate);
   }
    
    // Control Button and Gui Enable
   public void cntrlButtonActive(boolean activate)
   {
      lcButton.setEnabled(activate);clButton.setEnabled(activate);rlButton.setEnabled(activate);
      lrButton.setEnabled(activate);crButton.setEnabled(activate);rcButton.setEnabled(activate);
      display.setEnabled(activate);
   }
   
    // Dont even Try to Understand these it tedious
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        playButton = new javax.swing.JButton();
        pauseButton = new javax.swing.JButton();
        restartButton = new javax.swing.JButton();
        graphicsPanel = new javax.swing.JPanel();
        userNameLabel = new javax.swing.JLabel();
        countPanel = new javax.swing.JPanel();
        countByLabel = new javax.swing.JLabel();
        countLabel = new javax.swing.JLabel();
        messageTf = new javax.swing.JTextField();
        display = new Gui();
        lcButton = new javax.swing.JButton();
        lcButton.addActionListener(this);
        lrButton = new javax.swing.JButton();
        lrButton.addActionListener(this);
        clButton = new javax.swing.JButton();
        clButton.addActionListener(this);
        crButton = new javax.swing.JButton();
        crButton.addActionListener(this);
        rlButton = new javax.swing.JButton();
        rlButton.addActionListener(this);
        rcButton = new javax.swing.JButton();
        rcButton.addActionListener(this);
        sidePane = new javax.swing.JPanel();
        newGame = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 150, 255));
        setPreferredSize(new java.awt.Dimension(900, 430));

        playButton.setText("Play");
        playButton.setPreferredSize(new java.awt.Dimension(78, 25));
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });

        pauseButton.setText("Pause");
        pauseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseButtonActionPerformed(evt);
            }
        });

        restartButton.setText("Restart");
        restartButton.setPreferredSize(new java.awt.Dimension(89, 25));
        restartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartButtonActionPerformed(evt);
            }
        });

        graphicsPanel.setBackground(new java.awt.Color(51, 204, 255));

        userNameLabel.setBackground(new java.awt.Color(151, 234, 239));
        userNameLabel.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        userNameLabel.setForeground(new java.awt.Color(115, 233, 235));
        userNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userNameLabel.setText("user");

        countPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        countByLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        countByLabel.setText("Time");

        countLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        countLabel.setText("00:00");

        javax.swing.GroupLayout countPanelLayout = new javax.swing.GroupLayout(countPanel);
        countPanel.setLayout(countPanelLayout);
        countPanelLayout.setHorizontalGroup(
            countPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(countByLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(countLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
        );
        countPanelLayout.setVerticalGroup(
            countPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(countPanelLayout.createSequentialGroup()
                .addComponent(countByLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(countLabel))
        );

        messageTf.setEditable(false);
        messageTf.setBackground(new java.awt.Color(242, 242, 242));
        messageTf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        messageTf.setText("Welcome To Towers Of Hanoi");

        display.setBackground(new java.awt.Color(51, 204, 255));

        javax.swing.GroupLayout displayLayout = new javax.swing.GroupLayout(display);
        display.setLayout(displayLayout);
        displayLayout.setHorizontalGroup(
            displayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        displayLayout.setVerticalGroup(
            displayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 234, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout graphicsPanelLayout = new javax.swing.GroupLayout(graphicsPanel);
        graphicsPanel.setLayout(graphicsPanelLayout);
        graphicsPanelLayout.setHorizontalGroup(
            graphicsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(graphicsPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(messageTf, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(countPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addComponent(display, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        graphicsPanelLayout.setVerticalGroup(
            graphicsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(graphicsPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(graphicsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(messageTf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(countPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(display, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lcButton.setText("LC");

        lrButton.setText("LR");

        clButton.setText("CL");

        crButton.setText("CR");

        rlButton.setText("RL");

        rcButton.setText("RC");

        sidePane.setBackground(new java.awt.Color(0, 150, 255));

       /* javax.swing.GroupLayout sidePaneLayout = new javax.swing.GroupLayout(sidePane);
        sidePane.setLayout(sidePaneLayout);
        sidePaneLayout.setHorizontalGroup(
            sidePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 171, Short.MAX_VALUE)
        );
        sidePaneLayout.setVerticalGroup(
            sidePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 393, Short.MAX_VALUE)
        );*/

        newGame.setText("New Game");
        newGame.setPreferredSize(new java.awt.Dimension(89, 25));
        newGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lcButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lrButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(clButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(crButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(rlButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rcButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pauseButton)
                                .addGap(9, 9, 9)
                                .addComponent(restartButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(newGame, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(graphicsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sidePane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(restartButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pauseButton)
                    .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newGame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(graphicsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rlButton, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rcButton, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clButton, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(crButton, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lcButton, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lrButton, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

   private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        //START COUNT underContr
      pane.showMoves();           // SidePane to hold Moves
       
      messageOutput(Color.BLACK,"Place All Ellipses on Red Tower Max: "+max);
        
      cntrlButtonActive(true);
      pauseActive(true);
      playActive(false);
   }//GEN-LAST:event_playButtonActionPerformed

   private void restartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartButtonActionPerformed
      display.makeDefault();
      display.repaint();
        
      count=0;   // Change Count to zero
      countLabel.setText(""+count);
       
      messageOutput(Color.BLACK,"Place All Ellipses on Red Tower Max: "+max);
        
      pane.showMoves();
      pane.clearMoves();
        
      cntrlButtonActive(true);
      pauseActive(true);
   }//GEN-LAST:event_restartButtonActionPerformed

   private void pauseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseButtonActionPerformed
      pane.showPause();
        
      messageOutput(Color.BLACK,"PAUSED");
        
      cntrlButtonActive(false);
      playActive(true);
        //count stop
   }//GEN-LAST:event_pauseButtonActionPerformed

   private void newGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameActionPerformed
      display.makeDefault();
      display.repaint();
        
      pane.showSettings();
      pane.clearMoves();
        
      playActive(true);
      pauseActive(false);
      cntrlButtonActive(false);
        
      count=0;   // Change Count to zero
      countLabel.setText(""+count);
        
      messageOutput(Color.BLACK,"Press Play to \"Begin\"");
   }//GEN-LAST:event_newGameActionPerformed

    // Control Gui with Button
   public void actionPerformed(ActionEvent e)
   {         
      JButton command=(JButton)(e.getSource()); // event button
         
      String to,from;         // enterchange to and from of stars
          
      if(command.getText().equalsIgnoreCase("lc"))
      {
         from="left";
         to="center";
      }   
      else if(command.getText().equalsIgnoreCase("lr"))
      { 
         from="left";
         to="right";
      }
      else if(command.getText().equalsIgnoreCase("cl"))
      { 
         from="center";
         to="left";
      }
      else if(command.getText().equalsIgnoreCase("cr"))
      { 
         from="center";
         to="right";
      } 
      else if(command.getText().equalsIgnoreCase("rl"))
      { 
         from="right";
         to="left";
      }
      else 
      { 
         from="right";
         to="center";
      }   
      int message =display.move(from,to);
         
      if(message==-1)
         messageOutput(Color.RED,"Big ellipse on small Ellipse is not allowed!");
      else if(message==1)
         messageOutput(Color.BLACK,"Place All Ellipses on Red Tower Max: "+max);
      else
      {
         messageOutput(Color.BLACK,"Place All Ellipses on Red Tower Max: "+max);
         display.repaint();
         pane.hasMove(from, to);
            //increment count
         count++;
         countLabel.setText(""+count);
         if(display.RedisFull())
         {
            if(count<=max) //Check if Count is less or equals to max
               messageOutput(Color.BLUE,"Excellent Moves  \"Complete\" ");
            else
               messageOutput(new Color(70,130,180),"Well done but Try not to exceed "+max);
            pauseActive(false);
                
            cntrlButtonActive(false);
         }
            
      }   
   }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clButton;
    private javax.swing.JLabel countByLabel;
    private javax.swing.JLabel countLabel;
    private javax.swing.JPanel countPanel;
    private javax.swing.JButton crButton;
    private Gui display;
    private javax.swing.JPanel graphicsPanel;
    private javax.swing.JButton lcButton;
    private javax.swing.JButton lrButton;
    private javax.swing.JTextField messageTf;
    private javax.swing.JButton newGame;
    private javax.swing.JButton pauseButton;
    private javax.swing.JButton playButton;
    private javax.swing.JButton rcButton;
    private javax.swing.JButton restartButton;
    private javax.swing.JButton rlButton;
    private javax.swing.JPanel sidePane;
    private javax.swing.JLabel userNameLabel;
    // End of variables declaration//GEN-END:variables
 
}
