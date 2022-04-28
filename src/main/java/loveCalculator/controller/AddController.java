package loveCalculator.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddController {
	
	@RequestMapping("/add")
	public String addIt(HttpServletRequest request, Model model) {
		int sum = 10;
		model.addAttribute("sumResult", sum);
		System.out.println("add route working");
		return "add";
	}
}
