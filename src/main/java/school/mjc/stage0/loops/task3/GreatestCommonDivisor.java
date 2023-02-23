package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        if (first==0&&second==0) {
            System.out.println("infinity");
            return;
        }
        if(first==0) {
            System.out.println(second);
            return;
        }
        if (second==0) {
            System.out.println(first);
            return;
        }
        int gcd = 1;
        for (int i=1;i<=(first>second?second:first);i++){
            if (first%i==0&&second%i==0){
                gcd =i;
            }
        }
        System.out.println(gcd);
    }
}
