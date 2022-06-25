import java.util.Scanner;

public class App {
    public static void main(String[] args){

        System.out.println("Welcome to my custom java calculator! (2 Numbers Only)");

        Scanner num_1 = new Scanner(System.in);
        System.out.println("What is you first number?");
        String num_1_t = num_1.nextLine();
        System.out.println("What is your second number?");
        Scanner num_2 = new Scanner(System.in);
        String num_2_t = num_2.nextLine();
        System.out.println("What is your operation? (+ = add, - = subtract, * = multiply, / = divide)");
        Scanner operation = new Scanner(System.in);
        String operation_t = operation.nextLine();
        
       if(operation_t.equals("+")) {

            System.out.println(Integer.parseInt(num_1_t) + Integer.parseInt(num_2_t));

       }
       
       else if(operation_t.equals("-")) {

        System.out.println(Integer.parseInt(num_1_t) - Integer.parseInt(num_2_t));

       }

       else if(operation_t.equals("*")) {

        System.out.println(Integer.parseInt(num_1_t) * Integer.parseInt(num_2_t));

       }

       else if (operation_t.equals("/") && Integer.parseInt(num_1_t) > Integer.parseInt(num_2_t) || Integer.parseInt(num_2_t) < Integer.parseInt(num_1_t)) {  

            float num_1_float = Integer.parseInt(num_1_t);
            float num_2_float = Integer.parseInt(num_2_t);
            System.out.println(num_1_float / num_2_float); 

    }
}
}