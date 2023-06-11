package mycatsrpg;

import java.util.Scanner;

public class Menu {

	int option = 0;

	Scanner hold = new Scanner(System.in);

	public int menu() {

		System.out.println("Menu");
		System.out.println("----------------------------------------------");
		System.out.println("Pressione 1 para Escolher personagen");
		System.out.println("                                              ");
		System.out.println("Pressione 2 iniciar o jogo");
		System.out.println("                                              ");
		System.out.println("Pressione 3 Para Alterar dificuldade ");
		System.out.println("                                              ");
		System.out.println("Pressione 4 para jogar novamente ");
		System.out.println("                                              ");
		System.out.println("Pressione 5 para sair ");
		option = hold.nextInt();
		return option;
	}

}
