package Bienvenida;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej4 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            int[] res = palindrome(num);
            for (int re : res) {
                System.out.print(re + " ");
            }
        }

    }

    public static int[] palindrome(int n){
        int iterations = 0;
        int[] res = new int[2];
        String l = String.valueOf(n);
        String l1 = reverseString(l);
        while(!l.equals(l1)){
            n += Integer.parseInt(l1);
            l = String.valueOf(n);
            l1 = reverseString(l);
            iterations++;
        }
        res[0] = iterations;
        res[1] = n;
        return res;
    }

    public static String reverseString(String s) {
        if(s.length() <= 1)
            return s;
        else {
            String reverse = reverseString(s.substring(1));
            return reverse + s.charAt(0);
        }
    }
}
