import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.Graphics2D;
import java.awt.Color;

public class Circle extends Shape
{
    public Circle(Point2D.Double p, double r, Color c)
    {
        super(p,r,c);
    }
    
    public void draw(Graphics2D g2, boolean filled)
    {
        Ellipse2D.Double cir = new Ellipse2D.Double(getCenter().getX(), getCenter().getY(), getRadius(), getRadius());
        g2.setColor(getColor());
        if (filled == true)
        {
            g2.draw(cir);
            g2.fill(cir);
        }
        else
        {
            g2.draw(cir);
        }
    }
    
    public boolean isInside(Point2D.Double point)
    {
        double x = point.getX();
        double y = point.getY();
        Ellipse2D.Double cir = new Ellipse2D.Double(getCenter().getX(), getCenter().getY(), getRadius(), getRadius());
        
        if (cir.contains(x, y))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
    