package Bienvenida;

import java.util.ArrayList;

import static Bienvenida.Ej2.erathostenes;

public class Ej3 {
    public static void main(String[] args) {
        int n = 10000;
        int[] arr = erathostenes(n + 1);

        ArrayList<Integer> nums = new ArrayList<>();

        int i = 0;
        int sum = 0;
        while(sum < n){
            sum += arr[i];
            nums.add(arr[i]);
            i++;
        }

        boolean flag = false;
        while(!flag){
            if(binarySearch(arr, sum) == -1){
                sum -= nums.get(nums.size() - 1);
                nums.removeLast();
            } else
                flag = true;
        }

        if(flag) {
            for (int j = 0; j < nums.size(); j++) {
                if (j != nums.size() - 1)
                    System.out.print(nums.get(j) + " + ");
                else
                    System.out.print(nums.get(j) + " = " + sum);
            }
        }
    }

    private static int busquedaBinariaR(int[]a, int e, int index, int i, int j) {
        if(a[index] == e) {
            return index;
        }
        if(i > j) {
            return -1;
        }

        if(a[index] > e) {
            j = index -1;
            return busquedaBinariaR(a, e, (j-i)/2, i, j);
        }else {
            i = index +1;
            return busquedaBinariaR(a, e, (j+i)/2, i, j);
        }
    }

    public static int binarySearch(int[] a, int e) {
        int j = a.length-1;
        return busquedaBinariaR(a, e,j/2,0,j);
    }
}
