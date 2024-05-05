package entidade;

import interfaces.PagamentoOnlineServico;
import servico.PayPalService;
import servico.ServicoDeContrato;

import java.time.LocalDate;
import java.util.*;

public class Contrato {
    private Integer numero;
    private LocalDate data;
    private Double valor;


    List<Parcela> parcelas = new ArrayList<>();

    public Contrato(Integer numero, LocalDate data, Double valor) {
        this.numero = numero;
        this.data = data;
        this.valor = valor;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
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

    public List<Parcela> getParcelas() {
        return parcelas;
    }

    public void setParcelas(List<Parcela> parcelas) {
        this.parcelas = parcelas;
    }

    public void setParcela(Parcela parcela) {
        this.parcelas.add(parcela);
    }
}
