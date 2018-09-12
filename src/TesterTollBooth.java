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
                Truck nissan = new NissanTruck(6, 18000); // 5 axles and 16000 kilograms
                Truck daewoo = new DaewooTruck(3, 11500); // 8 axles and 12000 kilograms
                Truck audi = new AudiTruck(2, 10000); // 2 axles and 8000 kilograms
                Truck honda = new HondaTruck(4, 11000); // 2 axles and 8000 kilograms
                Truck chevy = new ChevyTruck(9, 22000); // 2 axles and 8000 kilograms
                booth.calculateToll(ford);
                booth.calculateToll(nissan);
                booth.calculateToll(daewoo);
                booth.calculateToll(audi);
                booth.calculateToll(honda);
                booth.calculateToll(chevy);
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