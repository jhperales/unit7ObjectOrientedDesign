import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.*;
import java.awt.event.*;

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
        
        this.x1 = 0;
        this.x2 = 0;
        this.x3 = 0;
        this.y1 = 0;
        this.y2 = 0;
        this.y3 = 0;
    }

    class MousePressListener implements MouseListener
    {
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
}