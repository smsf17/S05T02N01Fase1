package cat.itacademy.barcelonactiva.samayoa.sonia.s05.t02.n01.Fase1.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cat.itacademy.barcelonactiva.samayoa.sonia.s05.t02.n01.Fase1.domain.Games;
import cat.itacademy.barcelonactiva.samayoa.sonia.s05.t02.n01.Fase1.domain.Users;
import cat.itacademy.barcelonactiva.samayoa.sonia.s05.t02.n01.Fase1.dto.GamesDTO;
import cat.itacademy.barcelonactiva.samayoa.sonia.s05.t02.n01.Fase1.dto.UsersDTO;
import cat.itacademy.barcelonactiva.samayoa.sonia.s05.t02.n01.Fase1.repository.GamesRepository;
import cat.itacademy.barcelonactiva.samayoa.sonia.s05.t02.n01.Fase1.repository.UserRepository;


@Service
public class UserServicesImpl implements UserServices {

	@Autowired
	UserRepository userRepo;
	GamesRepository gamesRepo;
	
	@Override
	public Users add(UsersDTO userDTO) {
		Users user = this.mapDTOToEntity(userDTO);
		return userRepo.save(user);		 
	}

	@Override
	public UsersDTO update(UsersDTO userDTO, int id) {
		Users userUpdate=userRepo.findById(id).orElse(null);
		UsersDTO user=this.mapEntityToDTO(userUpdate);
		user=userRepo.save(user);
		return user;
	}
	
	public Games partida(GamesDTO gameDTO) {
		
		Games game= new Games();
		int d1 = this.roll();
		int d2 = this.roll();
		int total= d1+d2;
		game.setIdGame(gameDTO.getIdGame());
		game.setDice1(d1);
		game.setDice2(d2);
		game.setTotalTurn(total);
		if (total==7) {
			game.setWin(true);
		}else{
			game.setWin(false);
		}
		
		return game;
		
	}
	
	public int roll() {
        return (int) (Math.floor(Math.random() * 6) + 1);
    }
	
	public double AverageSuccess(List<Games> games) {
		
		int Success=0;
		double Average=0;
		for (int i=0; i < games.size() ; i++) {
			if (games.get(i).getWin() == true) {
				Success = Success + 1;
			}
		}
		Average= Success/games.size()*100;
		
		
		return Average;		
	}
	
	public List<Games> getAll() {
		List<Games> games = gamesRepo.findAll();
		return games;
	}

	

	
	private Users mapDTOToEntity(UsersDTO user) {
		List<UsersDTO> users;
		Users aux = null;
		aux = new Users();
		aux.setId(user.getId());
		if (user.getUserName()==" ") {
			aux.setUserName("ANONIMO");
			aux.setRegDate(user.getRegDate());
		}else {
			if(users.contains(user.getUserName())) {
				System.out.print("nombre existe");
			}else {
				aux.setUserName();
				aux.setRegDate(user.getRegDate());
			}
		}
		return aux;
	}
	
	
	private UsersDTO mapEntityToDTO(Users user) {
		UsersDTO aux = null;
		if(user!=null) {
			aux = new UsersDTO();
			aux.setId(user.getId());
			aux.setUserName(user.getUserName());
		}
		return aux;
	}

	

}
