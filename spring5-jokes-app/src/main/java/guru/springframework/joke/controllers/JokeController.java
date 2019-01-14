/*
 *  Company: RS
 *  Project: spring5-jokes-app
 *  Created: 14 sty 2019  21:51:45
 *  Author:  RS
 */
package guru.springframework.joke.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.joke.services.JokeService;

/**
 *<p></p><br>14 sty 2019
 * @author RS
 *
 */
@Controller
public class JokeController {

	private JokeService jokeService;

	@Autowired
	public JokeController(JokeService jokeService) {
		this.jokeService = jokeService;
	}
	
	@RequestMapping({"/", ""})
	public String showJoke(Model model) {
		 model.addAttribute("joke", jokeService.getJoke());
		 
		 return "chucknorris";
	}
}
