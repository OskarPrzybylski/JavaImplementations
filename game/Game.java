import java.util.Random;



public class Game{

    private int numeral;
    private Random r;
    private int numberofchecking=0;

    public Game(int limit){
        r = new Random();
        randomize(limit);



    }   

    private void randomize(int n){
        numeral = r.nextInt(n+1);


    }

    public int check(int number){
        numberofchecking++;
        if(number==numeral){
            return 0;
        }
        if(number>numeral){
            return 1;
        }
        else{
            return -1;
        }

    }
    public int checking_number(){
        return numberofchecking;
    }

}