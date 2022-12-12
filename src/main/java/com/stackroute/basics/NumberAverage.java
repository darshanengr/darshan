package com.stackroute.basics;

import java.io.InputStream;
import java.util.Scanner;

public class NumberAverage {
	Scanner value = new Scanner(System.in);

    public static void main(String[] args) {
       new NumberAverage().getArrayValues();
    }

   

	//get the values of the array from the user
    public void getArrayValues() {
    	System.out.println("Enter number of values:");
    	int size =value.nextInt();
    	System.out.println("Enter the values:");
    	int[] array = new int[6];
    	for(int number:array) {
    		number = value.nextInt();
    	}
    	new NumberAverage().findAverage( array);

    }

    //write here logic to calculate the average an array
    public String findAverage(int[] inputArray) {
    	int total=0;
    	for(int number: inputArray) {
    		total=total+number;
    	}
    	int avg =total/inputArray.length;
        return avg+"";
    }
}
