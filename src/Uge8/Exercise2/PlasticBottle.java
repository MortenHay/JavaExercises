package Uge8.Exercise2;

public class PlasticBottle extends Uge8.Exercise2.Bottle {
    private String material;

    public PlasticBottle(int volume, String content, String material) {
        super(volume, content);
        this.material = (material == "PET") ? "PET" : "OTHER";

    }

    public String toString() {
        return "This " + material + " bottle has a volume of " + volume() + " and contains " + content();
    }
}
