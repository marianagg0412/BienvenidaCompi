package Bienvenida;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        //System.out.println(compare(a, b));
        char temp = 65;
        int n = (a.length() > b.length()) ? 1 : -1;

        StringBuilder s = new StringBuilder();
        int min = Math.min(a.length(), b.length());
        int i = 0;
        while(i < min && temp == 65){
            if(a.compareTo(b) != 0) {
                if (a.charAt(i) != b.charAt(i))
                    if (n == 1)
                        temp = a.charAt(i);
                    else
                        temp = b.charAt(i);
                i++;
            } else{
                temp = '\0';
            }
        }
        if(n == 1 && temp == 65)
            temp = a.charAt(min);
        else if(n == -1 && temp == 65)
            temp = b.charAt(min);

        System.out.println(temp);
    }
}
