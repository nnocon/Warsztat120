package collections.inheritance.interfacesFamily;

public class Mother {
    private String name;

    public Mother(String name) {
        this.name = name;
    }

    public void przedstawSie() {
        System.out.println("I am mother " + name);
    }

   public boolean isAdult(){
        return true;
   }

}
