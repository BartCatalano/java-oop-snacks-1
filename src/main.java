import org.snack.java.snack.student.ContoBancario;
import org.snack.java.snack.student.RegistroAlunni;
import org.snack.java.snack.student.Studente;

public class main {
public static void main(String[] args) {

    // inizializzo studente e lo stampo
    Studente studente1 = new Studente("Mario", "Rossi", 25);
    System.out.println(studente1.toString());

    // creo un registro per gli studenti
     RegistroAlunni registro = new RegistroAlunni();
    //  aggiungo uno studente creato direttamente nel registro
     registro.aggiungiStudente(new Studente("Anna", "Bianchi", 22));
     registro.aggiungiStudente(new Studente("Federico", "Quintieri", 22));
    //  aggiungo uno studente creato nello snack numero 1
     registro.aggiungiStudente(studente1);
      // Stampa il registro
      registro.stampaRegistro();

    //   usando questa soluzione nel primo snack assegno a mario il nome della var studente1, mentre nel secondo caso uso solo la classe studente per creare il secondo direttamente nel registro. anna esiste solo nel registro o come studente1 esiste esiste indipendentemente dalregistro?

    


//    inizializzo conto corrente e lo stampo
ContoBancario contoBancario1 = new ContoBancario("1254asdas4asda34");
   System.out.println("Saldo attuale " + contoBancario1.getSaldo() + " euro");
   contoBancario1.deposita(500);
   
   contoBancario1.preleva(200);
   
}
}
