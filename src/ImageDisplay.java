import java.io.IOException;
import java.util.Scanner;

public class ImageDisplay {


    public static void rectanglePrint()
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 7;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void squareTrianglePrint()
    {
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 0; j < i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void isoscelesTrianglePrint()
    {
       for(int i = 1; i <= 5;i++)
       {
           for (int j = 5; j >= i;j--)
           {
               System.out.print("*");
           }
           System.out.println();
       }
    }

    public static void main(String[] args) throws IOException
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu : ");
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4.Exit");
        boolean result = false;
        do
        {
            System.out.print("Xin mời lựa chọn : ");
            String value = input.next();
            if (value.length() == 1)
            {
                char charValue = value.charAt(0);
                if (charValue== '1' || charValue == '2' || charValue == '3')
                {
                    if (charValue == '1')
                    {
                        rectanglePrint();
                    }
                    else if (charValue == '2')
                    {
                        squareTrianglePrint();
                    }
                    else
                    {
                        isoscelesTrianglePrint();
                    }
                    result = true;
                }
                else
                {
                    if (charValue == '4')
                    {
                        break;
                    }
                }
            }
        }
        while (!result); // result trong moi truong dieu kien la true -> !result
    }
}
