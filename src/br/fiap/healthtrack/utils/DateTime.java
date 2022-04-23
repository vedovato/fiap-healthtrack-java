package br.fiap.healthtrack.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
	private LocalDateTime date;
	
	public DateTime() {
		this.date = LocalDateTime.now();
	}
	
	public LocalDateTime get() {		
		return this.date;
	}
	
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
		return dtf.format(this.date);
	}

	public String dateTimeToString(LocalDateTime dtInclusao) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return dtf.format(dtInclusao);
	}

	public LocalDateTime StringToDate(String dtNascimento) {
		// TODO Auto-generated method stub
		this.date = LocalDateTime.now();
		return this.date; 
	}
}
