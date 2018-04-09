import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Vector;
import java.io.FileWriter;

public class VectorsMain{


    public static void main(String[] args) {
    
        
        VectorsInterface a = new VectorsInterface();
        VectorsContainer table = a.get();
        Vector<Double> k = new Vector<>();
        for(int i=0;i<table.one.size();i++){
            k.add(table.one.get(i)+ table.two.get(i));
        }
        System.out.println("Sum of these vectors: " + k.toString());
        try{
            FileWriter writer;
            writer = new FileWriter("test.txt");
            writer.write(k.toString());
            writer.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
        
    }




}