package simplilearn.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "/showMessage.html")
public class SimpleController {

	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView helloWorld() {
		
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("showMessage");
		
		modelAndView.addObject("message", "Spring MVC! Using Spring Boot");
		
		return modelAndView;
	}
}
