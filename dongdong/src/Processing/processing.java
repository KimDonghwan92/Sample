package Processing;

import Properties.Color;
import Properties.Stroke;
import ShapeObj.Circle;
import ShapeObj.Rect;
import ShapeObj.Shape;
import processing.core.PApplet;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by DongDong on 2016-02-01.
 */
public class processing extends PApplet{

    public static final processing p = new processing();
    List<Shape> shapes;
    Circle c;
    Rect r;

    public static void main(String...args)
    {
        p.runSketch();
    }

    public void settings()
    {
        size(1200,1200);
    }
    public void setup()
    {
        background(54,70,89,255);
        shapes = new ArrayList<>();
        c  = new Circle();
        r  = new Rect();

        c.setPos(300,300,100,100);
        c.setColor(Color.Mode.RGB,100,200,200,255);
        c.setStroke(Stroke.Mode.HSB,200,100,100,5);
        shapes.add(c);

        r.setPos(300,600,100,100);
        r.setColor(Color.Mode.RGB,236,136,113,255);
        r.setStroke(Stroke.Mode.HSB,255,227,208,5);
        shapes.add(r);

    }

    public void draw()
    {

        background(54,70,89,255);
        for(Shape each : shapes)
        {
            each.draw();
        }
    }

    public void mouseDragged()
    {
        Move(mouseX, mouseY);
    }

    public void Move(int x, int y)
    {
        if(sqrt((c.cx - x)*(c.cx - x)+(c.cy-y)*(c.cy-y)) < sqrt((x-(r.cx + r.w/2))*(x-(r.cx + r.w/2)) +  (y - (r.cy + r.h/2))*(y - (r.cy + r.h/2))))
        {
            if(sqrt((c.cx - x)*(c.cx - x)+(c.cy-y)*(c.cy-y)) < c.r1)
            {

                c.setPos(c.cx + (mouseX - pmouseX), c.cy+(mouseY - pmouseY), 100,100);
                this.draw();

            }

        }
        else
        {
            if((y <= r.cy + r.h) && (x <= r.cx + r.w))
            {
                r.setPos(r.cx + (mouseX - pmouseX), r.cy+(mouseY - pmouseY), 100,100);
                this.draw();
            }

        }
    }
}
