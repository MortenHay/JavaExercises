package Uge8.Exercise2;

public class Bottle extends Uge8.Exercise2.Vessel {
    private String content;

    public Bottle(int volume, String content) {
        super(volume);
        this.content = content;
    }

    public String content() {
        return content;
    }

    public String toString() {
        return "This bottle has a volume of 1 and contains " + content;
    }

}
