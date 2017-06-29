package day1;

class Football{
	String player;
	int matches;
	
	//Function Overloading - Functions with same name & different arguments
	//You can have member functions of same name overloaded
	
	
	//1.Constructor's purpose is to customize object creation
	//2.It's like a special function of same name as name of class
	//3.It's a case of over loaded function - Function Overloading
	//4.Constructor allocates a piece of memory, returns it to caller
	//5.There is no return statement in constructor
	//6.Even if you don't write constructor, compiler will create constructor for you
	
	//One arg constructor
	public Football(String player) {
		this.player = player;
	}
	
	//This is 2 arg constructor
	public Football(String player, int matches) {
		this.player = player;
		this.matches = matches;
	}
	
	//These are overloaded functions - same function name but differnt function arguments
	public void fun(){
		
	}
	
	public int fun(int a){
		return a;
	}
}

public class ConstructorConcepts {

	public static void main(String[] args) {
		//Calls 1-arg constructor
		Football f = new Football("Ronaldo");
		
		//Calls 2-arg constructor
		Football f2 = new Football("Ronaldo",66);
		
		f.fun();
		
		System.out.println(f.fun(6));
	}

}
