package cat.itacademy.barcelonactiva.samayoa.sonia.s05.t02.n01.Fase1.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class User{


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "UserName")
	private String userName;
	
	@Column(name = "Date")
	private LocalDate regDate;
	
	@Column(name = "AverageWin")
	private float averageWin;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user", cascade = CascadeType.ALL)
	 @JsonIgnoreProperties("user")
	private List<Game> gameList = new ArrayList<>();

		
		public User() {
	}

	public User(Long id, String userName, LocalDate regDate) {
		this.id = id;
		this.userName = userName;
		this.regDate = regDate;
	}
	
	public User(Long id, String userName, LocalDate regDate, float averageWin, List<Game> gameList) {
		this.id = id;
		this.userName = userName;
		this.regDate = regDate;
		this.averageWin = averageWin;
		this.gameList = gameList;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		String nameAux = userName;
		if (userName==" ") {
			nameAux="ANONIMO";
		}
		this.userName = nameAux;
	}

	public LocalDate getRegDate() {
		return regDate;
	}
		
	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}

	@PrePersist
	public void defineDate() {
		regDate = LocalDate.now();
	}
	
	public float getAverageWin() {
		return averageWin;
	}

	public void setAverageWin(float averageWin) {
		this.averageWin = averageWin;
	}

	/*public List<Game> getGameList() {
		List<Game> gameList = new ArrayList<Game>();
		for (Game game : gameList) {
			if (game.getIdUser().equals(this.getId())){
				gameList.add(game);
				}
		}
		return gameList;
	}*/

	public void setGameList(List<Game> gameList) {	
		
		this.gameList = gameList;
	}

}
