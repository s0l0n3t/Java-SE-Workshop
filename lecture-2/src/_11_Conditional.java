public class _11_Conditional {
    public static void main(String[] args) {
        int age = 18;
        String strValue = (age>= 18) ? "Yaşınız 18 den büyüktür." : "Yaşınız 18 den küçüktür.";
        System.out.println(strValue);
        if(age >= 18){
            System.out.println("Yaşınız 18 den büyüktür.");
        }
        else{
            System.out.println("yaşınız 18 den küçüktür.");
        }
    }
}
