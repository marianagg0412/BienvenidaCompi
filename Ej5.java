package Bienvenida;

import java.util.HashMap;

public class Ej5 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int[] nums = {5, 1, 5, 1};
        int temp = -1;

        int i = 0;
        while(i < nums.length && temp == -1){
            if(!freq.containsKey(nums[i]))
                freq.put(nums[i],1);
            else
                temp = nums[i];
            i++;
        }
        System.out.println(temp);
    }
}
