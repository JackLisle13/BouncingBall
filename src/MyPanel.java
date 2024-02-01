import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

   Ball[] myBall = new Ball[20];

    public MyPanel() {
        setBackground(Color.WHITE);
        for (int i = 0; i < myBall.length; i++) {
            myBall[i] = new Ball(((int) (Math.random() * 450)), ((int) (Math.random() * 450)),((int) (Math.random() * 50)+1),((int) (Math.random() * 5)+1),((int) (Math.random() * 5)+1),new Color(((int) (Math.random() * 250)+1),((int) (Math.random() * 250)+1),((int) (Math.random() * 250)+1)));
        }

    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);


        for (Ball ball : myBall) {
            ball.draw(g);
            ball.move();
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
