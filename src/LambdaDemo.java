@FunctionalInterface
interface Fda {
    void playMusic();
}

public class LambdaDemo {
    public static void main(String[] args) {
        // Must be capital 'Fda'
        Fda d = () -> System.out.println("I am a lambda");
        d.playMusic();
    }
}