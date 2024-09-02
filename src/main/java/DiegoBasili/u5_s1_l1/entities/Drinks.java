package DiegoBasili.u5_s1_l1.entities;



public class Drinks extends Cibo {
    private String name;
    private Double litri;


    public Drinks(String name, Double price, int calorie, Double litri) {
        super(price, calorie);
        this.litri = litri;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Drinks{" +
                "name='" + name + '\'' +
                ", litri=" + litri +
                ", price=" + price +
                ", calorie=" + calorie +
                "} ";
    }
}
