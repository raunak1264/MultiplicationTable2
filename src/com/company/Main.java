package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
        for(int i=1; i <=100;i++)
        {
            System.out.printf("%d x %d= %d\n",n,i,n*i);
        }
    }
}
