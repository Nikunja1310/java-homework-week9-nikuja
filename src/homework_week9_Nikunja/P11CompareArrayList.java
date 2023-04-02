package homework_week9_Nikunja;

import java.util.ArrayList;

/**
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink")
 */
public class P11CompareArrayList {

    public void addElemetsInArray(){

        ArrayList<String > c1 = new ArrayList<>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("White");
        c2.add("Pink");

        if(c1.equals(c2)){
            System.out.println("The Two ArrayLists are equal.");
        }else{
            System.out.println("The Two ArrayLists are not equal.");
        }


    }

    public static void main(String[] args) {
        P11CompareArrayList object = new P11CompareArrayList();
        object.addElemetsInArray();
    }
}

