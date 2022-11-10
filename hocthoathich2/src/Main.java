import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("N = ");
            n = scanner.nextInt();
            if ((n % 2 == 0) || (n <= 0))
                System.out.println("Please enter odd number greater than 0");
        } while ((n % 2 == 0) || (n <= 0));

        int a = n / 2;
        int b = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= a; j++)
                System.out.print(" ");
            for (int j = 1; j <= b; j++)
                System.out.print("*");
            System.out.println();
            if (i <= n / 2) {
                a--;
                b += 2;
            } else {
                a++;
                b -= 2;
            }
        }
    }
}