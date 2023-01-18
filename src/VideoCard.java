public class VideoCard extends HardwareProduct {
    
    private int maximumScore;
    private double currency;

    public VideoCard(double currencyPrice, double score) {

        super(currencyPrice, score);
        this.maximumScore = 100;
        this.currency = currencyPrice;
    }

    public void computePerformance() {
        this.performance = score / maximumScore * 100;
        // price + score
    }
}
