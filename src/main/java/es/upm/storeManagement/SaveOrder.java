package es.upm.storeManagement;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SaveOrder {

	@PostMapping("/saveOrder")
	public String greeting(Model model, @RequestParam String title, @RequestParam String element) {
		model.addAttribute("title", title);
		model.addAttribute("element", element);
		
		return "show_order";
	}
}