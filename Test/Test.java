import java.util.ArrayList;

/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test
{
    // instance variables - replace the example below with your own
    private int x;

    
    public static void main(String[] args){
        ArrayList<String> bobby = new ArrayList<String>();
        
        bobby.add("Sally");
        System.out.println(bobby);
        
    }
    
    /**
     * Constructor for objects of class Test
     */
    public Test()
    {
        // initialise instance variables
        x = 0;
        
        String[] bob = new String[1];
        
        ArrayList<String> bobby = new ArrayList<String>();
        
        bobby.add("Sally");
        System.out.println(bobby);
        
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
