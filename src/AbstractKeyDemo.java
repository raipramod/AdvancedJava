abstract class A {
    public void playMusic(){
        System.out.println("hi");
    }


    public abstract void runMe();
}

class B extends A{

    @Override
    public void runMe() {
        System.out.println("I am an abstract");
    }
}



public class AbstractKeyDemo {
    public static void main(String[] args) {

        B b = new B();
        b.runMe();
        b.playMusic();
        
    }
}
