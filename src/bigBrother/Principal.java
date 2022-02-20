package bigBrother;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Emparedado artur = new Emparedado();
		Emparedado natalia = new Emparedado();
		Scanner entrada = new Scanner(System.in);
		
		artur.setNome("Artur");
		natalia.setNome("Natalia");
		
		int votacao = 0;
		int choice = 0;
		int totalVotos = 0;
		int totalVotosArtur = 0;
		int totalVotosNatalia = 0 ;
		
		
		do {			
			System.out.println("***Bem vindo!***\n" +
								"***Vote em quem voce deseja que saia do jogo***\n");
			System.out.println("***Digite 1 para votar no Artur***\n"+ 
								"***Digite 2 para votar na Natalia***\n"+
								"***Difite 3 para ver o o total de votos atual***\n"+
								"***Digite 4 para Encerrar a votação***\n");
			votacao = entrada.nextInt();
			switch (votacao) {
			case 1:
				System.out.println("**Voce votou no: " + artur.getNome());
				totalVotosArtur = totalVotosArtur + 1;
				artur.setVotos(totalVotosArtur);
				totalVotos = totalVotos + 1;
				System.out.println(totalVotosArtur);
				break;
				
			case 2:
				System.out.println("Voce votou na: " + natalia.getNome());
				totalVotosNatalia = totalVotosNatalia + 1;
				natalia.setVotos(totalVotosNatalia);
				totalVotos = totalVotos + 1;
				break;				
			case 3:
				votacao = 3;
				System.out.println("Total de votos apurados: " + totalVotos);
				break;
				
			case 4:
				System.out.println("***Obrigado por participar***");
				System.out.println("Resultado da votacao: \n"+"Toal de votos "+ 
				totalVotos +"\n Total votos " + artur.getNome()+": " + totalVotosArtur +
				"\n Total votos "+ natalia.getNome() + ": " +totalVotosNatalia+ 
				"\n Total de Votos apurados: " + totalVotos);
				break;
			default:
				System.out.println("Opção Inválida, " + "por favor digite uma opção válida");
				break;
			}
			if (votacao != 4) {
				System.out.println("Deseja Escolher Outra Opção? \n" + " 1 - SIM\n" + "2 - NÃO");
				choice = entrada.nextInt();
			}else {
				System.out.println("******Volte Sempre!******");
				break;
			}
			
		} while (choice == 1);
		
	
	}

}
