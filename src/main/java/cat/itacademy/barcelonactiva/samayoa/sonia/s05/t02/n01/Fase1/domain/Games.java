package cat.itacademy.barcelonactiva.samayoa.sonia.s05.t02.n01.Fase1.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "games")
public class Games {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idGame;

	@Column(name = "Dice1")
	private int Dice1;
	
	@Column(name = "Dice2")
	private int Dice2;
	
	@Column(name = "Total Turn")
	private int TotalTurn;
	
	@Column(name = "Win")
	private Boolean Win ;

	 @ManyToOne()
	    @JoinColumn(name = "id")
	    private Users users;

	public int getIdGame() {
		return idGame;
	}

	public void setIdGame(int idGame) {
		this.idGame = idGame;
	}

	public int getDice1() {
		return Dice1;
	}
	
	public void setDice1(int dice1) {
		Dice1 = dice1;
	}

	public int getDice2() {
		return Dice2;
	}
	
	public void setDice2(int dice2) {
		Dice2 = dice2;
	}

	
	public int getTotalTurn() {
		return TotalTurn;
	}
	

	public void setTotalTurn(int totalTurn) {
		
		int total=Dice1+Dice2;
		
		TotalTurn = total;
	}
	
	public Boolean getWin() {
		return Win;
	}

	public void setWin(Boolean win) {
		Win=false;
		if (TotalTurn==7) {
			Win=true;
		}
		Win = win;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}


}
