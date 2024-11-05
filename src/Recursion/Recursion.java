package Recursion;

import java.util.ArrayList;

public class Recursion {
    public void TOH(int n, int source, int destination) throws RuntimeException{
        if (n<1){
            throw new RuntimeException("Input can't be less than 1");
        }

        if (n==1){
            System.out.printf("%s -> %s%n", source, destination);
            return;
        }
        int other = 6-(source+destination);
        TOH(n-1, source, other);
        System.out.printf("%s -> %s%n", source, destination);
        TOH(n-1, other, destination);
    }
}
