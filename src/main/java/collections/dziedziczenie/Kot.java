package collections.dziedziczenie;

public class Kot extends Zwierze{
    public String name;
    public int age;


    public Kot(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Kot(){
        name = "Wata";
        age = 2;
    }

    public void sound(){
        System.out.println("Miau!");
    }
    public void scratch(){
        System.out.println(name + " drapie tapety!");
    }

}
