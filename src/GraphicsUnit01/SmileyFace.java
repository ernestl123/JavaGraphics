package GraphicsUnit01;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class SmileyFace extends Canvas
{
   public SmileyFace()    //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      smileyFace(window);
   }

   public void smileyFace( Graphics window )
   {
      window.setColor(Color.BLUE);
      window.drawString("SMILEY FACE LAB ", 35, 35);

      window.setColor(Color.YELLOW);
      window.fillOval( 210, 100, 400, 400 );
      //eyes
      window.setColor(Color.GREEN);
      window.fillOval(350, 230, 30, 40);
      window.fillOval(450, 230, 30, 40);
      //nose
      window.setColor(Color.BLACK);
      window.fillOval(390, 260, 50, 50);
      
      //smile
      window.setColor(Color.RED);
      window.drawArc(320, 300, 200, 100, 180, 180);

		//add more code here


   }
}