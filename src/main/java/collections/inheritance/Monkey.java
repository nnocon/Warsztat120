package collections.inheritance;

public class Monkey extends Animal{
    private String name;
    private int age;
    private int tailLengt;

    public Monkey(String name, int age, int tailLengt) {
        this.name = name;
        this.age = age;
        this.tailLengt = tailLengt;
    }

    public Monkey() {
        name = "Jacek";
        age = 8;
        tailLengt = 20;
    }

    public void uhaha() {
        System.out.println("Uhahaha!!!");
    }

    public void jump(){
        System.out.println(name + " skacze w poszukiwaniu babana!");
    }

    public void eat (){
        System.out.println("Malpa je banana!");
    }
}
