package collections.inheritance.interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class IntefacesDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        Queue<String> list3 = new LinkedList<>();
        List<String> list2 = new LinkedList<>();
        list2.add("aved");
        list2.add("toto");
        list2.add("ahha");
        System.out.println(list2.get(1));
        list2.remove(2);

        System.out.println(list2);


    }
}
