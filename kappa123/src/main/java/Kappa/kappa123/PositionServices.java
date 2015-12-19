package Kappa.kappa123;

import java.util.ArrayList;
import java.util.List;

public class PositionServices {
	
	private List<Position> positions;
	
	public PositionServices(){
		positions = new ArrayList<Position>();
		positions.add(new Position(0, null, 0, 0));
		positions.add(new Position(1, null, 0, 0));
		positions.add(new Position(2, null, 0, 0));
		positions.add(new Position(3, null, 0, 0));
		positions.add(new Position(4, null, 0, 0));
		positions.add(new Position(5, null, 0, 0));
	}
	
	public List<Position> getBoard(){
		return positions;
	}
	
	public int getFirstAvailableSpot(int playerID){
		//first player
		if(playerID == 1){
			for(int i = 0; i < 3; i++){
				if(positions.get(i).getName()!=null){
					return i;
				}
			}
		}
		//second palyer
		else{
			for(int i = 3; i < 6; i++){
				if(positions.get(i).getName()!=null){
					return i;
				}
			}
		}
		return -1;
	}
	
//	public Position createPosition(int number, String name, int attack, int defence){
//		Position newPosition = new Position(number, name, attack, defence);
//		positions.add(number, newPosition);
//		return newPosition;
//	}

}
