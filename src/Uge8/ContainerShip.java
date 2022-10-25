package Uge8;

public class ContainerShip extends Uge8.Ship {
    private int teu;

    public ContainerShip(String name, int length, int teu) {
        super(name, length);
        this.teu = teu;
    }

    public int teu() {
        return teu;
    }

    public String toString() {
        return super.toString() + " container carrier with " + teu + " TEU";
    }
}