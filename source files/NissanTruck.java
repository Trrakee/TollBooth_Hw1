public class NissanTruck implements Truck {
    /**
     * Variables
     */
    private int axles;
    private double weight;
    private static final String name = "Nissan_Truck";

    /**
     * @param axles
     * @param weight
     */
    NissanTruck(int axles, double weight) {
        this.axles = axles;
        this.weight = weight;
    }

    /**
     * @return axle
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
     * @return displays information to the screen such as name of truck, axle count, and weight in Kilograms.
     */
    public void displayData() {
        System.out.printf("%-12s — Axles: %d     ||      Total Weight In Kilograms: %-10.2f", name, getAxles(), getWeight());
    }
}