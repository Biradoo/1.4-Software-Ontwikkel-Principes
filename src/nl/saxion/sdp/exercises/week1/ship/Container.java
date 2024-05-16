package nl.saxion.sdp.exercises.week1.ship;

public class Container {
    private int weight;
    private Port destination;

    public Container(int weight, Port destination) {
        if (weight < 1) {
            throw new IllegalArgumentException("The value can't be 0 or lower");
        }
        this.weight = weight;

        this.destination = destination;
    }

    public int getWeight() {
        return weight;
    }

    public Port getDestination() {
        return destination;
    }
}
