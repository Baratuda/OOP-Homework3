import java.util.*;

public class SortingExample{

    private static List<User> soringList(List<User> list, Comparator<User> comparator){
         Collections.sort(list,comparator);
         return list;
    }
    public static void main(String[] args) {
        
        List<User> users = new ArrayList<>();
        users.add(new User("Олег","Невзоров","+375445476534",25));
        users.add(new User("Aндрей","Панов","+375445476535",21));
        users.add(new User("Иван","Киреев","+375445476536",18));
        users.add(new User("Кристина","Фамина","+375445476537",19));
        users.add(new User("Марина","Баранова","+375445476538",34));
        Comparator<User> comparator = (a, b) -> a.compareTo(b);
        for(User i: soringList(users, comparator))
           System.out.println(i); 
    }
}