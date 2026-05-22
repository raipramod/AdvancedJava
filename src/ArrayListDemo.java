import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(2);
        myList.add(6);
        myList.add(9);

        System.out.println(myList.get(2));

        System.out.println("===================");
        System.out.println(myList);

    }
}
