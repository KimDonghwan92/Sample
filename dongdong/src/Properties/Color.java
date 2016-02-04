package Properties;

/**
 * Created by DongDong on 2016-02-01.
 */
public class Color {

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

    public int getA() {
        return a;
    }

    private Mode myMode;
    private int x,y,z,a;

    public void setColor(Color.Mode mode, int x, int y, int z, int a)
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
        this.a = a;
    }
}
