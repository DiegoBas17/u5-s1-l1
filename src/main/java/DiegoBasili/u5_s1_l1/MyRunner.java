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

    @Override
    public void run(String... args) throws Exception {
        System.out.println("inizio run");
        menu.stampaMenu();
        Ordine ordine = new Ordine(1, StatoOrdine.IN_CORSO, tavolox2().getNumeroCopertiMassimo(), LocalDateTime.now(), tavolox2().getNumeroTavolo());
        ordine.addElementoComanda(menu.getElementiMenu().get(0));
        ordine.addElementoComanda(menu.getElementiMenu().get(2));
        System.out.println(ordine);

        System.out.println("fine run");
    }

    @Bean
    public Tavolo tavolox6 () {
        return new Tavolo(1, 6);
    }
    @Bean
    public Tavolo tavolox2 () {
        return new Tavolo(1, 2);
    }
    @Bean
    public Tavolo tavolox4 () {
        return new Tavolo(1, 4);
    }

}
