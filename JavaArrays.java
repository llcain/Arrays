import java.io.*;
import  java.lang.*;
import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;

public class JavaArrays {
    // call a method
    static void myMethod() {
        System.out.println("I made it!");
    }

    public static void main(String[] args) {
       int[] numbers = new int[3];
        int resultArray[] = new int[6];

        // Array Initialization
        resultArray[0] = 60;
        resultArray[1] = 11;
        resultArray[2] = 80;
        resultArray[3] = 20;
        resultArray[4] = 97;
        resultArray[5] = 61;





       numbers[0] = 6;
       numbers[1] = 7;
       numbers[2] = 10;

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(resultArray));
        System.out.println(resultArray[0]);

        String[] cars = {"volvo", "BMW", "Ford", "Mazda"};

        cars[0] = "camry";

        // Looping through an array using for loop

        // how to write a for loop

        for(int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        for (String i : cars) {
            System.out.println(i);
        }

        System.out.println(Arrays.toString(cars));

        myMethod();
        myMethod();
        myMethod();


    }
}
