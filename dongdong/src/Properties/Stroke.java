package Properties;

/**
 * Created by DongDong on 2016-02-01.
 */
public class Stroke {

    public enum Mode
    {
        RGB, HSB
    }

    public Mode getMyMode() {
        return myMode;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public int getW() {
        return w;
    }

    private Mode myMode;

    private int x,y,z,w;

    private int pd;

    public void setStroke(Stroke.Mode mode, int x, int y, int z, int a)
    {
        if(mode == Mode.RGB)
        {
            myMode = Mode.RGB;
        }
        else
        {
            myMode = Mode.HSB;
        }

        this.x = x;
        this.y = y;
        this.z = z;
        this.w = a;
    }
}
