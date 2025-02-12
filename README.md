
# Java Snacks



## Authors

- [@ErikaPezzini](https://github.com/ErikaPezzini)


## Exercise

Snack 1:
	Contatore di Auto
Crea una classe Auto con:
Un numero di telaio (final int numeroTelaio) univoco assegnato automaticamente alla creazione.
Una variabile static int contatoreAuto per tenere traccia del numero totale di auto create.
Un modello (final String modello) assegnato al momento della creazione e non modificabile.
Ogni volta che viene creata una nuova Auto, il contatore deve aumentare e il numero di telaio deve essere assegnato in modo incrementale.
Implementa un metodo static int getNumeroTotaleAuto() che restituisca il numero totale di auto create.
Scrivi un programma che:
Crei alcune auto e stampi il loro numero di telaio e modello.
Stampi il numero totale di auto create.
Snack 2:
	Sistema di Conversione Valute
Crea una classe ConvertitoreValute che contenga un array di tassi di cambio (es. da EUR a USD, GBP, JPY...) dichiarato come final static per impedire modifiche.
Implementa un metodo static double converti(String da, String a, double importo), che accetta la valuta di partenza, quella di destinazione e l'importo da convertire, restituendo il valore convertito.
Il programma deve accettare input dall’utente (valuta di partenza, valuta di destinazione, importo) e restituire l’importo convertito.