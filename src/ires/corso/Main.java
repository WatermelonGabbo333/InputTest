package ires.corso;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in;
        int max = 0;
        int ordine = 0;
        in = new Scanner(System.in);
        System.out.println("Inserisci un numero");
        int n1 = in.nextInt();
        System.out.println("Inserisci un secondo numero");
        int n2 = in.nextInt();
        if(n1>n2) {
            max = n1;
            ordine = 1;
        }
        else {
            max = n2;
            ordine = 2;
        }

        System.out.println("Inserisci un terzo numero");
        int n3 = in.nextInt();
        if(n1==n2 && n1==n3 && n2==n3)
            System.out.println("I tre numeri sono uguali");
        if(max>n3)
            System.out.println("Il maggiore è : " + max + " ed è il : " + ordine);
         if(max<n3){
            ordine = 3;
            System.out.println("Il maggiore è : " + n3 + " ed è il : " + ordine);
        }
    }
}
