public class Wino implements podajRocznikWina
{
    public int rocznikWina;
    public String markaWina;

    @Override
    public void rocznikWina()
    {
        System.out.println("1998");
    }

    @Override
    public void markaWina()
    {
        System.out.println("Cabernet Sauvignon");
    }
}