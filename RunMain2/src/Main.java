import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double math;
        double physics;
        double chemistry;
        double avg;
        char rank;

        System.out.print("Input math :");
        math = scanner.nextDouble();
        System.out.print(" Input physics:");
        physics = scanner.nextDouble();
        System.out.print("Input Chemistry:");
        chemistry = scanner.nextDouble();

       avg = (math + physics + chemistry )/3;
       System.out.printf("AVG=%.2f\n", avg);

       if (avg >=8.0) {
           rank = 'A';
       }else if (avg >=6.5){
           rank ='B';
       }else if (avg >=5){
           rank ='C';
       }else{
           rank ='D';
       }
       System.out.println("RANK=" + rank);

    }
}