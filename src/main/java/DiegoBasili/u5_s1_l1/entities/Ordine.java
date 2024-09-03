package DiegoBasili.u5_s1_l1.entities;

import DiegoBasili.u5_s1_l1.enums.StatoOrdine;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@PropertySource("application.properties")

public class Ordine {
    private int numeroOrdine;
    private List<Cibo> comanda;
    private StatoOrdine statoOrdine;
    private int numeroCoperti;
    private LocalDateTime oraAcquisizione;
    private int numeroTavolo;
    @Value("${costo.coperto}")
    private double costoCoperto;

    public Ordine(int numeroOrdine, StatoOrdine statoOrdine, int numeroCoperti, LocalDateTime oraAcquisizione, int numeroTavolo) {
        this.numeroOrdine = numeroOrdine;
        this.comanda = new ArrayList<>();
        this.statoOrdine = StatoOrdine.IN_CORSO;
        this.numeroCoperti = numeroCoperti;
        this.oraAcquisizione = oraAcquisizione;
        this.numeroTavolo = numeroTavolo;
    }

    public void addElementoComanda(Cibo cibo) {
        comanda.add(cibo);
    }


    public Double conto() {
    double toteleComanda = comanda.stream().mapToDouble(Cibo::getPrice).sum();
    double totaleCoperto = numeroCoperti * costoCoperto;
    return toteleComanda + totaleCoperto;
    }


    public int getNumeroOrdine() {
        return numeroOrdine;
    }

    public void setNumeroOrdine(int numeroOrdine) {
        this.numeroOrdine = numeroOrdine;
    }

    public double getCostoCoperto() {
        return costoCoperto;
    }

    public void setCostoCoperto(double costoCoperto) {
        this.costoCoperto = costoCoperto;
    }

    public List<Cibo> getComanda() {
        return comanda;
    }

    public void setComanda(List<Cibo> comanda) {
        this.comanda = comanda;
    }

    public StatoOrdine getStatoOrdine() {
        return statoOrdine;
    }

    public void setStatoOrdine(StatoOrdine statoOrdine) {
        this.statoOrdine = statoOrdine;
    }

    public int getNumeroCoperti() {
        return numeroCoperti;
    }

    public void setNumeroCoperti(int numeroCoperti) {
        this.numeroCoperti = numeroCoperti;
    }

    public LocalDateTime getOraAcquisizione() {
        return oraAcquisizione;
    }

    public void setOraAcquisizione(LocalDateTime oraAcquisizione) {
        this.oraAcquisizione = oraAcquisizione;
    }

    public int getNumeroTavolo() {
        return numeroTavolo;
    }

    public void setNumeroTavolo(int numeroTavolo) {
        this.numeroTavolo = numeroTavolo;
    }

    @Override
    public String toString() {
        return "Ordine{" +
                "numeroOrdine=" + numeroOrdine +
                ", comanda=" + comanda +
                ", statoOrdine=" + statoOrdine +
                ", numeroCoperti=" + numeroCoperti +
                ", oraAcquisizione=" + oraAcquisizione +
                ", numeroTavolo=" + numeroTavolo +
                ", costoCoperto=" + costoCoperto +
                '}';
    }
}
