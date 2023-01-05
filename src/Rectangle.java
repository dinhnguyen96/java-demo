import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Nhập chiều cao: ");
        int height = input.nextInt();
        System.out.print("Nhập chiều rộng : ");
        int width = input.nextInt();

        int perimeter = (height + width) * 2;
        int area = height * width;

        System.out.println("Chu vi hình chữ nhật : " + perimeter);
        System.out.println("Diện tích hình chữ nhật : " + area);

    }
}
