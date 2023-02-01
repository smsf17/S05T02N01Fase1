package cat.itacademy.barcelonactiva.samayoa.sonia.s05.t02.n01.Fase1.dto;

import java.sql.Date;
import java.util.List;

import cat.itacademy.barcelonactiva.samayoa.sonia.s05.t02.n01.Fase1.domain.Games;


public class UsersDTO {
	
	private int id;
	private String UserName;
	private Date RegDate;
	private double AverageSuccess;
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
