package org.generation.italy;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class RootController {

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/books")
	public String books(Model model) {
		model.addAttribute("title", "Books");
		model.addAttribute("list",
				Arrays.asList("How Beautiful We Were by Imbolo Mbue", "Intimacies by Katie Kitamura",
						"The Love Songs of W.E.B. Du Bois by Honor&eacuto;e Fanonne Jeffers",
						"No One Is Talking About This by Patricia Lockwood",
						"When We Cease to Understand the World by Benjam&iacuto; Labatut"));
		return "list";
	}
	@GetMapping("/songs")
	public String songs(Model model) {
		model.addAttribute("title", "Songs");
		model.addAttribute("list",
				Arrays.asList("Wizkid feat. Tems, 'Essence'","Taylor Swift, 'All Too Well (10 Minute Version)'","Olivia Rodrigo, 'Drivers License'","Lil Nas X, 'Montero (Call Me By Your Name)'","Lucy Dacus, 'VBS'"));
		return "list";
	}
	@GetMapping("/series")
	public String series(Model model) {
		model.addAttribute("title", "Series");
		model.addAttribute("list",
				Arrays.asList("The Great","Hacks", "Only Murders in the Building","Reservation Dogs", "Succession"));
		return "list";
	}
	@GetMapping("/movies")
	public String movies(Model model) {
		model.addAttribute("title", "Movies");
		model.addAttribute("list",
				Arrays.asList("Dune", "Spencer", "The Card Counter", "Drive My Car", "Passing"));
		return "list";
	}

}
