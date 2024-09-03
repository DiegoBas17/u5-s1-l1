package DiegoBasili.u5_s1_l1.entities;

import DiegoBasili.u5_s1_l1.enums.StatoTavolo;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


public class Tavolo {
    private int numeroTavolo;
    private int numeroCopertiMassimo;
    private StatoTavolo statoTavolo;

    public Tavolo(int numeroTavolo, int numeroCopertiMassimo) {
        this.numeroTavolo = numeroTavolo;
        this.numeroCopertiMassimo = numeroCopertiMassimo;
        this.statoTavolo = StatoTavolo.LIBERO;
    }

    public int getNumeroTavolo() {
        return numeroTavolo;
    }

    public void setNumeroTavolo(int numeroTavolo) {
        this.numeroTavolo = numeroTavolo;
    }

    public StatoTavolo getStatoTavolo() {
        return statoTavolo;
    }

    public void setStatoTavolo(StatoTavolo statoTavolo) {
        this.statoTavolo = statoTavolo;
    }

    public int getNumeroCopertiMassimo() {
        return numeroCopertiMassimo;
    }

    public void setNumeroCopertiMassimo(int numeroCopertiMassimo) {
        this.numeroCopertiMassimo = numeroCopertiMassimo;
    }
}
