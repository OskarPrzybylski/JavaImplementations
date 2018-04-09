
import java.io.FileReader;
import java.io.FileWriter;


public class Testio extends Test{


    public Testio(){
        randomize();

    }


    protected void write(){

        FileWriter a;
        try{
             a = new FileWriter("test.txt");
            a.write(set);
            a.close();
        }
        catch(Exception e){
            System.out.println(e);
        }   

    }

    protected void read(){
        FileReader a;
        try{
            a = new FileReader("test.txt");
            a.read(set);
            a.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
            
    }

}