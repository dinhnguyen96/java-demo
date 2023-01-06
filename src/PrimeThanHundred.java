public class PrimeThanHundred {


    public static boolean primeNumberCheck(int prime)
    {
        if (prime < 2) return false;
        if (prime == 2) return true;

        for (int i = 2; i <= prime/2; i++)
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
        String str = "";
       for (int i = 2; i < 100; i++)
       {
           if (primeNumberCheck(i))
           {
               str += i + " ";
           }
       }
       System.out.println(str);
    }
}
