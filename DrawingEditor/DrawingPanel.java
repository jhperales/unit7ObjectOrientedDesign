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
        this.currentColor = new Color(5, 123, 32);
        this.bgColor = new Color(255, 255, 255);
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
        this.currentColor = JColorChooser.showDialog(null, "Pick a color", this.currentColor);
    }
    
    public void addCircle()
    {
       Circle c = new Circle(new Point2D.Double(50,50), Math.random(), this.currentColor);
       this.shapes.add(c);
    }
    
    public void addSquare()
    {
        Square s = new Square(new Point2D.Double(50,50), Math.random(), this.currentColor);
        this.shapes.add(s);
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
    }
}