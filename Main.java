public class Main {

    public static void main(String[] args) {
        Electeur p = new Electeur("Morin", "Alice", 0.1, 0.9);
        Electeur p1 = new Electeur("Valembois", "Auxane", 0.2, 0.3);

        Candidat c = new Candidat("Monsieur", "Président", 0.5, 0.5);

        System.out.println(p1);
        System.out.println(p);
        System.out.println(c);

    }

}
