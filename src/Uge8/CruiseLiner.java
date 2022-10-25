package Uge8;

public class CruiseLiner extends Uge8.Ship {
    private int noOfPassengers;

    public CruiseLiner(String name, int length, int noOfPassengers) {
        super(name, length);
        this.noOfPassengers = noOfPassengers;
    }

    public int noOfPassengers() {
        return noOfPassengers;
    }

    public String toString() {
        return super.toString() + " cruise liner with " + noOfPassengers + " passenger capacity";
    }
}