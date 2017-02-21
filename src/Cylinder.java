
/**
 *
 * @author thembalakhe
 */
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;

public class Cylinder 
{

   //private static int objectNumber=0;
   Color color=new Color(0,150,255);   // Default Color 
   

   protected final int DEGREE =180;  // use 180 degrees arc angle
   protected final int STARTANGLE=0;  // use 0 degrees start angle
   protected final int HEIGHT=10;     // use 10 for height
   
   protected int x;
   protected int y;
   protected int w;    // Width
   protected int h;    // height
   protected boolean fill;  
   
   public Cylinder(int x,int y,int w,int h,boolean fill)
   {
      this.x=x;
      this.y=y;
      this.w=w;
      this.h=h;
      this.fill=fill;
   }
   public Cylinder(int x,int y,int w,int h,Color color)
   {
        //new Cylinder(x,y,w,h,true);
        this.x=x;
        this.y=y;
        this.w=w;
        this.h=h;
        this.color=color;
        fill=true;
   }
   
   public void changeHeight(int h)
   {
      this.h=h;
   }
   public void changePosition(int x,int y)
   {
      this.x=x;
      this.y=y;
   }
   public void changePosition(Dimension newpos)
   {
        x=(int)newpos.getWidth();
        y=(int)newpos.getHeight();
   }
   public Dimension getPosition()
   {
      return new Dimension(x,y);
   }

   public int getWidth()
   {
      return w;
   }

   public int getHeight()
   {
      return h;
   }
   
   public int biggerThan(Cylinder small)  //return 1 if this ellipse is greater ELSE -1 
   {
      if(w == small.getWidth())
         return 0;
      else if(w > small.getWidth())
         return 1;
      else
         return -1;
   }
  
   public void drawCylinder(Graphics g)  // draw this Cylinder on GUI   
   {
      if(fill)
      {
         g.fillArc(x,y+h,w,HEIGHT,STARTANGLE,-DEGREE);
         g.fillRect(x,y+5,w,h);
         g.setColor(color);
         g.fillArc(x,y,w,HEIGHT,STARTANGLE,DEGREE);
         g.fillArc(x,y,w,HEIGHT,STARTANGLE,-DEGREE);
         
      }
      else
      {
         g.drawArc(x,y+h,w,HEIGHT,STARTANGLE,-DEGREE);
         g.drawArc(x,y,w,HEIGHT,STARTANGLE,DEGREE);
         g.drawArc(x,y,w,HEIGHT,STARTANGLE,-DEGREE);
         g.drawLine(x,y+5,x,y+h+5);
         g.drawLine(x+w,y+5,x+w,y+h+5);
      }         
   }
}
