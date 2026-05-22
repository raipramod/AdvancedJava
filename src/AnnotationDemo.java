abstract class abc{
    public void playMusic(){
        System.out.println("I am singer");
    }

    //public abstract void playMusics();

  /*  public void addMe(){

    }*/
}

class cda extends abc{

    @Override
    public void playMusic(){
        System.out.println("I am done");
    }
}


public class AnnotationDemo {
    public static void main(String[] args) {

        cda c = new cda();
        c.playMusic();

    }
}
