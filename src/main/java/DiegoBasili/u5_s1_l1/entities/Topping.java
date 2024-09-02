package DiegoBasili.u5_s1_l1.entities;

import lombok.Getter;


public class Topping extends Cibo {
    private String name;


    public Topping(String name, Double price, int calorie) {
        super(price, calorie);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Topping{" +
                "name=" + name +
                ", price='" + price + '\'' +
                ", calorie=" + calorie +
                "} ";
    }
}
