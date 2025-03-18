package org.snack.java.snack.student;
// Crea una classe RegistroAlunni che rappresenti un registro di alunni. Utilizza un array privato per memorizzare oggetti Alunno. Implementa un costruttore senza parametri per inizializzare il registro vuoto e un metodo pubblico per aggiungere alunni al registro. Aggiungi un metodo che stampi la lista degli studenti.

public class RegistroAlunni {
    // cero un array vuoto per inserire gli studenti
   private Studente[] registro; 
//    creo una var per tenere traccia del numero di studenti inseriti
// mi servirà per determinare se ho ancora spazio nel registro o no
    private int numeroStudenti; 

    // Costruttore senza parametri che inizializza il registro vuoto con una dimensione di 100 
    public RegistroAlunni() {
        // creo un array di 100 posti 
        registro = new Studente[100]; 
        // inizzializzo il contatore a 0 
        numeroStudenti = 0; 
    }

// Metodo per aggiungere uno studente al registro
public void aggiungiStudente(Studente studente) {
    // faccio prima un controllo per vedere se ho spazio nel registro usando la var che ho creato prima
    if (numeroStudenti < registro.length) { 
        // in caso di spazio aggiungo lo studente e aumento il contatore
        registro[numeroStudenti] = studente;
        numeroStudenti++; }
    //  altrimento dico che il registro è pieno (devo gestirlo diversamente?)
    else {
        System.out.println("Il registro è pieno!");
    }
}

// Metodo per stampare la lista degli studenti registrati
public void stampaRegistro() {
    System.out.println("Elenco degli studenti:");
    // faccio un ciclo for classico con incremento per avere la lista
    for (int i = 0; i < numeroStudenti; i++) {
        System.out.println(registro[i]);
    }
}
}



