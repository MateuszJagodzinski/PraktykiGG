import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_Listy {
    public static void main(String[] args)
    {
        //Zadanie 1 i 5
        System.out.println();
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        List<String> array = new ArrayList<>();
        for(int i=0;i<10;i++) {
            String x = scanner.nextLine();
            boolean z=false;
            for (String s : array) {
                if (s.equals(x)) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                array.add(x);
            } else {
                System.out.println("Wprowadzone dane nie mogą się powtarzać!");
            }
            System.out.println("Dla liczby i=" + i + " Wprowadziłeś wartość " + array.get(i));
        }

        //Zadanie 2 i 4
        System.out.println();
        System.out.println();

        for(int i = 0; i < array.size(); i++){
            System.out.println("Liczba["+i+"] = "+array.get(i));
        }
        try {
            for(int j=0;j<5;j++){
                System.out.println("Podaj indeks danej:");
                array.remove(scanner.nextInt());
            }
        }catch (java.util.InputMismatchException InputMismatchException){
            System.out.println("Niepoprawny typ podanych danych!");
        }catch (IndexOutOfBoundsException indexOutOfBoundsException){
            System.out.println("Przekroczono wartość danej!");
        }

        //Zadanie 3
        System.out.println();
        System.out.println();

        for (int h = 0; h < 2; h++) {
            System.out.println("Podaj indeks danej którą chcesz podmienić:");
            int x1 = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Co mam podmienić? " + array.get(x1));
            String y1 = scanner.nextLine();
            array.set(x1, y1);
        }
        for (int i = 0; i < array.size(); i++) {
            System.out.println("Dane[" + i + "] = " + array.get(i));
        }
    }
}
