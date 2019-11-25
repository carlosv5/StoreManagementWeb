package es.upm.storeManagement;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OrdersController {
	
	 @Autowired
	 private OrdersRepository repository;
	 
	 @PostConstruct
	 public void init() {
	 String[] test = {"test","test2","test3"};
	 repository.save(new Order("Order de prueba 1", test));
	 repository.save(new Order("Order de prueba 2", test));
	 }

	 @RequestMapping("/saveOrder")
	public String saveOrder(Model model, @RequestParam String title, @RequestParam String element) {
		//Order order = new Order(title, string[] {element})
		String[] elements = {element};
		repository.save(new Order(title, elements));
		model.addAttribute("title", title);
		model.addAttribute("elements", elements);
		
		return "show_order";
	}

	@GetMapping("/")
	public String greeting(Model model) {
		model.addAttribute("orders", repository.findAll());
		
		return "index";
	}
	
	@RequestMapping("/order/{id}")
	public String showOrder(Model model, @PathVariable long id) {
		model.addAttribute("title", repository.findById(id).get().getTitle());
		model.addAttribute("elements", repository.findById(id).get().getElement());
		
		return "show_order";
	}
	
	@GetMapping("/editOrder")
	public String showOrder(Model model, @RequestParam String title, @RequestParam String element) {
		String[] elements = {element};
		repository.save(new Order(title, elements));
		model.addAttribute("title", title);
		model.addAttribute("element", element);
		
		return "editOrder";
	}
		
}