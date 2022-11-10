import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String st;
//        String[] arr;
//
//        System.out.print("Enter Full Name: ");
//        st = scanner.nextLine().trim();
//
//        arr = st.split(" ");
//
////        for (int i = 0; i < arr.length; i++)
////            System.out.printf("_%s_\n", arr[i]);
//
//        st = "";
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i].length() != 0)
//                st = st + arr[i] + " ";
//        }
//
//        // xoa khoang trang o cuoi chuoi
//        st = st.trim();
//
//        System.out.println();
//        System.out.println(st);

        Scanner scanner = new Scanner(System.in);
        StringBuilder st;
        String[] arr;

        System.out.print("Enter Full Name: ");
        st = new StringBuilder(scanner.nextLine().trim());

        arr = st.toString().split(" ");

        st = new StringBuilder(); // tao chuoi rong
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() != 0)
                st.append(arr[i]).append(" ");
        }

        // xoa khoang trang o cuoi chuoi
        // st = new StringBuilder(st.toString().trim());
        st.deleteCharAt(st.length() - 1);

        System.out.println();
        System.out.println(st);
    }
}
