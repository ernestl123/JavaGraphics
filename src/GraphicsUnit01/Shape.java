package GraphicsUnit01;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Shape
{
   //instance variables
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;

   public Shape(int x, int y, int wid, int ht, Color col)
   {
		xPos = x;
		//finish this constructor
                yPos = y;
                width = wid;
                height = ht;
                color = col;
            
   }


   public void draw(Graphics window)
   {
      window.setColor(color);

      //draw whatever you want
      //    ^
      //  [ :: ]
      //    ()
      window.fillOval(xPos, yPos, width, height);
      window.drawRect(xPos, yPos, width, height);

   }

   //BONUS
   //add in set and get methods for all instance variables

   public String toString()
   {
   	return xPos+" "+yPos+" "+width+" "+height+" "+color;
   }
}