package hw7GuessNumber;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        System.out.println("Введіть будь-яке ціле число від 0 до 10:");
        Scanner scan = new Scanner(System.in);
        while (true) {
            int userNumber = scan.nextInt();
            int computerNumber = 5;
            if (userNumber == computerNumber) {
                System.out.println("Бінго, ви вгадили число!");
                break;
            } else if (userNumber < 0) {
                System.out.println("Число менше 0, введіть ціле число від 0 до 10");
            } else if (userNumber > 10) {
                System.out.println("Число більше 10, введіть ціле число від 0 до 10");
            } else {
                System.out.println("Не вгадали, спробуйте ще!");
            }
        }
    }
}
