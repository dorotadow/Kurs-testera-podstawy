import java.util.Scanner;

public class Klub {
    public static void main(String[] args) {
        System.out.println("jak mmasz na imie?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("czesc" + name + "ile masz lat?");
        int age = scanner.nextInt();
        if (age >= 21) {
            System.out.println("wchodzisz do klubu");
        }
        else {
            System.out.println("Nie wchodzisz");
        }
        }





    }

