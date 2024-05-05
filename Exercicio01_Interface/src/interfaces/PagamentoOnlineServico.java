package interfaces;

public interface PagamentoOnlineServico {

    Double calculoDaTaxa(Double valor); //2%
    Double calculoDoJuros(Double valor, Integer mes);//1%
}
