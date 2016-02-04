package ShapeObj;

import Processing.processing;

/**
 * Created by DongDong on 2016-02-01.
 */
public class Rect extends Shape {

    public int cx,cy,w,h;

    public void setPos(int cx, int cy, int z, int a)
    {
        this.cx = cx;
        this.cy = cy;
        this.w = z;
        this.h = a;
    }

    public void draw()
    {
        processing.p.fill(c.getX(),c.getY(),c.getZ(),c.getA());
        processing.p.stroke(s.getX(),s.getY(),s.getW());
        processing.p.strokeWeight(s.getW());
        processing.p.rect(cx,cy,w,h);
    }
}
