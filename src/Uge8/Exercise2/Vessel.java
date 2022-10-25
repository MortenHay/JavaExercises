package Uge8.Exercise2;

public class Vessel {
    private int volume;

    public Vessel(int volume) {
        this.volume = volume;
    }

    public int volume() {
        return volume;
    }

    public String toString() {
        return "This vessel has a volume of " + volume;
    }
}
