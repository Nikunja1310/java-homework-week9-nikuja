package homework_week9_Nikunja;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 9. Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class P9HashMapObjectIterateForEachLoop {

    public void addHasMapToList(){
    Map<String, Integer> people = new HashMap();
    people.put("Australia" , 55 );
    people.put("UK" , 90 );
    people.put("India" , 2600  );
    people.put("Paris" , 50 );

        for ( Map.Entry<String, Integer>  country: people.entrySet()  )  {
            System.out.println(country.getKey() + " " + country.getValue());
       }

        Iterator<Map.Entry<String,Integer>> countrylist = people.entrySet().iterator();
        while(countrylist.hasNext()){
            System.out.println(countrylist.next());
        }
}

    public static void main(String[] args) {
    P9HashMapObjectIterateForEachLoop object = new P9HashMapObjectIterateForEachLoop();
    object.addHasMapToList();
    }
}