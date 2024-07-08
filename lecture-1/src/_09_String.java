public class _09_String {
    public static void main(String[] args) {
        String strVar = " Java ÖğReniyorum JaVa ";
        System.out.println(strVar);
        System.out.println(strVar.length());
        System.out.println(strVar.trim().length());//Başında ve sonundaki boşlukları aldı.
        System.out.println(strVar.toLowerCase());
        System.out.println(strVar.toUpperCase()); 
        System.out.println(strVar.concat("-son")); //Değişkenin sonuna ekle.
        System.out.println(strVar.startsWith("Java"));
        System.out.println(strVar.endsWith(" "));
        System.out.println(strVar.contains(" ")); //İçeriyor mu ? Sorusunun cevabı.
        System.out.println(strVar.indexOf("Java"));//Baştan başlamaktadır.
        System.out.println(strVar.lastIndexOf("Java"));//Sondan aramaya başlamaktadır.
    }
}
