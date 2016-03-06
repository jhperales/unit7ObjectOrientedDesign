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
        this.currentColor.setBackground(control.getColor());
        this.add(pickColor);
        this.add(currentColor);
        this.add(addCircle);
        this.add(addSquare);

        ClickListener listener = new ClickListener();
        this.pickColor.addActionListener(listener);
        this.addCircle.addActionListener(listener);
        this.addSquare.addActionListener(listener);
    }

    public class ClickListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            if (event.getActionCommand() == "Pick Color")
            {
                control.pickColor();
                currentColor.setBackground(control.getColor());
            }
            if (event.getActionCommand() == "Add Circle")
            {
                control.addCircle();
            }
            if (event.getActionCommand() == "Add Square")
            {
                control.addSquare();
            }
        }
    }

    

}
        