import java.util.Scanner;

public class BMICalculator
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập chiều cao: ");
        double height = input.nextFloat();
        System.out.print("Nhập số cân nặng : ");
        double weight = input.nextFloat();
        double bmi = weight / Math.pow(height/100,2);

        if (bmi < 18.5)
        {
            System.out.println("Underweight");
        }
        else if (bmi < 25)
        {
            System.out.println("Normal");
        }
        else if (bmi < 30)
        {
            System.out.println("Overweight");
        }
        else
        {
            System.out.println("Obese");
        }

    }
}
