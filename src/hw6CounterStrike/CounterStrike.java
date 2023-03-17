package hw6CounterStrike;

public class CounterStrike {
    public static void main(String[] args) {
        String teamNavi = "Navi";
        int[] fragsNaVi = {5, 15, 25, 8, 12};

        String teamVitality = "Vitality";
        int[] fragsVitality = {10, 45, 4, 3, 18};

        int averageTeamNavi = 0;
        int averageTeamVitality = 0;
        for (int avg = 0; avg < 5; avg++) {
            averageTeamNavi += fragsNaVi[avg];
            averageTeamVitality += fragsVitality[avg];
        }
        averageTeamNavi /= 5;
        averageTeamVitality /= 5;

        if (averageTeamNavi > averageTeamVitality) {
            System.out.println("Перемогла команда " + teamNavi + " набрала " + averageTeamNavi + " очків");
        } else if (averageTeamNavi < averageTeamVitality){
            System.out.println("Перемогла команда " + teamVitality + " набрала " + averageTeamVitality + " очків");
        } else {
            System.out.println("Нічия");
        }
    }
}
