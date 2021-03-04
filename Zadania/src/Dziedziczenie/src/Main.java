class main
{

    public static void main(String[] args)
    {
        System.out.println();

        // Zadanie.1
        Kwadrat kwadrat = new Kwadrat(4);
        System.out.println(kwadrat.obliczPole());

        Prostokat prostokat = new Prostokat(4,2);
        System.out.println(prostokat.poleProstokata());

        System.out.println();

        //Zadanie.2
        Pies pies = new Pies(4, 4, "Azor", "czarna", 12);

        pies.dajGłos();

        System.out.println();

        //Zadanie.3
        Spawacz spawacz = new Spawacz(5000, "Pełny", true, true);
        spawacz.wykonujePrace();

        System.out.println();

        //Zadanie.4
        //a) Metoda 1 i 4.
        //b) W klasie B ukrytą metodą jest metoda 3.

    }
}