package br.com.springboot.DSLista.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.springboot.DSLista.dto.GameListDTO;
import br.com.springboot.DSLista.entities.GameList;
import br.com.springboot.DSLista.projection.GameMinProjection;
import br.com.springboot.DSLista.repositories.GameListRepository;
import br.com.springboot.DSLista.repositories.GameRepository;

/* Responsável por implentar os metódos com a lógica de negócio */

@Service
public class GameListService {

	@Autowired
	private GameListRepository gameListRepository;

	@Autowired
	private GameRepository gameRepository;

	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(GameListDTO::new).toList();
	}

}