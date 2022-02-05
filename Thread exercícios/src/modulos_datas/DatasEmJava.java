package modulos_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatasEmJava {
		
		public static void main(String[] args) throws ParseException {
			
			//COMPARANDO DATAS USANDO COMO EXEMPLO, O VENCIMENTO DE UM BOLETO//
			
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
			
			Date dataVencimentoBoleto = simpleDateFormat.parse("10/04/2022");
			Date dataAtualHoje = simpleDateFormat.parse("07/04/2022");
			
			if(dataVencimentoBoleto.after(dataAtualHoje)) {
				System.out.println("BOLETO NÃO VENCIDO");
			}else {
				System.out.println("PENDENTE DE PAGAMENTO");
			}
			
		}

}
