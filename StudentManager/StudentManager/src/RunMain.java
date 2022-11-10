import model.Student;
import utils.MenuUtil;
import utils.StudentManager;
import utils.Validator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("1", "D", 11, "Math", "HA", 9f));
        studentList.add(new Student("2", "C", 11, "English", "DN", 9f));
        studentList.add(new Student("3", "A", 11, "Physics", "Hue", 9f));
        studentList.add(new Student("4", "B", 12, "History", "HA", 9f));
        studentList.add(new Student("5", "M", 12, "History", "HA", 8f));
        studentList.add(new Student("6", "N", 12, "Math", "HA", 8f));

        StudentManager studentManager = new StudentManager(studentList);

        int i;
        do {
            MenuUtil.printMenu();

            do {
//                System.out.print("Choice: ");
//                i = scanner.nextInt();

                i = Validator.getInt(scanner, "Choice: ");

                if ((i < 1) || (i > 6))
                    System.out.println("Enter a number from 1 to 6");
            } while ((i < 1) || (i > 6));

            switch (i) {
                case 1:
                    studentManager.addStudent();
                    System.out.println();
                    break;
                case 2:
                    studentManager.showAllStudentList();
                    System.out.println();
                    break;
                case 3:
                    studentManager.sortStudentList();
                    System.out.println();
                    break;
                case 4:
                    studentManager.showAllCourseList();
                    System.out.println();
                    break;
                case 5:
//                    System.out.print("Enter ID or Name for search: ");
//                    String search = scanner.next();

                    String search = Validator.getString(scanner, "Enter ID or Name for search: ");

                    studentManager.searchStudent(search);
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Program is finished");
                    break;
            }
        } while (i != 6);
    }
}
