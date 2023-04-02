package homework_week9_Nikunja;

import java.util.ArrayList;

/**
 * 6. Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class P6_RetrieveElementAtIndex {

    public void addElementsToTheList(){

        int a [] = new int[5];

        ArrayList<Integer> list = new ArrayList();
        list.add(000);
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
        }


    public static void main(String[] args) {

        P6_RetrieveElementAtIndex object = new P6_RetrieveElementAtIndex();
        object.addElementsToTheList();

    }
    }




