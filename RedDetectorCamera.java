import java.util.Random;

public class RedDetectorCamera extends Sensor {
    Random rand = new Random();

    @Override
    public double measure() {
        return rand.nextDouble();
    }
}
