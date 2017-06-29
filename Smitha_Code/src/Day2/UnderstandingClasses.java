package Day2;

class Designer{
	
	int expr;
	float salary;
	String name;
	
	/* Few things about constructor*/
	/* 1. Name of constructor is same as name of class
	 * 2. It is used to init & create objects
	 * 3. Even if its not written, default constructor will be generated
	 */
	public Designer(int expr, float salary, String name) {
		super();
		this.expr = expr;
		this.salary = salary;
		this.name = name;
	}



	@Override
	public String toString() {
		return "Designer [expr=" + expr + ", salary=" + salary + ", name=" + name + "]";
	}
	
	/*Methods are the things done by or done to design objects*/
	void doNewDesign(){
		System.out.println(this.name + " Doing new design");
	}
	
	void scrapOldDesign(){
		System.out.println(this.name + " Scraping old design");
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + expr;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Float.floatToIntBits(salary);
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Designer other = (Designer) obj;
		if (expr != other.expr)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Float.floatToIntBits(salary) != Float.floatToIntBits(other.salary))
			return false;
		return true;
	}
	
	
	
}


public class UnderstandingClasses {

	public static void main(String[] args) {
		
		/*
		Designer d1 = new Designer();
		d1.expr = 5;
		d1.name = "Smitha";
		d1.salary = 1212121212.0f;
		
		Designer d2 = new Designer();
		d2.expr = 15;
		d2.name = "abc";
		d2.salary = 1212121212.0f;
		*/
		
		Designer d1 = new Designer(5,910291029.0f,"abc");
		Designer d2 = new Designer(15,91029441029.0f,"defabc");
		
		System.out.println(d1);
		System.out.println(d2);
		
		d1.doNewDesign();
		d2.scrapOldDesign();
		
		Designer d3 = new Designer(5,910291029.0f,"abc");
		Designer d4 = new Designer(5,910291029.0f,"abc");
		
		if (d3.equals(d4)){
			System.out.println("They are same");
		}
		
		Designer d[] = new Designer[100];
		d[0] = new Designer(5,910291029.0f,"abc");
		
		for(int i =0; i < d.length; i++){
			d[i] = new Designer(i,910291029.0f,"abc");
		}

	}

}
