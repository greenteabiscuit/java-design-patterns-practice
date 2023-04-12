// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press ⌥⏎ with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        PizzaStore nystore = new NYPizzaStore();
        PizzaStore chicagostore = new ChicagoPizzaStore();

        Pizza pizza = nystore.orderPizza("cheese");
        System.out.println(pizza.getName());

        pizza = chicagostore.orderPizza("cheese");
        System.out.println(pizza.getName());
    }
}