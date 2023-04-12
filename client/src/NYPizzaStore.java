public class NYPizzaStore extends PizzaStore{

    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NyStyleCheesePizza();
        }
        return null;
    }
}
