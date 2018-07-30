package java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate hoje = LocalDate.now();
		
		LocalDate olimpiadasRio = LocalDate.of(2020, Month.JUNE, 5);
		
		int anos = olimpiadasRio.getYear() - hoje.getYear();
		
		System.out.println(anos);
		
		Period perido = Period.between(hoje, olimpiadasRio);
		System.out.println(perido.getDays());
		
		LocalDate proximaCopa = olimpiadasRio.plusYears(4);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String dataFormatada = proximaCopa.format(formatador);
		
		System.out.println(dataFormatada);
		
		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		
		
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(formatadorComHoras));
		
		LocalTime intervalo = LocalTime.of(15, 30);
		System.out.println(intervalo);
	}

}
