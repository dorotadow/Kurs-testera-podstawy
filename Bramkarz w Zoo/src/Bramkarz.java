import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.*;

public class Bramkarz {
    public static void main(String[] args) {
        out.println("Jak masz na imie?");
        Scanner scanner = new Scanner(System.in);
        String[] name = new String[9];
        name[0] = "Anna";
        name[1] = "Darek";
        name[2] = "Piotr";
        name[3] = "Pawel";
        out.println("Pierwszy element tablicy" + "Anna");
        out.println("Drugi element tablicy" + "Darek");
        out.println("Trzeci element tablicy" + "Piotr");
        out.println("Czwarty element tablicy" + "Pawel");
        for (int i = 0; name.length <= i ; i++){
        }
        out.println("Wchodzisz");

        if (name[0] == "Anna"); {
            out.println("Wchodzisz" + "Anna");
        }

        if (name[8] == "Mikolaj") ;
        {
            out.println("Jest Mikolaj");

            if (name[8] == "Mikolaj" + "Nie da 10 zl") ;
            {
                out.println("Bramkarz cie nie wpusci");
            }
        }
    }
}


































