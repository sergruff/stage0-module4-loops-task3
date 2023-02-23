package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String str = Integer.toString(t);
        int sum=0;
        for (int i =0; i<str.length();i++){
            if (Character.isDigit(str.charAt(i))) {
                sum+=Character.getNumericValue(str.charAt(i)) ;
            }
        }
        System.out.println(sum);
    }
}
