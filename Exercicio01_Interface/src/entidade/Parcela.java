package entidade;

import java.time.LocalDate;
import java.util.Date;

public class Parcela {
    private LocalDate data;
    private Double valor;

    public Parcela(LocalDate data, Double valor) {
        this.data = data;
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
