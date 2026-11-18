public class Main {
    public static void main(String[] args) {
        System.out.println("Biblioteket öppnar");

        Bok hobbit = new Bok("Hobbit", "J.R.R. Tolkien", 310);
        Bok momo = new Bok("Momo", "Micheal Ende", 250);
        Bok pippi = new Bok("Pippi Långstrump", "Astrid Lindgren", 160);
        Bok metro = new Bok("Metro: 2033", "Dmitrij Gluchovskij",463);

        System.out.println(hobbit.titel + " av " + hobbit.forfattare);
        System.out.println(momo.titel + " av " + momo.forfattare);
        System.out.println(pippi.titel + " av " + pippi.forfattare);
        System.out.println(metro.titel + " av " + metro.forfattare);

        Lantagare anna = new Lantagare("Anna");
        Lantagare omar = new Lantagare("Omar");
        Lantagare zachery = new Lantagare("Zachery");

        System.out.println(anna.namn + " har " + anna.antalLan + " lån");
        System.out.println(omar.namn + " har " + omar.antalLan + " lån");
        System.out.println(zachery.namn + " har " + zachery.antalLan + " lån");
    }
}
