import java.awt.geom.*;
import java.awt.*;


public class Square extends Shape
{
    
    public Square(Point2D.Double p, double r, Color c)
    {
        super(p, r, c);
    }
    
    public void draw(Graphics2D g2, boolean filled)
    {
        Rectangle2D.Double rec = new Rectangle2D.Double(getRadius() *2, getRadius() * 2, getCenter().getX(), getCenter().getY());
    }
    
    public boolean isInside(Point2D.Double point)
    {
        return false;
    }
}