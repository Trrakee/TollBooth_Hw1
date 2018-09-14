public class IllinoisToolbooth implements TollBooth {
    private double totalToll;

    /**
     * @param toll adds the toll of the current truck to the entire total
     */
    @Override
    public void addToll(double toll) {
        this.totalToll += toll;
    }

    /**
     * @return the total of all trucks
     */
    @Override
    public double getTotalToll() {
        return totalToll;
    }

    /**
     * @param truckName
     * int:axleCount, String:space, double:toll,ton,tonTotal
     */
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
        System.out.printf("%15s - Toll Due: $%.2f\n", space, toll);
    }

    /**
     * displays information to the screen such as name of truck, axle count, and weight in Kilograms.
     */
    @Override
    public void displayData() {
        System.out.printf("\n ------------------------------------" +
                "\n| Welcome to the Illinois Tollbooth: |" +
                "\n ------------------------------------" +
                "\n*** Collecting Receipts *** \nTotals since the last collection - Receipts: $%.2f   ||  Trucks: %d\n" +
                "-----------------------------------------------------------------------\n", getTotalToll(), trucksArrived.size());
    }

    @Override
    public void truckReset() {
        trucksArrived.clear();
    }
}