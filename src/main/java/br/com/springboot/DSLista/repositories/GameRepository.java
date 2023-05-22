package br.com.springboot.DSLista.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.springboot.DSLista.entities.Game;

/*  Responsável por realizar consultas na base de dados. */

public interface GameRepository extends JpaRepository<Game, Long> {

}