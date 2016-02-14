import java.awt.geom.*;
import java.awt.event.*;
import javax.swing.*;

public class MousePressListener implements MouseListener
{
    private Point2D p1;
    private Point2D p2;
    private Point2D p3;
    
    public void mousePressed(MouseEvent event)
    {
        this.p1.setLocation(event.getX(), event.getY());
        this.p2.setLocation(event.getX(), event.getY());
        this.p3.setLocation(event.getX(), event.getY());
        
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
    