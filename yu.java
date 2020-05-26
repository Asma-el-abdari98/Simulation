package proSAA;

import javax.swing.*;
import java.awt.*;

class Route extends JPanel{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
   
        public void paintComponent(Graphics g) {
           // super.paintComponent(g);
          /*   g.setColor(Color.gray); 
             g.fillRect(0, 200, 600, 200);
             g.fillRect(200, 0, 200, 600);
             g.setColor(Color.white);
             //vertical
             g.fillRect(300, 3, 3, 20);
             g.fillRect(300, 30, 3, 20);
             g.fillRect(300, 60, 3, 20);
             g.fillRect(300, 90, 3, 20);
             g.fillRect(300, 120, 3, 20);
             g.fillRect(300, 150, 3, 20);
             g.fillRect(300, 180, 3, 20);
             g.fillRect(300, 420, 3, 20);
             g.fillRect(300, 450, 3, 20);
             g.fillRect(300, 480, 3, 20);
             g.fillRect(300, 510, 3, 20);
             g.fillRect(300, 540, 3, 20);
            // horizontal
             g.fillRect(3, 300, 20, 3);
             g.fillRect(30, 300, 20, 3);
             g.fillRect(60, 300, 20, 3);
             g.fillRect(90, 300, 20, 3);
             g.fillRect(120, 300, 20, 3);
             g.fillRect(150, 300, 20, 3);
             g.fillRect(180, 300, 20, 3);
             g.fillRect(420, 300, 20, 3);
             g.fillRect(450, 300, 20, 3);
             g.fillRect(480, 300, 20, 3);
             g.fillRect(510, 300, 20, 3);
             g.fillRect(540, 300, 20, 3);
             g.fillRect(570, 300, 20, 3);  */

            
            setBackground(Color.GRAY);
        	
        	super.paintComponent(g);
        	 // draws a line diagonally across the screen
        	 // draws a rectangle around "hello there!"
        	 //g.setColor(Color.BLACK);
        	// g.fillRect(0, 0,getWidth(), getHeight());
        	 g.setColor(Color.WHITE);
        	 for(int i=370;i<580;i+=55){  // passage de la route 1
        	 	 g.fillRect(i, 190, 25, 60);
        	 }
        	 for(int i=310;i<500;i+=55){  //passage de la route 2
        	  g.fillRect(240, i, 60, 25);
        	 }
        	 for(int i=370;i<580;i+=55){  // passage de la route 3
        	 	 g.fillRect(i, 570, 25, 60);
        	 }
        	 for(int i=310;i<500;i+=55){  //passage de la route 4
        	 	 g.fillRect(620, i, 60, 25);
        	 }
        	for(int i=0;i<280;i+=40){  // route1
        		 g.setColor(Color.WHITE);
        		 g.fillRect(460, i, 5, 30);
        	 }
        	for(int i=0;i<320;i+=40){  // route 2
        		 g.fillRect(i, 405, 30, 5);
        	}
        	 for(int i=530;i<1000;i+=40){ // route 3
        		 g.fillRect(460, i, 5, 30);
        	 }
        	 for(int i=600;i<2000;i+=40){  //route 4
        		 g.fillRect(i, 405, 30, 5);
        	 } 
        	 g.setColor(new Color(0, 183, 0));
           //les espaces vert
        	 
        	g.fillRoundRect(-20, -20, 360, 300, 45, 45);  
        	g.fillRoundRect(-20, 520, 360, 800, 45, 45);
        	g.fillRoundRect(580, -20, 1000, 300, 45, 45);
        	g.fillRoundRect(580, 520, 1000, 1000, 45, 45);
        	
        	g.setColor(Color.BLACK);
        	g.fillRoundRect(260, 503, 75, 20, 45, 45 );
        	g.fillRoundRect(590, 278, 75, 20, 45, 45 );
        	g.fillRoundRect(338, 202, 20, 75, 45, 45 );
        	g.fillRoundRect(562, 532, 20, 75, 45, 45);
        	
        /*	g.setColor(Color.BLACK);
        	g.fillRoundRect(260, 503, 75, 20, 45, 45 );
        	g.fillRoundRect(590, 278, 75, 20, 45, 45 );
        	g.fillRoundRect(338, 202, 20, 75, 45, 45 );
        	g.fillRoundRect(562, 532, 20, 75, 45, 45);*/
        }
}
