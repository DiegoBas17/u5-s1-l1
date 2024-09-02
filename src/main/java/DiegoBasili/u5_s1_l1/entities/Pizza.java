package DiegoBasili.u5_s1_l1.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
public class Pizza extends Cibo {
    private String name;
    private List<Topping> toppings;

    public Pizza(String name, double prezzo, int calorie) {
        super(prezzo, calorie);
        this.name = name;
        this.toppings = new ArrayList<>();
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    @Override
    public String toString() {
        String toppingList = toppings.isEmpty() ? "" : " (" + toppings.stream().map(Topping::getName).collect(Collectors.joining(", ")) + ")";
        return "Pizza{" +
                "name='" + name + '\'' +
                ", toppings=" + toppingList +
                ", price=" + price +
                ", calorie=" + calorie +
                "} ";
    }
}
