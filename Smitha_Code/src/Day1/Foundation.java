package Day1;

public class Foundation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[][][] = new int[10][][];
        arr[1] = new int[2][];
        arr[1][1] = new int[5];
        
        String s = "Hello World";
        System.out.println(s.charAt(1));
        String s2 = new String("Hello World");
        if(s == s2){
        	System.out.println("Same");
        }
        if(s.equals(s2)){
        	System.out.println("Same now");
        }
        
        System.out.println(s.concat(" Here I am"));
        //s[1] = "s";
        
        System.out.println(s.compareTo("IGood Stuff"));
	}

}
