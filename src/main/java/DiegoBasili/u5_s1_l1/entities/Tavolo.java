package DiegoBasili.u5_s1_l1.entities;

import DiegoBasili.u5_s1_l1.enums.StatoTavolo;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class Tavolo {
    private int numeroTavolo;
    private int numeroCopertiMassimo;
    private StatoTavolo statoTavolo;

    public Tavolo(int numeroTavolo, int numeroCopertiMassimo) {
        this.numeroTavolo = numeroTavolo;
        this.numeroCopertiMassimo = numeroCopertiMassimo;
        this.statoTavolo = StatoTavolo.LIBERO;
    }
}
