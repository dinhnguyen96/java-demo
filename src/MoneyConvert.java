import java.util.Scanner;

public class MoneyConvert
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số tiền cần chuyển đổi : ");
        int money = input.nextInt();

        int moneyConvert = money * 23000;
        System.out.printf("Số tiền sau khi chuyển đổi sang VND :  %d", moneyConvert);

    }
}
