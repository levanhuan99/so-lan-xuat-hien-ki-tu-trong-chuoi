package com.codewithme;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    String str ="levanhuan";
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap ki tu");
        char cha=scanner.next().charAt(0);
        int amount=0;
        for (int i=0;i<str.length();i++){
           if (str.charAt(i)==cha){
               amount++;

            }
        }
        System.out.println("so lan xuat hien cua "+ cha+ " trong chuoi la "+ amount);


    }
}
