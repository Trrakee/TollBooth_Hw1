import java.util.ArrayList;
public interface TollBooth {
    ArrayList<Truck> trucksArrived = new ArrayList<>();

    /**
     * @param toll adds toll cost to totalToll
     */
    void addToll(double toll);

    /**
     * @return The total of all tolls
     */
    double getTotalToll();

    /**
     * @param truckName Calculates the toll due for a truck
     */
    void calculateToll(Truck truckName);

    /**
     * display a string
     */
    void displayData();
}