package nl.saxion.sdp.exercises.week1.ship;

import java.util.ArrayList;

public class Ship {
    private String name;
    private int maxContainers;
    private int maxWeight;
    private int depthNeeded;
    private ArrayList<Container> containers = new ArrayList<>();
    private ArrayList<Port> destinations = new ArrayList<>();


    public Ship(String name, int maxContainers, int maxWeight, int depthNeeded) {
        if (name.isBlank()) {
            throw new IllegalArgumentException("The name can't be empty");
        }
        this.name = name;

        if (maxContainers < 0) {
            throw new IllegalArgumentException("The value can't be under 0");
        }
        this.maxContainers = maxContainers;

        if (maxWeight < 0) {
            throw new IllegalArgumentException("The value can't be under 0");
        }
        this.maxWeight = maxWeight;

        if (depthNeeded < 0) {
            throw new IllegalArgumentException("The value can't be under 0");
        }
        this.depthNeeded = depthNeeded;
    }

    public String getName() {
        return name;
    }

    public int getMaxContainers() {
        return maxContainers;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public int getDepthNeeded() {
        return depthNeeded;
    }

    public int getTotalWeightOfContainers() {
        int totalWeight = 0;
        for (Container container : containers) {
            totalWeight += container.getWeight();
        }
        return totalWeight;
    }

    public int getTotalContainers() {
        return containers.size();
    }

    public boolean addDestination(Port input) {
        if (input.getMaxDepth() < getDepthNeeded()) {
            System.err.println("This port isn't deep enough for this ship");
            return false;
        }
        destinations.add(input);
        return true;
    }

    public boolean addContainer(Container input) {
        try {
            if (getTotalWeightOfContainers() + input.getWeight() > getMaxWeight()) {
                throw new IllegalArgumentException("The container is too heavy for this ship! Unload some first");
            }

            if (getTotalContainers() >= getMaxContainers()) {
                throw new IllegalArgumentException("This ship doesn't have any spots left for this container");
            }

            if (!addDestination(input.getDestination())) {
                throw new IllegalArgumentException("This port isn't deep enough for this ship");
            }
            containers.add(input);
            return true;
        } catch (IllegalArgumentException IAE) {
            System.err.println(IAE.getMessage());
            return false;
        }
    }
}
