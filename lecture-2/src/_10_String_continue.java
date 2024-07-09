public class _10_String_continue {

    public static void main(String[] args) {
        String strValue = "Merhaba Techcareer";
        String strValue1 = "Javase";
        String strValue2 = "Javaee";

        System.out.println(strValue.substring(0,3));//stringi parçalamaktadır.
        System.out.println(strValue.isEmpty());
        //1.Yol
        System.out.println(strValue+strValue1+strValue2);
        //2.Yol
        System.out.println(strValue1.concat(strValue2));
        //3.Yol
        StringBuffer buffer = new StringBuffer();
        buffer.append(strValue1).append(strValue2);
        String toBuffer = buffer.toString();
        System.out.println(toBuffer);
        //String to integer
        String number1 = "44";
        int toChange = Integer.valueOf(number1);
        System.out.println(toChange+16);
        //Integer to string
        int number2 = 50;
        String toChange2 = String.valueOf(number2);
        System.out.println(toChange2+20);

        //Casting
        float f1 = 12.32f;
        long l1 = 123124123123l;
        
        
    }
}
