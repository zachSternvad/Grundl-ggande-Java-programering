public class Bok {
    String titel;
    String forfattare;
    int sidor;
    boolean utlanad;

    public Bok(String titel, String forfattare, int sidor) {
        this.titel = titel;
        this.forfattare = forfattare;
        this.sidor = sidor;
        this.utlanad = false;
    }
}
