public class Samochod implements Pojazd
{
    public boolean stop;

    @Override
    public void stop()
    {
        System.out.println("STOP!");
    }

    public void skrecwLewo()
    {
        System.out.println("Skręc w lewo");
    }
}
