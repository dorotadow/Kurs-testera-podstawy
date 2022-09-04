import java.util.Scanner;

public class Bramkarz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nameList = new String[]{"Anna", "Darek", "Piotr", "Dawid"};
        boolean flag = false;
        boolean again = false;
        do {
            System.out.println("Jak masz na imie?");
            String name = scanner.next();
            for (String n : nameList) {
                if (name.equals(n)) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println("Jestes na liscie mozesz wejsc do Zoo");
            } else {
                System.out.println("Nie ma cie na liscie, placisz 10zl");
            }

            System.out.println("Czy jest ktos nastepny? tak lub nie");
            String odpowiedz = scanner.next();
            if (odpowiedz.equals("tak")) {
                again = true;
            }
        } while (again);
    }
}