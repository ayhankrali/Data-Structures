package generics;

import java.util.ArrayList;

public class GenericsArray {
    public static ArrayList<Integer> union(ArrayList<Integer>

                                                   firstList, ArrayList<Integer> secondList) {

        ArrayList<Integer> union = new ArrayList<Integer>(firstList);



        for (Integer item : secondList) {

            if (!union.contains(item)) {

                union.add(item);

            }

        }

        return union;

    }



    public static ArrayList<Integer> intersect(ArrayList<Integer>

                                                       firstList, ArrayList<Integer> secondList) {

        ArrayList<Integer> intersect = new ArrayList<Integer>();

        for (Integer item : firstList) {

            if (!secondList.contains(item)) {

                intersect.add(item);

            }

        }

        return intersect;

    }



    public static void printList(ArrayList<Integer> list) {

        System.out.print("{ ");

        for (Integer item : list) {

            System.out.print(item);

            System.out.print(" ");

        }

        System.out.println("}");

    }


}
