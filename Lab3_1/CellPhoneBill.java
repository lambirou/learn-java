package Lab3_1;

public class CellPhoneBill {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java CellPhoneBill <number of minutes>");
            System.exit(1);
        }

        int peakMinutesUsed = Integer.parseInt(args[0]);
        int nightWeekendMinutesUsed = Integer.parseInt(args[1]);

        double monthlyBill = 29.95;
        int peakMinutes = 400;
        int nightWeekendMinutes = 750;
        double additionalMinutesCost = 0.40;

        if (peakMinutesUsed > peakMinutes) {
            monthlyBill += (peakMinutesUsed - peakMinutes) * additionalMinutesCost;
        }

        if (args.length >= 3) {
            double additionalnightWeekendMinutesCost = Double.parseDouble(args[2]);

            if (nightWeekendMinutesUsed > nightWeekendMinutes) {
                monthlyBill += (nightWeekendMinutesUsed - nightWeekendMinutes) * additionalnightWeekendMinutesCost;
            }
        } else {
            if (nightWeekendMinutesUsed > nightWeekendMinutes) {
                monthlyBill += (nightWeekendMinutesUsed - nightWeekendMinutes) * additionalMinutesCost;
            }
        }

        System.out.println("The monthly bill is $" + monthlyBill);
    }
}