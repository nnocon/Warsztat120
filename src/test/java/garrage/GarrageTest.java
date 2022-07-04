package garrage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class GarrageTest {

    @Test
    public void repairCarFicesAllWheels(){
        Wheel wheel1 = new Wheel(2.2);
        Wheel wheel2 = new Wheel(2.2);
        Wheel wheel3 = new Wheel(2.4);
        Wheel wheel4 = new Wheel(2.4);
        Wheel[] wheels = {wheel1, wheel2, wheel3};

        //2 wheels are flat
        wheel1.doFlatTire();
        wheel2.doFlatTire();

        //wheel3 is OK
        Car car = new Car (wheels);
        Garrage garrage = new Garrage();

        //when
        Receipt receipt = garrage.repairCar(car);

        //than
        assertEquals(2,receipt.getCount());
        assertFalse(wheel1.isFlat());
        assertFalse(wheel2.isFlat());

    }

}