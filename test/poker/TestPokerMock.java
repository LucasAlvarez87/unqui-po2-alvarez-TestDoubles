package poker;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPokerMock {

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
		Carta spyCarta1 = spy(carta1);
		Carta spyCarta2 = spy(carta2); 
		
		pokerStatus.esMismoValor(spyCarta1, spyCarta2);
		
		
		verify(spyCarta1).getValor();
		verify(spyCarta2).getValor();
		
	}
	
	
	@Test
	public void dosCartasSonDeIgualValorFalso() {
		Carta spyCarta1 = spy(carta1);
		Carta spyCarta6 = spy(carta6); 
		
		
		assertFalse(pokerStatus.esMismoColor(spyCarta1, spyCarta6));
		
		verify(spyCarta1).getColor();
		verify(spyCarta6).getColor();
	}
	
	@Test
	public void dosCartasSonDeMismoColorVerdadero() {
		Carta spyCarta1 = spy(carta5);
		Carta spyCarta6 = spy(carta6);
		
		assertTrue(pokerStatus.esMismoColor(spyCarta1,spyCarta6));
		
		verify(spyCarta1).getColor();
		verify(spyCarta6).getColor();
		
	}
	
	
}
