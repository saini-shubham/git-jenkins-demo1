//Java program to print the ascii value of a given character


import java.util.Scanner;

/* Ask Teacher : DONE
Here I am trying to get a character through command line and prints it's ascii value
*/
class AsciiValue{
	public static void main(String args[]){
		System.out.println("Jenkins Git Pipeline");
		System.out.println("Entered character:"+args[0]);
		char c = args[0].charAt(0);
		System.out.println("Ascii Value: "+(int)c);
	}
}

/*
class AsciiValue{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Character");
		char a = sc.next().charAt(0);
		//System.out.printf("Ascii Value:%d",a);
		System.out.println("Ascii Value"+(int)a);
		
	}
		
}
*/