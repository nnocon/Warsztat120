package collections.inheritance.animals;

import collections.inheritance.interfaces.FarmAnimal;
import collections.inheritance.interfaces.LandCreature;
import jdk.jfr.Label;

public class Cow extends Animal implements LandCreature, FarmAnimal {


    public Cow(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println("Muuuuu!");
    }
}