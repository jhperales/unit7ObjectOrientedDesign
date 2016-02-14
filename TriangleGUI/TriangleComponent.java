import java.awt.*;
import java.awt.Graphics;
import java.awt.geom.*;
import javax.swing.*;

public class TriangleComponent extends JComponent
{
    private Line2D line1;
    private Line2D line2;
    private Line2D line3;
    
    public TriangleComponent(Point2D p1, Point2D p2, Point2D p3)
    {
        this.line1.setLine(p1, p2);
        this.line2.setLine(p2, p3);
        this.line3.setLine(p3, p1);
    }
    
   
    
    
}
        