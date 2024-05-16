package nl.saxion.sdp.exercises.week1.car;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    private Car a = new Car("123-ab-1", 50, 10);


    @Test
    void createNewCarWithValidLicencePlateGivesNoException() {

    }

    @Test
    void newCarHasFullTank() {
        assertEquals(50, a.getCurrentFuel());
    }

    @Test
    void carWhenDriving50kmConsumes5LiterOfFuel() {
        a.drive(50);
        assertEquals(45, a.getCurrentFuel());
    }

    @Test
    void carWithEmptyTankCannotDrive() {
        assertThrows(IllegalArgumentException.class, () -> {
            Car b = new Car("123-ab-1", 1, 10);
            b.drive(50);
        });
    }

    @Test
    void carFuelCapacityCantBeUnder0_GivesException() {
        assertThrows(IllegalArgumentException.class, () -> {
            Car b = new Car("123-ab-1", -10, 10);
        });
    }

    @Test
    void carConsumptionCantBeUnder0_GivesException() {
        assertThrows(IllegalArgumentException.class, () -> {
            Car b = new Car("123-ab-1", 10, -10);
        });
    }

    @Test
    void carLicencePlateStartsWith4Numbers_GivesException() {
        assertThrows(IllegalArgumentException.class, () -> {
            Car b = new Car("1234-ab-1", 50,10);
        });
    }

    @Test
    void carLicencePlateStartsWith2Numbers_GivesExcpetion() {
        assertThrows(IllegalArgumentException.class, () -> {
            Car b = new Car("12-ab-1", 50,10);
        });
    }

    @Test
    void carLicencePlateWith3Letters_GivesExpcetion() {
        assertThrows(IllegalArgumentException.class, () -> {
            Car b = new Car("123-abc-1", 50,10);
        });
    }

    @Test
    void carLicencePlateWith1Letter_GivesException() {
        assertThrows(IllegalArgumentException.class, () -> {
            Car b = new Car("123-a-1", 50,10);
        });
    }

    @Test
    void carLicencePlateEndsWith2Numbers_GivesException() {
        assertThrows(IllegalArgumentException.class, () -> {
            Car b = new Car("123-ab-12", 50,10);
        });
    }

}