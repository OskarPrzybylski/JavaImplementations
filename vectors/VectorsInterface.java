import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.TimeUnit;



public class VectorsInterface{

    private final static int MAX_RETRY_COUNT = 5;
    private BufferedReader bufferRead;
    private String a;
    private String b;
    private InputCheckingClass c;
    private InputCheckingClass d;
    private int tries;




    public VectorsInterface(){
        int i=0;
        bufferRead = new BufferedReader(new InputStreamReader(System.in));
    
         while(i==0){
            try{
                i=1;
                read();
                c= new InputCheckingClass(a);
                d= new InputCheckingClass(b);
                compare();
            }
            catch(WektoryRoznejDlugosciException e){
                tries++;
                i=0;
                
                if(tries==MAX_RETRY_COUNT){
                    throw new RuntimeException("Adding these vectors is not possible. Program end");
                }
                System.out.println(e.toString());
                System.out.println("TRY AGAIN");
        
                continue;
            }

        }
        System.out.println("Vectors have same lengths...");
        System.out.print("PROCESSING: ");
        for(int b=0;b<10;b++){
            System.out.print('|');
            try{
                TimeUnit.SECONDS.sleep(1);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.println(" ");
        


    }

    private void read(){
        try{

        System.out.println("Write your 1 vector[FORMAT: 1 2 1.2 33]");
        a= bufferRead.readLine();
        System.out.println("Write your 2 vector[FORMAT: 1 2 1.2 33]");
        b= bufferRead.readLine();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }

    private void compare(){
        if(c.length()!=d.length()) throw new WektoryRoznejDlugosciException(c.length(),d.length());

    }
    public VectorsContainer get(){
        VectorsContainer table= new VectorsContainer(c.get(), d.get());
        return table;
    }

}