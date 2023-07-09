import java.util.*;

public class SortingExample {

    private static List<String> soringList(List<String> list, Comparator<String> comparator){
         Collections.sort(list, comparator);
         return list;
    }
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        Comparator<String> comparator = (a, b) -> a.compareTo(b);
       System.out.println(soringList(names, comparator)); 
    }
}