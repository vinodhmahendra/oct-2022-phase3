package simplilearn;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

public class RepeatedTests {
	
	@RepeatedTest(5)
	void addNumber(RepetitionInfo repetitionInfo) {
		System.out.println("#: " + repetitionInfo.getCurrentRepetition());
	}

}
