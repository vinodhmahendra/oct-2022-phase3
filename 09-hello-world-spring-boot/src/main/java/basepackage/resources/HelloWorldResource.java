package basepackage.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldResource {

	@RequestMapping(path = "/hello" , method = RequestMethod.GET)
	public String helloWorld() {
		return " Hello World ! Spring Boot!";
	}
}
