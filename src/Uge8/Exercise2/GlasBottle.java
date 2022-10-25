package Uge8.Exercise2;

public class GlasBottle extends Uge8.Exercise2.Bottle {
    private String color;

    public GlasBottle(int volume, String content, String color) {
        super(volume, content);
        this.color = color;
    }

    public String toString() {
        return "This " + color + " glas bottle has a volume of " + volume() + " and contains " + content();
    }

}
