import java.awt.event.*;
import javax.swing.JFrame;
import java.awt.geom.*;
import java.awt.event.*;
import javax.swing.*;

public class TriangleFrame extends JFrame
{
    private static final int FRAME_WIDTH = 1000;
    private static final int FRAME_HEIGHT = 1000;

    private TriangleComponent scene;


    class MousePressListener implements MouseListener
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
        
        public Point2D getP1()
        {
            return this.p1;
        }
        
        public Point2D getP2()
        {
            return this.p2;
        }
        
        public Point2D getP3()
        {
            return this.p3;
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
    
    public TriangleFrame()
    {
        scene = new TriangleComponent();
        add(scene);
        
        MouseListener listener = new MousePressListener();
        scene.addMouseListener(listener);
        
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }
}
