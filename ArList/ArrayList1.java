package ArList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

//Given an ArrayList of Strings and two indices, write a program to swap the two Strings at the given indices.
//Write a program to remove the last object in the ArrayList.

public class ArrayList1 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("ajay", "binoy", "cindhiya", "divya", "eric", "feroz"));

        System.out.println(list);

        Collections.swap(list, 1, 2);

        System.out.println(list);
        list.remove(5);
        System.out.println(list);
            }
        }


