package nl.saxion.sdp.exercises.week1.ship;

public class Main {
    public static void main(String[] args) {
        /*
            todo: After you finished implementing the system the code beneath should work
         */

        ShipManagment shipManagment = new ShipManagment();
        shipManagment.addShip(new Ship("BigSur",30,30000,20));
        shipManagment.addShip(new Ship("Adrianna",40,40000,25));
        shipManagment.addPort(new Port(30,"SanFrancisco"));
        shipManagment.addPort(new Port(15,"Curacao"));
        shipManagment.addPort(new Port(40,"Los Angeles"));

        Ship s = shipManagment.getShip("BigSur");
        s.addDestination(shipManagment.getPort("SanFrancisco"));
        s.addDestination(shipManagment.getPort("Curacao"));
        s.addDestination(shipManagment.getPort("Los Angeles"));
        boolean result;
        result = s.addContainer(new Container(300,shipManagment.getPort("SanFrancisco")));
        System.out.println("Should be true: " + result);
        result = s.addContainer(new Container(200,shipManagment.getPort("SanFrancisco")));
        System.out.println("Should be true: " + result);
        result = s.addContainer(new Container(250,shipManagment.getPort("Curacao")));
        System.out.println("Should be false: " + result);
        result = s.addContainer(new Container(350,shipManagment.getPort("Los Angeles")));
        System.out.println("Should be true: " + result);

    }
}
