import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    Scanner vScanner = new Scanner(System.in);
    System.out.println("Temperatur as Celsius> ");
    float temp = vScanner.nextFloat();
    float celToFahrenheit = (temp*(9/5))+ 32;
    System.out.println("Fahrenheit: "+ celToFahrenheit);
    }
}
