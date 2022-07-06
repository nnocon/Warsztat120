package collections.inheritance.citizen;

import java.util.List;

public class Town {
    private List<Citizen> citizens;

    public void add(Citizen citizen) {
     citizens.add((Citizen) citizens);

    }


    @Override
    public String toString() {
        return "Town{" +
                "citizens=" + citizens +
                '}';
    }
}
