package Modelos;

import java.util.Scanner;

public class BreakEContinue {

	// Scanner - ENGLISH mode
	Scanner typingData = new Scanner(System.in);

	// Scanner - Modo PORTUGUÊS-BR
	Scanner dadosDigitados = new Scanner(System.in);

	// ToDo list:
	// [...] Transformas os temas em métodos e em classe separada
	// [] Executar os temas na classe principal

	// Exemplo 01 - Usando "While" (Checador de palavras)
	public void checarNumero() {
		int validador = 1;

		while (validador <= 3) {
			System.out.println(" ");
			System.out.println("==================");
			System.out.println("Checador numeral (" + validador + " de 3 utilizações)");
			System.out.println("Digite um número = ");
			int numeroDigitado = dadosDigitados.nextInt();

			if (numeroDigitado == 1) {
				System.out.println("Código 01 (Abracadabra) identificado");
				System.out.println("Execução interrompida.");
				validador++;
				break;
			} else if (numeroDigitado == 2) {
				System.out.println("Código 02 (Reboot) identificado.");
				System.out.println("Execução reiniciada.");
				validador++;
				validador--;
				continue;
			} else {
				System.out.println("Erro! Numeral não identificado. Por favor, tente novamente.");
			}
			validador++;
		}
	}

	// Exemplo 02 - Usando doWhile (Cubo de divisões)
	public void usarCuboDivisor() {
		int contadorDeTentativas = 1;
		do {
			System.out.println(" ");
			System.out.println("================");
			System.out.println("CUBO DIVISOR (" + contadorDeTentativas + " de 5 tentativas)");
			System.out.println("ATENÇÃO: Para utilizar o sistema, ");
			System.out.println("o segundo numero precisa ser maior do que 0 (zero)");
			System.out.println("Insira o primeiro valor = ");
			float inputA = dadosDigitados.nextFloat();

			System.out.println("Agora, insira o segundo valor = ");
			float inputB = dadosDigitados.nextFloat();

			// Autenticador de denominador
			if (inputB == 0) {
				// Este comando "Continue" implica na reinicialização do cubo divisor
				contadorDeTentativas++;
				continue;
			}

			float resultado = inputA / inputB;
			System.out.println("Resultado = ");
			System.out.println(inputA + " / " + inputB + " = " + resultado);
			contadorDeTentativas++;
		} while (contadorDeTentativas <= 5);
	}

	// Exemplo 03 - Usando Switch (Mixer de cores de luzes)
	public void mudarCorDasLuzes() {
		int tentativasDeUso = 1;

		do {
			System.out.println(" ");
			System.out.println("===============");
			System.out.println("Mixer de cores de iluminação (" + tentativasDeUso + " de 5 utilizações)");
			System.out.println("Por favor, digite um nome de coloração = ");
			String corCapturada = dadosDigitados.next();
			switch (corCapturada) {
			case "Verde":
				System.out.println("Cor da lâmpada RGB = " + corCapturada);
				break;
			case "Azul":
				System.out.println("Cor da lâmpada RGB = " + corCapturada);
				break;
			case "Branco":
				System.out.println("Cor da lâmpada RGB = " + corCapturada);
				break;
			case "Amarelo":
				System.out.println("Cor da lâmpada RGB = " + corCapturada);
				break;
			case "Roxo":
				System.out.println("Cor da lâmpada RGB = " + corCapturada);
				break;
			default:
				System.out.println("Erro! Cor ou informação");
				System.out.println("não encontrada no sistema!");
				System.out.println("Por favor, tente novamente.");
			}
			tentativasDeUso++;
		} while (tentativasDeUso <= 5);
	}

	// "Break" and "continue" statements - ENGLISH mode

	// Example 01 - Using while (Word checker)
	public void checkNumber() {
		int validator = 1;

		while (validator <= 3) {
			System.out.println(" ");
			System.out.println("==================");
			System.out.println("Number checker (" + validator + " of 3 uses)");
			System.out.println("Please, type a number = ");
			int typedNumber = typingData.nextInt();

			if (typedNumber == 1) {
				System.out.println("Code 01 (Abracadabra) identified");
				System.out.println("Execution interrupted.");
				validator++;
				break;
			} else if (typedNumber == 2) {
				System.out.println("Code 02 (Reboot) identified.");
				System.out.println("Execution reinitiated.");
				validator++;
				validator--;
				continue;
			} else {
				System.out.println("Error! Number unknown. Please, try again.");
			}
			validator++;
		}
	}

	// Example 02 - Using doWhile (Division cube)
	public void useDivisionsCube() {
		int attemptsChecker = 1;
		do {
			System.out.println(" ");
			System.out.println("================");
			System.out.println("DIVISION CUBE (" + attemptsChecker + " of 5 attempts)");
			System.out.println("ATTENTION: To use the D.C. system, ");
			System.out.println("the 2nd number should be larger than 0 (zero)");
			System.out.println("Type the 1st number = ");
			float inputA = dadosDigitados.nextFloat();

			System.out.println("Now, type the 2nd value = ");
			float inputB = dadosDigitados.nextFloat();

			// Denominator authenticator
			if (inputB == 0) {
				attemptsChecker++;
				// This "continue" command causes the system (And loop) reinitialization
				continue;
			}

			float result = inputA / inputB;
			System.out.println("Result = ");
			System.out.println(inputA + " / " + inputB + " = " + result);
			attemptsChecker++;
		} while (attemptsChecker <= 5);
	}

	// Example 03 - Using Switch (Colorful lights changer)
	public void changeLightsColors() {
		int useAttempts = 1;

		do {
			System.out.println(" ");
			System.out.println("===============");
			System.out.println("RGB lamp color changer (" + useAttempts + " of 5 uses)");
			System.out.println("Please, type a color name = ");
			String corCapturada = typingData.next();
			switch (corCapturada) {
			case "Green":
				System.out.println("RGB lamp color = " + corCapturada);
				break;
			case "Blue":
				System.out.println("RGB lamp color = " + corCapturada);
				break;
			case "White":
				System.out.println("RGB lamp color = " + corCapturada);
				break;
			case "Yellow":
				System.out.println("RGB lamp color = " + corCapturada);
				break;
			case "Purple":
				System.out.println("Cor da lâmpada RGB = " + corCapturada);
				break;
			default:
				System.out.println("Error! Color or information");
				System.out.println("not found in system!");
				System.out.println("Please, try again.");
			}
			useAttempts++;
		} while (useAttempts <= 5);
	}
}
