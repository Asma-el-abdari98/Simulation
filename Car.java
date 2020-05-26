package proSAA;

import javax.swing.*;
import java.awt.*;


public class Car extends JPanel 
{
       /**
       *
       */
       private static final long serialVersionUID = 1L;
       int y=0;
       int x=0;
       int choose;
       public void paintComponent(final Graphics g) {
             super.paintComponent(g);
             
             if(choose==1)
             {
              g.setColor(Color.black);
              g.fillOval(360, 10+y, 20, 20);
              g.fillOval(410, 10+y, 20, 20);
              g.fillOval(360, 70+y, 20, 20);       
              g.fillOval(410, 70+y, 20, 20);
              g.setColor(Color.green);
              g.fillRect(370, 3+y, 50, 100);
              g.setColor(Color.black);
              g.drawRect(380, 25+y, 25, 50);
             }
             
             else if(choose==2)
             {
              g.setColor(Color.black);
              g.fillOval(480, 620-y, 20, 20);
              g.fillOval(530, 620-y, 20, 20);
              g.fillOval(480, 680-y, 20, 20);       
              g.fillOval(530, 680-y, 20, 20);
              g.setColor(Color.green);
              g.fillRect(490, 610-y, 50, 100);
              g.setColor(Color.black);
              g.drawRect(500, 635-y, 25, 50);
             }
             
             else if (choose==3) {
              g.setColor(Color.black);
              g.fillOval(10+x, 420, 20, 20);
              g.fillOval(10+x, 470, 20, 20);
              g.fillOval(70+x, 420, 20, 20);       
              g.fillOval(70+x, 470, 20, 20);
              g.setColor(Color.green);
              g.fillRect(3+x, 430, 100, 50);
              g.setColor(Color.black);
              g.drawRect(25+x, 440, 50, 25);     
             }
            
            else if (choose==4) {
              g.setColor(Color.black);
              g.fillOval(900-x, 300, 20, 20);
              g.fillOval(900-x, 350, 20, 20);
              g.fillOval(960-x, 300, 20, 20);       
              g.fillOval(960-x, 350, 20, 20);
              g.setColor(Color.green);
              g.fillRect(890-x, 310, 100, 50);
              g.setColor(Color.black);
              g.drawRect(915-x, 320, 50, 25);     
             }  
      }
}
