@FunctionalInterface
interface bn{
    int subNum(int a, int b);
}

public class LDdemo {
    public static void main(String[] args) {

        bn n = (int a, int b)->a-b;
        int result = n.subNum(4,3);
        System.out.println(result);
    }
}
