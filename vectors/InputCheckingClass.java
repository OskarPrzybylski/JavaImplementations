import java.util.ArrayList;
import java.util.Vector;

public class InputCheckingClass {
        private String a;
        private int j=0;
        private int checking=0;
        private int adding=0;
        private ArrayList<Double> list;
        private Vector<Double> v;

        public InputCheckingClass(String input){
            a = input;
            list = new ArrayList<Double>();
            v = new Vector<Double>();
            parsee();
            parseToVector();

        }

        private void parse(){
            try{
               
                for(int i=0;i<a.length();i++){
                   //System.out.println(a.substring(i, i+1));
                   
                   if(a.substring(i, i+1).equals(".") ){
                     //  System.out.println("haha");
                       checking=1;
                       
                   }
                   if(!a.substring(i, i+1).equals(" ")){
                        adding=1;
                   }
                    
                   if(isNumeric(a.substring(i, i+1) )){
                       if(checking==1){
                           list.set(j-1, list.get(j-1) + ((Double.parseDouble(a.substring(i, i+1)))/10) );
                           checking=0;
                       }
                       else{
                       list.add(j, Double.parseDouble(a.substring(i, i+1)));
                       j++;
                       }
                   }
                }
                
            }
               catch(Exception e){
                   System.out.println(e);
               }
       
        }


        private static boolean isNumeric(String str)  
        {  
          try  
          {  
            double d = Double.parseDouble(str);  
          }  
          catch(NumberFormatException nfe)  
          {  
            return false;  
          }  
          return true;  
        }

        public Vector<Double> get(){
        
            return v;
        }

        public int length(){
            return list.size();
        }
        private void parseToVector(){
            //for(int i=0;i<list.size();i++){
                //try{
                    v.addAll(list);
                //}
               // catch(Exception e){
                 //   System.out.println("o kurde");
                //}
            //}
        }

        private void parsee(){
            ArrayList<String> str = new ArrayList<String>();
            int j=0;
            int k=0;
            try{
                for(int i=0;i<a.length();i++){
               
               
                    if(a.substring(i, i+1).equals(" ")){
                        adding=1;
                    }
                    if(adding==0){
                        if(isNumeric(a.substring(i, i+1)) || a.substring(i, i+1).equals(".")){
                            if(j==0){
                                str.add(a.substring(i, i+1));
                                j=1;
                            }
                            else{
                                str.set(str.size()-1, str.get(str.size()-1)+ a.substring(i, i+1) );
                            }
                        }
                   
                    }
                    else{
                        list.add(Double.parseDouble(str.get(str.size()-1)));
                        //System.out.println(list.get(list.size()-1));
                        adding=0;
                        k++;
                        j=0;
                    }
               
               
               
                }
                if(k!=str.size()){
                    list.add(Double.parseDouble(str.get(str.size()-1)));
                }
            }
            catch(NumberFormatException e){
                System.out.println("haha");
                System.out.println(e);
            }
            //System.out.println(str);
            
            
        }


}