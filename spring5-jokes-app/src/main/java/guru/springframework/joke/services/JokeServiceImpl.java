/*
 *  Company: RS
 *  Project: spring5-jokes-app
 *  Created: 9 sty 2019  21:57:23
 *  Author:  RS
 */
package guru.springframework.joke.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 *<p></p><br>9 sty 2019
 * @author RS
 *
 */
@Service
public class JokeServiceImpl implements JokeService{

	private final ChuckNorrisQuotes chuckNorrisQuotes;
	
	
	public JokeServiceImpl() {
		chuckNorrisQuotes = new ChuckNorrisQuotes();
	}


	/* (non-Javadoc)
	 * @see guru.springframework.joke.services.JokeService#getJoke()
	 */
	@Override
	public String getJoke() {
		return chuckNorrisQuotes.getRandomQuote();
	}

}
