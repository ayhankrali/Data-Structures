package generics;

import java.util.ArrayList;

import static generics.GenericsArray.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> firstList = new ArrayList<Integer>();

        firstList.add(1);

        firstList.add(2);

        firstList.add(3);

        firstList.add(4);

        firstList.add(5);

        System.out.print("firstList = ");

        printList(firstList);



        ArrayList<Integer> secondList = new ArrayList<Integer>();

        secondList.add(2);

        secondList.add(4);

        secondList.add(6);

        System.out.print("secondList = ");

        printList(secondList);



        ArrayList<Integer> unionList = union(firstList, secondList);

        System.out.print("union = ");

        printList(unionList);



        ArrayList<Integer> intersectList =

                intersect(firstList, secondList);

        System.out.print("intersect = ");

        printList(intersectList);
    }
}
