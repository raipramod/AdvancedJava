package newproject;

public class QuestionService {

    Questions [] question = new Questions[5];

    public QuestionService(){
        question[0] = new Questions(1,"Size of int","1","2","3","4","4");
        question[1] = new Questions(2,"Size of boolean", "1","2","3","4","2");
        question[2] = new Questions(3,"Size of double","1","2","3","4","3" );
        question[3] = new Questions(4,"Size of string","1","2","3","4","1" );
        question[4] = new Questions(5,"Size of char", "1","2","3","4","5");

    }

    public void playQuiz(){
        for(Questions q : question){

            System.out.println(q.toString());
        }
    }

}
