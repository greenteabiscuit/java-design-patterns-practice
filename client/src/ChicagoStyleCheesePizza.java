public class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza() {
        name = "Chicago cheese";
        dough = "thin crust";
        sauce = "mar";
        toppings.add("grated cheese");
    }

    @Override
    void cut() {
        System.out.println("cutting in chicago style");
    }
}
