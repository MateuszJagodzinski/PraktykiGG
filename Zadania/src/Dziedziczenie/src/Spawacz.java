public class Spawacz extends Praca
{
    private boolean niebezpieczna;

    public Spawacz(double pensja, String etat, boolean fajna, boolean niebezpieczna)
    {
        super(pensja, etat, fajna);
        this.niebezpieczna = niebezpieczna;
    }

    public void wykonujePrace()
    {
        System.out.println("Spawam");
    }
    public boolean isNiebezpieczna()
    {
        return niebezpieczna;
    }

    public void setNiebezpieczna(boolean niebezpieczna)
    {
        this.niebezpieczna = niebezpieczna;
    }
}
