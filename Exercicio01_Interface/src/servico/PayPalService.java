package servico;

import interfaces.PagamentoOnlineServico;

public class PayPalService implements PagamentoOnlineServico {
    @Override
    public Double calculoDaTaxa(Double valor) {
        return valor * 0.02;
    }

    @Override
    public Double calculoDoJuros(Double valor, Integer mes) {
        return (valor *0.01)*mes;
    }
}
