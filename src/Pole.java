
/**
 *
 * @author thembalakhe
 */
/**
 * POLE CLASS
 *
 * pole - hold ellipse
 *      - remove ellipse in this pole
 *      - add ellipses in this pole
 *
 */

import java.awt.Dimension;
import java.util.ArrayList;

public class Pole<E extends Cylinder>
{
   private final Dimension size;        // x and y of pole
   private final int width;      // how long is the pole
   private final int height;
   protected ArrayList<E> ellipses=new ArrayList<>();     // ellispes on this pole
   
   public Pole(int x,int y,int w,int h)           
   {
      size=new Dimension(x,y);
      width=w;
      height=h;
   }
   // get x position
   public int getX()
   {
      return (int)(size.getWidth());
   }
   // get y position
   public int getY()
   {
      return (int)(size.getHeight());
   }
   // get width
   public int getWidth()
   {
      return width;
   }
   // get height
   public int getHeight()
   {
      return height;
   }
   // get the top Cylinder 
   public E topElement()   
   {
         return ellipses.get(ellipses.size() -1);
   }
   // add Cylinder to this pole
   public void addElement(E element)  
   {  
       int x=(int)(getX()+(getWidth()/2)-(element.getWidth()/2));
       int y=(int)(getY()+getHeight()-ellipsePresent()*element.getHeight());
       element.changePosition(new Dimension(x,y)) ;     
       ellipses.add(element);   
   }
   // remove E frm ths pole
   public void removeElement()
   {
      ellipses.remove(ellipses.size()-1);  //the top ellipse
   }
   // check that this pole is full 3 for Level 1,4 for next,etc
   public boolean isFull(int fullLength)   
   {  
      return (ellipses.size()==fullLength);
   }
   // how many Cylinder are current in this pole
   public int ellipsePresent()        
   {
      return ellipses.size();
   }
   // draw the cylinders on this pole
   public void draw(java.awt.Graphics g)
   {
       for (E ellipse : ellipses) {
           ellipse.drawCylinder(g);
       }
   
   }
   // move top allipse from ths to pole  "to"
   public int moveTo(Pole<E> to)
   {
      if(ellipses.isEmpty())
         {
            return 1;
         }                      // unsuccessful due to no element on ths
      else if(to.ellipsePresent()==0)
         {
            to.addElement(topElement());
            removeElement();
            return 0;              // successful   transition due no ellipse on "to"
         }   
        else if(to.topElement().biggerThan(topElement())== 1)
         {    
            to.addElement(topElement());
            removeElement();
            return 0;              //successful transition  due to to.topElement>topElement
         }
        else
         {
            return -1;        // unsuccessful due to to.topElement<topElement
         }   
   }
   //clear all ellipse on ths
   public void clear()
   {
      ellipses.clear();
   }
}
