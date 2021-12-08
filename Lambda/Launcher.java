package Lambda;

/**
 * Application entry point.
 */
class App {
    private static int operate(int a, int b, InterfaceOperator op) {
        return op.operation(a, b);
    }

    static void calc(String numb1, String numb2) {
        int x = Integer.parseInt(numb1);
        int y = Integer.parseInt(numb2);

        InterfaceOperator add = (a, b) -> a + b;
        InterfaceOperator multiply = (a, b) -> a * b;

        int resultAdd = operate(x, y, add);
        int resultMultiply = operate(x, y, multiply);

        System.out.println("Result add: " + resultAdd);
        System.out.println("Result multiply: " + resultMultiply);
    }

    static void say(String message) {
        InterfaceMessage speaker = (s) -> System.out.println("Hello " + s);
        speaker.sayMessage(message);
    }
}

class Action {
    static final String CALC = "calc";
    static final String SAY = "say";
}

public class Launcher {
    public static void main(String[] args) {
        try {
            switch (args[0]) {
                case Action.CALC:
                    App.calc(args[1], args[2]);
                    break;
                case Action.SAY:
                    App.say(args[1]);
                    break;
                default:
                    System.out.println("Unknown action");
                    break;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
