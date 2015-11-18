package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import Model.Manager;
import Model.Player;
import Model.Team;
import controller.Controller;

public class TestSoccerStats {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		//clear registrations
		Manager m =Manager.getInstance();
		m.delete();
	}

	@Test
	public void addGoal() {
		Controller c = new Controller();
		Manager m = Manager.getInstance();
		assertEquals(0, m.getLeagueTeams().size());
		Player p = new Player("Test player", 9);
		Team t = new Team("Test team");
		m.getLeagueTeams().add(t);
		assertTrue(m.addPlayer(p, t));
	}

}
