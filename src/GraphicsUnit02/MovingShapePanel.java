package GraphicsUnit02;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Font; 
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MovingShapePanel extends JPanel implements Runnable
{
	private Shape sh;

	public MovingShapePanel()
	{
		setBackground(Color.WHITE);
		setVisible(true);

		//refer sh to a new Shape

                sh = new Shape(100, 100, 50, 50, Color.BLUE, 5, 5);
		new Thread(this).start();
	}

	public void update(Graphics window)
	{
		paint(window);
	}

	public void paint(Graphics window)
	{
		window.setColor(Color.WHITE);
		window.fillRect(0,0,getWidth(), getHeight());
		window.setColor(Color.BLUE);
		window.drawRect(20,20,getWidth()-40,getHeight()-40);
		window.setFont(new Font("TAHOMA",Font.BOLD,18));
		window.drawString("CREATE YOUR OWN SHAPE!",40,40);

		//tell sh to move and draw
                sh.moveAndDraw(window);
		//this code handles the left and right walls
		if(!(sh.getxPos()>=10 && sh.getxPos()<=730))
		{
			sh.setxSpeed(-sh.getxSpeed());
		}
                else if (!(sh.getyPos()>=10 && sh.getyPos()<=530))
		{
			sh.setySpeed(-sh.getySpeed());
		}

		//add code to handle the top and bottom walls

	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(10);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}