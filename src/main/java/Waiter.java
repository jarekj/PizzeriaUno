public class Waiter {
    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza getPizza() {
        pizzaBuilder.buildDough();
        pizzaBuilder.buildTopping();
        pizzaBuilder.buildSauce();
        return pizzaBuilder.getPizza();
    }

}
