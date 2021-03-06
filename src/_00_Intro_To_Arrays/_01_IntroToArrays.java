package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
	static Random ran;
	static int smallboi=49;
    public static void main(String[] args) {
        // 1. declare and Initialize an array 5 Strings
    		String[] fivestringz = new String[5];
        // 2. print the third element in the array
    		System.out.println(fivestringz[3]+"");
        // 3. set the third element to a different value
    		fivestringz[3]="hi";
        // 4. print the third element again
    		System.out.println(fivestringz[3]+"");
        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice
    		for(int i = 0; i<5; i++) {
    		if(i==0) {
    			fivestringz[i]="haha first";
    		}else if(i==1) {
    			fivestringz[i]="first is the worst";
    		}else if(i==2) {
    			fivestringz[i]="why u arguing";
    		}else if(i==3) {
    			fivestringz[i]="i'm tired of this";
    		}else if(i==4) {
    			fivestringz[i]="last is the best tbh";
    		}
    			
    		}
        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
    		for(int i = 0; i<5; i++) {
    			System.out.println(fivestringz[i]);
    			
    			
    		}
    		
        // 7. make an array of 50 integers
    		int[] ints = new int[50];
        // 8. use a for loop to make every value of the integer array a random
        //    number
    		for(int i = 0; i<50; i++) {
    			ran = new Random();
    			ints[i]=ran.nextInt(50);
    			System.out.println(ints[i]);
    			if(ints[i]<=smallboi) {
    				smallboi = ints[i];
    				    			}
    			
    		}
    		System.out.println("the smallest number is " + smallboi +"");

    		
        // 9. without printing the entire array, print only the smallest number
        //    on the array
    		
        // 10 print the entire array to see if step 8 was correct

        // 11. print the largest number in the array.

        // 12. print only the last element in the array

    }
}
