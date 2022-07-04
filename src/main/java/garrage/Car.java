package garrage;

import java.util.Arrays;
import java.util.Random;

public class Car {
    private final Wheel[] wheels;

    public Car(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void flatRandomTire(){
        Random random = new Random();
        int wheelIndex = random.nextInt(wheels.length);
        Wheel randomWheel = wheels[wheelIndex];

        //przebijam kolo
  //      randomWheel.setFlat(true);
    //    randomWheel.setPressure(0.0);
        randomWheel.doFlatTire();
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + Arrays.toString(wheels) +
                '}';
    }
}
