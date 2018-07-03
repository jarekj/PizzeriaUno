import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Waiter waiter = new Waiter();
        boolean againPizza = true;

        while(againPizza) {

            System.out.println("Select pizza");
            System.out.println("0. Exit menu");
            System.out.println("1. Margharita Pizza");
            System.out.println("2. Pepperoni Pizza");
            System.out.println("3. Hawaiian Pizza");
            System.out.print("Enter your choice: ");
            int whichPizza = scanner.nextInt();

            switch (whichPizza) {
                case 0:
                    System.out.println("Exiting menu... bye");
                    againPizza = false;
                    break;
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
            if (whichPizza == 1 || whichPizza == 2 || whichPizza == 3) {
                System.out.print("You have chosen: ");
                System.out.print(waiter.getPizza());
            }
        }
    }
}
