package poker;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PokerStatus {
	
/*
	public String verificar(String c1, String c2, String c3, String c4, String c5 ) {
		if (this.esPoker(c1, c2, c3, c4, c5)) {
			return "Poker";
		}
		else if (this.esTrio(c1, c2, c3, c4, c5)) {
			return "Trio";
		}
		else if (this.esColor(c1, c2, c3, c4, c5)) {
			return "Color";
		}
		else {
			return "Nada";
		}
	}
	
	public boolean esPoker(String c1, String c2, String c3, String c4, String c5 ) {
		List <String> cartas = Arrays.asList(c1,c2,c3,c4,c5);
		Stream <String> igualesAC1 = cartas.stream().filter(c -> this.esMismoValor(c1, c)); 
		Stream <String> igualesAC2 = cartas.stream().filter(c -> this.esMismoValor(c2, c)); 
		return igualesAC1.count() == 4 || igualesAC2.count() == 4;
		
	}
	
	public boolean esMismoValor(String c1, String c2){
			Character ch1 = c1.charAt(0);
			Character ch2 = c2.charAt(0);
			return ch1.equals(ch2) && c1.length() == c2.length();
	}
	
	public PokerStatus() {
		super();
	}
	
	public boolean esMismoColor(String c1, String c2) {
		 Character ch1 = c1.charAt((c1.length()-1));
		 Character ch2 = c2.charAt((c2.length()-1));
		 return ch1.equals(ch2);
	}
	
	public boolean esTrio(String c1, String c2, String c3, String c4, String c5 ) {
		List <String> cartas = Arrays.asList(c1,c2,c3,c4,c5);
		Stream <String> igualesAC1 = cartas.stream().filter(c -> this.esMismoValor(c1, c)); 
		Stream <String> igualesAC2 = cartas.stream().filter(c -> this.esMismoValor(c2, c)); 
		Stream <String> igualesAC3 = cartas.stream().filter(c -> this.esMismoValor(c3, c)); 
		return igualesAC1.count() == 3 || igualesAC2.count() == 3 || igualesAC3.count() == 3;
	}
	
	public boolean esColor(String c1, String c2, String c3, String c4, String c5 ) {
		List <String> cartas = Arrays.asList(c1,c2,c3,c4,c5);
		Stream <String> igualesAC1 = cartas.stream().filter(c -> this.esMismoColor(c1, c));
		return igualesAC1.count() == 5;
	}
	*/
	
	public String verificar(Carta c1, Carta c2, Carta c3, Carta c4, Carta c5 ) {
		if (this.esPoker(c1, c2, c3, c4, c5)) {
			return "Poker";
		}
		else if (this.esTrio(c1, c2, c3, c4, c5)) {
			return "Trio";
		}
		else if (this.esColor(c1, c2, c3, c4, c5)) {
			return "Color";
		}
		else {
			return "Nada";
		}
	}
	
	public boolean esPoker(Carta c1, Carta c2, Carta c3, Carta c4, Carta c5 ) {
		List <Carta> cartas = Arrays.asList(c1,c2,c3,c4,c5);
		Stream <Carta> igualesAC1 = cartas.stream().filter(c -> this.esMismoValor(c1, c)); 
		Stream <Carta> igualesAC2 = cartas.stream().filter(c -> this.esMismoValor(c2, c)); 
		return igualesAC1.count() == 4 || igualesAC2.count() == 4;
		
	}
	
	public boolean esMismoValor(Carta c1, Carta c2){
		return c1.getValor().equals(c2.getValor());
	}
	
	public PokerStatus() {
		super();
	}
	
	public boolean esMismoColor(Carta c1, Carta c2) {
		 return c1.getColor().equals(c2.getColor());
	}
	
	public boolean esTrio(Carta c1, Carta c2, Carta c3, Carta c4, Carta c5 ) {
		List <Carta> cartas = Arrays.asList(c1,c2,c3,c4,c5);
		Stream <Carta> igualesAC1 = cartas.stream().filter(c -> this.esMismoValor(c1, c)); 
		Stream <Carta> igualesAC2 = cartas.stream().filter(c -> this.esMismoValor(c2, c)); 
		Stream <Carta> igualesAC3 = cartas.stream().filter(c -> this.esMismoValor(c3, c)); 
		return igualesAC1.count() == 3 || igualesAC2.count() == 3 || igualesAC3.count() == 3;
	}
	
	public boolean esColor(Carta c1, Carta c2, Carta c3, Carta c4, Carta c5 ) {
		List <Carta> cartas = Arrays.asList(c1,c2,c3,c4,c5);
		Stream <Carta> igualesAC1 = cartas.stream().filter(c -> this.esMismoColor(c1, c));
		return igualesAC1.count() == 5;
	}
}
