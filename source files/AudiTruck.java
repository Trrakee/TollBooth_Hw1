import java.lang.reflect.Parameter;

public class AudiTruck implements Truck {
    /**
     * variables.
     */
    private int axles;
    private double weight;
    private static final String name = "Audi_Truck";
    /**
     * @param axles
     * @param weight
     */
    AudiTruck(int axles, double weight) {
        this.axles = axles;
        this.weight = weight;
    }

    /**
     * @return axles
     */
    @Override
    public int getAxles() {
        return axles;
    }

    /**
     * @return weight
     */
    @Override
    public double getWeight() {
        return weight;
    }

    /**
     * returns common data such as weight,the name of the truck, and the weight.
     */
    public void displayData() {
        System.out.printf("%-12s — Axles: %d     ||      Total Weight In Kilograms: %-10.2f", name, getAxles(), getWeight());
    }
}