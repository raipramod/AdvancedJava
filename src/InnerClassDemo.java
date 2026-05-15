class Aa {
    public void playMusic(){
        System.out.println("In Aa");
    }
}
public class InnerClassDemo {
    public static void main(String[] args) {

        Aa a = new Aa(){
            public void playMusic(){
                System.out.println("In inner class"); // implement inner anonymouse class
            }
        };
        a.playMusic();

    }
}
