public class QuadraticEquation{

    private double A;
    private double B;
    private double C;
    private double x1;
    private double x2;
    
    public QuadraticEquation(double[] values) throws Exception{
        if(values.length!=3)
            throw new NumberOfArgumentsException("Number of arguments is not correct! Shoud be 3 numbers!");
        A=values[0];
        B=values[1];
        C=values[2];
        solve();
    }
    
    private void solve(){
        double delta= Math.sqrt(B*B - 4*A*C);
        x1= (-B+delta) / (2*A);    
        x2= (-B-delta) / (2*A);
    }

    public void print(){
        
        System.out.println("x1= " + x1 + " x2 = " + x2);
        
    }
    public double[] get(){
        return (new double[] {x1,x2});
    }

    
    }