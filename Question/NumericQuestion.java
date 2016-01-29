public class NumericQuestion extends Question
{
    private double answer;
    
    
    //example of a method overload
    //setAnswer method that takes String parameter is being overloaded
    public void setAnswer(double correctRespsonse)
    {
        this.answer = correctRespsonse;
    }
    
    //this is an example of method overriding
    //the checkAnswer method int he question calss ie being overrideen
    public boolean checkAnswer(String response)
    {
        double responseAsDouble = Double.parseDouble(response);
        return Math.abs(responseAsDouble - answer) <= 0.01;
    }
        
}

    