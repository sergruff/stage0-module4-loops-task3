package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        if (lastFibonacci>2){
            for (int i=0;i<lastFibonacci;i++){
                System.out.println(calculateFibonacci(i));
            }
        }
    }
    private int calculateFibonacci(int n){
        if (n==0) {return 0;}
        if (n==1) {return 1;}
        return calculateFibonacci(n-1)+calculateFibonacci(n-2);
    }
}
