public class WektoryRoznejDlugosciException extends RuntimeException {
    private int length1;
    private int length2;
    public WektoryRoznejDlugosciException(int i, int j){
        length1=i;
        length2=j;
    
    }
    public String toString(){
        return ("lengths of 2 vectors is not equal. Vector1: " + length1 + " Vector2: " + length2);
    }
}