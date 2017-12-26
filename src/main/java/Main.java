import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Weather weather = new Weather("https://api.darksky.net/forecast/1f1c351099874a0b925a89f198c779dc/49.8397,24.0297?units=si&lang=uk&exclude=daily,minutely,hourly,alerts,flags");
        Updates updates = new Updates();
        weather.addObserver(updates);
        weather.getWeather();
    }
}
