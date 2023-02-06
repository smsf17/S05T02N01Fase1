package cat.itacademy.barcelonactiva.samayoa.sonia.s05.t02.n01.Fase1.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "User")
public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "UserName")
	private String userName;
	
	@Column(name = "Date")
	private LocalDate regDate;
	
	@Column(name = "AverageWin")
	private float averageWin;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Game> games;
	
		public User() {
	}

	public User(Long id, String userName, LocalDate regDate) {
		this.id = id;
		this.userName = userName;
		this.regDate = regDate;
	}

	public User(Long id, String userName, LocalDate regDate, float averageWin, List<Game> games) {
		this.id = id;
		this.userName = userName;
		this.regDate = regDate;
		this.averageWin = averageWin;
		this.games = games;
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
		regDate = LocalDate.now();
	}
	
	public float getAverageWin() {
		return averageWin;
	}

	public void setAverageWin(float averageWin) {
		this.averageWin = averageWin;
	}

	public List<Game> getGames() {
		return games;
	}

	public void setGames(List<Game> games) {
		this.games = games;
	}
	
	

}
