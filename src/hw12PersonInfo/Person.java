package hw12PersonInfo;

public class Person {
    public String personInfo(String firstName, String lastName, String city, String phone) {
        return ("Зателефонувати громадянину " + firstName + " " + lastName + " із міста " + city + " можна за номером " + phone);
    }

    public static void main(String[] args) {
        Person person = new Person();

        System.out.println(person.personInfo("Will", "Smith", "New York", "2936729462846."));
        System.out.println(person.personInfo("Jackie", "Chan", "Shanghai", "12312412412."));
        System.out.println(person.personInfo("Sherlock", "Holmes", "London", "37742123513."));
    }
}
