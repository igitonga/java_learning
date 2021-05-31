package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[]args){

        int cars [] = {1,2,3,10};
        int k = 4;

        parkingDilemma(cars,k);
    }

    static int parkingDilemma(int[] cars, int k) {
        // write your code here
        Arrays.sort(cars);
        int len = cars.length;
        int min = cars[k-1] - cars[0];
        for (int i = 1; i <= len - k; i++) {
            if (min > cars[k-1+i] - cars[i]) {
                min = cars[k - 1 + i] - cars[i];
            }
        }
        System.out.println(min);
        return min+1;
    }
}
