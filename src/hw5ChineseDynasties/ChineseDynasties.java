package hw5ChineseDynasties;

public class ChineseDynasties {
    public static void main(String[] args) {
        int liWarrior = 13;
        int liBowman = 24;
        int liRider = 46;

        int minWarrior = 9;
        int minBowman = 35;
        int minRider = 12;

        int dynastyLi = 860;
        double dynastyMin = dynastyLi * 1.5;

        int totalAttackLi = dynastyLi * (liWarrior + liBowman + liRider);
        double totalAttackMin = dynastyMin * (minWarrior + minBowman + minRider);

        System.out.println("Total attack rate Dynasty Li : " + totalAttackLi);
        System.out.println("Total attack rate Dynasty Min : " + totalAttackMin);
    }
}
