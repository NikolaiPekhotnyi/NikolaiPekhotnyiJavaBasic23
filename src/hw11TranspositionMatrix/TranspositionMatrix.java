package hw11TranspositionMatrix;


import java.util.Random;
import java.util.Scanner;

public class TranspositionMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введіть кількісті рядків матриці М: ");
        int rowMatrix = scanner.nextInt();

        System.out.println("Введіть кількість стовпців матриці N: ");
        int columnsMatrix = scanner.nextInt();

        int[][] initialMatrix = new int[rowMatrix][columnsMatrix];
        int[][] transportedMatrix = new int[columnsMatrix][rowMatrix];

        for (int i = 0; i < rowMatrix; i++) {
            for (int j = 0; j < columnsMatrix; j++) {
                initialMatrix[i][j] = random.nextInt(10);
            }
        }

        for (int i = 0; i < rowMatrix; i++) {
            for (int j = 0; j < columnsMatrix; j++) {
                transportedMatrix[j][i] = initialMatrix[i][j];
            }
        }

        System.out.println("Матриця початкова: ");
        for (int i = 0; i < rowMatrix; i++) {
            for (int j = 0; j < columnsMatrix; j++) {
                System.out.print(initialMatrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Транспортована матриця: ");
        for (int i = 0; i < columnsMatrix; i++) {
            for (int j = 0; j < rowMatrix; j++) {
                System.out.print(transportedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
