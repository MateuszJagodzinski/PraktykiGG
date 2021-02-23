public class Main2
{
    //Zadanie 1
    public static void main(String[] args) {
        System.out.println("");
        char firstLetterOfAnAlphabet = 'A';

        for (int i = 0; i < 26; i++) {
            if (i % 2 == 0)
                System.out.print(firstLetterOfAnAlphabet + " ");
            firstLetterOfAnAlphabet++;
            System.out.print("");

        }

        System.out.println("");
        System.out.println("");

        //Zadanie 2
        int a = 0;
        int b = 1;
        int x = 8;

        for(int i = 1; i < x; ++i) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println("");
    }
}
