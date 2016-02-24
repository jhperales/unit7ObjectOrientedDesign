import javax.swing.*;
import java.awt.BorderLayout;

public class DrawingEditor extends JFrame
{
    private DrawingPanel canvas;
    private ControlPanel controls;
    
    public DrawingEditor()
    {
        super.setTitle("Drawing Editor");
        this.canvas = new DrawingPanel();
        this.controls = new ControlPanel(canvas);
        
        add(this.canvas);
        add(this.controls);
        
        
        
    }
}