package com.analytics;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];
        double[] totals = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter name for student " + (i+1) + ":");
            names[i] = sc.nextLine();
            System.out.println("Enter CAT (30), Assignment (20), FAT (50):");
            double cat = sc.nextDouble();
            double assn = sc.nextDouble();
            double fat = sc.nextDouble();
            sc.nextLine(); // consume newline
            
            totals[i] = cat + assn + fat;
        }

        // Logic for Topper and Grade Insight
        int topperIdx = 0;
        for (int i = 1; i < 5; i++) {
            if (totals[i] > totals[topperIdx]) topperIdx = i;
        }

        System.out.println("Topper: " + names[topperIdx] + " with " + totals[topperIdx] + " marks.");
    }
}
