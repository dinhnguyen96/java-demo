import java.util.Scanner;

public class PrimeCheck {

    public static boolean primeNumberCheck(int prime)
    {
        if (prime < 2) return false;
        if (prime == 2) return true;

        for (int i = 2; i <= prime / 2;i++)
        {
            if (prime % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = input.nextInt();

        boolean cheked = primeNumberCheck(n);

        if (cheked)
        {
            System.out.println("Là số nguyên tố");
        }
        else
        {
            System.out.println("Không phải là số nguyên tố");
        }
    }
}
