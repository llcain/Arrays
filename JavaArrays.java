
import java.lang.reflect.Array;
import java.util.Arrays;

public class JavaArrays {

    public static void main(String[] args) {
       int[] numbers = new int[3];
        int resultArray[] = new int[6];

        // Array Initialization
        resultArray[0] = 60;
        resultArray[1] = 11;
        resultArray[2] = 80;
        resultArray[3] = 20;
        resultArray[4] = 97;
        resultArray[5] = 45;


       numbers[0] = 6;
       numbers[1] = 7;
       numbers[2] = 10;

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(resultArray));
        System.out.println(resultArray[0]);


    }
}
