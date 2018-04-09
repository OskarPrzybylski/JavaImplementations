
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;


public class Testnio extends Test{
    private Path p = Paths.get("test1.txt");
    byte[] array;

    public Testnio(){
        array= set.toString().getBytes();
        randomize();
    }

    protected void write(){

        try{
            Files.write(p, array);

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    protected void read(){
        try{
            Files.readAllBytes(p);

    
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

}