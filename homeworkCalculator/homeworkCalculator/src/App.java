import java.text.BreakIterator;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner appScanner = new Scanner(System.in);
    System.out.print("first number> ");
    int intVar1 = appScanner.nextInt();
    System.out.print("second number> ");
    int intVar2 = appScanner.nextInt();
    

    System.out.println("""
            1 - Sum
            2 - Minus
            3 - Multiplication
            4 - Divide
            """);
    System.out.print("> ");
    int selectVar = appScanner.nextInt();
    switch(selectVar){
        case 1:
        System.out.println(intVar1 +"+"+ intVar2 +" = " +(intVar1+intVar2) );
        break;
        case 2:
        System.out.println(intVar1 +"-"+ intVar2 +" = " +(intVar1-intVar2) );
        break;
        case 3:
        System.out.println(intVar1 +"*"+ intVar2 +" = " +(intVar1*intVar2) );
        break;
        case 4:
        System.out.println(intVar1 +"/"+ intVar2 +" = " +(intVar1/intVar2) );
        break;
    }



    }
}
