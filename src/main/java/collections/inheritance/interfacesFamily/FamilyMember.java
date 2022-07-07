package collections.inheritance.interfacesFamily;

public interface FamilyMember {

    default void przedstawSie() {
        System.out.println("I am a family member");
    }

    boolean isAdult();
}
