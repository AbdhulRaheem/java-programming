package day1;

public class First {

	public static void main(String[] args) {
		
		//Create a variable & assign 10
		int a = 10;
		
		//Create an array of size 10
		int b[] = new int[10];
		
		//This is how you are asscessing the array
		for(int i =0; i < b.length; i++){
			b[i] = i*i;
		}
		
		for(int i = 0; i < b.length; i++){
			System.out.println(b[i]);
		}
		
		//2-d array, creating 10 placeholder which will point to arrays
		int bnew[][] = new int[10][];
		bnew[0] = new int[9];
		bnew[1] = new int[8];
		
		int i = 10;
		while(i > 0){
			System.out.println(i);
			if (i == 5 ){
				break;
			}
			i--;
		}
		
		i = 10;
		
		while(i > 0){
			i--;
			if (i == 5 ){
				continue;
			}
			System.out.println(i);
			
		}

	}

}
