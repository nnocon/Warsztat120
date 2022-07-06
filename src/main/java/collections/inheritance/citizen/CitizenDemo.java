package collections.inheritance.citizen;

public class CitizenDemo {
    public static void main(String[] args) {

        King king = new King();
        Peasant peasant = new Peasant();
        Soldier soldier = new Soldier();
        Townsman townsman = new Townsman();



        Town town = new Town();
        town.add(king);
        town.add(peasant);
        town.add(soldier);
        town.add(townsman);


    }
}
