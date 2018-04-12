package models.entities;

public class Letter {

	private String letter;
	private int use;
	
	public Letter(String letter) {
		this.letter = letter;
		use = 0;
	}

	public int getUse() {
		return use;
	}

	public void setUse(int use) {
		this.use = use;
	}

	public String getLetter() {
		return letter;
	}

	@Override
	public String toString() {
		return "Letter [letter=" + letter + ", use=" + use + "]";
	}
	
	
}
