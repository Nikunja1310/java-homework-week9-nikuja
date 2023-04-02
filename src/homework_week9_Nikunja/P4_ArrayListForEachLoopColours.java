package homework_week9_Nikunja;

import java.util.ArrayList;

/**
 * 4. Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
public class P4_ArrayListForEachLoopColours {

    String a[] = new String[5];


    public void addElementsToTheList() {
        ArrayList<String> list = new ArrayList();
        list.add("Black");
        list.add("White");
        list.add("Red");
        list.add("Blue");
        list.add("Pink");
        list.add("Burgundy");

        System.out.println(list);

        for (Object a : list) {
            System.out.println(a);

        }

    }


        public static void main (String[]args){

            P4_ArrayListForEachLoopColours object = new P4_ArrayListForEachLoopColours();
            object.addElementsToTheList();

        }

}