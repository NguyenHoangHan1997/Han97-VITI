// Java String 2: Test scanner.next(), scanner.nextLine()
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String st;
//
//        System.out.print("Enter a String: ");
//        st = scanner.next();
//
//        System.out.println();
//        System.out.println(st);
//
//        System.out.print("Enter a String: ");
//        st = scanner.nextLine();
//
//        System.out.println();
//        System.out.println(st);

        String[] arr = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.printf("Enter String %d: ", i + 1);
            arr[i] = scanner.nextLine();
        }

        System.out.println();
        for (String st1 : arr)
            System.out.println(st1);
    }
}
