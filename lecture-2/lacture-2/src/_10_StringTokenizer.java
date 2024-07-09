import java.util.StringTokenizer;

public class _10_StringTokenizer {
    public static void main(String[] args) {
        String str1 = "javase ";
        String str2 = "javaee ";
        String str3 = "javame ";

        //Birleştir
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str1).append(str2).append(str3);
        String toBuffer = stringBuilder.toString();
        System.out.println(toBuffer);


        //Parçala
        StringTokenizer tokenizer = new StringTokenizer(toBuffer," ");//delimeter yapısı eklenmezse neye göre parçalanacağı bilinmez.
        while(tokenizer.hasMoreTokens()){
            System.out.println(tokenizer.nextToken());
        }

    }
}
