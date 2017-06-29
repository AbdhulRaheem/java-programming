package day1;

//oublic 
public class Sunday {
	int data;
	
	public Sunday(int data){
		this.data = data;
		if( data % 2 == 0){
			this.data *= 2; 
		} else {
			this.data *=3;
		}
		
		switch(data){
		case 1:this.data = 99;
		       break;
		       
		case 2:this.data = 100;
		       break;
		       
		default:System.out.println("Hello World");
		       
		}
	}
	
	public void hello(){
		
	}
	
	private void moreInfo(){
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Obj " + this.data;
	}

}
