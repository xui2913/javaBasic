package com.neuedu.test;

public class OneWork {
    public static void main(String[] args) {
        int a=695;
        int b=0;
        while (a!=0){
            b=a%10;
            System.out.println(b);
            a=a/10;
        }
    }
}
