import java.util.Scanner;
import java.util.Random;

public class TrabalhoJogoMatematica {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random ra = new Random();
		int opcao;
		
		do {
			int tentativa = 5, pontuacao = 0, resposta, respostaCorreta;
			
			System.out.println("     Jogo da Matematica     ");
			System.out.println("****************************");
			System.out.println("* 1 - Novo Jogo            *");
			System.out.println("* 2 - Sair                 *");
			System.out.println("****************************");
			System.out.print("Selecione a opcao a cima: ");
			opcao = sc.nextInt();

			if (opcao == 1) {
				System.out.println("      Selecione o Nivel     ");
				System.out.println("****************************");
				System.out.println("* 1 - Soma e Subtracao     *");
				System.out.println("* 2 - Multiplicacao        *");
				System.out.println("* 3 - Divisao              *");
				System.out.println("* 4 - Todos                *");
				System.out.println("****************************");
				System.out.print("Selecione a opcao a cima: ");
				int nivel = sc.nextInt();

				while (tentativa > 0) {
					if (nivel == 1) {
						for (int i=1; i<=10; i++) {	
							int num1 = ra.nextInt(100);
							int num2 = ra.nextInt(100);
							int operacao = ra.nextInt(100);

							if (operacao < 50) {
								respostaCorreta = num1 + num2; 
								System.out.println("Tentativas Restantes: "+tentativa+" Pontuacao: "+pontuacao);
								System.out.println("Nivel "+nivel+" Rodada"+i);
								System.out.print(num1+" + "+num2+" = ");
								resposta = sc.nextInt();
							} else {
								respostaCorreta = num1 - num2; 
								System.out.println("Tentativas Restantes: "+tentativa+" Pontuacao: "+pontuacao);
								System.out.println("Nivel "+nivel+" Rodada"+i);
								System.out.print(num1+" - "+num2+" = ");
								resposta = sc.nextInt();
							}

							if (resposta == respostaCorreta) {
								System.out.println("Correto!!!!!\n");
								pontuacao++;
							} else {
								System.out.println("Errado!!! Resposta Correta é: "+respostaCorreta);
								tentativa--;
							}

							if (tentativa == 0) {
								System.out.println("Voce errou de mais HAHHAHAHAHA\n");
								break;
							}
						}
						nivel++;
					} else if (nivel == 2) {
						for (int i=1; i<=10; i++) {
							int num1 = ra.nextInt(100);
							int num2 = ra.nextInt(10);

							respostaCorreta = num1 * num2; 
							System.out.println("Tentativas Restantes: "+tentativa+" Pontuacao: "+pontuacao);
							System.out.println("Nivel "+nivel+" Rodada"+i);
							System.out.print(num1+" x "+num2+" = ");
							resposta = sc.nextInt();

							if (resposta == respostaCorreta) {
								System.out.println("Correto!!!!!\n");
								pontuacao++;
							} else {
								System.out.println("Errado!!! Resposta Correta é: "+respostaCorreta);
								tentativa--;
							}

							if (tentativa == 0) {
								System.out.println("Voce errou de mais HAHHAHAHAHA\n");
								break;
							}
						}
						nivel++;
					} else if (nivel == 3) {
						for (int i=1; i<=10; i++) {
							int num1 = 0;
							int num2 = 0;
							do {
								num1 = ra.nextInt(100);
								num2 = ra.nextInt(10)+1;
								respostaCorreta = num1 / num2;
							} while (num1%num2 != 0);
					
							
							System.out.println("Tentativas Restantes: "+tentativa+" Pontuacao: "+pontuacao);
							System.out.println("Nivel "+nivel+" Rodada"+i);
							System.out.print(num1+" / "+num2+" = ");
							resposta = sc.nextInt();

							if (resposta == respostaCorreta) {
								System.out.println("Correto!!!!!\n");
								pontuacao++;
							} else {
								System.out.println("Errado!!! Resposta Correta é: "+respostaCorreta);
								tentativa--;
							}

							if (tentativa == 0) {
								System.out.println("Voce errou de mais HAHHAHAHAHA\n");
								break;
							}
						}
						nivel++;
					} else {
						for (int i=1; i<=10; i++) {
							int operacao = ra.nextInt(100);

							if (operacao < 25) {
								int num1 = ra.nextInt(100);
								int num2 = ra.nextInt(100);
								respostaCorreta = num1 + num2; 
								System.out.println("Tentativas Restantes: "+tentativa+" Pontuacao: "+pontuacao);
								System.out.println("Nivel "+nivel+" Rodada"+i);
								System.out.print(num1+" + "+num2+" = ");
								resposta = sc.nextInt();	
							} else if (operacao < 50) {
								int num1 = ra.nextInt(100);
								int num2 = ra.nextInt(100);
								respostaCorreta = num1 - num2; 
								System.out.println("Tentativas Restantes: "+tentativa+" Pontuacao: "+pontuacao);
								System.out.println("Nivel "+nivel+" Rodada"+i);
								System.out.print(num1+" - "+num2+" = ");
								resposta = sc.nextInt();
							} else if (operacao < 75) {
								int num1 = ra.nextInt(100);
								int num2 = ra.nextInt(10);
								respostaCorreta = num1 * num2; 
								System.out.println("Tentativas Restantes: "+tentativa+" Pontuacao: "+pontuacao);
								System.out.println("Nivel "+nivel+" Rodada"+i);
								System.out.print(num1+" x "+num2+" = ");
								resposta = sc.nextInt();
							} else {
								int num1 = 0;
								int num2 = 0;
								do {
									num1 = ra.nextInt(100);
									num2 = ra.nextInt(10)+1;
									respostaCorreta = num1 / num2;
								} while (num1%num2 != 0);
								System.out.println("Tentativas Restantes: "+tentativa+" Pontuacao: "+pontuacao);
								System.out.println("Nivel "+nivel+" Rodada"+i);
								System.out.print(num1+" / "+num2+" = ");
								resposta = sc.nextInt();
							}

							if (resposta == respostaCorreta) {
								System.out.println("Correto!!!!!\n");
								pontuacao++;
							} else {
								System.out.println("Errado!!! Resposta Correta é: "+respostaCorreta);
								tentativa--;
							}

							if (tentativa == 0) {
								System.out.println("Voce errou de mais HAHHAHAHAHA\n");
								break;
							}
						}
						System.out.println("Sua pontuação: \n\n"+pontuacao);
						break;
					}
				}
			}
		} while (opcao != 2);
		System.out.println("Ate mais...");
	}
}