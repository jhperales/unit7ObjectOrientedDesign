import javax.swing.*;
import java.awt.event.*;

public class ControlPanel extends JPanel
{
    private JButton addCircle;
    private JButton addSquare;
    private JButton pickColor;
    private JPanel currentColor;
    private DrawingPanel control;
    
    
    public ControlPanel(DrawingPanel controls)
    {
        this.addCircle = new JButton("Add Circle");
        this.addSquare = new JButton("Add Square");
        this.pickColor = new JButton("Pick Color");
        this.currentColor = new JPanel();
        this.control = controls;
        this.add(pickColor);
        this.add(currentColor);
        this.add(addCircle);
        this.add(addSquare);
    }
    
    
    public class ClickListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            System.out.println(event.getActionCommand() + " was clicked");
        }
    }
}

        