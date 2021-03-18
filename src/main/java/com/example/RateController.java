package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RateController {
	
	@Value("${rate}")
	private String rate;
	
	@Value("${lanecount}")
	private String laneCount;
	
	@Value("${tollstart}")
	private String tollStart;

	@GetMapping("/rate")
	public String getRate(Model m) {
		m.addAttribute("rateAmount", rate);
		m.addAttribute("lanes", laneCount);
		m.addAttribute("tollStart", tollStart);

		// Name of the View
		return "rateview";
	}
}
