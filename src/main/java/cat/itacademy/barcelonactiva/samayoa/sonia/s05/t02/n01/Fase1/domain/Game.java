package cat.itacademy.barcelonactiva.samayoa.sonia.s05.t02.n01.Fase1.domain;

import java.io.Serializable;

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
public class Game implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idGame;

	@Column(name = "Die1")
	private int Die1;
	
	@Column(name = "Die2")
	private int Die2;
	
	@Column(name = "Total Turn")
	private int TotalTurn;
	
	@Column(name = "Win")
	private Boolean Win ;
	
	 @ManyToOne()
	    @JoinColumn(name = "idUser")
	    private User user;

	public Long getIdGame() {
		return idGame;
	}

	public void setIdGame(Long idGame) {
		this.idGame = idGame;
	}

	public int getDie1() {
		return Die1;
	}
	
	public void setDie1(int die1) {
		Die1 = die1;
	}

	public int getDie2() {
		return Die2;
	}
	
	public void setDie2(int die2) {
		Die2 = die2;
	}

	
	public int getTotalTurn() {
		return TotalTurn;
	}
	

	public void setTotalTurn(int totalTurn) {
		
		int total=Die1+Die2;
		
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

	public User getUser() {
		return user;
	}

	public void setUsers(User user) {
		this.user = user;
	}


}
