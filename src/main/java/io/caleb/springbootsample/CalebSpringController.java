package io.caleb.springbootsample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalebSpringController {

	@RequestMapping("/HelloWorld")
	public String helloWorld() {
		return "Hello World!";
	}
	
	@GetMapping("/SquareMyNumber/{number}")
	public double squareMyNumber(@PathVariable double number){
		if(number == 0)
			return 0;
		//This function will square the incoming double value and return it.
		return Math.pow(number, 2);
	}
	
	@GetMapping("/AddTen")
	public double addTen(@RequestBody double number) {
		return number + 10;
	}
	
	@PostMapping("/Person")
	public String addPerson(@RequestBody PersonDto person) {
		return person.firstName + " " + person.lastName + " received!";
	}
}
