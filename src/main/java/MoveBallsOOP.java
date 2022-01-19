import processing.core.PApplet;

public class MoveBallsOOP extends PApplet{
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 15;
    public static Ball[] balls;

    public void settings(){
        size(WIDTH, HEIGHT);
    }

    public void setup(){
        balls = new Ball[4];
        for (int i = 0; i < 4; i++) {
            balls[i] = new Ball(0,(i+1)* HEIGHT /5);
        }
    }

    public void drawBalls(Ball ball){
        ellipse(ball.x,ball.y, DIAMETER,DIAMETER);
    }
    public void draw(){
        for (int i = 0; i < 4; i++) {
            drawBalls(balls[i]);
        }
        balls[0].x++;
        balls[1].x+=2;
        balls[2].x+=3;
        balls[3].x+=4;
    }

    public static void main(String args[]){
        String[] appletArgs = new String[] { "MoveBallsOOP" };
        PApplet.main(appletArgs);
    }
}
