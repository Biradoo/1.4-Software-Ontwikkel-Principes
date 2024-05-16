package nl.saxion.sdp.exercises.week1.ship;

public class Port {
    private String name;
    private int maxDepth;

    public Port(int maxDepth, String name) {
        if (maxDepth < 0) {
            throw new IllegalArgumentException("Depth can't be under 0");
        }
        this.maxDepth = maxDepth;

        if(name.isBlank()) {
            throw new IllegalArgumentException("The name can't be empty");
        }
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public int getMaxDepth() {
        return maxDepth;
    }
}
