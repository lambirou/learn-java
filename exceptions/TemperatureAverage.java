package exceptions;

import java.util.ArrayList;
import java.util.List;

public class TemperatureAverage {
    public static void main(String[] args) {
        try {
            List<Integer> temperatures = new ArrayList<Integer>();

            for (String arg : args) {
                temperatures.add(Integer.parseInt(arg));
            }

            Integer average = SimpleMaths.calculateAverage(temperatures);

            System.out.println("The average temperature is " + average + "°C.");
        } catch (NumberFormatException e) {
            System.out.println("Erreur de format");
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur de valeur");
        } catch (Exception e) {
            System.out.println("Erreur inconnue");
        }
    }
}
