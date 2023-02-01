package cat.itacademy.barcelonactiva.samayoa.sonia.s05.t02.n01.Fase1.domain;

import java.sql.Date;
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
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "UserName")
	private String UserName;
	
	@Column(name = "Date")
	private Date RegDate;

	@Column(name = "AverageSuccess")
	private double AverageSuccess;
	
	@OneToMany(mappedBy = "users", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Games> games;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public Date getRegDate() {
		return RegDate;
	}

	public void setRegDate(Date regDate) {
		RegDate = regDate;
	}

	public double getAverageSuccess() {
		return AverageSuccess;
	}

	public void setAverageSuccess(double averageSuccess) {
		AverageSuccess = averageSuccess;
	}

	public List<Games> getGames() {
		return games;
	}

	public void setGames(List<Games> games) {
		this.games = games;
	}
	
	

}
