package mycatsrpg;

import java.util.Random;

public class Play extends list_of_cats {

	private int mob;

	private int miniboss;

	private int boss;

	private int dice;

	private int moblife;

	private int minibosslife;

	private int bosslife;

	public Play() {

		normal_difficulty();

	}

	public int getMob() {
		return mob;
	}

	public void setMob(int damage) {

		mob = damage;

	}

	public int getMiniboss() {
		return miniboss;
	}

	public void setMiniboss(int damage) {

		miniboss = damage;

	}

	public int getBoss() {
		return boss;
	}

	public void setBoss(int damage) {

		boss = damage;

	}

	public int getdice() {
		return dice;
	}

	public void setdice(int dice) {
		this.dice = dice;
	}

	public int getmoblife() {
		return moblife;
	}

	public void setMoblife(int life) {

		moblife = life;

	}

	public int getMinibosslife() {
		return minibosslife;
	}

	public void setMinibosslife(int life) {

		minibosslife = life;
	}

	public int getBosslife() {
		return bosslife;
	}

	public void setBosslife(int life) {

		bosslife = life;

	}

	public void Dice() {
		int dice;
		int sidesofthedice = 6;
		Random number = new Random();
		dice = number.nextInt(sidesofthedice);
		setdice(dice);
		System.out.println("Dado rolando");
		System.out.println("                                   ");
		System.out.println("O dado parou no número " + getdice());
		System.out.println("                                   ");

	}

	public void phase1() {

		if (getlife() >= 1) {
			System.out.println("                                   ");
			System.out.println("Mob do Papa apareceu");
			System.out.println("-------------------------");
			System.out.println("Poder de ataque = " + getMob());
			System.out.println("-------------------------");
			System.out.println("Vida = " + getmoblife());
			System.out.println("-------------------------");
			System.out.println("                     ");
			System.out.println("====================================");
			System.out.println("Vida do Heroi: " + getlife());
			System.out.println("====================================");

		} else {

			System.out.println("Sem vida o suficiente");

		}

	}

	public void mob_combat() {

		while (getlife() >= 1) {
			System.out.println("                                    ");
			System.out.println("////////////////////////////////////");
			System.out.println("Combate em andamento");
			System.out.println("////////////////////////////////////");

			Dice();

			if (getdice() >= getmoblife()) {
				System.out.println("Mob morreu");
				System.out.println("Matou o mob com sucesso");
				System.out.println("fase finalizada");
				phase2();
				miniboss_combat();
				break;

			} else {
				System.out.println("Não matou o mob e sofreu um ataque");
				setMoblife(getmoblife() - getdice());
				setlife(getlife() - getMob());

			}

		}

		lose();

	}

	public void phase2() {

		if (getlife() >= 1) {
			System.out.println("                                   ");
			System.out.println("A fase 2 começou");
			System.out.println("-------------------------");
			System.out.println("White cat apareceu");
			System.out.println("-------------------------");
			System.out.println("Ele esta muito bravo");
			System.out.println("poder de ataque = " + getMiniboss());
			System.out.println("-------------------------");
			System.out.println("                         ");
			System.out.println("====================================");
			System.out.println("Vida do Heroi: " + getlife());
			System.out.println("====================================");

		} else {

			System.out.println("Sem vida o suficiente");

		}

	}

	public void miniboss_combat() {

		while (getlife() >= 1) {
			System.out.println("                                    ");
			System.out.println("////////////////////////////////////");
			System.out.println("Combate em andamento");
			System.out.println("////////////////////////////////////");

			Dice();

			if (getdice() >= getMinibosslife()) {
				System.out.println("Miniboss morreu");
				System.out.println("Matou o miniboss com sucesso");
				System.out.println("fase finalizada");
				phase3();
				boss_combat();
				break;

			} else {
				System.out.println("Não matou o miniboss e sofreu um ataque");
				setMinibosslife(getMinibosslife() - getdice());
				setlife(getlife() - getMiniboss());

			}

		}

		lose();

	}

	public void phase3() {

		if (getlife() >= 1) {
			System.out.println("                                   ");
			System.out.println("-------------------------");
			System.out.println("Fase 3 iniciada");
			System.out.println("                         ");
			System.out.println("Papa apareceu!");
			System.out.println("-------------------------");
			System.out.println("Poder de ataque" + getBoss());
			System.out.println("-------------------------");
			System.out.println("                         ");
			System.out.println("====================================");
			System.out.println("Vida do Heroi: " + getlife());
			System.out.println("====================================");

		} else {

			System.out.println("Sem vida o suficiente, jogue novamente");

		}

	}

	public void boss_combat() {

		while (getlife() >= 1) {
			System.out.println("                                    ");
			System.out.println("////////////////////////////////////");
			System.out.println("Combate em andamento");
			System.out.println("////////////////////////////////////");

			Dice();

			if (getdice() >= getBosslife()) {
				System.out.println("                                    ");
				System.out.println("Boss morreu");
				System.out.println("                                    ");
				System.out.println("O grande Papa foi derrotado ");
				System.out.println("Agora todos estão livres Parabens voce ganhou ");
				System.out.println("fase finalizada");
				break;

			} else {
				System.out.println("não matou o Papa");
				System.out.println("Papa diz HAHAHA");
				setBosslife(getBosslife() - getdice());
				setlife(getlife() - getBoss());

			}

		}

		lose();

	}

	public void lose() {

		if (getlife() <= 0) {

			System.out.println("game over, tente novamente");
			setdice(0);

		}

	}

	public void normal_difficulty() {

		setMob(3);
		setMoblife(6);
		setMiniboss(7);
		setMinibosslife(10);
		setBoss(8);
		setBosslife(14);
	}

	public void hard_difficulty() {

		setMob(6);
		setMoblife(8);
		setMiniboss(8);
		setMinibosslife(14);
		setBoss(10);
		setBosslife(12);
	}

	public void play_again() {
		setlife(16);

	}

}
