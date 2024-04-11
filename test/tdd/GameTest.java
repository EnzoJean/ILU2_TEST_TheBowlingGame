package tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class GameTest {
	private Game game = new Game();
	
	@Test
	public void test1Niveau1() {
		game.roll(0);
		assertEquals(game.score(), 0);
	}
	
	@Test
	public void test2Niveau1() {
		for (int i =0; i<20; ++i) {
			game.roll(0);
		}
		assertEquals(game.score(), 0);
	}
	
	@Test
	public void test3Niveau1() {
		for (int i =0; i<20; ++i) {
			game.roll(1);
		}
		assertEquals(game.score(), 20);
	}
	
	@Test
	public void test4Niveau1() {
		for (int i =0; i<10; ++i) {
			game.roll(1);
			game.roll(2);
		}
		assertEquals(game.score(), 30);
	}
}
