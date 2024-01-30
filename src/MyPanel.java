import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

   Ball[] myBall = new Ball[5];

    public MyPanel(){
        setBackground(Color.WHITE);
        for(int i = 0; i < myBall.length;i++){
            myBall[i] = new Ball(((int)(Math.random()*450)),((int)(Math.random()*450)));
        }

    }
    int xLoc = 20;
    int xVel = 8;
    int yLoc = 200;
    int yVel = 8;
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);


        for(int i = 0; i < myBall.length;i++){
            myBall[i].draw(g);
            myBall[i].move();
        }

        for(int i = 0; i < myBall.length;i++){

            }
        }



        xLoc += xVel;
        yLoc += yVel;

        g.setColor(Color.GREEN);
        //g.fillRect(0,400,1000,100);

        try {
            Thread.sleep(50);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        if (xLoc > 298){
            xVel = -8;
        }
        if(xLoc < 1){
            xVel = 8;
        }
        if(yLoc < 10){
            yVel = 8;
        }
        if(yLoc > 270){
            yVel = -8;
        }
//        g.setColor(Color.LIGHT_GRAY);
//        g.fillOval(xLoc1,yLoc1,200,200);
//        xLoc1 +=2;
//        yLoc1 +=2;
        repaint();
    }

}
