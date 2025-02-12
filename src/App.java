import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Auto auto1 = new Auto("Fiat 500");
        Auto auto2 = new Auto("Forde Fiesta");
        Auto auto3 = new Auto("BMW X3");

        auto1.stampaDettagli();
        auto2.stampaDettagli();
        auto3.stampaDettagli();

        System.out.println("Numero totale di auto: " + Auto.getNumeroTotaleAuto());

        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci la valuta di partenza (EUR, USD, GBP, JPY): ");
        String da = scan.nextLine();

        System.out.println("Inserisci la valuta di destinazione (EUR, USD, GBP, JPY): ");
        String a = scan.nextLine();

        System.out.println("Inserisci l'importo da convertire: ");
        double importo = scan.nextDouble();

        double importoConvertito = ConvertitoreValute.converti(da, a, importo);

        if (importoConvertito != -1){
            System.out.println("Importo convertito: " + importoConvertito);
        }

        scan.close();
    }
}
