import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class GameInterface{

    private BufferedReader bufferRead;
    private int limit;
    private String limits;
    private Game game;

    public GameInterface(){
        System.out.println("Welcome in NumeralGame by Oskar!");
        System.out.println("Your task is to say what numeral randomized computer");
    
        try{
            bufferRead = new BufferedReader(new InputStreamReader(System.in));
        }
        catch(Exception e){
            System.out.println(e);
        }
    
        set_limit();
        game = new Game(limit);

    }

    private void set_limit(){
        System.out.println("First of all, set your limit of randomized values:");
        int k=1;
        while(k==1){
            try{
                k=0;
                limits = bufferRead.readLine();
                limit = Integer.parseInt(limits);
            }
            catch(IOException e){
                System.out.println("CRITICAL ERROR GET BACK GET BACK");
       
            }
            catch(NumberFormatException e){
                System.out.println("Wrong format of limit! Should be integer! Program is ending... you loose :( No, Im joking, try again");
                k=1;
            }
        }
}

    public void choose(){
        int numberofchecking=game.checking_number();
        System.out.println("tries: " + numberofchecking);
        System.out.println("What number you want to choose?");
        try{
            String numbers = bufferRead.readLine();
            int number = Integer.parseInt(numbers);
            int comment = game.check(number);
            commentary(comment);
            if(comment!=0){
                choose();
            }
            else{
                numberofchecking++;
                System.out.println("You Win! Bravoo! In: " + numberofchecking + " tries");
            }
    
        }
    
        catch(NumberFormatException e){
            System.out.println("WRONG FORMAT! ENDING...");
        }
        catch(IOException e){
            System.out.println("CRITICAL ERROR GET BACK GET BACK");
        }
    }

    private void commentary(int comment){
        if(comment==0){
            System.out.println("Correct!");
        }
        if(comment>0){
            System.out.println("Too much!");
        }
        if(comment<0){
            System.out.println("Too less!");
        }
    }

}