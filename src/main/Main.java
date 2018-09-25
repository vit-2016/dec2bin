package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        dec2bin();
    }
    private static void dec2bin(){
        long a;
        String action = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("converter");
        while (!action.equals("yes")){

            System.out.println("input num");
            a = scanner.nextLong();
            if(a>-127 & a<128){
                System.out.println("byte short int long");
            } else if(a>-32768 & a<32767){
                System.out.println("short int long");
            }else if(a>-2147483648 & a<2147483647){
                System.out.println("int long");
            }else {
                System.out.println("long");
            }

            long[] b = new long [64];

            for(int i=0; i<64;i++){
                b[i]=1;
            }

            int last=0;

            for (int i=0; a>1; i++) {
                last=i+1;
                b[i]=a%2;
                a=a/2;
            }

            for ( ; last!=0;last--){
                System.out.print(b[last]);

            }

            if (a%2==0) {
                System.out.println(0);
            }else{
                System.out.println(1);
            }

            System.out.println(" ");

            System.out.println("do you want to leave?");
            action = scanner.next();
        }
    }
}
