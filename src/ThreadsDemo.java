class Apple extends Thread {
    public void run(){
        for(int i = 1; i<100; i++)
        System.out.println("hi");
    }
}

class Banana extends Thread{
    public void run(){
        for(int i = 1; i<100; i++)
        System.out.println("Hello");
    }
}


public class ThreadsDemo {
    public static void main(String[] args) {
        Apple a = new Apple();
        Banana ab = new Banana();

        System.out.println(a.getPriority());
        a.start();
        ab.start();
    }
}
