package com.app.calcapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.calcapp.dto.CalcDto;

@Controller

public class MainController {

	@GetMapping("/")
	public String showIndex(Model model) {
		CalcDto dto = new CalcDto();
		model.addAttribute("dto", dto);
		return "index";
	}

	@PostMapping("/")
	public String calc(@ModelAttribute CalcDto dto, RedirectAttributes attrib) {
		int n1 = dto.getN1();
		int n2 = dto.getN2();
		String op = dto.getOp();

		int res = 0;
		if (op.equals("add")) {
			res = n1 + n2;
		} else if (op.equals("sub")) {
			res = n1 - n2;
		} else if (op.equals("mult")) {
			res = n1 * n2;
		} else if (op.equals("div")) {
			res = n1 / n2;
		} else if (op.equals("mod")) {
			res = n1 % n2;
		}

		String msg = "Result  : " + res;
		attrib.addFlashAttribute("msg", msg);
		return "redirect:/";

	}
}
