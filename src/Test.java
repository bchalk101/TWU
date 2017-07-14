/**
 * Created by boruch on 14/7/17.
 */

import java.util.*;


public class Test
{
    public static void main(String[] args)
    {
        ass1();
    }

    private static void ass1()
    {
        Scanner reader = new Scanner(System.in);
        int i =  Integer.valueOf(reader.nextLine());
        int test = 0;
        while(test < i)
        {
            System.out.print("*");
            test++;
        }

        System.out.println("");
    }
}
