public class Student {
    String name;
    int vizeNot;
    int finalNot;
    int bütünlemeNot;
    boolean result;

    Student(String name,int vizeNot,int finalNot){
        this.name = name;
        this.vizeNot = vizeNot;
        this.finalNot = finalNot;
        int result = (int)((this.vizeNot*0.4)+ (this.finalNot*0.6));
        if(result >= 50 ){
            this.result = true;
        }
        
    }

}
