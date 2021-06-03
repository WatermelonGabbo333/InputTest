package ires.corso;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in;
        int max = 0;
        in = new Scanner(System.in);
        System.out.println("Inserisci un numero");
        int n1 = in.nextInt();
        System.out.println("Inserisci un secondo numero");
        int n2 = in.nextInt();
        if(n1>n2)
            max = n1;
        else
            max = n2;
        System.out.println("Inserisci un terzo numero");
        int n3 = in.nextInt();
        if(max>n3)
            System.out.println("Il maggiore è : " + max);
        else
            System.out.println("Il maggiore è : " + n3);
    }
}
