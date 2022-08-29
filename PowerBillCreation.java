public class PowerBillCreation {
    private int units;

    PowerBillCreation(int units) {
        this.units = units;
    }

    // calculation
    void calculateBill() {
        double bill = 0;
        if(units < 100) {
            bill = units * 1.20;
        }
        else if(units < 300) {
            bill = 100 * 1.20 + (units - 100) * 2;
        }
        else if(units > 300) {
            bill = 100 * 1.20 + 200 * 2 + (units - 300) * 3;
        }
        System.out.println("The power bill for " + units + " is $" + bill);
    }
}
