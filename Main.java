import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pachymeter pachymeter = new Pachymeter();
        RedDetectorCamera redDetectorCamera = new RedDetectorCamera();

        Aspect width = new Aspect("WIDTH", pachymeter);
        Aspect length = new Aspect("LENGTH", pachymeter);
        Aspect color = new Aspect("COLOR", redDetectorCamera);

        Rule widthRule = new RuleMin(width, 0.4);
        Rule lengthRule = new RuleMin(length, 0.4);
        Rule colorRule = new RuleMin(color, 0.7);
        
        List<Rule> pepperRules = new ArrayList<Rule>();
        pepperRules.add(widthRule);
        pepperRules.add(lengthRule);
        pepperRules.add(colorRule);

        PepperController pepperController = new PepperController(pepperRules);
        pepperController.checkRules();
    }
}
