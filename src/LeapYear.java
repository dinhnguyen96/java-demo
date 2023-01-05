import java.util.Scanner;

public class LeapYear
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số năm : ");
        int year = input.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
        {
            System.out.println("Là năm nhuận");
        }
        else
        {
            System.out.println("Không phải Là năm nhuận");
        }
    }
}
