package utils;

import model.Student;

import java.util.*;

public class StudentManager {
    private List<Student> studentList = new ArrayList<>();

    public StudentManager() { }

    public StudentManager(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void addStudent() {
        Student st = new Student();
        st.inputStudent(studentList);
        studentList.add(st);
    }

    public void showAllStudentList() {
        System.out.println("Show All Student List:");
        for (int i = 0; i < studentList.size(); i++) {
            Student st = studentList.get(i);
            System.out.println(st);
        }
    }

    public void sortStudentList() {
        System.out.println("Sort Student List by Medium Score Gradual:");
//        List<Student> list1 = new ArrayList<>();
//        list1.addAll(studentList);
        List<Student> list1 = new ArrayList<>(studentList);

        // sap xep theo String
        Collections.sort(list1, new Comparator<Student>() {
            @Override
            public int compare(Student st1, Student st2) {
                return st1.getName().compareToIgnoreCase(st2.getName());
            }
        });

        // sap sep theo number
        Collections.sort(list1, new Comparator<Student>() {
            @Override
            public int compare(Student st1, Student st2) {
                if (st1.getMediumScore() > st2.getMediumScore())
                    return 1;
                else if (st1.getMediumScore() < st2.getMediumScore())
                    return -1;
                else
                    return 0;
            }
        });

//        Collections.sort(list1, new Comparator<Student>() {
//            @Override
//            public int compare(Student st1, Student st2) {
//                if (st1.getMediumScore() > st2.getMediumScore())
//                    return 1;
//                else if (st1.getMediumScore() < st2.getMediumScore())
//                    return -1;
//                else
//                    st1.getName().compareToIgnoreCase(st2.getName());
//            }
//        });

//        Collections.sort(list1, new Comparator<Student>() {
//            @Override
//            public int compare(Student st1, Student st2) {
//                if (st1.getMediumScore() > st2.getMediumScore())
//                    return 1;
//                else if (st1.getMediumScore() < st2.getMediumScore())
//                    return -1;
//                else {
//
//                    if (st1.getName().compareToIgnoreCase(st2.getName()) > 0)
//                        return 1;
//                    else if (st1.getName().compareToIgnoreCase(st2.getName()) < 0)
//                        return -1;
//                    else {
//
//                        if (st1.getAge() > st2.getAge())
//                            return 1;
//                        else if (st1.getAge() < st2.getAge())
//                            return -1;
//                        else
//                            return 0;
//
//                    }
//
//                }
//            }
//        });

        for (Student st : list1)
            System.out.println(st);
    }

    public void showAllCourseList() {
        System.out.println("Show All Course List:");
        List<String> courseList = new ArrayList<>();

        for (Student st : studentList) {
            if (!courseList.contains(st.getCourse()))
                courseList.add(st.getCourse());
        }

        Collections.sort(courseList);

        for (String course : courseList)
            System.out.println(course);
    }

    public void searchStudent(String search) {
        System.out.println("Search Student by ID or Name:");
        search = search.toLowerCase();
        int d = 0;

        for (Student st : studentList) {
            String id = st.getId().toLowerCase();
            String name = st.getName().toLowerCase();
            if ((id.contains(search)) || (name.contains(search))) {
                System.out.println(st);
                d++;
            }
        }

        if (d == 0)
            System.out.println("No matching results were found");
    }
}
