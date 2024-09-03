package DiegoBasili.u5_s1_l1;

import DiegoBasili.u5_s1_l1.entities.Menu;
import DiegoBasili.u5_s1_l1.entities.Ordine;
import DiegoBasili.u5_s1_l1.entities.Tavolo;
import DiegoBasili.u5_s1_l1.enums.StatoOrdine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class MyRunner implements CommandLineRunner {
    @Autowired
    private Menu menu;
    @Autowired
    private Ordine ordine;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("inizio run");
        menu.stampaMenu();

        System.out.println(ordine);
        System.out.println("il conto del tavolo numero " + ordine.getNumeroTavolo()+ " è: €"  +ordine.conto());

        System.out.println("fine run");
    }

}
