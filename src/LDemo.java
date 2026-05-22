@FunctionalInterface
interface An{
    int addNum(int i, int j);
}

public class LDemo {
    public static void main(String[] args) {

        An a = (int i, int j) -> i+j;


        int result = a.addNum(4,5);
        System.out.println(result);
    }
}
