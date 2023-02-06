package cat.itacademy.barcelonactiva.samayoa.sonia.s05.t02.n01.Fase1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cat.itacademy.barcelonactiva.samayoa.sonia.s05.t02.n01.Fase1.domain.Game;
import cat.itacademy.barcelonactiva.samayoa.sonia.s05.t02.n01.Fase1.domain.User;
import cat.itacademy.barcelonactiva.samayoa.sonia.s05.t02.n01.Fase1.repository.GameRepository;
import cat.itacademy.barcelonactiva.samayoa.sonia.s05.t02.n01.Fase1.repository.UserRepository;


@Service
public class UserServicesImpl implements UserServices {

	@Autowired
	UserRepository userRepo;
	GameRepository gameRepo;
	
	@Override
	public void add(User user) {
		userRepo.save(user);
	}
	@Override
	public void addGame(Game game) {
		gameRepo.save(game);
	}
	@Override
	public User update(User user, Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<User> getAllUser() {
		
		return userRepo.findAll();
	}
	@Override
	public List<Game> getAllGame() {
		
		return gameRepo.findAll();
	}
	@Override
	public void delete(Long id) {
		userRepo.deleteById(id);
		
	}
	
	public Game roll() {
		Game game= new Game();
		int d1 = (int) (Math.floor(Math.random() * 6) + 1);
		int d2 = (int) (Math.floor(Math.random() * 6) + 1);
		int total= d1+d2;
		game.setDie1(d1);
		game.setDie2(d2);
		game.setTotalTurn(total);
		if (total==7) {
			game.setWin(true);
		}else{
			game.setWin(false);
		}
		
		return game;
	}
	
	public double AverageSuccess(List<Game> game) {

		User user;
		int Success = 0;
		float Average = 0;
		for (int i = 0; i < game.size(); i++) {
			if (game.get(i).getWin() == true) {
				Success = Success + 1;
			}
		}
		Average = Success / game.size() * 100;
		user.setAverageWin(Average);

		return Average;
	}

	/*@Override
	public User add(UsersDTO userDTO) {
		User user = this.mapDTOToEntity(userDTO);
		return userRepo.save(user);		 
	}

	@Override
	public UsersDTO update(UsersDTO userDTO, int id) {
		User userUpdate=userRepo.findById(id).orElse(null);
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
	
	public List<Games> getAllGames() {
		List<Games> games = gamesRepo.findAll();
		return games;
	}
	
	@Override
	public List<UsersDTO> getAll() {
		List<UsersDTO> resultado = new ArrayList<UsersDTO>();
		List<User> users = userRepo.findAll();
		if (users!=null &&users.size()>0) {
			for(User user: users) {
				resultado.add(this.mapEntityToDTO(user));
			}
		}
		return resultado;
	}


	

	
	private User mapDTOToEntity(UsersDTO user) {
		User aux = null;
		aux = new User();
		aux.setId(user.getId());
		if (user.getUserName()==" ") {
			aux.setUserName("ANONIMO");
			aux.setRegDate(user.getRegDate());
		}else {
			/*if(users.contains(user.getUserName())) {
				System.out.print("nombre existe");
			}else {*/
				/*aux.setUserName(user.getUserName());
				aux.setRegDate(user.getRegDate());
			}
		//}
		return aux;
	}
	
	
	private UsersDTO mapEntityToDTO(User user) {
		UsersDTO aux = null;
		if(user!=null) {
			aux = new UsersDTO();
			aux.setId(user.getId());
			aux.setUserName(user.getUserName());
		}
		return aux;
	}*/

	

}
