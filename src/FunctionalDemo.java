@FunctionalInterface
interface Fd{
    void playMusic();

}


public class FunctionalDemo {
    public static void main(String[] args) {
        Fd d = new Fd() {
            @Override
            public void playMusic() {
                System.out.println("I am functional interface");
            }

        };
        d.playMusic();

    }
}
