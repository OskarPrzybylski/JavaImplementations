

public class helloworld {

    public static void main(String[] args) {
    
        int size = args.length;
        double[] arguments = new double[size];

        try{

            for(int i=0;i<size;i++){
            arguments[i] = Double.parseDouble(args[i]);
            }



            QuadraticEquation bb = new QuadraticEquation(arguments);
            double[] wyniki = new double[2];
            wyniki=bb.get();
            
            bb.print();
        }
        catch(NumberOfArgumentsException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("SOME ERRORS!");
        }


    
    }

}


