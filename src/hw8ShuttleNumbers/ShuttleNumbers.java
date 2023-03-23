package hw8ShuttleNumbers;

public class ShuttleNumbers {
    public static void main(String[] args) {
        for (int numberShuttle = 0; numberShuttle <= 100; numberShuttle++) {
            if (numberShuttle % 10 == 4 || numberShuttle % 10 == 9) {
                continue;
            }
            System.out.println("Number Shuttle: " + numberShuttle);
        }
    }
}