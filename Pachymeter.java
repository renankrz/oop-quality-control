import java.util.Random;

public class Pachymeter extends Sensor {
    Random rand = new Random();

    @Override
    public double measure() {
        return rand.nextDouble();
    }
}
