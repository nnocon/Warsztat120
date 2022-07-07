package collections.inheritance.interfacesFamily;

public class Father {
    private String name;

    public Father(String name) {
        this.name = name;
    }

    public void przedstawSie(){
        System.out.println("I am father "+ name);
    }


    public boolean isAdult(){
        return true;
    }
}
