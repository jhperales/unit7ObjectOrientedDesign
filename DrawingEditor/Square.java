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
        Rectangle2D.Double rec = new Rectangle2D.Double(getCenter().getX(), getCenter().getY(), getRadius(), getRadius());
        g2.setColor(getColor());
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
        double x = point.getX();
        double y= point.getY();
        Rectangle2D.Double rec = new Rectangle2D.Double(getRadius() *2, getRadius() * 2, getCenter().getX(), getCenter().getY());
        
        if (rec.contains(x, y))
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}