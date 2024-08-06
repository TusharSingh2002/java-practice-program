package Constructor.src;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap <String, String> map = new HashMap<>();
        map.put("a", "Tushar");
        map.put("b", "Wasif");
        map.put("c", "Harsh");
        map.put("d", "Rohit");
        map.put("e", "Russell");

        System.out.println(map);
        for (String name : map.keySet()) {
            System.out.println(name);
        }
    }


}
