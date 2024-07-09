public class _13_Enum {
    
    enum Types{
        SMALL,XLARGE,LARGE,MEDIUM
    }
    
    //PSVM
    public static void main(String[] args) {
        Types types = Types.LARGE;
        System.out.println(types.hashCode());//Nesnenin parmak izi.
        System.out.println(types.ordinal());
        String typeSmall = Types.SMALL.toString();
        System.out.println(typeSmall);

    }
}
