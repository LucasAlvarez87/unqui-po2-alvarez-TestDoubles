package poker;

public enum Valor {
	AS,DOS,TRES,CUATRO,CINCO,SEIS,SIETE,OCHO,NUEVE,DIEZ,J,Q,K;
	
	public boolean esMayorA(Valor valor) {
		return this.compareTo(valor) > 0;
	}
	
	public static void main(String[] args) {
		System.out.print(AS.esMayorA(CINCO));
	}
}
