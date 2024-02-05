package Bienvenida;

import java.util.Arrays;

public class Ej2 {
    public static int[] erathostenes(int n){
        int[] arr = new int[0];
        boolean[] primes = new boolean[n + 1];
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;
        for(int i = 2; i*i <=n; i++){
            if(primes[i]){
                for(int j = i*i; j <= n; j += i){
                    primes[j] = false;
                }
            }
        }
        for(int i = 0; i < primes.length; i++){
            if(primes[i]) {
                arr = Arrays.copyOf(arr, arr.length+1);
                arr[arr.length-1] = i;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        //Sieve of Eratosthenes
        int n = 30;
        int[] primes = erathostenes(n);
        for (int prime : primes) System.out.println(prime);
    }

}

