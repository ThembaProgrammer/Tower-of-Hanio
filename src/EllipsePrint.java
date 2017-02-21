
import java.awt.Color;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thembalakhe
 */
public class EllipsePrint extends Cylinder
{
    
   
    public EllipsePrint(int x,int y,int w,int h,Color color)
    {
        super(x,y,w,h,color);
    }
    
    @Override
    public void drawCylinder(java.awt.Graphics g)
    {
         g.setColor(color);                             
         g.fillArc(x,y+h,w,HEIGHT,STARTANGLE,-DEGREE);
         g.fillRect(x,y+5,w,h);
         g.fillArc(x,y,w,HEIGHT,STARTANGLE,DEGREE);
         g.fillArc(x,y,w,HEIGHT,STARTANGLE,-DEGREE);
     
         g.setColor(Color.black);
         g.drawArc(x,y+h,w,HEIGHT,STARTANGLE,-DEGREE);
         g.drawArc(x,y,w,HEIGHT,STARTANGLE,DEGREE);
         g.drawArc(x,y,w,HEIGHT,STARTANGLE,-DEGREE);
         g.drawLine(x,y+5,x,y+h+5);
         g.drawLine(x+w,y+5,x+w,y+h+5);
    }
    
}
