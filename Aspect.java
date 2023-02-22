public class Aspect {
    private String name;
    private Sensor sensor;

    public Aspect(String name, Sensor sensor) {
        this.name = name;
        this.sensor = sensor;
    }

    public String getName() {
        return name;
    };

    public double getValue() {
        return sensor.measure();
    };
}
