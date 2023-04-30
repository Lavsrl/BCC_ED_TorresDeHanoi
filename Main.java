package torresDeHanoi;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
	/*
	 * Lavínia Rocha Leite
	 * 3° Período
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe quantos discos deseja inserir: ");
		int discos = sc.nextInt();
		
		LocalDateTime inicioJogo = LocalDateTime.now(); 
		
		int resultado = Movimento.movimentaEmTorre(discos);
       
        LocalDateTime finalJogo = LocalDateTime.now(); 
        
        Duration totalDuracao = Duration.between(inicioJogo, finalJogo);

		System.out.println("O número de movimentos necessários para a resolução é de: " + resultado);
		
		System.out.println("O tempo para o processo de movimento foi de: " + Movimento.formatandoTempo(totalDuracao));

		
		sc.close();

	}
}
