package io.caleb.springbootsample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalebSpringController {

	@RequestMapping("/HelloWorld")
	public String helloWorld() {
		return "Hello World!";
	}
}
