public class BetterRectangleTest
{
    public static void main(String[] args)
    {
        BetterRectangle rec = new BetterRectangle(10, 10, 5, 5);
        System.out.println("Expected Perimeter: 20");
        System.out.println("Actual Perimeter: " + rec.getPerimiter() + "\n");
        System.out.println("Expected Area: 25");
        System.out.println("Actual Area: " + rec.getArea());
    }
}
        