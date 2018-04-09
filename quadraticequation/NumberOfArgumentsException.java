public class NumberOfArgumentsException extends Exception{

    private String message;
    public NumberOfArgumentsException(String message2){
        message=message2;
    }
    public String toString(){
        return ("NumberOfArgumentsException occurred: " + message);
    }
    
    }