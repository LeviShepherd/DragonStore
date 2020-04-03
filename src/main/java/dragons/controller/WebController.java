package dragons.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dragons.beans.Dragon;
import dragons.repository.DragonRepository;

@Controller
public class WebController {

	@Autowired
	DragonRepository repo;
	
	@GetMapping({ "/", "viewAll" })
	public String viewAllDragons(Model model) {
		if(repo.findAll().isEmpty()) {
			return addNewDragon(model);
		}
			model.addAttribute("dragons", repo.findAll());
			return "results";
	}
	
	@GetMapping("/inputDragon")
	public String addNewDragon(Model model) {
	Dragon d = new Dragon();
	model.addAttribute("newDragon", d);
	return "input";
	}
	
	@PostMapping("/inputDragon")
	public String addNewDragon(@ModelAttribute Dragon d, Model model) {
		repo.save(d);
		return viewAllDragons(model);
	}
	
	@GetMapping("/edit/{id}")
	public String showUpdateDragon(@PathVariable("id") long id,
	Model model) {
		Dragon d = repo.findById(id).orElse(null);
		model.addAttribute("newDragon", d);
		return "input";
	}
	
	@PostMapping("/update/{id}")
	public
	String reviseDragon(Dragon d, Model model) {
		repo.save(d);
		return viewAllDragons(model);
	}
	
	@GetMapping("/delete/{id}")
	public String deleteDragon(@PathVariable("id") long id, Model model) {
		Dragon d = repo.findById(id).orElse(null);
		repo.delete(d);
		return viewAllDragons(model);
	}
}
