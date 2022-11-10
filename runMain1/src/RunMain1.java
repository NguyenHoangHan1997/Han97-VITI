import java.util.Scanner;

public class RunMain1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.print("Input a : ");
        a = scanner.nextInt();
        System.out.print("Input b : ");
        b = scanner.nextInt();

        c = a;
        a = b;
        b = c;

        System.out.println("SWAP");
        System.out.printf("a =%d\nb=%d", a, b);
    }
}
