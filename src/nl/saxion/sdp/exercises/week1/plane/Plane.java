package nl.saxion.sdp.exercises.week1.plane;

public class Plane {
    private boolean luggageLoaded, passengersLoaded, doorsLocked;

    public Plane() {
        this.luggageLoaded = false;
        this.passengersLoaded = false;
        this.doorsLocked = false;
    }

    public boolean isLuggageLoaded() {
        return luggageLoaded;
    }

    public boolean isPassengersLoaded() {
        return passengersLoaded;
    }

    public boolean isDoorsLocked() {
        return doorsLocked;
    }

    public boolean depart() {
        if (isLuggageLoaded() && isPassengersLoaded() && isDoorsLocked()) {
            System.out.println("The plane is ready to depart! Preparation complete!");
            return true;
        } else {
            System.out.println("The plane is not yet ready to departure. Prepartions incomplete!");
            return false;
        }
    }

    public void lockDoors() {
        this.doorsLocked = true;
        System.out.println("Locking doors!");
    }

    public void unlockDoors() {
        this.doorsLocked = false;
        System.out.println("Unlocking doors!");
    }

    public boolean loadLuggage() {
        if (isDoorsLocked()) {
            System.err.println("Unable to load luggage. The doors are locked!");
            return false;
        } else {
            System.out.println("Luggage loaded!");
            return isLuggageLoaded();
        }
    }

    public boolean loadPassengers() {
        if (isDoorsLocked()) {
            System.err.println("Unable to load passengers. The doors are locked!");
            return false;
        } else {
            System.out.println("Passengers loaded!");
            return isPassengersLoaded();
        }
    }
}
