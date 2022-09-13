package collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {

        //key:value - mapa je interface koji se sastoji od ovih clanova
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "text1");
        map.put(5, "text5");
        map.put(62, "text62");

        map.remove(1);

        for (Map.Entry m: map.entrySet()) {
            System.out.println("Key: " + m.getKey() + " " + "Value: " + m.getValue());
        }




    }
}
