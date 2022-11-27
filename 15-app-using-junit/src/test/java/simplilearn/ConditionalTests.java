package simplilearn;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

@DisplayName("Test on which platform")
public class ConditionalTests {

	
	@Test
	@EnabledOnOs({OS.WINDOWS})
	@DisplayName("windows operating system")
	void executeOnWindowsOS() {
		System.out.println("windows");
	}
	
	@Test
	@EnabledOnOs({OS.LINUX})
	@DisplayName("linux operating system")
	void executeOnLinuxOS() {
		System.out.println("linux");
	}
}
