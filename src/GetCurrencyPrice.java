import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class GetCurrencyPrice {
    

    public static double getPriceFromResponce(String responce) {

        responce = responce.trim();
        final String[] arr = responce.split(":");

        return Double.valueOf(arr[arr.length - 1].replace("}", ""));
    }

    public static double getCurrencyToRON(String currencyCode) {
        
        try {
            String apikey = "api key goes here";
            String url = "https://api.currencyapi.com/v3/latest?apikey=" + apikey + "&currencies=RON&base_currency=" + currencyCode;
            URL urlForGetRequest = new URL(url);
            String readLine = null;
            HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection();
            conection.setRequestMethod("GET");
            int responseCode = conection.getResponseCode();
        
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(conection.getInputStream()));
                StringBuffer response = new StringBuffer();

                while ((readLine = in.readLine()) != null) {
                    response.append(readLine);
                }
                in.close();

                return getPriceFromResponce(response.toString());

            } else {
                throw new Exception("Error in API Call");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return 0.0;
        }
    }
}
