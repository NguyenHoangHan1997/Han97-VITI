package model;

public class employ_PartTime {
    private int id;
    private String Name;
    private String numberPhone;
    private String Address;
    private int timeHours;
    private double Salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getTimeHours() {
        return timeHours;
    }

    public void setTimeHours(int timeHours) {
        this.timeHours = timeHours;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public employ_PartTime(int id, String name, String numberPhone, String address, int timeHours, double salary) {
        this.id = id;
        Name = name;
        this.numberPhone = numberPhone;
        Address = address;
        this.timeHours = timeHours;
        Salary = salary;
    }

    @Override
    public String toString() {
        return "employ_PartTime{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                ", Address='" + Address + '\'' +
                ", timeHours=" + timeHours +
                ", Salary=" + Salary +
                '}';
    }
}
