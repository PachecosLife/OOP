package modulos_datas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatasEmJava {
		
		public static void main(String[] args) {
			
			Date date = new Date();
			
			System.out.println("Data em MILISEGUNDOS = " + date.getTime());
			System.out.println("Dia do MÊS = " + date.getDate());
			System.out.println("Dia da SEMANA = " + date.getDay());
			System.out.println("HORÁRIO = " + date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds());
			System.out.println("ANO = " + (date.getYear() + 1900));
			System.out.println("=====");
			
			//-------------------------- SIMPLE DATE FORMAT ---------------------------//
			//                     ELE FORMATA UMA STRING EM DATA                      //
			
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
			System.out.println("FORMATOU DATA EM STRING = " + simpleDateFormat.format(date));
			
			
		}

}
