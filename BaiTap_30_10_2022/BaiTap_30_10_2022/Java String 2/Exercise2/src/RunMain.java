import java.util.Scanner;

// Java String 2: Exercise 2
public class RunMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String st1;
        String st2;

        System.out.print("Enter String 1: ");
        st1 = scanner.next();

        System.out.print("Enter String 2: ");
        st2 = scanner.next();

        int a = st1.compareToIgnoreCase(st2);
        System.out.println(a);

        if (a < 0)
            System.out.printf("%s before %s", st1, st2);
        else if (a > 0)
            System.out.printf("%s after %s", st1, st2);
        else
            System.out.printf("%s = %s", st1, st2);
    }
}
