package arraylist;

import java.util.ArrayList;
import java.util.Date;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add("Hello");
        list.add(5);
        list.add(2727.66);
        list.add(2727.66);
        list.add(new Date());

        for (int i = 0; i <list.size() ; i++) {
            Object value = list.get(i);
            System.out.printf("Index=%d; Value=%s\n", i, value);
        }

    }
}
