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

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );

      //call head method
      head(window);
      //call other methods
      upperBody(window);
      lowerBody(window);
   }

   public void head( Graphics window )
   {
      window.setColor(Color.YELLOW);

      window.fillOval(300, 100, 200, 100);
      window.setColor(Color.GRAY);
      window.fillOval(340, 130, 20, 20);
      window.fillOval(440, 130, 20, 20);
      window.drawLine(350, 160, 440, 160);

		//add more code here
				
   }

   public void upperBody( Graphics window )
   {
       window.setColor(Color.BLUE);
       
       window.fillRect(350, 200, 100, 100);
       window.setColor(Color.BLACK);
       window.drawLine(250, 140, 350, 200);
       window.drawLine(450, 200, 550, 150);
		//add more code here
                
   }

   public void lowerBody( Graphics window )
   {
       window.setColor(Color.BLUE);
       window.fillRect(350, 320, 100, 100);
       window.setColor(Color.BLACK);
       window.drawLine(300, 450, 350, 420);
       window.drawLine(450, 420, 490, 450);
		//add more code here

   }
}