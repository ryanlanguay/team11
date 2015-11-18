package Model;

import java.util.ArrayList;
import java.util.List;

public class Team {
	
	private String name;
	List<Player> tPlayers;
	
	public Team(String teamName){
		setName(teamName);
		tPlayers = new ArrayList<Player>();
	}
	
	public void addPlayer(Player p){
		tPlayers.add(p);
	}
	
	public List<Player> getPlayers(){
		return tPlayers;
	}
	
	//TODO: IMPLEMENT THIS
	public List<Player> getTop5Players(){
		return null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
