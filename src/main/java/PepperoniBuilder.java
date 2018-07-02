public class PepperoniBuilder extends PizzaBuilder {
    public void buildDough() {
        pizza.setDough("cienkie");
    }

    public void buildTopping() {
        pizza.setTopping("mozarell, peperoni");
    }

    public void buildSauce() {
        pizza.setSaouce("pomidorowy z ziołami");

    }
}
