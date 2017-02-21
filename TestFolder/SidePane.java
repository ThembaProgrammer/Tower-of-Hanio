import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.CardLayout;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.awt.*;

public class SidePane extends JPanel
{
   JPanel panel1;             // panel to hold
      
   // My 3 Panels     
   SettingsPanel settings;
   LastMove moves;
   JPanel  pausing;
   
   CardLayout card;          // cardLayout to shift panels
   
   public SidePane()
   { 
      card=new CardLayout();        // Card
      panel1=new JPanel();          // Panel Card
      panel1.setLayout(card);       // Place Cardlayout to Panel1
       
      settings=new SettingsPanel(); // Settings Panel
      moves=new LastMove();         // Moves Panel
      pausing=new JPanel();         // Pause Panel
      
      // Adding panel to layout
      card.addLayoutComponent(settings,"settings");  
      card.addLayoutComponent(moves,"moves");
      card.addLayoutComponent(pausing,"pause");
      
      // Adding panel to panel
      panel1.add(settings);
      panel1.add(moves); 
      panel1.add(pausing);
      
      add(panel1);
   }
   
     // SidePane hold Settings
   public void showSettings()
   {
      card.show(panel1,"settings");
   }
    // SidePane hold Moves
   public void showMoves()
   {
      card.show(panel1,"moves");
   }
    // SidePane hold Pause
   public void showPause()
   {
      card.show(panel1,"pause");
   }
   
   public static void main(String[] args)
   {
   
      SidePane pane=new SidePane();
      JPanel side=new JPanel();
      side.setBackground(new Color(0,150,255));
      side.add(pane);
      
      JFrame frame=new JFrame("test");
      frame.setSize(300,400);
      frame.add(side);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
   

}