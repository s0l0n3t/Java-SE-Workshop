
public class _14_Array {
    public static void main(String[] args) {
        int[] numbers = new int[5];//5 elemanlı bir dizi oluştur.

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        for(int i = 0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
        for (int i : numbers) {
            System.out.println(i);
        }
        System.out.println(numbers[numbers.length-1]);//Son dizi nesnesi.

        Integer[][] matrix = new Integer[3][3];//Fakat int olsaydı 0 olarak initialize edilecekti.
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        for(int k = 0;k < matrix.length;k++){ 
            for(int j = 0;j<matrix[0].length;j++){
                System.out.println(matrix[k][j]);
            }   

        }
        

    }
}
