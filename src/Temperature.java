
import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temperature = input.nextDouble();
        System.out.print("Enter temperature scale (C/F): ");
        String scale = input.next();
        double convertedTemperature;
        if (scale.equalsIgnoreCase("C")) {
            convertedTemperature = (temperature * 9 / 5) + 32;
            System.out.println(temperature + "°C is equal to " + convertedTemperature + "°F.");
        } else if (scale.equalsIgnoreCase("F")) {
            convertedTemperature = (temperature - 32) * 5 / 9;
            System.out.println(temperature + "°F is equal to " + convertedTemperature + "°C.");
        } else {
            System.out.println("Invalid temperature scale.");
        }
    }
}
