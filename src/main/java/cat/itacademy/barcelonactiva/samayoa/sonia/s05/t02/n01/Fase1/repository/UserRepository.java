package cat.itacademy.barcelonactiva.samayoa.sonia.s05.t02.n01.Fase1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cat.itacademy.barcelonactiva.samayoa.sonia.s05.t02.n01.Fase1.domain.Users;
import cat.itacademy.barcelonactiva.samayoa.sonia.s05.t02.n01.Fase1.dto.UsersDTO;

public interface UserRepository extends JpaRepository<Users, Integer>{

	UsersDTO save(UsersDTO user);

}
