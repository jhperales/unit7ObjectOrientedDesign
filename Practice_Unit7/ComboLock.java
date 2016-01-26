public class ComboLock
{
    private int secret1;
    private int secret2;
    private int secret3;
    private int current;
    private int turn_num;
    private boolean unlock1;
    private boolean unlock2;
    private boolean unlock3;
    public ComboLock(int first, int second, int third)
    {
        this.secret1 = first;
        this.secret2 = second;
        this.secret3 = third;
        this.unlock1 = false;
        this.unlock2 = false;
        this.unlock3 = false;
        this.current = 0;
        this.turn_num = 1;
    }
    
    /** Method to reset lock */
    public void reset()
    {
        this.current = 0;
    }
    
    /** turns to the left with sepcified ticks */
    public void turnLeft(int ticks)
    {
        this.current -= ticks;
        
        if (this.current < 0)
        {
            this.current = 39 + this.current;
        }
        
        if (this.current == this.secret2)
        {
            this.unlock2 = true;
        }
        
        
        this.turn_num += 1;
    }
    
    /** turns to the right with specified tics*/
    public void turnRight(int ticks)
    {
        this.current += ticks;
        
        if (this.current > 39)
        {
            this.current = this.current - 39;
        }
        
        if (this.turn_num == 1)
        {
            if (this.current == secret1)
            {
                this.unlock1 = true;
            }
        }
        
        if (this.turn_num == 3)
        {
            if (this.current == secret3)
            {
                this.unlock3 = true;
            }
        }
        
        
        this.turn_num += 1;
    }
    
    /** attempts to unlock */
    public boolean open()
    {
        if (this.unlock1 == true && this.unlock2 == true && this.unlock3 == true)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}