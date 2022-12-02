package com.bytelegend;

import java.util.Arrays;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(filterPrimeNumbers(1, 10)));
        System.out.println(Arrays.toString(filterPrimeNumbers(50, 100)));
    }

    /**
     * `filterPrimeNumbers(int start, int end)` method returns an array of all prime numbers in the
     * given `start<=n<=end` range.
     *
     * <p>For example, `filterPrimeNumbers(1, 10)` returns `[2, 3, 5, 7]`.
     *
     * <p>A prime number is a whole number greater than 1 whose only factors are 1 and itself.
     *
     * <p>Tips: for a positive integer `n`, if it's not divisible by any of the integers between 2
     * and `Math.sqrt(n)`, then `n` is a prime number.
     */
    public static int[] filterPrimeNumbers(int start, int end) {
        int j = start;
        List<Object> list =new ArrayList<Object>();
        for (int i = 0; i <= end - j; i++,start++) {
            if (isPrime(start)){
                list.add(start);
            }
        }

        int[] ints =new int[list.size()];
        for(int i = 0;i < list.size(); i++){
            ints[i] = (int) list.get(i);
        }
        return  ints;
    }
    
    public static boolean isPrime(int n){
        if(n == 1 || n == 0) {
            return false;
        }

        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }
}
