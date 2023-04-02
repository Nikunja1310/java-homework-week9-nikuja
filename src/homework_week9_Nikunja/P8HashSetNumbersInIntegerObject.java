package homework_week9_Nikunja;

import java.util.HashSet;

/**
 * 8. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */
public class P8HashSetNumbersInIntegerObject {

    public void storeNumber(){

        HashSet<Integer> set = new HashSet<>();
        set.add(4);
        set.add(7);
        set.add(8);

        for (int i = 0 ; i > 0 || i < 11;){
            if(true){
                System.out.println(set);
            }else{
                System.out.println("Numbers entered are not in range of 1 to 10");
            }
            break;

        }
    }

    public static void main(String[] args) {
        P8HashSetNumbersInIntegerObject object = new P8HashSetNumbersInIntegerObject();
        object.storeNumber();
    }
}
