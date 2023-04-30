package torresDeHanoi;

import java.time.Duration;
import java.util.Stack;

public class Movimento {
	/*
	 * Lavínia Rocha Leite
	 * 3° Período
	 */
	
	public static int movimentaEmTorre(int discos) {
		Stack<Integer> torre1 = new Stack<>();
		Stack<Integer> torre2 = new Stack<>();
		Stack<Integer> torre3 = new Stack<>();
        for (int i = discos; i >= 1; i--) {
            torre1.push(i);
        }
        
		int movimentos = movimentar(discos, torre1, torre2, torre3);
		return movimentos;
	}
	
	
	public static int movimentar(int numeroDiscos, Stack<Integer> origem, Stack<Integer> destino, Stack<Integer> auxiliar) {
	int movimentos = 0;
	if(numeroDiscos > 0) {
		movimentos += movimentar(numeroDiscos - 1, origem, auxiliar, destino);
		int disco= origem.pop();
		auxiliar.push(disco);

		movimentos += movimentar(numeroDiscos - 1,  auxiliar, destino, origem);
		disco = auxiliar.pop();
		destino.push(disco);

		movimentos++;
	}
	
	return movimentos;
	}

	public static String formatandoTempo(Duration duracao) {
	    long minutos = duracao.toMinutes();
	    long segundos = duracao.getSeconds() % 60;
	    long milissegundos = duracao.toMillis() % 1000;

	    //HH:mm:ss:mmm
	    return String.format("%02d:%02d:%02d:%03d", minutos / 60, minutos % 60, segundos, milissegundos);
	}
}
