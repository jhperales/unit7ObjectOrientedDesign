import java.util.*;

public class Person implements Comparable<Person>
{
    private String name;
    
    public Person(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return this.name;
    }
   
    public int compareTo(Person other)
    {
        return this.name.compareTo(other.name);
    }
    
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        Person[] list = new Person[10];
        
        for (int i = 0; i < 10; i++)
        {
            System.out.print("Enter a name: ");
            String name = s.nextLine();
            Person person = new Person(name);
            list[i] = person;
        }
        
        Arrays.sort(list);
        
        System.out.print("\nFirst: " + list[0].name); 
        System.out.print("\nLast: " + list[9].name); 
    }
}
        