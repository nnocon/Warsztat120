package collections.dziedziczenie;

import java.util.ArrayList;
import java.util.List;

public class ZwierzetaDemo {
    public static void main(String[] args) {

        Pies pies = new Pies();
        Kot kot = new Kot();


        pies.burie();
        kot.scratch();

        List<Zwierze> zwierzeta = new ArrayList<>();
            zwierzeta.add(kot);
            zwierzeta.add(pies);


        for (Zwierze zwierze : zwierzeta) {

            zwierze.goToSleep();
            zwierze.sound();
        }

    }
}
