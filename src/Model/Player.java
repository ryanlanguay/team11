package Model;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	String name;
	int position;
	List<Infractions> pInfractions;
	List<Shot> pShots;
	
	public Player(String Name, int Position){
		name =Name;
		if (Position>=1 && Position<=11) position = Position;
		if (position==0) System.out.println("Position entered is invalid and is not set; choose a # between 1 and 11");
		pInfractions = new ArrayList<Infractions>();
		pShots = new ArrayList<Shot>();
	}
	
	public void addInfraction(Infractions f){
		pInfractions.add(f);
	}
	
	public void addShot(Shot s){
		pShots.add(s);
	}
	
	public String getName(){
		return name;
	}
	public int getPosition(){
		return position;
	}
	public List<Infractions> getInfractions(){
		return pInfractions;
	}
	public List<Shot> getShots(){
		return pShots;
	}
	
	public int countGoals(Player p) {
		int goals=0;
		for (int i=0; i<pShots.size(); i++) {
			if (pShots.get(i).isGoal) goals++;
		}
		return goals;
	}
}
