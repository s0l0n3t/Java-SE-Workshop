

public class App {
    public static void main(String[] args) throws Exception {
        java.util.Date date = new java.util.Date();
        
        System.out.println("Time (GMT+3): "+date.getHours() + ":"+ date.getMinutes()+ ":"+ date.getSeconds());
        System.out.print(date.toString().substring(0,date.toString().length()-8));
        System.out.println(date.getYear()+1900);
    }
}
