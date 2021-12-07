public class Demo {

    public static void main(String[] args) {
        double rate = 1.5;
        double price = 0.0;

        if (rate >= 0.0 && rate < 1.0) {
            price = 20 * rate;
        } else if (rate >= 1.0 && rate < 2.0) {
            price = 15 * rate;
        } else if (rate >= 2.0) {
            price = 10 * rate;
        }

        System.out.println(price);
    }

} // end of class 6TFC7YGV
