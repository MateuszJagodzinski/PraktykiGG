public interface Pojazd
{
    default void skrecWLewo()
    {
        System.out.println("Skręcam w lewo");
    }

    default void stop()
    {
        System.out.println("Zatrzymuje się");
    }
}