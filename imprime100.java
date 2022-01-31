
public class imprime100 {
	
	public static void imprimeIntervalo(int valorInicial, int valorFinal) {
		for(int i=valorInicial; i<valorFinal+1; i++) {
			String textoSaida = Integer.toString(i);
			if (i%3==0) {
				textoSaida = (i%5!=0)?"Foo":"FooBaa";
				}
			else if (i%5==0) {
				textoSaida = "Baa";
				}
			System.out.println(textoSaida);
		}
	}
	
	public static void main (String[] args) {
		int valorInicial = 1;
		int valorFinal = 100;
		imprimeIntervalo(valorInicial, valorFinal);
	}

}
