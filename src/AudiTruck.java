public class AudiTruck implements Truck {
    private int axles;
    private double weight;
    private static final String name = "Audi_Truck";

    AudiTruck(int axles, double weight) {
        this.axles = axles;
        this.weight = weight;
    }
    @Override
    public int getAxles() {
        return axles;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    public void displayData() {
        System.out.printf("%-12s — Axles: %d     ||      Total Weight In Kilograms: %-10.2f", name, getAxles(), getWeight());

    }
}