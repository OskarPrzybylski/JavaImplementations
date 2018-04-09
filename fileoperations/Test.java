import java.util.Random;


public abstract class Test{

    private static Random r;
    protected static char[] set;

    protected void randomize(){
        r = new Random();
        set= new char[1000];
        for(int i=0;i<1000;i++){
            set[i]=(char)(r.nextInt(26)+'a');
        }
    

    }

    protected abstract void write();
    protected abstract void read();

    public void start_test(){
        long start_time = System.nanoTime();
        write();
        long stop_time=System.nanoTime();
        System.out.println("Evaluation time of writing:" + (stop_time-start_time));

        start_time=System.nanoTime();
        read();
        stop_time=System.nanoTime();
        System.out.println("Evaluation time of reading:" + (stop_time-start_time));
    }


}