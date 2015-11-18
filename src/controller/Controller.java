package controller;

import java.util.Iterator;

import Model.Manager;
import Model.Player;
import Model.Team;

public class Controller {
	public String addPlayer(String name, int position, String teamName) {
		Manager m = Manager.getInstance();
		Iterator<Team> iTeam = m.getLeagueTeams().iterator();
		String error = "Team name provided is not valid!";
		while (iTeam.hasNext() && error != null); {
			if (iTeam.next().getName().equals(teamName)) {
				Player p = new Player(name, position);
				iTeam.next().addPlayer(p);
				error=null;
			}
		}
		return error;
	}

}
