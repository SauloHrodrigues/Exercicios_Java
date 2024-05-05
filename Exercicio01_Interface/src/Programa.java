import entidade.Contrato;
import entidade.Parcela;
import interfaces.PagamentoOnlineServico;
import servico.PayPalService;
import servico.ServicoDeContrato;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Programa {
    public static void main(String[] args) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Contrato contrato = new Contrato(01,LocalDate.parse("03/05/2024",fmt) ,6000.00);

        ServicoDeContrato servicoDeContrato= new ServicoDeContrato(new PayPalService());
        
        servicoDeContrato.processarContratro(contrato,36);
        for(Parcela p : contrato.getParcelas()){
            System.out.println(p.getData()+" "+p.getValor());
        }
    }
}
