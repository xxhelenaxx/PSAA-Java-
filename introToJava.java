import java.util.Scanner; // Import the Scanner class to read input from the console
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input from the console (for read user input)
        System.out.println("Hello World"); //println is used to print text to the console with a new line at the end
        System.out.print("This is a sample Java program.\n");//print is used to print text to the console without a new line at the end
        System.out.print("This is the second line of the program.\n"); //\n is used to create a new line in the output

        //Variables are used to store data in a program. In Java, you can declare variables of different types such as int, double, String, etc. For example:
/* Primtive variables in Java:
int
double
char
boolean
float
long
short
byte
-Simple value stored directly in memory. (stack)
     */
/*Reference variables in Java:
String
array
objects
-Reference variables =memory address of the object (stack) that points to the (heap)
 */
/*  ako sakash da go koiristish trgni komentara i aktiviraj
        byte temperature = 25; // declaring a byte variable 8bits -small integer
        short score = 85; // declaring a short variable 16bits -short integer
        int age = 25; // declaring an integer variable 32 bits -number
        long id = 123456789L; // declaring a long variable 64bits -long integer
        float height = 5.9f; // declaring a float variable 32 bits -decimal number
        double salary = 50000.50; // declaring a double variable 64 bits -decimal number
        char grade = 'A'; // declaring a char variable -character
        boolean isEmployed = true; // declaring a boolean variable 1 or 0 (true or false)
        //with text
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Is Employed: " + isEmployed);
        // without text
        System.out.println(age);
        if (isEmployed) { 
            System.out.println("The person is employed.");
        } else {
            System.out.println("The person is not employed.");
        } // if-else statement to check employment status


        String name = "John Doe"; // declaring a String variable -text
        System.out.println("Name: " + name);

    
        System.out.println("What is your name?");
        String yourName= scanner.nextLine(); // Read user input for string

        System.out.println("What is your age?");
        int yourAge= scanner.nextInt(); // Read user input for integer

        System.out.println("What is your salary?");
        double yourSalary= scanner.nextDouble(); // Read user input for double

        System.out.println("What is your height?");
        float yourHeight= scanner.nextFloat(); // Read user input for float

        scanner.close(); // Close the scanner to prevent resource leaks

        System.out.println("Your name is: " + yourName + " , \n  your age is: " + yourAge + ", \n your salary is: " + yourSalary + ", \n  and your height is: " + yourHeight);

        */

        //printf is used to format the output in a specific way. It allows you to specify placeholders for variables and control the formatting of the output. For example:
        String name = "John Doe";
        int age = 25;
        System.out.printf("Name: %s, Age: %d\n", name, age); // %s is a placeholder for a string, %d is a placeholder for an integer
        //placeholders
        /*
        %s - string
        %d - integer
        %f - float, double
        %c - character
        %b - boolean
        %l - long

         */
    

    }
}
//to run javac Name.java
// java Name

