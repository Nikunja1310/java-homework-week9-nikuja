package homework_week9_Nikunja;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 3. Write a Java program to reverse an array of integer values
 */
public class P3_ReverseArray {

    ArrayList<Integer> list = new ArrayList();

    public void addElementsToTheList(){
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
    }

public void elementsReversed(){
    Collections.reverse(list);
}

    public static void main(String[] args) {

        P3_ReverseArray object = new P3_ReverseArray();

        object.addElementsToTheList();
        System.out.println("Original number : " + object.list);

        object.elementsReversed();
        System.out.println("Reversed List : " + object.list);


    }



}
