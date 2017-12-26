import java.util.Observable;

public class Updates extends Observe {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Weather has just been updated");
    }
}
