import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class MassPlus10 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        ArrayList a1 = new ArrayList();
        ArrayList a2 = new ArrayList();
        ArrayList a3 = new ArrayList();
        ArrayList a4 = new ArrayList();
        ArrayList a5 = new ArrayList();
        plus10 (a1);
        plus10 (a2);
        plus10 (a3);
        plus10 (a4);
        plus10 (a5);
        System.out.println("Массив 1: "+a1);
        System.out.println("Массив 2: "+a2);
        System.out.println("Массив 3: "+a3);
        System.out.println("Массив 4: "+a4);
        System.out.println("Массив 5: "+a5);
    }
    public static ArrayList plus10 (ArrayList a){
        for (int i = 0; i < 10; i++) {
            a.add((int)(Math.random()*100));
        }
        return a;
    }
}
