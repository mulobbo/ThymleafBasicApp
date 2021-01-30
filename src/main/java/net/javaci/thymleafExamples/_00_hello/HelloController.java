package net.javaci.thymleafExamples._00_hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HelloController {
	
	@GetMapping("merhaba")
	public String renderhello(Model model) {
		
		model.addAttribute("welcome_message","Merhaba arkadaşlarrrr");
		return "hello";
	}
	@GetMapping("merhaba2")
	public String renderhello2(Model model,@RequestParam(required = false, defaultValue = "World") String name) {
		model.addAttribute("name", name);
		return "hello2";
	}
	
	

}
