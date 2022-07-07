package collections.inheritance.interfacesFamily;

public class Son {
    private String name;

    public Son(String name) {
        this.name = name;
    }
    public void przedstawSie() {
        System.out.println("I am son " + name);
    }

    public boolean isAdult(){
        return false;
    }
}
