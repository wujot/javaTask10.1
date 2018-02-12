import javafx.scene.transform.Scale;

import java.io.FileWriter;
import java.util.Scanner;

public class TenOne {

    public static void main(String[] args) throws Exception {

        // variables
        int numbers;
        double[] arrayOfNumbers;
        FileWriter fw = new FileWriter("arrayOfDoubles.txt");

        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers would you like to type in ?");
        numbers = Integer.parseInt(sc.nextLine());
        arrayOfNumbers = new double[numbers];

        System.out.printf("Type %d double numbers: \n", numbers);
        // prompt user to fill up array of double numbers
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = Double.parseDouble(sc.nextLine());
        }

        // save array of double numbers into .txt file
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            fw.write(arrayOfNumbers[i] + "\n");
        }

        sc.close();
        fw.close();
    }
}
