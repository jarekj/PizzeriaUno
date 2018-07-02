public abstract class PizzaBuilder {
    protected Pizza pizza;

    public PizzaBuilder(){
        pizza = new Pizza();
    }

    public abstract void buildDough();

    public abstract void buildTopping();

    public abstract void buildSauce();
}
