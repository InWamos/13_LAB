public abstract class HardwareProduct {
    
    protected double currencyPrice;
    protected double score;
    protected double leiPrice;
    protected double performance;
    
    public HardwareProduct(double currencyPrice, double score) {
        this.currencyPrice = currencyPrice;
        this.score = score;
    }
    
    public void setLeiPrice(double price) {
        this.leiPrice = price * currencyPrice;
    }

    protected abstract void computePerformance();

    
    protected double computeRatioLeiPricePerformance() {
        
        return leiPrice / performance;
    };

    public String toString() {

        return "[PERFORMANCE]: " + performance + "[LEI PER PRICE]: " + computeRatioLeiPricePerformance() + '\n';

    };

}
