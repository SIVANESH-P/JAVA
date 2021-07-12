import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
    System.out.println("Hello java this is siva");
    
    
    int x = 2;
    System.out.println(x);
    float decimal =(float)11.4;
    System.out.println(decimal);
    char my_char = 's';
    System.out.println(my_char);
    boolean is_false = true;
    System.out.println(is_false);
   
    
    Scanner scan = new Scanner (System.in);
    System.out.println("Enter your favourite number");
    int user_favourite_number = scan.nextInt();
    System.out.println("Your entered number is");
    System.out.print(user_favourite_number);
    
    Scanner scan1 = new Scanner (System.in);
    System.out.println("Enter some decimal value");
    double user_input_double = scan1.nextDouble();
    System.out.println("The entered value is");
    System.out.println(user_input_double);
    
    Scanner word = new Scanner(System.in);
    System.out.println("Enter username");
    String user_name = word.nextLine();
    System.out.println("Your username is");
    System.out.print(user_name);
       
	}

}
