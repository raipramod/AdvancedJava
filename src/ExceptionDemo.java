public class ExceptionDemo {
    public static void main(String[] args) {
        int i = 0;
        int j =0;

        try{
            j = 2/i;
        }
        catch (Exception e){
            System.out.println("Error" +e);
        }
        System.out.println(j);
    }
}
