//Aria Jannat
//CUS 1185 Cryptography
// November 22, 2022
// EA/ EEA Assignment


import java.util.Scanner;

public class AriaJ_EA_EEA {

	public static void main(String[] args) {
		
		System.out.println("Enter two positive integers: ");
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x=a;
		int y=b;
	    
		 System.out.println("Enter 1 to run EA, or enter 2 to run EEA: ");
		
	     int choice = sc.nextInt();
	     
	     //Run EA
	     if (choice==1) {
	    	 System.out.println("Running EA... ");
		        while (b>0) {
		            //print the statements for seach step
		            System.out.println(String.format("(%d, %d)", a,b));
		            System.out.println(String.format("(%d, %d mod %d)", b,a,b));
		            //swap operation
		            int m=a%b;
		            a=b;
		            b=m;
		            
		            
		        }
	
		        System.out.println(String.format("gcd(%d,%d)=%d", x,y,a));
		       
		        System.out.println(" ");
		       
		        
		
		//Run EEA method
	     } else if (choice==2) {
	    	
	    	 System.out.println("Running EEA... ");
	    	 
	    	 Long f = EEA(x,y);
	    	 int z= EA(x,y);
	    	 
	    	 if (z !=1) {
	    		 System.out.println("The inverse of "+ x + "mod" + y + " does not exist." );
	    		 } else {
	    			 System.out.println("The inverse of "+ x + "mod" + y + " is "+ f + "mod" + y + ".");
	    			 }
		        
	    	 
	    	 
	     } else {
	    	 System.out.println("Invalid input.");
	     }
	}
	
//EEA METHOD
	public static Long EEA (int a, int N) {
		Long i = (long) 0;
		for (i = (long) 0; i < N; i++) {
			if ((a*i) % N ==1) {
				break;
			}
		}
		return i;
		
				
	}
	
	public static int EA (int a, int b) {

	
		        while (b>0) {
		            //print statements for the seach step
		            System.out.println(String.format("(%d, %d)", a,b));
		            System.out.println(String.format("(%d, %d mod %d)", b,a,b));
		            //swap operations
		            int m=a%b;
		            a=b;
		            b=m;
		        }
	
		    //recursive loop
		        if ((b%a)==0) {
		        	return a;
		        } else {
		        	return EA(a, (a% b));
		        }
		        
	}
	

}
