public class Step {
    private boolean isIncrease;
    private double amount;

    public Step(boolean isIncrease, double amount) {
        this.isIncrease = isIncrease;
        this.amount = amount;
    }

    public boolean isIncrease() {
        return isIncrease;
    }

    public double getAmount() {
        return amount;
    }
}
