enum Status{
    Running, Failed, Pendin, Success;
}

public class EnumDemo {
    public static void main(String[] args) {
        // int i = 9;
        Status s = Status.Running;
        Status s1 = Status.Success;
        System.out.println(s);
        System.out.println(s1);

    }
}
