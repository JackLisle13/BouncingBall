import java.awt.*;
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

    public void move() {
            x += xspeed;
            y += yspeed;
        if (x > 490){
            xspeed = (xspeed - (xspeed*2));
        }
        if(x < 1){
            xspeed = (xspeed - (xspeed*2));
        }
        if(y < 10){
            yspeed = (yspeed - (yspeed*2));
        }
        if(y > 450) {
            yspeed = (yspeed - (yspeed * 2));
        }
    }






}
