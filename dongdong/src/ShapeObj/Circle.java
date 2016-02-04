package ShapeObj;

import Processing.processing;

/**
 * Created by DongDong on 2016-02-01.
 */
public class Circle extends Shape {

    public int cx,cy,r1,r2;

    public void setPos(int x, int y, int z, int a)
    {
        this.cx = x;
        this.cy = y;
        this.r1 = z;
        this.r2 = a;
    }

    public void draw()
    {
        processing.p.fill(c.getX(),c.getY(),c.getZ(),c.getA());
        processing.p.stroke(s.getX(),s.getY(),s.getZ());
        processing.p.strokeWeight(s.getW());
        processing.p.ellipse(cx,cy,r1,r2);
    }
}
