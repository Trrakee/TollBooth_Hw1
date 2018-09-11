public class IllinoisToolbooth implements TollBooth {
    private double totalToll;
     @Override
    public void addToll(double toll) {
        this.totalToll += toll;
    }

    @Override
    public double getTotalToll() {
        return totalToll;
    }

    @Override
    public void calculateToll(Truck truckName) {
        int axleCount = truckName.getAxles();
        String space = "";
        double weightCount = truckName.getWeight();
        double toll = 5 * axleCount;
        double ton = weightCount * .001;
        double tonTotal = 0;
        for (int i = 0; i < ton; i++)
            tonTotal += 10;
        trucksArrived.add(truckName);
        toll = toll + tonTotal;
        addToll(toll);
        truckName.displayData();
        System.out.printf("%15s — Toll Due: $%.2f\n",space, toll);
    }
    @Override
    public void displayData() {
         System.out.printf("\nTotals since the last collection - Receipts: $%.2f   ||  Trucks: %d\n" , getTotalToll(),trucksArrived.size());

    }
}
