package org.generation.italy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/movies")
public class MovieController {

	@GetMapping("/{title}")
	public String movieDetail(Model model, @PathVariable("title") String title) {
		model.addAttribute("type", "movies");
		model.addAttribute("title", title);
		model.addAttribute("description", "A small side door led into the whitewashed corridor from which the three bedrooms opened. Holmes refused to examine the third chamber, so we passed at once to the second, that in which Miss Stoner was now sleeping, and in which her sister had met with her fate. It was a homely little room, with a low ceiling and a gaping fireplace, after the fashion of old country-houses. A brown chest of drawers stood in one corner, a narrow white-counterpaned bed in another, and a dressing-table on the left-hand side of the window. These articles, with two small wicker-work chairs, made up all the furniture in the room save for a square of Wilton carpet in the centre. The boards round and the panelling of the walls were of brown, worm-eaten oak, so old and discoloured that it may have dated from the original building of the house. Holmes drew one of the chairs into a corner and sat silent, while his eyes travelled round and round and up and down, taking in every detail of the apartment.\n"
				+ "\n"
				+ "\"Where does that bell communicate with?\" he asked at last pointing to a thick bell-rope which hung down beside the bed, the tassel actually lying upon the pillow.\n"
				+ "\n"
				+ "\"It goes to the housekeeper's room.\"\n"
				+ "\n"
				+ "\"It looks newer than the other things?\"\n"
				+ "\n"
				+ "\"Yes, it was only put there a couple of years ago.\"\n"
				+ "\n"
				+ "\"Your sister asked for it, I suppose?\"\n"
				+ "\n"
				+ "\"No, I never heard of her using it. We used always to get what we wanted for ourselves.\"\n"
				+ "\n"
				+ "\"Indeed, it seemed unnecessary to put so nice a bell-pull there. You will excuse me for a few minutes while I satisfy myself as to this floor.\" He threw himself down upon his face with his lens in his hand and crawled swiftly backward and forward, examining minutely the cracks between the boards. Then he did the same with the wood-work with which the chamber was panelled. Finally he walked over to the bed and spent some time in staring at it and in running his eye up and down the wall. Finally he took the bell-rope in his hand and gave it a brisk tug.");
		return "detail";
	}
}
