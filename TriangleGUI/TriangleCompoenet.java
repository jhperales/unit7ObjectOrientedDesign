import java.awt.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.geom.Line2D;
import javax.swing.*;

public class  TriangleCompoenet extends JComponent
{
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;
    
    public void drawPoint(Graphics g, double x, double y)
    {
        Graphics2D g2 = (Graphics2D) g;
        Point2D.Double point = new Point2D.Double();
        point.setLocation(x,y);
        g2.draw(point);
    }
    
        
}
        