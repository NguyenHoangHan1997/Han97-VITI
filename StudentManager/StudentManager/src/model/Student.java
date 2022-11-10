package model;

import utils.Validator;

import java.util.List;
import java.util.Scanner;

public class Student {
    private String id;
    private String name;
    private int age;
    private String course;
    private String address;
    private float mediumScore;

    public Student() { }

    public Student(String id, String name, int age, String course, String address, float mediumScore) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.address = address;
        this.mediumScore = mediumScore;
    }

    @Override
    public String toString() {
        return "Student ID: " + id +
                ",  Name: " + name +
                ",  Age: " + age +
                ",  Course: " + course +
                ",  Address: " + address +
                ",  Medium Score=" + mediumScore;
    }

//    public void inputStudent(List<Student> studentList) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter Student Information:");
//
//        boolean checkID;
//        do {
//            checkID = true;
//            System.out.print("StudentID: ");
//            this.id = scanner.next().trim();
//
//            for (Student st : studentList) {
//                if (st.getId().equalsIgnoreCase(this.id)) {
//                    System.out.println("The ID is available");
//                    checkID = false;
//                    break;
//                }
//            }
//        } while (!checkID);
//
//        System.out.print("Name: ");
//        this.name = scanner.next();
//        System.out.print("Age: ");
//        this.age = scanner.nextInt();
//        System.out.print("Course: ");
//        this.course = scanner.next();
//        System.out.print("Address: ");
//        this.address = scanner.next();
//        System.out.print("Medium Score: ");
//        this.mediumScore = scanner.nextFloat();
//    }

    public void inputStudent(List<Student> studentList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Information:");

        boolean checkID;
        do {
            checkID = true;
            this.id = Validator.getString(scanner, "Student ID: ");

            for (Student st : studentList) {
                if (st.getId().equalsIgnoreCase(this.id)) {
                    System.out.println("The ID is available");
                    checkID = false;
                    break;
                }
            }
        } while (!checkID);

        this.name = Validator.getString(scanner, "Name: ");
        this.age = Validator.getInt(scanner, "Age: ");
        this.address = Validator.getString(scanner, "Address: ");
        this.course = Validator.getString(scanner, "Course: ");
        this.mediumScore = Validator.getFloat(scanner, "Medium Score: ");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getMediumScore() {
        return mediumScore;
    }

    public void setMediumScore(float mediumScore) {
        this.mediumScore = mediumScore;
    }
}
