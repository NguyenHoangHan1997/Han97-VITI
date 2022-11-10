package excercise1;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("Input N: ");
            n = scanner.nextInt();
        } while ((n <= 0) || (n % 2 == 0));

        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.printf("%c", 'A' + j - 1);

            System.out.println();
        }


    }
}


