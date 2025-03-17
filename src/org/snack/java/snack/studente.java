package org.snack.java.snack;

// Scrivi una classe Studente con i seguenti attributi: nome, cognome, età. Implementa un costruttore che accetta tre parametri per inizializzare questi attributi. Aggiungi un metodo che restituisca una stringa concatenata dei valori (es. Anselmo Bitta, 24 anni).

public class Studente {

    // creo le var da popolare
private String nome;
private String cognome;
private int age;

// creo il costruttore 

public Studente(String nome, String cognome, int age) {
    this.nome = nome;
    this.cognome = cognome;
    this.age = age;
}

public String getnome(){
    return this.nome;
}

public void setnome(String nome){
    this.nome = nome;
}

public String getcognome(){
    return this.cognome;
}

public void setcognome(String cognome){
    this.cognome = cognome;
}

public int getage(){
    return this.age;
}

public void setetà(int age){
    this.age = age;
}

public String toString(){
    return "Studente [" + nome + "" + " " +" " + cognome + " "+ " ," + "" + age + "]";
}

}



