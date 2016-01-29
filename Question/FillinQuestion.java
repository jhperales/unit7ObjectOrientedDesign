import java.util.Scanner;

public class FillinQuestion extends Question
{
    /** this calss supports fill-in-the-blank questions wher answer is specified in the question's text.
     * For example:
     *      text = "The inventor of Java was _James Gosling_"
     *      
     * this will extract the asnwer from the question's text and replace teh answer with ----
     */
    
    //will override the setText method of the Quetion class to extract tha answe from the text
    public void setText(String questionText)
    {
        Scanner parser = new Scanner(questionText);
        parser.useDelimiter("_");
        String question = parser.next();
        String answer = parser.next();
        question += "____" + parser.next();
        super.setText(question);
        this.setAnswer(answer);
    }
    
}
