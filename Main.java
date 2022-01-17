public class Main {

    public static void main(String[] args) {
        Electeur p = new Electeur("Morin", "Alice");
        Electeur p1 = new Electeur("Valembois", "Auxane");

        Candidat c = new Candidat("Monsieur", "Président");

        System.out.println(p1);
        System.out.println(p);
        System.out.println(c);

    }

}
