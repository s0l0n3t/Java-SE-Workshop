import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        while(true){
        Scanner driverScanner = new Scanner(System.in);
       
        System.out.print("Name: ");
        String nameDriver = driverScanner.nextLine();
        System.out.print("Speed: ");
        int speedDriver = driverScanner.nextInt();
        car stdInDriver = new car(nameDriver, speedDriver);
        if(stdInDriver.speed >= 90 && stdInDriver.speed <= 100){
            System.out.println();
            System.out.println("Penalty 1000 TRY");
            stdInDriver.penalty = 1000;
        }
        else if(stdInDriver.speed > 100 && stdInDriver.speed <= 110){
            System.out.println("Penalty 2000 TRY");
            stdInDriver.penalty = 2000;
        }
        else if(stdInDriver.speed > 110 && stdInDriver.speed <= 130){
            System.out.println("Penalty 3000 TRY");
            stdInDriver.penalty = 3000;
        }
        else if(stdInDriver.speed > 131 ){
            System.out.println("Permanently penalty 10000 TRY!");
            System.out.println("Your driving licence usurpated so you can't drive anymore");
            stdInDriver.penalty = 10000;
            stdInDriver.licence =false;
        }
        else{
            
        }
        System.out.println();
        stdInDriver.printDriver();
    }}
}
