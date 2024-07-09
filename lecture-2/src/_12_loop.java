public class _12_loop {
public static void main(String[] args) {
    
        System.out.println(1+2+3+4+5+6+7+8);
        int forSum = 0;
        for(int i =0; i<= 10; i++){
            forSum+= i;
        }
        System.out.println(forSum);
        int d = 0;
        do{
            d++;
            d+=d;
        }
        while(d <= 10);{
            System.out.println(d);
        }
        



}   
}
