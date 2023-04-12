import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<String>();

    void prepare() {
        System.out.println("preparing...");
    }

    void bake() {
        System.out.println("baking...");
    }

    void cut() {
        System.out.println("cutting...");
    }

    void box() {
        System.out.println("placing in box");
    }

    public String getName() {
        return name;
    }
}
