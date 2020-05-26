package proSAA;

import javax.swing.*;
import java.awt.*;

class feu extends JPanel{
       /**
       *
       */
       private static final long serialVersionUID = 1L;
            int check;

            public void paintComponent(final Graphics g) {
            
           super.paintComponent(g);
           g.setColor(Color.black);
           g.fillRect(0, 0, 15, 15);
         if(check==1)
         {
        	 g.setColor(Color.red);
             g.fillOval(12, 3, 15, 15);
           //  g.fillOval(340, 250, 15, 15);
             g.setColor(Color.gray);
             g.fillOval(12, 35, 15, 15);
             g.setColor(Color.gray);
             g.fillOval(12, 68, 15, 15);
         }
         else if(check==2)
         {
            g.setColor(Color.gray);
            g.fillOval(12, 3, 15, 15);
           // g.fillOval(340, 250, 15, 15);
            g.setColor(Color.orange);
            g.fillOval(12, 35, 15, 15);
            g.setColor(Color.gray);
            g.fillOval(12, 68, 15, 15);
         }
         else if (check==3)
         {
            g.setColor(Color.gray);
            g.fillOval(12, 3, 15, 15);
          //  g.fillOval(340, 250, 15, 15);
            g.setColor(Color.gray);
            g.fillOval(12, 35, 15, 15);
            g.setColor(Color.green);
            g.fillOval(12, 68, 15, 15);
         }
           
       }

   }