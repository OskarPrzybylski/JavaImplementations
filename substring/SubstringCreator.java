import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubstringCreator{

    private BufferedReader bufferRead;
    private String s;
    private SubstringClass myclass;
    private int ai;
    private int bi;

    public SubstringCreator(){

        System.out.println("Welcome in Substring Creator");
        
      //  try{
            bufferRead = new BufferedReader(new InputStreamReader(System.in));
        //    }
           // catch(Exception e){
               // System.out.println(e);
           // }
            set_string();
            myclass = new SubstringClass(s);
            set_limits();

    }

    public SubstringCreator(String text, int a, int b){
        System.out.println("Welcome in Substring Creator");
        s=text;
        ai=a;
        bi=b;
        myclass=new SubstringClass(s);
    }

    private void set_string(){
        System.out.println("First of all, set your string:");
   try{
        s = bufferRead.readLine();
   }
   catch(IOException e){
       System.out.println("Wrong Input!");
   }



    }

    private void set_limits(){
        try{
        System.out.println("Set your limits");
        System.out.println("Set a:");

        String a = bufferRead.readLine();
        ai = Integer.valueOf(a);
        System.out.println(ai);
        System.out.println("Set b:");
        String b = bufferRead.readLine();
        bi=Integer.valueOf(b);
        System.out.println(b);
        }
        catch(IOException e){
            System.out.println("Wrong limits! Should be NUMBER!");
        }
        
    }

    public String get_substring(){
        return myclass.substring(ai, bi);
    }
}