import java.awt.Rectangle;

public class BetterRectangle extends Rectangle
{
    public BetterRectangle(int pointa, int pointb, int width, int height)
    {
        super.setLocation(pointa, pointb);
        super.setSize(width, height);
    }
    
    public int getPerimiter()
    {
        return width + width + height + height;
    }
    
    public int getArea()
    {
        return width*height;
    }
}