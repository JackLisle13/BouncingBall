import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

   Ball[] myBall = new Ball[20];

    public MyPanel() {
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(500,500));
        for (int i = 0; i < myBall.length; i++) {
            myBall[i] = new Ball(((int) (Math.random() * 450)), ((int) (Math.random() * 450)),((int) (Math.random() * 50)+1),((int) (Math.random() * 5)+1),((int) (Math.random() * 5)+1),new Color(((int) (Math.random() * 250)+1),((int) (Math.random() * 250)+1),((int) (Math.random() * 250)+1)));
        }

    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        for (Ball ball : myBall) {
            ball.draw(g);
            ball.move(this);
        }

        for(int i = 0; i < myBall.length/2; i++) {
            for(int j = myBall.length-1; j > myBall.length/2; j--){
                if(  ( ((myBall[i].getx() - myBall[j].getx()) < 20) && ((myBall[i].getx() - myBall[j].getx()) > -20)) && ((myBall[i].gety() - myBall[j].gety()) < 20) && ((myBall[i].gety() - myBall[j].gety()) > -20)){
                    System.out.println("Bounce");
                    myBall[i].bounce();
                    myBall[j].bounce();
                }
            }
        }

        try {
            Thread.sleep(20);
        }
        catch(Exception e) {
            System.out.println(e);
        }

        repaint();
    }

}
