import java.awt.*;
public class Ball {
    private int size;
    private Color color;
    private int xspeed;
    private int yspeed;
    private int x,y;

    public Ball(int x,int y){
        this.x = x;
        this.y = y;
        size = 10;
        xspeed = 5;
        yspeed = 5;
        color = Color.BLUE;
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
        if(y > 590) {
            yspeed = (yspeed - (yspeed * 2));
        }
    }






}
