import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner studentScanner = new Scanner(System.in);
    
    System.out.print("Name> ");
    String varName = studentScanner.nextLine();
    System.out.print("Midterm> ");
    int varMid = studentScanner.nextInt();
    System.out.print("Final> ");
    int varFinal = studentScanner.nextInt();
    int result = (int)((varMid*0.4)+ (varFinal*0.6));
    Student stdInStudent = new Student(varName, varMid, varFinal);
    if(result >= 50){
        stdInStudent.result = true;
        System.out.println("Congratulations !");
    }
    else{
        System.out.println("You have to enter condition examination.");
        stdInStudent.result = false;
        System.out.print("Condition note> ");
        int varCon = studentScanner.nextInt();
        int varLast = (int)((varMid*0.4)+ (varCon*0.6));
        if(varLast >= 50){
            stdInStudent.result = true;
            System.out.println("Congratulations !");
        }
        else{
            System.out.println("See u next year.");
        }
    }

    }
}
