package poker;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*; 


public class TestPoker {

	private PokerStatus pokerStatus;
	private Carta carta1;
	private Carta carta2;
	private Carta carta3;
	private Carta carta4;
	private Carta carta5;
	private Carta carta6;
	private Carta carta7;
	private Carta carta8;
	private Carta carta9;
	
	@BeforeEach
	public void setUp() {
		pokerStatus = new PokerStatus();
		carta1 = new Carta(Valor.AS, Color.CORAZONES);
		carta2 = new Carta(Valor.AS, Color.DIAMANTES);
		carta3 = new Carta(Valor.AS, Color.PICAS);
		carta4 = new Carta(Valor.AS, Color.TREBOLES);
		carta5 = new Carta(Valor.CINCO, Color.TREBOLES);
		carta6 = new Carta(Valor.SEIS, Color.TREBOLES);
		carta7 = new Carta(Valor.DIEZ, Color.TREBOLES);
		carta8 = new Carta(Valor.CUATRO, Color.TREBOLES);
		carta9 = new Carta (Valor.DIEZ, Color.DIAMANTES);
	}
	
	@Test
	public void dosCartasSonDeIgualValorVerdadero() {
		assertTrue(pokerStatus.esMismoValor(carta1, carta2));
	}
	
	@Test
	public void dosCartasSonDeIgualValorFalso() {
		assertFalse(pokerStatus.esMismoValor(carta1, carta6));
	}
	
	/*
	@Test
	public void testDeVerificarVerdadero() {
		assertTrue(pokerStatus.verificar("2D","2C", "2P", "2T", "JP"));
	}
	
	@Test
	public void testDeVerificarFalso() {
		assertFalse(pokerStatus.verificar("2D","2C", "2P", "JT", "JP"));
	}
	*/
	
	@Test
	public void dosCartasSonDeMismoColorVerdadero() {
		assertTrue(pokerStatus.esMismoColor(carta5,carta6));
	}
	
	@Test
	public void dosCartasSonDeMismoColorFalso() {
		assertFalse(pokerStatus.esMismoColor(carta1,carta4));
		
	}
	
	@Test
	public void esTrio() {
		assertEquals("Trio", pokerStatus.verificar(carta1,carta2,carta3,carta5,carta6));
	}
	
	@Test
	public void esColor() {
		assertEquals("Color", pokerStatus.verificar(carta4,carta5,carta6,carta7,carta8));
	}
	
	@Test
	public void esPoker() {
		assertEquals("Poker", pokerStatus.verificar(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	public void noEsNada() {
		assertEquals("Nada", pokerStatus.verificar(carta1,carta2,carta6,carta9,carta5));
	}
	
	@Test
	public void cartaEsMayorA(){
		assertTrue(carta5.esMayorA(carta1));
	}
	
	
}
