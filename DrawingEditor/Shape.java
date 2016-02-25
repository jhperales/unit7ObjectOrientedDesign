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
     *
     * @pre     shape has been created 
     * @return  Returns Point2D.Double
     */
    public Point2D.Double getCenter()
    {
        return this.center;
    }
    
    /**
     * Returns radius of shape
     *
     * @pre     shap has been created
     * @return  Retursn type double
     */
    public double getRadius()
    {
        return this.radius;
    }
    
    /**
     * Displaces the center of this shape by (x, y)
     *
     * @pre     Shape is created
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
     * @pre     shape is created
     * @post    radius of shape has been modified
     * @param   r the specified radius, what the radius will change to
     */
    public void setRadius(double r)
    {
        this.radius = r;
    }

    

}
