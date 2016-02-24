import javax.swing.*;
import java.awt.BorderLayout;

public class DrawingEditor extends JFrame
{
    private DrawingPanel canvas;
    private ControlPanel controls;
    
    public DrawingEditor()
    {
        super.setTitle("Drawing Editor");
        super.setSize(400, 400);
        this.canvas = new DrawingPanel();
        this.controls = new ControlPanel(canvas);
        controls.setLayout(new BorderLayout());
        controls.add(controls, BorderLayout.SOUTH);
    }
    public static void main(String[] args)
    {
        DrawingEditor editor = new DrawingEditor();
        editor.setVisible(true);
    }
}