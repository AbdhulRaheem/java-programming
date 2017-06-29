package Day2;

/* 
 * Three things that can be final - variable, function & class
 * final var - you cannot change variable
 * final function - you cannot override it. On making base class method final, NO derived class can override the function
 * final class - you cannot derive from it
 */

class Student{
	final int age = 10;
	final void doStudy(){
		System.out.println("In base class");
	}
}


class GoodStudent extends Student{
//	void doStudy(){
//		System.out.println("In derived class");
//	}
}

public class UnderstandingFinal {

	public static void main(String[] args) {
		Student s = new Student();
		//s.age = 99;
		s.doStudy();
		
		GoodStudent g = new GoodStudent();
		g.doStudy();

	}

}
