/*Write a program DistinctValues.java that takes three integer command-line arguments a, b, and c and print the number of distinct values (1, 2, or 3) among a, b, and c.*/

public class DistinctValues {

    public static void main(String[] args) {
        
        //Entrada de variables
        System.out.println("$ java DistinctValues " + args[0] + " " + args[1] + " " + args[2]);
        
        //Condicional
        if(!args[0].equals(args[1]) && !args[1].equals(args[2]) && !args[0].equals(args[1])){//todos diferentes
            System.out.println("3");
        }else{
            if(((args[0].equals(args[1]) && !args[1].equals(args[2])) || (!args[0].equals(args[1]) && args[0].equals(args[2])) || (!args[0].equals(args[1]) && args[1].equals(args[2])))){//Uno diferente
                System.out.println("2");
            }else{
                System.out.println("1");//Ninguno diferente
            }
        }
    }
}