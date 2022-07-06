package collections.dziedziczenie;

import java.security.PublicKey;

public class Pies extends Zwierze{
    public String name;
    public int age;

    public Pies(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Pies() {
        name = "Belo";
        age = 15;
    }

    public void sound() {
        System.out.println("Whow whow!");
    }

    public void burie() {
        System.out.println(name + " zakopuje kosci w ziemi");
    }
    public void goToSleep(){
        System.out.println(name + " poszedl spac :)");
    }
}
