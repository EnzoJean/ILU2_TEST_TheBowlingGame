package tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {
	private Game game = new Game();
	
//	@Test
//	public void test1Niveau1() {
//		game.roll(0);
//		assertEquals(game.score(), 0);
//	}
//	
//	@Test
//	public void test2Niveau1() {
//		for (int i =0; i<20; ++i) {
//			game.roll(0);
//		}
//		assertEquals(game.score(), 0);
//	}
//	
//	@Test
//	public void test3Niveau1() {
//		for (int i =0; i<20; ++i) {
//			game.roll(1);
//		}
//		assertEquals(game.score(), 20);
//	}
//	
//	@Test
//	public void test4Niveau1() {
//		for (int i =0; i<10; ++i) {
//			game.roll(1);
//			game.roll(2);
//		}
//		assertEquals(game.score(), 30);
//	}
//	
//	@Test
//	public void Niveau2() {
//		game.roll(7);
//		game.roll(3);
//		game.roll(4);
//		for (int i=0; i<17; ++i) {
//			game.roll(0);
//		}
//		assertEquals(game.score(), 18);
//	}
//	
//	@Test
//	public void Niveau3() {
//		game.roll(10);
//		game.roll(3);
//		game.roll(4);
//		for (int i=0; i<16; ++i) {
//			game.roll(0);
//		}
//		assertEquals(game.score(), 24);
//	}
//	
//	@Test
//	public void Niveau4() {
//		game.roll(1);
//		game.roll(2);
//		game.roll(10);
//		game.roll(0);
//		game.roll(10);
//		game.roll(4);
//		game.roll(2);
//		game.roll(0);
//		game.roll(10);
//		game.roll(6);
//		game.roll(2);
//		game.roll(0);
//		game.roll(10);
//		game.roll(6);
//		game.roll(4);
//		game.roll(8);
//		game.roll(2);
//		game.roll(2);
//		game.roll(7);
//		assertEquals(game.score(), 122);
//	}
//	
//	@Test
//	public void Niveau5() {
//		game.roll(1);
//		game.roll(2);
//		game.roll(10);
//		game.roll(0);
//		game.roll(10);
//		game.roll(4);
//		game.roll(2);
//		game.roll(0);
//		game.roll(10);
//		game.roll(6);
//		game.roll(2);
//		game.roll(0);
//		game.roll(10);
//		game.roll(6);
//		game.roll(4);
//		game.roll(8);
//		game.roll(2);
//		game.roll(2);
//		game.roll(8);
//		game.roll(8);
//		assertEquals(game.score(), 131);
//	}
	
	@Test
	public void Niveau6() {
		for (int i =0; i<12;++i) {
			System.out.println(i);
			game.roll(10);
		}
		assertEquals(game.score(), 300);
	}
	
}
