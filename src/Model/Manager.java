package Model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Manager {
	private List<Match> leagueMatches;
	private List<Team> leagueTeams;
	private static Manager theInstance = null;
	private Manager(){
		setLeagueMatches(new ArrayList<Match>());
		setLeagueTeams(new ArrayList<Team>());
	} 
	public static Manager getInstance()
	{
		if(theInstance == null)
		{
			theInstance = new Manager();
		}
		return theInstance;
	}

	public boolean addPlayer(Player p, Team t) {
		//This adds added functionality to ensure that the provided team exists
		boolean wasAdded = false;
		for (int i=0; i<leagueTeams.size(); i++) {
			if (leagueTeams.get(i).equals(t)) {
				leagueTeams.get(i).addPlayer(p);
				wasAdded=true;
				break;
			}
		}
		return wasAdded;
	}
	public void DisplayTopScoringMatches(){
		int i = 1;
		Match highestScore = getLeagueMatches().get(0);
		int totalGoals = highestScore.homeGoals+highestScore.awayGoals;
		while (i < getLeagueMatches().size()) {
			if (getLeagueMatches().get(i).homeGoals+getLeagueMatches().get(i).awayGoals>totalGoals) {
				highestScore = getLeagueMatches().get(i);
				totalGoals = highestScore.homeGoals+highestScore.awayGoals;
			}
		}
		System.out.println("The highest scoring match is the match with ID "+highestScore.id);
	}

	public void delete()
	{
		leagueTeams.clear();
		leagueMatches.clear();
	}

	public static void main(String args[]){
		Manager m = new Manager();
		m.getLeagueMatches().add(new Match(new Team("Team 1"), new Team("Team 2"), 1));
		m.getLeagueMatches().get(0).addHomeGoal(new Player("Player 1", 10));
		m.DisplayTopScoringMatches();
	}
	public List<Match> getLeagueMatches() {
		return leagueMatches;
	}
	public void setLeagueMatches(List<Match> leagueMatches) {
		this.leagueMatches = leagueMatches;
	}
	public List<Team> getLeagueTeams() {
		return leagueTeams;
	}
	public void setLeagueTeams(List<Team> leagueTeams) {
		this.leagueTeams = leagueTeams;
	}
}
