import java.util.Scanner;

public class GreatestCommonDivisor {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("a = ");
        int a = input.nextInt();
        System.out.print("b = ");
        int b = input.nextInt();

        if ( a == 0 || b == 0)
        {
            System.out.println("Không có ước chung lớn nhất");
            return;
        }
        int greatestCommon = 1;

        for (int i = 2; i < Math.abs(a-b);i++)
        {
            if (a % i == 0 && b % i == 0)
            {
                if (i > greatestCommon)
                {
                    greatestCommon = i;
                }
            }
        }
        System.out.printf("Ước chung lớn nhất của %d %d  là  %d ", a, b, greatestCommon);


    }
}
