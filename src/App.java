public class App {
    public static void main(String[] args) throws Exception {
        Auto auto1 = new Auto("Fiat 500");
        Auto auto2 = new Auto("Forde Fiesta");
        Auto auto3 = new Auto("BMW X3");

        auto1.stampaDettagli();
        auto2.stampaDettagli();
        auto3.stampaDettagli();

        System.out.println("Numero totale di auto: " + Auto.getNumeroTotaleAuto());
    }
}
