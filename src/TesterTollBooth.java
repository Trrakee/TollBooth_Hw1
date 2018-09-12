import java.util.*;
public class TesterTollBooth {
    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            Scanner userInput = new Scanner(System.in);
            System.out.println("Press 1 to run the 'Test Class'.\n" +
                    "Press 2 to Exit.");
            int input = userInput.nextInt();
            if (input == 1) {
                Scanner rerun = new Scanner(System.in);
                TollBooth booth = new IllinoisToolbooth();
                double weightEntry = Math.random();
                Truck ford = new FordTruck(5, 12000); // 5 axles and 12000 kilograms
                Truck ford1 = new NissanTruck(6, 18000); // 5 axles and 16000 kilograms
                Truck ford3 = new DaewooTruck(3, 11500); // 8 axles and 12000 kilograms
                Truck ford6 = new AudiTruck(2, 10000); // 2 axles and 8000 kilograms
                Truck ford7 = new HondaTruck(4, 11000); // 2 axles and 8000 kilograms
                Truck ford8 = new ChevyTruck(9, 22000); // 2 axles and 8000 kilograms
                booth.calculateToll(ford);
                booth.calculateToll(ford1);
                booth.calculateToll(ford3);
                booth.calculateToll(ford6);
                booth.calculateToll(ford7);
                booth.calculateToll(ford8);
                booth.displayData();
                System.out.print("------------------------------------------------------------------------------");
                System.out.println("\nWould You Like To Run The Program Again?" +
                        "\nYes or No.");
                String answer = rerun.next();
                if (answer.equalsIgnoreCase("yes")) {
                    System.out.print("------------------------------------------------------------------------------");
                    running = true;
                    System.out.println();
                } else {
                    running = false;
                    System.out.println("Goodbye, Thank You For Running My Program!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
                }

            } else if (input == 2) {
                System.out.println("Goodbye.");
                running = false;
                System.exit(191);
            } else {
                System.out.println("That is not a valid choice.");
                running = true;
            }
        }
    }
}
