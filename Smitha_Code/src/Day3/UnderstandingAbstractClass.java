package Day3;

//Abstract class - Incomplete class, You cannot make objects of it.
abstract class Building{
	
	public void makeInfra(){
	   System.out.println("making infra");	
	}
	
	abstract void makeWalls();
}

class AddWallsonBuilding extends Building{

	@Override
	void makeWalls() {
		System.out.println("Making walls now");
		
	}
	
}

public class UnderstandingAbstractClass {

	public static void main(String[] args) {
		
		Building b = new AddWallsonBuilding();
		
	}
}
