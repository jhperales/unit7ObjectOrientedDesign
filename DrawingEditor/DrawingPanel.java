import javax.swing.*;
import java.util.ArrayList;
import java.awt.*;
import java.awt.geom.*;



public class DrawingPanel extends JPanel
{
    private ArrayList<Shape> shapes;
    private boolean isActive;
    private boolean isMoving;
    private Color currentColor;
    private Color bgColor;
    
    
    public DrawingPanel()
    {
        this.shapes = new ArrayList<Shape>();
        this.currentColor = new Color(0, 0, 0);
    }
    
    /**
     * Returns the current color
     *
     * @return  Returns a Color object
     */
    public Color getColor()
    {
        return this.currentColor;
    }
    
    /**
     * Returns size to encapsulate reasonable drawing canvas
     *
     * @return Dimension object
     */
    public Dimension getPreferredSize()
    {
        return new Dimension(400, 400);
    }

    /**
     * Brings up JColorChooser and sets chosen colo as new drawing color; leaves unchanges if cancel is clicked
     */
    public void pickColor()
    {
        JColorChooser.showDialog(null, "Pick a color", this.currentColor);
    }
    
    public void addCircle()
    {
        Ellipse2D.Double circle = new Ellipse2D.Double();
        this.shapes.add(circle);
    }
}