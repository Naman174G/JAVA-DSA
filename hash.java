import java.util.HashMap;

public class hash{
  public static void main(String[] args) {
    HashMap<Integer, String> map = new HashMap<>();

    map.put(1,"Naman");
    map.put(2,"Ravi");

    System.out.println(map);

    String student = map.get(2);
    System.out.println(student);

    String zero = map.get(6);
    System.out.println(zero);

    System.out.println(map.containsKey(1));

    map.keySet();
    }

}