package br.com.springboot.DSLista.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.springboot.DSLista.entities.GameList;

/*  Responsável por realizar consultas na base de dados. */

public interface GameListRepository extends JpaRepository<GameList, Long> {

}