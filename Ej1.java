package Bienvenida;

import java.util.Arrays;

public class Ej1 {
    public static void main(String[] args) {
        int[] v = {1,2,3,4,5,6,7,8,9,8,6,5,4,3,2,1,10,10,11,11,13,12,13,12,9};
        Arrays.sort(v);
        int temp = Integer.MAX_VALUE;

        int i = 1;
        while(i < v.length && temp == Integer.MAX_VALUE){
            if(i != v.length-1 ){
                if(v[i-1] != v[i] && v[i] != v[i+1])
                    temp = v[i];
            } else
                if(v[i-1] != v[i])
                    temp = v[i];
            i++;
        }

        System.out.println(temp);
    }
}
