package Lab2_1;

public class TempConverter {
    public static void main(String[] args) {
        final double frh = Double.parseDouble(args[0]);
        final double celsius = (frh - 32) * 5 / 9;

        System.out.println(frh + " degrees Fahrenheit is " + celsius + " degrees Celsius.");
    }
}
