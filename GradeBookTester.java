import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	
	GradeBook group1;
	GradeBook group2;

	@BeforeEach
	void setUp() throws Exception {
		
		group1 = new GradeBook(5);
		group2 = new GradeBook(5);
		
		group1.addScore(78);
		group1.addScore(84);
		group1.addScore(98);
		group1.addScore(63);
		group1.addScore(100);
		
		group2.addScore(54);
		group2.addScore(76);
		group2.addScore(81);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		
		group1 = group2 = null;
	}

	@Test
	void testAddScore() {
		
		assertTrue((group1.toString()).equals("78.0 84.0 98.0 63.0 100.0 "));
		assertTrue((group2.toString()).equals("54.0 76.0 81.0 0.0 0.0 "));
		
		assertEquals(5, group1.getScoreSize());
		assertEquals(3, group2.getScoreSize());
		
	}


	@Test
	void testSum() {
		
		assertEquals(423, group1.sum());
		assertEquals(211, group2.sum());
		
	}

	@Test
	void testMinimum() {
		
		assertEquals(63, group1.minimum());
		assertEquals(54, group2.minimum());
		
	}

	@Test
	void testFinalScore() {
		
		assertEquals(360, group1.finalScore());
		assertEquals(157, group2.finalScore());
		
	}


}
