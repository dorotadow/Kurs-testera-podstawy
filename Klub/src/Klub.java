import java.util.Scanner;

public class Klub {
    public static void main(String[] args) {
        System.out.println("Gdzie mieszkasz?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("czesc" + name + "Ile masz lat?");
        int age = scanner.nextInt();
        if (age >= 30) {
            System.out.println("Idziesz do klubu");
        }
        else{
            System.out.println("Nie mozesz isc do klubu");
        }
    }
}