import java.util.ArrayList;


public class ShopTest {
    
    public static void main(String[] args) {

        final double USDPrice = GetCurrencyPrice.getCurrencyToRON("USD");
        final double EURPrice = GetCurrencyPrice.getCurrencyToRON("EUR");
        System.out.println("Exchange rates\n" + "[USD]: " + USDPrice + "\n[EUR]: " + EURPrice + '\n');
        ArrayList<String> videoCards = ParseTextFile.parseTextFile("PlaciVideo.txt");
        ArrayList<String> monitors = ParseTextFile.parseTextFile("Monitoare.txt");

        for(int i = 0; i < videoCards.size(); i += 2) {

            VideoCard vc = new VideoCard(EURPrice, Double.valueOf(videoCards.get(i + 1)));
            vc.computePerformance();
            vc.setLeiPrice(Double.valueOf(videoCards.get(i)));
            System.out.println(vc.toString());
        }

        for(int i = 0; i < monitors.size(); i += 2) {

            Monitor mon = new Monitor(USDPrice, Double.valueOf(videoCards.get(i + 1)));
            mon.computePerformance();
            mon.setLeiPrice(Double.valueOf(monitors.get(i)));
            System.out.println(mon.toString());
        }
    }
}
