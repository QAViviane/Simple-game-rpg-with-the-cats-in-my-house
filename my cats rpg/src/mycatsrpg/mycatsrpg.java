package mycatsrpg;

import java.util.Scanner;

public class mycatsrpg {

	public static void main(String[] args) {
		Scanner readline = new Scanner(System.in);

		characters player = new characters();

		Play game = new Play();

		Menu menu = new Menu();

		int selection = 0;
		int option = 0;
		int characters = 0;
		int phase = 0;

		while (option != 8) {
			option = menu.menu();

			if (option == 1) {
				System.out.println("Pressione 1 para exibir o nome dos personagens");
				characters = readline.nextInt();

				if (characters == 1) {
					player.display_characters();
					player.character_selection();

				}

			}

			if (option == 2) {
				System.out.println("Pressione 1 iniciar a primeira fase");
				phase = readline.nextInt();

				if (phase == 1) {

					System.out.println("Fase 1 iniciada");
					game.phase1();
					game.mob_combat();

				}
			}

			if (option == 3) {
				System.out.println("Escolha uma Dificuldade");
				System.out.println("Pressione 1 para escolher a dificuldade normal");
				System.out.println("Pressione 2 para escolher a dificuldade dificil");
				selection = readline.nextInt();
				if (selection == 1) {
					game.normal_difficulty();
					System.out.println("Dificuldade normal escolhida");
				}
				if (selection == 2) {
					game.hard_difficulty();
					System.out.println("dificuldade dificil escolhida");
				}
			}

			if (option == 4) {
				System.out.println("jogo resetado");
				game.play_again();

			}

			if (option == 5) {
				System.out.println("Encerrando");
				break;

			}

		}

	}

}
