public class ConvertitoreValute {
    private static final double [] tassiCambio = {1.0, 1.21, 0.85, 130.0};

    public static double converti(String da, String a, double importo){
        int indiceDa = valutaIndex(da);
        int indiceA = valutaIndex(a);

        if (indiceDa == -1 || indiceA == -1){
            System.out.println("Valuta non supportata.");
            return -1;
        }

        return importo * (tassiCambio[indiceA]/tassiCambio[indiceDa]);
    }

    private static int valutaIndex(String valuta){
        switch (valuta.toUpperCase()){
            case "EUR": return 0;
            case "USD": return 1;
            case "GBP": return 2;
            case "JPY": return 3;
            default: return -1;
        }
    }
}
