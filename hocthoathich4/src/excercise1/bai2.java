package excercise1;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        int n;
        int m;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập giá trị của n là :");
        n=scanner.nextInt();
        System.out.println("Nhập giá trị của m là");
        m=scanner.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0||i==n-1||j==0||j==m-1){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
