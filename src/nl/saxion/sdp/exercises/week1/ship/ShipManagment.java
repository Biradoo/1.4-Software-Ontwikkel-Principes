package nl.saxion.sdp.exercises.week1.ship;

import java.util.ArrayList;

public class ShipManagment {
    private ArrayList<Ship> ships = new ArrayList<>();
    private ArrayList<Port> ports = new ArrayList<>();

    public boolean addShip(Ship input) {
        if (ships.add(input)) {
            return true;
        } else {
            throw new IllegalArgumentException("Input not correct!");
        }
    }

    public boolean addPort(Port input) {
        if (ports.add(input)) {
            return true;
        } else {
            throw new IllegalArgumentException("Input not correct!");
        }
    }

    public Ship getShip(String input) {
        for (Ship ship : ships) {
            if (ship.getName().equalsIgnoreCase(input)) {
                return ship;
            } else {

            }
        }
        throw new IllegalArgumentException("Ship not found");
    }

    public Port getPort(String input) {
        for (Port port : ports) {
            if (port.getName().equalsIgnoreCase(input)) {
                return port;
            } else {

            }
        }
        throw new IllegalArgumentException("Port not found");
    }
}
