public abstract class Rule {
    protected Aspect aspect;

    public Rule(Aspect aspect) {
        this.aspect = aspect;
    }

    public String getName() {
        return aspect.getName();
    };

    public abstract boolean check();
}
