public class Client {
	public static void main(String[] args) {
		Roshan roshan = Roshan.instance();
		roshan.levelUp();
		roshan.levelUp();
		System.out.println(roshan);
	}
}

class Roshan {
	private static Roshan roshan = new Roshan();
	private int level = 0;
	private static final int INITIAL_HP = 5000;
	private int hp = INITIAL_HP;
	public String toString() {
		return ("level: " + level + "\n" + "hp: " + hp);
	}
	private void refreshHp() {
		hp = INITIAL_HP + level*1000;
	}
	public void levelUp() {
		level++;
		refreshHp();
	}
	
	private Roshan() {
		
	}
	public static Roshan instance() {
		return roshan;
	}
}