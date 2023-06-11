package mycatsrpg;

public class list_of_cats {

	public list_of_cats() {

		setlife(16);
	}

	private String name;
	private String description;
	private int life;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getdescription() {
		return description;
	}

	public void setdescription(String description) {
		this.description = description;
	}

	public int getlife() {
		return life;
	}

	public void setlife(int life) {
		
		this.life = life;
		
	}

}
