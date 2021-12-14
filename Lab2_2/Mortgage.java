package Lab2_2;

public class Mortgage {
    public static void main(String[] args) {
        double principal = Double.parseDouble(args[0]);
        double interestRate = Double.parseDouble(args[1]);
        int years = Integer.parseInt(args[2]);

        // Montant total du prêt
        double total = principal + interestRate * principal / 100;

        // Paiement mensuel
        double monthly = total / (years * 12);

        System.out.println("The monthly payment is " + monthly);
        System.out.println("The total payment is " + total);
    }
}
