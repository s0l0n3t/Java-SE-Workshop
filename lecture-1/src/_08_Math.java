import java.util.Random;

public class _08_Math {
    public static void main(String[] args) {
        System.out.println(Math.PI);        
        System.out.println(Math.min(2, 900));// 2-900 arasındaki minimum
        System.out.println(Math.E);
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.abs(-44));
        System.out.println(Math.floor(2.3));
        System.out.println(Math.round(2.34));// Standart yuvarlama metodu
        System.out.println(Math.ceil(3.2));//Ne olursa olsun bir üst tam sayıya yuvarlar.
        System.out.println(Math.random()*10);//0-10 aralığında bir double rastgele değer verecektir.
        

        Random intRandom = new Random();
        int intVar = intRandom.nextInt(10);//0-10 aralığında bir tam sayı değişkeni çıktısı elde edilir.
        System.out.println(intVar);
        
    }
}
