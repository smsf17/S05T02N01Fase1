package cat.itacademy.barcelonactiva.samayoa.sonia.s05.t02.n01.Fase1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cat.itacademy.barcelonactiva.samayoa.sonia.s05.t02.n01.Fase1.domain.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {

}
