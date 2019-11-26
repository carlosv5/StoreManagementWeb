package es.upm.storeManagement;

import java.util.Optional;

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
	public String saveOrder(Model model, @RequestParam String title, @RequestParam(value="element[]") String[] elements) {
		Order order = new Order(title, elements);
		repository.save(order);
		long id = repository.count();
		model.addAttribute("id", id);
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
		model.addAttribute("id", id);
		model.addAttribute("title", repository.findById(id).get().getTitle());
		model.addAttribute("elements", repository.findById(id).get().getElement());
		
		return "show_order";
	}
	
	@GetMapping("/editOrder")
	public String showOrder(Model model, @RequestParam long id, @RequestParam String title, @RequestParam(value="element[]") String[] elements) {
		repository.deleteById(id);
		Order order = new Order(title, elements);
		//repository.save(order);
		model.addAttribute("title", title);
		model.addAttribute("elements", elements);
		
		return "editOrder";
	}
		
}