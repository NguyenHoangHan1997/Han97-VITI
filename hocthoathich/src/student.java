public class student {
private String id;
private String name;
private String grade;
private int age;
private float avgMark;
private float fee;
private String email;
private String phoneNumber;

    public String getId() {
        return id;
    }

    public student(String id, String name, String grade, int age, float avgMark, float fee, String email, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.age = age;
        this.avgMark = avgMark;
        this.fee = fee;
        this.email = email;
        this.phoneNumber = phoneNumber;
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

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getAvgMark() {
        return avgMark;
    }

    public void setAvgMark(float avgMark) {
        this.avgMark = avgMark;
    }

    public float getFee() {
        return fee;
    }

    public void setFee(float fee) {
        this.fee = fee;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void study(String object){

}
public  void payfee (float amont){

}public void doHomework(String subject){

    }
    public void test(String subject){

    }
}
