package tdd;

public class Game {
	private int score;
	private int nbLancer;
	private int dernierLancer = 0;

	private int nbLancerDouble = 0;
	private int nbLancerTriple = 0;
	
	public Game() {
		score = 0;
		nbLancer = 0;
	}
	
	public void roll(int nbQuilles) {
		System.out.println("avant : " + score);
		if (nbLancerDouble > 0) {
			score += nbQuilles;
			nbLancerDouble--;
		}
		else if (nbLancerTriple > 0) {
			score += 2*nbQuilles;
			if (nbQuilles != 10)
				nbLancerTriple--;
		}
		score += nbQuilles;
		
		if(nbQuilles == 10 && nbLancer%2 == 0) {
			if (nbLancerDouble == 1 || nbLancerTriple == 1) {
				nbLancerDouble = 0;
				nbLancerTriple = 1;
			}
			else {
				nbLancerDouble = 2;
			}
			nbLancer++;
		}
		
		else if (nbQuilles + dernierLancer == 10 && nbLancer%2 == 1 && nbLancer!=19) {
			nbLancerDouble = 1;
		}
		nbLancer++;
		dernierLancer = nbQuilles;
		System.out.println("apres : " + score+"\n");
	}
	
	public int score() {
		return score;
	}
	
}
