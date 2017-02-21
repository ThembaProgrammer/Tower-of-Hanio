/**
 * @author thembalakhe
 */

//package towerofhanoi;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Gui extends JPanel
{
    
   private int level;                                                // level 1 -> 3 ellipse
   //poles
   Pole<EllipsePrint> leftPole;
   Pole<EllipsePrint> centPole;
   Pole<EllipsePrint> rightPole;
   Timer clock;        // time to count down 
   
   Color[] colors={Color.YELLOW,new Color(147,255,47),Color.MAGENTA,new Color(238,130,0),
                    Color.CYAN,new Color(255,165,203),new Color(255,240,245),
                    new Color(176,196,222)};
  
   // End of variables declaration
   public Gui() 
   {
      level=3;
      leftPole=new Pole<EllipsePrint>(80,100,30,100);
      centPole=new Pole<EllipsePrint>(310,100,30,100);
      rightPole=new Pole<EllipsePrint>(540,100,30,100);
      makeDefault(level);                    // add all ellipse on left pole
   }
   public void makeDefault(int level)
   {
      leftPole.clear();
      centPole.clear();
      rightPole.clear();
      for(int i=level-1;i>=0;i--)
      {
         
         leftPole.addElement(new EllipsePrint(0,0,80+(20*i),15,colors[i]));
      }
   }
   // ---------------------actiom methods---------------------------------------------------------------------------- 
   public int move(String fromTower,String toTower)
   {
      
        Pole<EllipsePrint> to,from;         // enterchange to and from of stars

        switch(fromTower)
        {
            case "center":from=centPole;break;
            case "left"  :from=leftPole;break;
            default      :from=rightPole;break;   
        }
        
        switch(toTower)
        {
            case "center":to=centPole;break;
            case "left"  :to=leftPole;break;
            default      :to=rightPole;break;   
        }
        
        return from.moveTo(to);
    } 
    public void changeLevel(int level)
    {
        this.level=level;
    }    
    
    public boolean RedisFull()
    {
        return rightPole.isFull(level);
    }
    
    public void makeDefault()
    {
        makeDefault(level);
    }
        
      @Override
      public void paintComponent(Graphics g)
      { 
         super.paintComponent(g);
         g.setColor(new Color(20,20,250));
         EllipsePrint leftPoleGui=new EllipsePrint(80,100,30,110,Color.BLUE);
         leftPoleGui.drawCylinder(g); // drawing the left pole
         
         g.setColor(new Color(0,250,20));
         EllipsePrint centPoleGui=new EllipsePrint(310,100,30,110,Color.GREEN);
         centPoleGui.drawCylinder(g); //drawing the center pole
         
         g.setColor(new Color(250,0,0));
         EllipsePrint rightPoleGui=new EllipsePrint(540,100,30,110,Color.RED);
         rightPoleGui.drawCylinder(g); //drawing the right pole
         
         leftPole.draw(g);  //draw the cylinders on this pole 
         centPole.draw(g);  //draw the cylinders on this pole 
         rightPole.draw(g); //draw the cylinders on this pole 
       
      } 
//---------------------------------------------------form -----------------------------------------------------------*/
} 