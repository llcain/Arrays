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

    // Parameters and Arguments
    static  void hisMethod(String firstname) {
        System.out.println(firstname + " Rsefsnes");
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

        hisMethod("lisa");
        hisMethod("tom");
        hisMethod("sarah");

        String[] betterHomeGardens = {"over the rain","berry lemonade", "caribbean sea breeze"};

        Person myObj = new Person();
        myObj.setName("Bob"); // Set the value of the name variable to "Johns
        System.out.println(myObj.getName());

        // the number of elements we want to hold
        final int _arraySize = 4;

        // our array declaration
        String[] stringArray = new String[_arraySize];

        for (int i = 0; i < _arraySize; i++) {
            // assign value to index i
            stringArray[i] = "This is stored in index " + i;

            // print value saved in index i
            System.out.println(stringArray[i]);
        }

        Cars myObj1 = new Cars();
        Cars myFastCar = new Cars();
        myFastCar.honk();

        System.out.println(myObj1.make);
        System.out.println(myObj1.model);

//        Animal myAnimal = new Animal(); // Create an Animal object
        Animal myPig = new Pig(); // Create a Pig object
        Animal myDog = new Dog(); // Create a Dog object

//        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();



    }
}
