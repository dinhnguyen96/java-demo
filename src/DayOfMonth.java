import java.util.Scanner;

public class DayOfMonth
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập năm : ");
        int year = input.nextInt();
        System.out.print("Nhập tháng :");
        int month = input.nextInt();

        switch (month)
        {
            case 1,3,5,7,8,10,12:
                System.out.printf("Tháng %d Có 31 ngày", month);
                break;
            case 4,6,9,11:
                System.out.printf("Tháng %d Có 30 ngày", month);
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                {
                    System.out.printf("Tháng %d Có 29 ngày", month);
                }
                else
                {
                    System.out.printf("Tháng %d Có 28 ngày", month);
                }
                break;
            default:
                System.out.printf("Tháng %d không tồn tại trong lịch", month);
        }


    }
}
