package hw9Rugby;

import java.util.Arrays;
import java.util.Random;

public class Rugby {
    public static void main(String[] args) {
        Random randomNumbersAge = new Random();

        int[] teamRugby1 = new int[25];
        int[] teamRugby2 = new int[25];

        for (int count = 0; count < 25; count++) {
            teamRugby1[count] = randomNumbersAge.nextInt(23) + 18;
            teamRugby2[count] = randomNumbersAge.nextInt(23) + 18;
        }

        System.out.println("Вік гравців команди 1: " + Arrays.toString(teamRugby1));
        System.out.println("Вік гравців команди 2: " + Arrays.toString(teamRugby2));

        int sumAgeTeamRugby1 = 0;
        int sumAgeTeamRugby2 = 0;

        for (int avg = 0; avg < 25; avg++) {
            sumAgeTeamRugby1 += teamRugby1[avg];
            sumAgeTeamRugby2 += teamRugby2[avg];
        }

        int averageTeam1 = sumAgeTeamRugby1 / 25;
        int averageTeam2 = sumAgeTeamRugby2 / 25;

        System.out.println("Середній вік гравців команди 1: " + averageTeam1);
        System.out.println("Середній вік гравців команди 2: " + averageTeam2);
    }
}
