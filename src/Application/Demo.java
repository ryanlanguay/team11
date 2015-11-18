package Application;

import Model.Infractions;
import Model.Manager;
import Model.Match;
import Model.Player;
import Model.Shot;
import Model.Team;

public class Demo {

	public static void main(String[] args) {
		Manager m = Manager.getInstance();
		Player p = new Player("Test player", 10);
		Player pg = new Player("Test goalie", 1);
		p.addShot(new Shot(true, true));
		p.addInfraction(new Infractions(true, false, false));
		Team t = new Team("Test team");
		t.addPlayer(p);
		Team t2 = new Team("Second test team");
		t2.addPlayer(pg);
		Match mat = new Match(t, t2, 1);
		m.getLeagueMatches().add(mat);
		System.out.println("This build worked, and all classes were created and added to Manager!!!");

	}

}
