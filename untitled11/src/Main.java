import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double x;

        System.out.println("find x from ax + b = 0 equation");
        System.out.print("Input a: ");
        a = scanner.nextDouble();
        System.out.print("Input b: ");
        b = scanner.nextDouble();

        if (a == 0.0) {

            if (b == 0.0) {
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }

        } else {
            x = -b / a;
            System.out.printf("x = %.2f", x);
        }
    }
}