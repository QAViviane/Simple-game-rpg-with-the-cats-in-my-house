package mycatsrpg;

import java.util.ArrayList;
import java.util.Scanner;

public class characters {

	public characters() {

		initialize();
	}

	public ArrayList<list_of_cats> cats = new ArrayList<list_of_cats>();
	Scanner in = new Scanner(System.in);

	public void initialize() {
		list_of_cats character1 = new list_of_cats();
		character1.setName(" Abu ");
		character1.setdescription(" Dorminhoco ");
		character1.setlife(16);
	    cats.add(character1);

		list_of_cats character2 = new list_of_cats();
		character2.setName(" Coin ");
		character2.setdescription(" Bagunceiro ");
		character2.setlife(16);
		cats.add(character2);

		list_of_cats character3 = new list_of_cats();
		character3.setName(" Abua ");
		character3.setdescription(" Carinhosa ");
		character3.setlife(16);
		cats.add(character3);
	}

	public void display_characters() {

		for (int i = 0; i < cats.size(); i++) {
			System.out.println("====================================");
			System.out.println("Nome:" + cats.get(i).getName());
			System.out.println("Descricao:" + cats.get(i).getdescription());
			System.out.println("Vida:" + cats.get(i).getlife());
			System.out.println("====================================");
		}

	}

	public void character_selection() {

		int amount = cats.size();
		for (int i = 0; i < amount; i++) {
			System.out.println(cats.get(i).getName() + i);

		}
		System.out.println("Escolha seu personagem");
		int i = in.nextInt();
		System.out.println("Personagem escolhido:" + cats.get(i).getName());
	}

	
}
		
		

	
	
	
	

