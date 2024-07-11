
import java.util.Scanner;

public class _15_method {
    public static void main(String[] args) throws Exception {
        
        
        //1- returnsuz parametresiz(void). Public heryerden erişim var.Fakat public için sınıf nesnesini oluşturmak zorundayız.
        //Private yapısı encapsulation'dan gelmektedir.
        _15_method method = new _15_method();
        System.out.println(method.returnluParametresiz());

    }
    
    public void returnsuzParametresiz(){
        System.out.println("returnsuz parametresiz");
    }

    //returnsuz parametreli
    public void returnsuzParametreli(String name, int data){
        System.out.println("returnsuzParametresiz:" + name + " "+ data);
    }
    public void returnsuzParametreli(String name){
        System.out.println("returnsuzparametresiz: "+ name);
    }//Overloading.

    public String returnluParametresiz(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Adınızı Giriniz: ");
        String name = sc.nextLine();
        return "returnsuzParametresiz"+ name;
    }//returnlu parametresiz
    public String returnluParametreli(String surnameString){
        Scanner sc = new Scanner(System.in);
        System.out.print("Adınızı Giriniz: ");
        String name = sc.nextLine();
        return "returnsuzParametresiz"+ name+ " "+surnameString;
    }


}
