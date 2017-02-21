import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.*;

public class SidePane extends JPanel
{
   JPanel panel1;             // panel to hold
      
   // My 3 Panels     
   SettingsPanel settings;
   LastMove moves;
   PausePanel  pausing;
   
   CardLayout card;          // cardLayout to shift panels
   
   public SidePane(SettingsPanel settings)
   { 
      card=new CardLayout();        // Card
      panel1=new JPanel();          // Panel Card
      panel1.setLayout(card);       // Place Cardlayout to Panel1
      panel1.setBackground(new Color(0,150,255));
      
      this.settings=settings;            // Settings Panel
      moves=new LastMove();         // Moves Panel
      pausing=new PausePanel();         // Pause Panel
      
      // Adding panel to layout
      card.addLayoutComponent(settings,"settings");  
      card.addLayoutComponent(moves,"moves");
      card.addLayoutComponent(pausing,"pause");
      
      // Adding panel to panel
      panel1.add(settings);
      panel1.add(moves); 
      panel1.add(pausing);
      
      setBackground(new Color(0,150,255));
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
   
   public void hasMove(String from,String to)
   {
       moves.hasMove(from, to);
   }
   
   public void userName(String user)
   {
       pausing.userName(user);
   }
   
   public void clearMoves()
   {
      moves.clear();
   }

}