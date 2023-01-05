import java.util.Scanner;

public class DegreeOne {


    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("a = ");
        double a = input.nextInt();
        System.out.print("b = ");
        double b = input.nextInt();
        System.out.print("c = ");
        double c = input.nextInt();

        if (a != 0)
        {
            double answer = (c-b)/a;
            System.out.println("Phương trình có nghiệm là : " + answer);
        }
        else
        {
            if (b == c)
            {
                System.out.println("Phương trình vô số nghiệm");
            }
            else
            {
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
}
