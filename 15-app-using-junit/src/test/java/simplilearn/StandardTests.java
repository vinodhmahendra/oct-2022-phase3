package simplilearn;

import static org.junit.Assert.fail;
import static org.junit.Assume.assumeTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class StandardTests {
	
	@BeforeAll
	static void initAll() {
		System.out.println("Executed Before All @Test Methods");
	}

	@BeforeEach
	void init() {
		System.out.println("Executed Before Each @Test Method");
	}	
	
	@AfterEach
	void tearDown() {
		System.out.println("Executed After Each @Test Method");
	}	
	
	@AfterAll
	static void tearDownAll() {
		System.out.println("Exceuted After All @Test Methods");
	}
	
	@Test
	void abortedTest() {
		assumeTrue("abc".contains("Z"));
		fail("test should have been aborted");
	}
	
	@Test
	@Disabled
	void skippedTest() {
		
	}
	
	@Test
	void failingTest() {
		fail("A failing test!");
	}
	
	@Test
	void succedingTest() {
		
	}

}
