import java.awt.*;
import javax.swing.*;
public class Ball {
    private int size;
    private Color color;
    private int xspeed;
    private int yspeed;
    private int x,y;

    public Ball(int x,int y,int size,int xspeed,int yspeed,Color color){
        this.x = x;
        this.y = y;
        this.size = size;
        this.xspeed = xspeed;
        this.yspeed = yspeed;
        this.color = color;
    }

    public void draw(Graphics g2){
        g2.setColor(color);
        g2.fillOval(x,y,size,size);
    }

    public void move(JPanel panel) {
            x += xspeed;
            y += yspeed;
        if (x > (panel.getWidth() - size)){
            xspeed = -(int)(Math.random()*10);
        }
        if(x < 0){
            xspeed = (int)(Math.random()*10);
        }
        if(y < 0){
            yspeed = (int)(Math.random()*10);
        }
        if(y > (panel.getHeight() - size)) {
            yspeed = -(int)(Math.random()*10);
        }
    }






}
