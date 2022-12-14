package Uge8;

public class Tanker extends Uge8.Ship {
    private int barrels;

    public Tanker(String name, int length, int barrels) {
        super(name, length);
        this.barrels = barrels;
    }

    public String toString() {
        return super.toString() + " tanker with " + barrels + " barrels capacity";
    }
}