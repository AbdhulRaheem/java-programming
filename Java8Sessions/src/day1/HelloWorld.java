package day1;

class World{
	void hello(){
		System.out.println("Good stuff");
	}
}



//main is required for the class, whose name is same as name of file
public class HelloWorld {

	// Entry-point of the program
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		//Creating an object of class World
		World w = new World();
		w.hello();
		
		Sunday s = new Sunday(5);
		s.hello();
		
		Sunday sd[] = new Sunday[10];
		int i = 0;
		while(i < sd.length){
			sd[i++] = new Sunday(i);
		}
		
		for(int j =0; j < sd.length; j++){
			System.out.println(sd[j]);
		
		}
		

	}

}
