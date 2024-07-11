import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class _17_Datalist {
public static void main(String[] args) {
    
    List<String> list = new ArrayList<>();
    list.add("Apple");
    list.add("Banana");
    System.out.println(list);
    System.out.println(list.size());
    System.out.println(list.get(0));
    System.out.println(list.get(list.size()-1));

    list.remove(0);
    System.out.println(list.get(0));
    list.set(0, "Orange");//Banana -> Orange
    System.out.println(list.get(0));
    System.out.println(list.size());
    System.out.println(list.contains("Banana"));
    list.add("Grape");
    list.add("Banana");
    list.add("Apple");
    System.out.println(list.indexOf("Apple"));//Soldan arama
    System.out.println(list.lastIndexOf("Apple"));//Sağdan arama
    Collections.shuffle(list);
    //Linked list eklenen sırada gelmesi için kullanılır
    //En çok array list kullanılmaktadır.
    Set<Integer>hashSetl = new HashSet<>();// tekrar eden verilerden 1 tane gösterir.
    hashSetl.add(1);
    hashSetl.add(2);
    hashSetl.add(3);
    list.forEach(System.out::println);//Java 8 ile gelmiş  bir özelliktir.
    Map<String,String> hashMap = new HashMap<>();
    Map<Integer,String> hashInt = new HashMap<>();
    hashMap.put("1", "Apple");
    hashMap.put("2", "Banana");
    hashMap.put("3", "Grape");
    hashInt.put(1, "demoData");
    hashInt.put(2, "demoData");
}
}
