import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Nhập chiều cao: ");
        float height = input.nextFloat();
        System.out.print("Nhập chiều rộng : ");
        float width = input.nextFloat();

        float perimeter = (height + width) * 2;
        float area = height * width;

        System.out.println("Chu vi hình chữ nhật : " + perimeter);
        System.out.println("Diện tích hình chữ nhật : " + area);

    }
}
