package homework_week9_Nikunja;

import java.util.ArrayList;

/**
 * 7. Write a Java program to test if an array list is empty or not.
 */
public class P7ArrayIsEmpty {

    public void addElementsToTheList(){

        String a [] = new String [5];

        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("The");
        list.add("List");
        list.add("Is");
        list.add("not");
        list.add("Empty");


       if(list.isEmpty()){
            System.out.println("The list is empty");
        }else{
            System.out.println("The list is not empty");
        }
    }

    public static void main(String[] args) {
        P7ArrayIsEmpty object = new P7ArrayIsEmpty();
        object.addElementsToTheList();
    }



}
