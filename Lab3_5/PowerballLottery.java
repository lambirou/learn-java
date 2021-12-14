package Lab3_5;

public class PowerballLottery {
    public static void main(String[] args) {
        int nbl = 5;
        int redNumber = (int) (Math.random() * (1 - 42) + 42);
        String str = "[";

        for (int i = 1; i <= nbl; i++) {
            int nb = (int) (Math.random() * (1 - 49) + 49);
            str += (i < nbl) ? nb + ", " : nb + "]";
        }

        System.out.println("Red ball : [" + redNumber + "]");
        System.out.println("White Balls : " + str);
    }
}
