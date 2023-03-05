package Hw4Parallelepiped;

public class Parallelepiped {
    public static void main(String[] args) {
        int sideOne = 6;
        int sideTwo = 4;
        int sideThree = 3;
        int volume = sideOne * sideTwo * sideThree;
        System.out.println("Об'єм паралелепіпеда = " + volume);
        int length = 4 * (sideOne + sideTwo + sideThree);
        System.out.println("Cумарна довжина всіх сторін паралелепіпеда = " + length);
    }
}
