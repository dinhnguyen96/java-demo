public class PrimeNumber {


    public static boolean primeNumberCheck(int prime)
    {
        if (prime < 2) return false;
        if (prime == 2) return true;

        for (int i = 2; i <= prime / 2;i++)
        {
            if (prime % 2 == 0)
            {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args)
    {
        int count = 0, prime = 2; String str = "";
        while (count < 20)
        {
            if (primeNumberCheck(prime))
            {
                str += prime + " ";
                count++;
            }
            prime++;
        }
        System.out.println("20 số nguyên tố đầu tiên : " + str);
    }
}
