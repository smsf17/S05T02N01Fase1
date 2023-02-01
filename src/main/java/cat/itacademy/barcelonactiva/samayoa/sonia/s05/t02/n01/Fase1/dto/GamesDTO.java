package cat.itacademy.barcelonactiva.samayoa.sonia.s05.t02.n01.Fase1.dto;

public class GamesDTO {
	
	private int idGame;
	private int Dice1;
	private int Dice2;
	private int TotalTurn;
	private Boolean Win ;
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
		TotalTurn = totalTurn;
	}
	public Boolean getWin() {
		return Win;
	}
	public void setWin(Boolean win) {
		Win = win;
	}
	
	

}
