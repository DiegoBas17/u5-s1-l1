package DiegoBasili.u5_s1_l1;

import DiegoBasili.u5_s1_l1.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U5S1L1Application {

	public static void main(String[] args) {
		SpringApplication.run(U5S1L1Application.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(U5S1L1Application.class);
		Menu menu =context.getBean(Menu.class);
		menu.stampaMenu();
	}


}
