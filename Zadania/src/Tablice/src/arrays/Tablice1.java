import java.util.Random;
import java.util.Scanner;

public class Tablice1 {
    public static void main(String[] args) {

        System.out.println();
        //Przykład 5
        double[] power = {23.45, -2.22, 45.90, 67.45, -56, 234.11,-34.8, 90.4, -77};
        double min = power[0];
        double max = power[0];
        int minA = 0;
        int maxA = 0;
        for(int i = 0; i < 9; i++)
        {
            if(max < power[i])
            {
                max = power[i];
                maxA = i;
            }
            if(min > power[i])
            {
                min = power[i];
                minA = i;
            }
            System.out.println("element [" + i + "] = " + power[i]);
        }
        power[maxA] = min;
        power[minA] = max;
        System.out.println();
        System.out.println("Po zamianie liczb:");
        System.out.println();
        for( int j = 0; j < 9; j++)
        {
            System.out.println("element [" + j + "] = " + power[j]);
        }
        System.out.println();
        System.out.println();

        //Przykład 6
        System.out.println("Odwrócenie tablicy:\n");
        int numberA;
        int numberB;
        for (int i = 0; i < power.length/2;i++){
            numberA = (int) power[i];
            numberB = (int) power[power.length - 1 - i];
            power[i] = numberB;
            power[power.length - 1 - i] = numberA;
        }
        for (int i = 0; i < power.length; i++){
            System.out.println("Element [" + i + "] = " + power[i]);
        }

        System.out.println();
        System.out.println();

        //Przykład 7
        System.out.println();
        Random random = new Random();
        for (int i = 0; i < 8; i++) {
            if (power[i] < power[i + 1]) {
                System.out.println("Liczba " + power[i + 1] + " jest wieksza od liczby " + power[i]);
            } else {
                System.out.println("Liczba " + power[i] + " jest większa od liczby  " + power[i + 1]);
            }
        }
                // Przykład 8
                System.out.println();
                Scanner scanner = new Scanner(System.in);
                String[] person = new String[4];// 0 - 3

                System.out.println("Podaj Imię:");
                person[0] = scanner.next();
                System.out.println("Podaj Rasa:");
                person[1] = scanner.next();
                System.out.println("Podaj Klasa:");
                person[2] = scanner.next();
                System.out.println("Podaj Broń:");
                person[3] = scanner.next();
                System.out.println();
                System.out.println(person[0]);
                System.out.println(person[1]);
                System.out.println(person[2]);
                System.out.println(person[3]);
            }
        }
