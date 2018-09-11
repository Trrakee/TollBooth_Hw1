import java.util.ArrayList;
public interface TollBooth {
    ArrayList<Truck> trucksArrived = new ArrayList<>();

    void addToll(double toll);

    double getTotalToll();

    void calculateToll(Truck truckName);

    void displayData();
}
