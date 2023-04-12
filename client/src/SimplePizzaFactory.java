public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            System.out.println("cheese");
        }

        return pizza;
    }
}
