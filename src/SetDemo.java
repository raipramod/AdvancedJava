import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> s = new TreeSet<>();
        s.add(22);
        s.add(4);
        s.add(9);

        for(int a : s) {
            System.out.println(a);
        }
    }
}
