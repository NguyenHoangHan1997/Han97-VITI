

public class Main {
    public static void main(String[] args) {
cat tom=new cat();
tom.setName("Tom");
        System.out.println(tom.getName());
        cat meow=new cat();
        meow.setName("Meow");
        System.out.println(tom.getName());
        String meowName=meow.getName();
        System.out.println("meow's name is:"+meowName);
        }
    }
