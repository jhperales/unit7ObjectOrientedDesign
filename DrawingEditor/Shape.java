import java.awt.geom.*;
import java.awt.*;

public abstract class Shape
{
    private Point2D.Double center;
    private double radius;
    private Color color;
    /**
     * Creates a shape with the center at the spcifed point and with the specified radius and color
     */
    public Shape(Point2D.Double point, double r, Color c)
    {
        this.center = point;
        this.radius = r;
        this.color = c;
    }
    
    /**
     * Returns center of the shape
     * @return  Returns Point2D.Double
     */
    public Point2D.Double getCenter()
    {
        return this.center;
    }
    
    /**
     * Returns the color of the constructed shape
     * @return  Color object
     */
    public Color getColor()
    {
        return this.color;
    }

    /**
     * Returns radiurs of shape
     * @return  Retursn type double
     */
    public double getRadius()
    {
        return this.radius;
    }
    
    /**
     * Displaces the center of this shape by (x, y)
     *
     * @post    Shape has moved from previous location
     * @param   x  the x-cooridinate
     * @param   y  the y-cooridinate
     */
    public void move(double x, double y)
    {
        this.center.setLocation(x, y);
    }

    /**
     * sets the radius to r
     *
     * @post    radius of shape has been modified
     * @param   r the specified radius, what the radius will change to
     */
    public void setRadius(double r)
    {
        this.radius = r;
    }

    /**
     * Returns ture if the point lies inside this shape. false otherwise
     *
     * @param   point  the specified point to checkge
     * @return  returns boolean
     */
    public abstract boolean isInside(Point2D.Double point);

    /**
     * Returns true if the point lies approximately on the border of this shape, false otherwise
     * @param   point  The point that the method will evaluate
     * @return  Returns type boolean
     */
    public boolean isOnBorder(Point2D.Double point)
    {
        return false;
    }
    
    /**
     * Draws this shape. Draws a filled shape if filled is true, and a hollow shape otherwise
     * @param   filled   Evaluates is shape is filled or not
     *          g2       Default Graphis2D object
     */
    public abstract void draw(Graphics2D g2, boolean filled);


}
