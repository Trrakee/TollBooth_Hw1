public class ChevyTruck implements Truck {
    /**
     * variables
     */
    private int axles;
    private double weight;
    private static final String name = "Chevy_Truck";

    /**
     * @param axles
     * @param weight
     */
    ChevyTruck(int axles, double weight) {
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
     * displays information to the screen such as name of truck, axle count, and weight in Kilograms.
     */
    public void displayData() {
        System.out.printf("%-12s — Axles: %d     ||      Total Weight In Kilograms: %-10.2f", name, getAxles(), getWeight());
    }
}