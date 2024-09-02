package DiegoBasili.u5_s1_l1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



@ToString
public abstract class Cibo {
    protected Double price;
    protected int calorie;

    public Cibo(Double price, int calorie) {
        this.price = price;
        this.calorie = calorie;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }
}
