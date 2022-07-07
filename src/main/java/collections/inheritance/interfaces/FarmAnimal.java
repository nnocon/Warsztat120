package collections.inheritance.interfaces;

public interface FarmAnimal {


 //  public final static int AGE = 10;


    public abstract void eat();
    public abstract void makeSound();

    //wujatel, jesli dodamy default do metody to moze nie byc abstrakcyjna
    public default void moteda(){
        System.out.println("hello");
    }
}
