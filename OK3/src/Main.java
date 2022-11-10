import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        double math;
        double physics;
        double chemistry;
        //double english = 9.0;
        double avg;
        char rank;

        System.out.print("Input math: ");
        math = scanner.nextDouble();
        System.out.print("Input physics: ");
        physics = scanner.nextDouble();
        System.out.print("Input chemistry: ");
        chemistry = scanner.nextDouble();

        //avg = (math + physics + chemistry + english) / 4;

        Main obj = new Main();
        avg = obj.getAvg(math, physics, chemistry);
        System.out.printf("AVG = %.2f\n", avg);

        if (avg >= 8.0) {
            rank = 'A';
        } else if (avg >= 6.5) {
            rank = 'B';
        } else if (avg >= 5.0) {
            rank = 'C';
        } else {
            rank = 'D';
        }

        //System.out.println("RANK = " + calculateRank(avg));
        System.out.println("RANK = " + rank);
        System.out.printf("RANK = %c", rank);

        /*
        if (avg >= 8.0) {
            rank = 'A';
        }
        if ((avg >= 6.5) && (avg < 8)) {
            rank = 'B';
        }
        */
    }

    private double getAvg(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    private static char calculateRank(double value) {
        if (value >= 8.0)
            return 'A';
        if (value >= 6.5)
            return 'B';
        if (value >= 5)
            return 'C';
        return 'D';
    }
}
