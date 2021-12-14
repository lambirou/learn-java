package Lab3_3;

public class NumberCount {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java NumberCount <number>");
            System.exit(1);
        }

        int numbEnd = Integer.parseInt(args[0]);

        if (numbEnd >= 1) {
            int count = 0;
            String str = "";

            for (int i = 1; i <= numbEnd; i++) {
                count += i;
                str += (i < numbEnd) ? i + " + " : numbEnd + " = " + count;
            }

            System.out.println(str);
        } else {
            System.out.println(numbEnd + " is not a positive number !");
        }
    }
}
