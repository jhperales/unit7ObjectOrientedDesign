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
        g2.setColor(Color.BLACK);
        if (filled == true)
        {
            g2.draw(rec);
            g2.fill(rec);
        }
        else
        {
            g2.draw(rec);
        }
    }

    
    public boolean isInside(Point2D.Double point)
    {
        if (point < radius && point > center)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}