import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Observable;

public class Weather extends Observable {
    private String url;

    public Weather(String url) throws IOException {
        this.url = url;
    }

    public void getWeather() throws IOException {
        URL oracle = new URL(url);
        BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));
        String s = in.readLine();
        in.close();
        int tempindex = s.indexOf("temperature") + 13;
        int startSummaryIndex = s.indexOf("summary") + 10;
        int endSummaryIndex = s.indexOf("icon") - 3;
        String temperatureString = s.substring(tempindex, tempindex + 4);
        String summaryString = s.substring(startSummaryIndex, endSummaryIndex);
        double temperature = Double.valueOf(temperatureString);
        setChanged();
        notifyObservers();
        System.out.println(summaryString);
        System.out.println(temperature);
        System.out.println(temperature - 273.15);

    }
}
