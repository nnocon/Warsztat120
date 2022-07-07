package collections.inheritance.interfacesFamily;

public class Daughter {
    private String name;

    public Daughter(String name) {
        this.name = name;
    }
    public void przedstawSie() {
        System.out.println("I am daoughter " + name);
    }

    public boolean isAdult(){
        return false;
    }
}
