package model;

import java.util.Scanner;

public class student {
    private String code;
    private String name;
    private int age;
    private int sex;

    public student(String code, String name, int age, int sex) {
        this.code = code;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
public void inputStudent(){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Input Student Information");
    System.out.println("Code: ");
}

    @Override
    public String toString() {
        return "student{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

}
