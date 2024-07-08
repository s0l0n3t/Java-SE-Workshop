import java.util.Scanner;
public class _07_Scanner {
    public static void main(String[] args) {
        // Kullanıcıdan veri alınması istenirse scanner kullanılır.
        Scanner cScanner = new Scanner(System.in);
        System.out.print("Type your name: ");
        String user = cScanner.nextLine();
        System.out.println(user);
        
        cScanner.close();
    }
}
