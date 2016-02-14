import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClickListener implements ActionListener
{
    private String name;
    private int count;
    
    public ClickListener(String name)
    {
        this.name = name;
        this.count = 0;
    }
    
    public void actionPerformed(ActionEvent event)
    {
        this.count++;
        if (count == 1)
        {
            System.out.println(this.name + " was clicked 1 time");
        }
        else
        {
            System.out.println(this.name +  "was clicked " + this.count + " times");
        }
    }
}