public class _04_PrimitiveType {

    public static void main(String[] args) {
        // primitive türlerlden kaynaklı java %100 oop değildir.
        // Primitive türler stack memory, hafızası belli olan yapılar için kullanılmaktadır.Heap memory, hafızası belli olmayan yapılardır.
        // Tam sayı: byte < short < int < long
        // Virgüllü: float < double
        // Boolean: true / false
        // Char: '\u4512' '*'
        // 8 tane primitive türler bulunmaktadır.
        // primitive türde null değer verilemez.


        byte b = 127; //-128 < byte < 127
        short c = 32767;
        double d = 3.12;
        float f = 3.40f;
        Boolean e = true;
        char g = 'A';
        
        System.out.println(b + " "+ c+ " Double: "+ f);
    }

}
