import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Select pizza");
        System.out.println("1. Margharita Pizza");
        System.out.println("2. Pepperoni Pizza");
        System.out.println("3. Hawaiian Pizza");
        System.out.print("Enter your choice: ");
        int whichPizza = scanner.nextInt();
        Waiter waiter = new Waiter();

        switch (whichPizza) {
            case 1:
                waiter.setPizzaBuilder(new MargheritaBuilder());
                break;

            case 2:
                waiter.setPizzaBuilder(new PepperoniBuilder());
                break;
            case 3:
                waiter.setPizzaBuilder(new HawaiianBuilder());
                break;
            default:
                System.out.println("Pizza not selected");
        }
        System.out.println(waiter.getPizza());
    }
}
