package garrage;

public class Main {
    public static void main(String[] args) {
        Wheel wheel1 = new Wheel(2.2);
        Wheel wheel2 = new Wheel(2.2);
        Wheel wheel3 = new Wheel(2.4);
        Wheel wheel4 = new Wheel(2.4);

        System.out.println(wheel1);

        Wheel[] wheels = {wheel1, wheel2, wheel3, wheel4};
        Car car = new Car(wheels);
        System.out.println(car);

    }
}
