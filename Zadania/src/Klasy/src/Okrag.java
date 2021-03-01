public class Okrag {
    private double promien;
    private double pole;
    private double srednica;

    public Okrag(double promien) {
        this.promien = promien;
    }

    void setSrednica() {
        System.out.println(promien * 2);
    }
    void setPole() {
        System.out.println(promien * promien * 3.14);
    }
    void obwodkola() {
        System.out.println(2*3.14*promien);
    }
}

