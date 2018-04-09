public class SubstringMain{

    public static void main(String[] args) {
        String si;
        int ai;
        int bi;
        if(args.length==3){
            try{
                ai=Integer.parseInt(args[1]);
                bi=Integer.parseInt(args[2]);
                SubstringCreator b = new SubstringCreator(args[0], ai, bi);
                si =b.get_substring();
                System.out.println("Your substring: " + si);
            }
            catch(NumberFormatException e){
                System.out.println("Wrong input! Should be: String downlimit uplimit");
            }
        }    
        else{
            System.out.println("Wrong input! Should be: String downlimit uplimit");
        }    //String s;
        //SubstringCreator a = new SubstringCreator();
        //s= a.get_substring();
        //System.out.println(s);


    }
}