public class cat {
    public String name;
    public int age;
    public String color;
    public String eyesColor;
    public float weight;
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEyesColor() {
        return eyesColor;
    }

    public void setEyesColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setName(String name){
        this.name=name;
    }
    public void speak(){
        System.out.println(name +"is speaking");
    }
    public void move(){
        System.out.println(name+" is running ");

    }
    public void sleep(){

    }
    public void eat(){

    }
}

