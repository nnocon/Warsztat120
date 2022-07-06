package collections.inheritance;


import collections.inheritance.animals.Animal;

public class AnimalGuide {

    public void feedAnimal(Animal animal){
        System.out.println("Opiekun karmi zwierze:");
        animal.eat();
        animal.makeSound();


        //animal.uhaha();
        //Zła praktyka:
        /* if (animal instanceof Monkey) {
            Monkey monkey = (Monkey) animal;
            monkey.uhaha();
        }else if(animal instanceof Whale){
            Whale whale = (Whale) animal;
            whale.booing();
        }*/
    }

/*
    public void feedWhale(Whale whale){
        System.out.println("Opiekun karmi wieloryba:");
        whale.eat();
        whale.booing();
    }*/


}