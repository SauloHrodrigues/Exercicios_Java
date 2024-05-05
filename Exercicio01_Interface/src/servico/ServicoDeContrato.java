package servico;

import entidade.Contrato;
import entidade.Parcela;
import interfaces.PagamentoOnlineServico;

public class ServicoDeContrato {
    PagamentoOnlineServico servico;

    public ServicoDeContrato(PagamentoOnlineServico servico) {
        this.servico = servico;
    }

    public void processarContratro(Contrato contrato, Integer numeroDeMeses){
        double valorParcela = contrato.getValor() /numeroDeMeses;


        for(int i= 1; i<= numeroDeMeses; i++){
            double juros = servico.calculoDoJuros(valorParcela,i);
            double taxa = servico.calculoDaTaxa(valorParcela+juros);
            double totalParcela = valorParcela + juros+ taxa;
            contrato.setParcela(new Parcela(contrato.getData().plusDays(30*i), totalParcela));

        }
    }
}
