package ShapeObj;

import Properties.Color;
import Properties.Stroke;

/**
 * Created by DongDong on 2016-02-01.
 */
public class Shape {

    Color c;
    Stroke s;

    public Shape()
    {
        c = new Color();
        s = new Stroke();
    }


    public void setColor(Color.Mode mode, int x, int y, int z, int a)
    {
        c.setColor(mode, x,y,z,a);
    }

    public void setStroke(Stroke.Mode mode, int x, int y, int z, int a)
    {
        s.setStroke(mode,x,y,z,a);
    }

    public void setPos(int x, int y, int z, int a)
    {

    }

    public void draw()
    {

    }

}
