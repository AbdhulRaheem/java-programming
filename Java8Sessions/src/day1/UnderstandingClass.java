package day1;

//1. Public class should be of name name that of file
//2. There will be only one public class, rest will be default
//3. Access Specifier - Public / Default / Private / Protected

class Fun{
	
}

class Tennis{
	//Class members - variables that can be accessed with class objects
	String player;
	int matches;
	
	//class method - function that can be invoked with class objects
	void funPlayingTennis(){
		System.out.println("Tennis playing is fun");
		//accessing member varible
		System.out.println(this.player + " is playing now");
	}
}

public class UnderstandingClass {

	public static void main(String[] args) {
		Tennis t = new Tennis(); //Created an instance of it.
		t.matches = 10;
		t.player = "Rodger";
		//new - allocates memory
		t.funPlayingTennis();
	}

}
