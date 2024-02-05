package Bienvenida;

public class Ej7 {
    public static void main(String[] args) {
        tree("123", 4);
    }

    public static void tree(String d, int h){
        int decorLen = d.length();
        int spaces = (2*h - 1)/2;
        for(int i = 0; i < h; i++){
            spaces(spaces);
            StringBuilder line = new StringBuilder();
            for(int j = 0; j < i+1; j++){
                line.append(d.charAt(j % decorLen));
                if(j < i)
                    line.append(" ");
            }
            System.out.println(line);
            spaces--;
        }
        spaces((2*h - 1)/2);
        System.out.println("|");
    }

    public static void spaces(int s){
        for(int i = 0; i < s; i++)
            System.out.print(" ");
    }
}
