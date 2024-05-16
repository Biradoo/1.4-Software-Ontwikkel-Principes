package nl.saxion.sdp.exercises.week1.car;

public class Car {
    private String brand;
    private String licencePlateNr;
    private int fuelCapacity;
    private double currentFuel;
    private int consumption;
    private int mileage;

    public Car(String licencePlateNr, int fuelCapacity, int consumption) {
        this.brand = "Volvo";


        String[] parts = licencePlateNr.split("-");
        if(parts[0].length() != 3 || parts[1].length() != 2 || parts[2].length() != 1) {
            throw new IllegalArgumentException("The format is not right!");
        }
        this.licencePlateNr = licencePlateNr;

        if(fuelCapacity <=0)
            throw new IllegalArgumentException("Fuel capacity can't be 0 or under");
        this.fuelCapacity = fuelCapacity;

        if(consumption <=0)
            throw new IllegalArgumentException("Consumption can't be 0 or under");
        this.consumption = consumption;

        this.currentFuel = fuelCapacity;
        this.mileage = 0;
    }

    public String getBrand() {
        return brand;
    }

    public String getLicencePlateNr() {
        return licencePlateNr;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public double getCurrentFuel() {
        return currentFuel;
    }

    public int getConsumption() {
        return consumption;
    }

    public int getMileage() {
        return mileage;
    }

    public double getPercentageFuel() {
        return (getCurrentFuel() / getFuelCapacity()) * 100;
    }

    public void drive(int km) {
        if (currentFuel - ((double) km / getConsumption()) < 0) {
            throw new IllegalArgumentException("The car can't drive that far!");
        } else {
            currentFuel -= ((double) km / getConsumption());
            mileage += km;
            System.out.println("You drove " + km + " kilometers and consumed " + (double) (km / getConsumption()) + " litres of fuel");
        }
    }

    public void fuel(int litres) {
        if (getCurrentFuel() + litres > getFuelCapacity()) {
            System.err.println("You can't overfill the tank!");
        } else {
            currentFuel += litres;
            System.out.println("You filled the tank with " + litres + " litres");
        }
    }

    @Override
    public String toString() {
        return getBrand() + " (" + getLicencePlateNr() + "), " + getCurrentFuel() +
                " litres (" + getPercentageFuel() + "%) " + getMileage();
    }
}
