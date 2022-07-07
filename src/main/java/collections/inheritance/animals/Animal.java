package collections.inheritance.animals;


import collections.inheritance.interfaces.WaterCreature;
import collections.inheritance.interfaces.WildAnimal;

public abstract class Animal implements WildAnimal, WaterCreature {

    String name;
    int age;

   /* public Animal() {
        System.out.println("Animal 1");
    }*/

    public Animal(String name, int age) {
        System.out.println("Animal 2");
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("Zwierze je jedzonko :) ");
    }

    public abstract void makeSound(); // metoda abstrakcyjna nie ma ciała, TRZEBA ją nadpisywać

}
