interface Ab{
     void playSong();
}
class Bb implements Ab{

    @Override
    public void playSong() {
        System.out.println("Implementation");
    }
}

public class IntDemo {
    public static void main(String[] args) {
        Bb b = new Bb();
        b.playSong();

    }
}
