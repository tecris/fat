package org.playground.banking;

import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("waiting for input");
        int a = scanner.nextInt();
        System.out.println("value = "+a);

    }
}
