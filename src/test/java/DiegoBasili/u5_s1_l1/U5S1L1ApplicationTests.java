package DiegoBasili.u5_s1_l1;

import DiegoBasili.u5_s1_l1.entities.Cibo;
import DiegoBasili.u5_s1_l1.entities.Ordine;
import DiegoBasili.u5_s1_l1.entities.Pizza;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class U5S1L1ApplicationTests {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(U5S1L1Application.class);
	@Autowired
	private Ordine ordine;

	private static Stream<Arguments> listaOrdini() {
		return Stream.of(
				Arguments.of(Arrays.asList(new Pizza("margherita", 10, 200), new Pizza("adffa", 15, 300)), 2, 31),
				Arguments.of(Arrays.asList(new Pizza("margherita", 10, 200), new Pizza("adffa", 10, 300)), 2, 26),
				Arguments.of(Arrays.asList(new Pizza("margherita", 10, 200), new Pizza("adffa", 20, 300)), 6, 48),
				Arguments.of(Arrays.asList(new Pizza("margherita", 10, 200), new Pizza("adffa", 18, 300)), 4, 40)
		);
	}


	@ParameterizedTest
	@MethodSource("listaOrdini")
	void testConto(List<Cibo> comanda, int numeroCoperti, double expectedTotal) {
		ordine.setComanda(comanda);
		ordine.setNumeroCoperti(numeroCoperti);
		Double totale = ordine.conto();
		assertEquals(expectedTotal, totale);
	}

Pizza margherita= (Pizza) context.getBean("margherita");
Pizza hawaiana = (Pizza) context.getBean("hawaiana");


	@Test
	void prezzopizza() {
		double prezzo = margherita.getPrice();
		assertEquals(prezzo, 7.5);
	}
}
