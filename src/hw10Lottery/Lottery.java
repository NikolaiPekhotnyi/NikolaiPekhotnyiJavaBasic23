package hw10Lottery;

import java.util.Arrays;
import java.util.Random;

public class Lottery {
    public static void main(String[] args) {
        int[] firstArray = new int[7];
        int[] secondArray = new int[7];

        Random randomNumbers = new Random();
        for (int i = 0; i < 7; i++) {
            firstArray[i] = randomNumbers.nextInt(10);
            secondArray[i] = randomNumbers.nextInt(10);
        }

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        int numberCoincidences = 0;
        for (int j = 0; j < 7; j++) {
            if (firstArray[j] == secondArray[j]) {
                numberCoincidences++;
            }
        }

        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));
        System.out.println("Кількість збігів: " + numberCoincidences);
    }
}
