package br.com.springboot.DSLista.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.springboot.DSLista.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}