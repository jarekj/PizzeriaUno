import org.junit.Assert;
import org.junit.Test;

public class WaiterTest {
    @Test
    public void givenWaiterWhenSetMargharitaPizzaShouldReturnMargharitaPizza() {
        Waiter waiter = new Waiter();

        waiter.setPizzaBuilder(new MargheritaBuilder());
        Pizza newPizza = waiter.getPizza();

        String actualDough = newPizza.getDough();
        String actualSaouce = newPizza.getSaouce();
        String actualTopping = newPizza.getTopping();
        String expectedDough = "grube";
        String expectedSaouce = "pomidorowy";
        String expectedTopping = "mozarella";

        Assert.assertEquals(expectedDough, actualDough);
        Assert.assertEquals(expectedSaouce, actualSaouce);
        Assert.assertEquals(expectedTopping, actualTopping);
    }
    @Test
    public void givenWaiterWhenSetPepperoniPizzaShouldReturnPepperoniPizza() {
        Waiter waiter = new Waiter();

        waiter.setPizzaBuilder(new PepperoniBuilder());
        Pizza newPizza = waiter.getPizza();

        String actualDough = newPizza.getDough();
        String actualSaouce = newPizza.getSaouce();
        String actualTopping = newPizza.getTopping();
        String expectedDough = "cienkie";
        String expectedSaouce = "pomidorowy z ziołami";
        String expectedTopping = "mozarell, peperoni";
        Assert.assertEquals(expectedDough, actualDough);
        Assert.assertEquals(expectedSaouce, actualSaouce);
        Assert.assertEquals(expectedTopping, actualTopping);
    }
}
