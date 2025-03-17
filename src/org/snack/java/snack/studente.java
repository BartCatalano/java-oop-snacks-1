package org.snack.java.snack;

public class studente {

    // creo le var da popolare
private String nome;
private String cognome;
private int age;

// creo il costruttore 

public studente(String nome, String cognome, int age) {
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



