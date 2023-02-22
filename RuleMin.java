public class RuleMin extends Rule {
    private double minValue;

    public RuleMin(Aspect aspect, double minValue) {
        super(aspect);
        this.minValue = minValue;
    }

    public String getName() {
        return this.aspect.getName();
    };

    public boolean check() {
        return this.aspect.getValue() >= minValue;
    }
}
