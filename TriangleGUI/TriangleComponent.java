import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;


public class  TriangleComponent extends JComponent
{
    private Line2D.Double line1;
    private Line2D.Double line2;
    private Line2D.Double line3;
     
    private Ellipse2D.Double point1;
    private Ellipse2D.Double point2;
    private Ellipse2D.Double point3;
    
    private int clicks;
    
    public TriangleComponent(int numclicks)
    {
        
    }
    
    
    public void drawPoint(double x, double y)
    {
        
    }
}
