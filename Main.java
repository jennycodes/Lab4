import java.util.*;


public class Main
{
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        String day = "";
        System.out.println("What day is it? ");
        day = scnr.next();

        if ( day.contentEquals("Tuesday") || day.contentEquals("Thursday") )
        {
            System.out.println("We have class today.");
        }
        else
        {
            System.out.println("We do not have class today.");
        }
    }
}
