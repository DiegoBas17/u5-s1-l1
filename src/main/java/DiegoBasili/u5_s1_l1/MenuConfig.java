package DiegoBasili.u5_s1_l1;

import DiegoBasili.u5_s1_l1.entities.Drinks;
import DiegoBasili.u5_s1_l1.entities.Menu;
import DiegoBasili.u5_s1_l1.entities.Pizza;
import DiegoBasili.u5_s1_l1.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MenuConfig {

    @Bean
    public Topping pomodoro () {
        return new Topping("Pomodoro", 1.0, 10);
    }

    @Bean
    public Topping mozzarella () {
        return new Topping("Mozzarella", 1.0, 50);
    }

    @Bean
    public Topping prosciutto () {
        return new Topping("Prosciutto", 1.5, 40);
    }

    @Bean
    public Topping ananas () {
        return new Topping("Ananas", 3.0, 20);
    }

    @Bean
    public Topping salame () {
        return new Topping("Salame", 1.5, 100);
    }

    @Bean
    public Pizza margherita () {
        Pizza margherita = new Pizza("Margherita", 7.5, 300);
        margherita.addTopping(pomodoro());
        margherita.addTopping(mozzarella());
        return margherita;
    }

    @Bean
    public Pizza margheritaXL () {
        Pizza margherita = new Pizza("Margherita XL", 12.5, 300);
        margherita.addTopping(pomodoro());
        margherita.addTopping(mozzarella());
        return margherita;
    }

    @Bean
    public Pizza hawaiana () {
        Pizza hawaiana = new Pizza("Hawaiana", 15.5, 250);
        hawaiana.addTopping(pomodoro());
        hawaiana.addTopping(mozzarella());
        hawaiana.addTopping(prosciutto());
        hawaiana.addTopping(ananas());
        return hawaiana;
    }

    @Bean
    public Pizza hawaianaXL () {
        Pizza hawaiana = new Pizza("Hawaiana XL", 20.5, 250);
        hawaiana.addTopping(pomodoro());
        hawaiana.addTopping(mozzarella());
        hawaiana.addTopping(prosciutto());
        hawaiana.addTopping(ananas());
        return hawaiana;
    }

    @Bean
    public Pizza salamella () {
        Pizza salamella = new Pizza("Salamella", 9.5, 350);
        salamella.addTopping(pomodoro());
        salamella.addTopping(mozzarella());
        salamella.addTopping(salame());
        return salamella;
    }

    @Bean
    public Pizza salamellaXL () {
        Pizza salamella = new Pizza("Salamella XL", 18.5, 350);
        salamella.addTopping(pomodoro());
        salamella.addTopping(mozzarella());
        salamella.addTopping(salame());
        return salamella;
    }

    @Bean
    public Drinks limonata () {
        return new Drinks("Limonata", 3.0, 100, 0.4);
    }

    @Bean
    public Drinks acqua () {
        return new Drinks("Acqua", 1.0, 0, 0.5);
    }

    @Bean
    public Drinks cola () {
        return new Drinks("Cola", 2.5, 200, 0.33);
    }

    @Bean
    public Menu menu() {
        Menu menu = new Menu();
        menu.addElemento(margherita());
        menu.addElemento(margheritaXL());
        menu.addElemento(hawaiana());
        menu.addElemento(hawaianaXL());
        menu.addElemento(salamella());
        menu.addElemento(salamellaXL());
        menu.addElemento(pomodoro());
        menu.addElemento(mozzarella());
        menu.addElemento(prosciutto());
        menu.addElemento(ananas());
        menu.addElemento(salame());
        menu.addElemento(limonata());
        menu.addElemento(cola());
        menu.addElemento(acqua());
        return menu;
    }
}
