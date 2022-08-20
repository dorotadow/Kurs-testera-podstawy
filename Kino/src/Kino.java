import java.util.Scanner;

public class Kino {
    public static void main(String[] args) {
        System.out.println("Jak masz na imie?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("czesc" + name + "Ile masz lat?");
        int age = scanner.nextInt();
        if (age >= 20) {
            System.out.println("Idziesz do kina");
        }
        else {
            System.out.println("Nie idziesz");
        }


    }
}















