package studio1;

import support.cse131.ArgsProcessor;

public class Average {
    public static void main(String[] args){
        ArgsProcessor ap = new ArgsProcessor(args);
        int n1 = ap.nextInt("Enter the first number to be averaged:");
        int n2 = ap.nextInt("Enter the second number to be averaged:");
        double nA = (n1+n2)/2.0;
        System.out.println(nA);


    }
}
