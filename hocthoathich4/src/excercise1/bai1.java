package excercise1;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        int n;
        int m;
   Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập giá trị của n là:");
    n= scanner.nextInt();
        System.out.println("Nhập giá trị của m là :");
    m= scanner.nextInt();
    for(int i =0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.print(" * ");
        }
        System.out.println();
    }

    }
}
