package homework_week9_Nikunja;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterater
 */
public class P5_IterateArrayListIterator {

   // Map = interface   & map = variable
    //inside the  <> it is pair of key and Value k&V
    // Key can never be duplicate, whereas  variable can be duplicate
public void addElementsToTheList() {
    Map<Integer, String> map = new HashMap();
    map.put(1, "Nikunja");
    map.put(2, "Nirali");
    map.put(3, "Nikki");
    map.put(4, "Niks");

    for (Map.Entry<Integer, String> name : map.entrySet()) {
        System.out.println(name.getKey() + " " + name.getValue());
    }

    Iterator<Map.Entry<Integer, String>> nameList = map.entrySet().iterator();

    while (nameList.hasNext()) {
        System.out.println(nameList.next());
    }

}
    public static void main(String[] args) {

        P5_IterateArrayListIterator object = new P5_IterateArrayListIterator();
        object.addElementsToTheList();




    }


}
