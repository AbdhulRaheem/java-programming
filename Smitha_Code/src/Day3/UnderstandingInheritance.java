package Day3;

//public - visible everywhere
//private - Only inside that class
//default - similar to public but only inside a package
//protected - Available only during inheritance

class Human{
	String name;
	private int age;
	protected String location;
	
	public Human(String name, int age, String location) {
		this.name = name;
		this.age = age;
		this.location = location;
	}
	
	public void enjoyPlaying(){
		System.out.println("Playing time");
	}
	
	public void haveFun(){
		System.out.println("Having Fun");
	}
}

class NewEmployee extends Human{
	
	String offc;
	String designation;
	
	public NewEmployee(String name, int age, String location, String offc, String designation) {
		super(name, age, location);
		this.offc = offc;
		this.designation = designation;
	}

	public void enjoyPlaying(){
		//Getting access to base class obbject
		super.enjoyPlaying();
		System.out.println("Work Doesn't let me play");
	}
	
	public void enjoyWorking(){
		System.out.println("making work fun");
	}
	
}


class NewStudent extends Human{
	
	String std;
	int rank;
	
	public NewStudent(String name, int age, String location, String std, int rank) {
		super(name, age, location);
		this.std = std;
		this.rank = rank;
	}

	
	
}

public class UnderstandingInheritance {

	public static void main(String[] args) {
		NewEmployee n = new NewEmployee("Awi",
				                        33,
				                        "Blr",
				                        "Zeke",
				                        "xyz");
		
		n.enjoyPlaying();
		
		Human h = new Human("Abi",44,"Kar");
		//h.enjoyPlaying();
		
		//Assign derived class object to base class variable
		Human h1 = new NewEmployee("Awi",
                33,
                "Blr",
                "Zeke",
                "xyz");
		
		//h1.enjoyPlaying();
		//h1.haveFun();
		
		Human humans[] = new Human[10];
		humans[0] = new NewEmployee("Awi",
                33,
                "Blr",
                "Zeke",
                "xyz");
		humans[1] = new NewStudent("Awi",
                33,
                "Blr","XI",22);
		
		System.out.println("****");
		for(int i =0; i < 2; i++){
			humans[i].enjoyPlaying();
		}

	}

}
