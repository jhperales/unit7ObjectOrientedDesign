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
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;
    private Ellipse2D point;
    private Line2D line1;
    private Line2D line2;
    private Line2D line3;

    public TriangleComponent()
    {
        this.point.setFrame(0, 0, 0, 0);
    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
    }
    public class MousePressListener implements MouseListener
    {
        private Point2D p1;
        private Point2D p2;
        private Point2D p3;
        private TriangleComponent component;

        public void mousePressed(MouseEvent event)
        {
            
        }
        // Do-nothing methods
        public void mouseReleased(MouseEvent event)
        {
        }

        public void mouseClicked(MouseEvent event) 
        {
        }

        public void mouseEntered(MouseEvent event) 
        {
        }

        public void mouseExited(MouseEvent event) 
        {
        }
    }
    public void drawPoint(double x, double y)
    {

    }
}
