public class _05_WrapperType {


    public static void main(String[] args) {
        Byte data = 127;
        Integer i = 2;
        Float f = 12.2f;

        //Boxing
        int primitiveType = 44;
        Integer boxedType = primitiveType;
        System.out.println("wrapper: "+boxedType);
        // wrapper null değer alabilir.
        // null create(instance) zero
        // null: Çocuk dünyaya gelmesi. Hiç yokken dünyaya gelme olayıdır.
        // new: Vefat
        // zero: Dünyada ancak bir değeri yok.




        //Unboxing
        Integer boxedInteger1 = 23;
        System.out.println(boxedInteger1);
        int primitiveType2 = boxedInteger1;
        System.out.println(primitiveType2);



        




    }

}
