import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String st;
        String[] arr;
        int sum = 0;

        System.out.print("Enter a String: ");
        st = scanner.nextLine().trim();

        // Chuyen nhung cai gi ko phai so thanh khoang trang
        arr = st.split("");
        st = "";
        for (int i = 0; i < arr.length; i++) {
            try {
                Integer.parseInt(arr[i]);
                st = st + arr[i];
            } catch (NumberFormatException e) {
                st = st + " ";
            }
        }

        st = st.trim();

        arr = st.split(" ");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() != 0) {
                int a = Integer.parseInt(arr[i]);
                sum += a;
                System.out.print(a);

                if (i < arr.length - 1)
                    System.out.print(" + ");
            }
        }

        System.out.println(" = " + sum);
    }
}
