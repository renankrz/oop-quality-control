import java.util.List;

public abstract class ProductController {
    private List<Rule> rules;

    public ProductController(List<Rule> rules) {
        this.rules = rules;
    }

    public boolean checkRules() {
        boolean allRulesOk = true;

        for (Rule rule : rules) {
            boolean ruleOk = rule.check();
            System.out.println(rule.getName() + " rule met? " + ruleOk);

            if (!ruleOk) {
                allRulesOk = false;
            }
        }

        return allRulesOk;
    }
}
