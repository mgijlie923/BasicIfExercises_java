/*Write a program AllEqual.java that takes three integer command-line arguments and prints equal if all three are equal, and not equal otherwis*/

public class AllEqual{

	public static void main(String[]args){
		
		//Entrada de las tres variables
		System.out.println("Java AllEqual " + args[0] + " " + args[1] + " " + args[2]);
		
		//Condicional
		if(args[0].equals(args[1]) && args[1].equals(args[2])){
			System.out.println("equal");
		}else{
			System.out.println("not equal");
		}
	}
}
