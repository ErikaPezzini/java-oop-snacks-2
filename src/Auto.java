public class Auto {
    private static int contatoreAuto = 0;
    private final int numeroTelaio;
    private final String modello;

    public Auto(String modello){
        this.modello = modello;
        contatoreAuto++;
        this.numeroTelaio = contatoreAuto;
    }

    public static int getNumeroTotaleAuto(){
        return contatoreAuto;
    }

    public void stampaDettagli (){
        System.out.println("Numero Telaio: " + numeroTelaio + ", Modello: " + modello);
    }
}
