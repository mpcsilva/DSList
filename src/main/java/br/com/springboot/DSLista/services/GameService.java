package br.com.springboot.DSLista.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.springboot.DSLista.dto.GameDTO;
import br.com.springboot.DSLista.dto.GameMinDTO;
import br.com.springboot.DSLista.entities.Game;
import br.com.springboot.DSLista.repositories.GameRepository;

/* Responsável por implentar os metódos com a lógica de negócio */

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;

	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);
	}
	

	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
}