package org.snack.java.snack.student;

import java.math.BigDecimal;

// Crea una classe ContoBancario con attributi per numero di conto e saldo. Implementa un costruttore che accetta il numero di conto e inizializza il saldo a zero. Aggiungi metodi pubblici per depositare denaro sul conto, prelevare denaro dal conto e ottenere il saldo corrente.
public class ContoBancario {
    // creo le var da popolare
    private String numeroConto;
    private double saldo;
    
    // creo il costruttore
    public ContoBancario(String numeroConto){
      this.numeroConto = numeroConto;
      this.saldo = 0.0;

    }

    // faccio i get e set
public String getNumeroConto(){
    return this.numeroConto;
}

public void setNumeroConto(String numeroConto){
    this.numeroConto = numeroConto;
}

public double getSaldo(){
    return this.saldo;
}

public void setSaldo(double saldo){
    this.saldo = saldo;
}
// Metodo per depositare denaro
public void deposita(double importo) {
    if (importo > 0) {
        saldo += importo;
        System.out.println("Deposito effettuato. Nuovo saldo: " + saldo);
    } else {
        System.out.println("L'importo del deposito deve essere positivo.");
    }
}

// Metodo per prelevare denaro inserendo dei controlli per evitare di ritirare soldi che non si possiedono
public boolean preleva(double importo) {
    if (importo > 0 && importo <= saldo) {
        saldo -= importo;
        System.out.println("Prelievo effettuato. Nuovo saldo: " + saldo);
        return true;
    } else {
        System.out.println("Prelievo non consentito. Importo non valido o saldo insufficiente.");
        return false;
    }
}


}
