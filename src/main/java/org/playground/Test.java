package org.playground;

public class Test {

    public static void main(String[] a) {
        System.out.println("=== start ===");
        for (int k=0;k<10;k++) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("iteration: " + k);
        }
        System.out.println("=== end ===");
    }
}
