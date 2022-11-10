import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;
        double x1;
        double x2;
        double delta;

        System.out.println("find x from ax2 + bx + c = 0");
        System.out.print("Input a: ");
        a = scanner.nextDouble();
        System.out.print("Input b: ");
        b = scanner.nextDouble();
        System.out.print("Input c: ");
        c = scanner.nextDouble();

        if (a == 0.0) {

            if (b == 0.0) {
                if (c == 0.0) {
                    System.out.println("Phuong trinh vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            } else {
                x1 = -c / b;
                System.out.printf("x = %.2f", x1);
            }

        } else {

            delta = b * b - 4 * a * c;
            if (delta < 0.0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta == 0.0) {
                x1 = -b / (2 * a);
                System.out.printf("x1 = x2 = %.2f", x1);
            } else {
                x1 = (-b - Math.sqrt(delta)) / (2 * a);
                x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.printf("x1 = %.2f\n", x1);
                System.out.printf("x2 = %.2f", x2);
            }

        }
    }
}
