import org.snack.java.snack.studente;
import org.snack.java.student.ContoBancario;

public class main {
public static void main(String[] args) {

    // inizializzo studente e lo stampo
    studente studente1 = new studente("Mario", "Rossi", 25);
    System.out.println(studente1.toString());
    


//    inizializzo conto corrente e lo stampo
ContoBancario contoBancario1 = new ContoBancario("1254asdas4asda34");
   System.out.println("Saldo attuale " + contoBancario1.getSaldo() + " euro");
   contoBancario1.deposita(500);
   
   contoBancario1.preleva(200);
   
}
}
