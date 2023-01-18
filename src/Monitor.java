public class Monitor extends HardwareProduct {

    private int maximumScore;
    private double currency;

    public Monitor(double currencyPrice, double score) {

        super(currencyPrice, score);
        this.maximumScore = 150;
        this.currency = currencyPrice;
    }

    public void computePerformance() {
        this.performance = score / maximumScore * 100;
        // price + score
    }
}
