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

nextByte()	byte broj
nextShort()	short broj
nextInt()	int broj
nextLong()	long broj
nextFloat()	float broj
nextDouble()	double broj
next()	eden zbor, do prazno mesto
nextLine()	cela linija tekst
         */
    

    }
}
//to run javac Name.java
// java Name

//String methods — PSAA
String a = "Hello";
String b = "Hello";
String c = "hello";
//equals(String s) — proveruva dali dva stringa imaat ista sodrzhina.
a.equals(b); // true
a.equals(c); // false
//== — kaj objekti, proveruva dali referencite pokazhuvaat kon ist objekt, a ne dali tekstot e ist.
a == b; // moze da bide true
//compareTo(String s) — gi sporeduva stringovite leksikografski; vrakja 0 ako se ednakvi, negativna vrednost ako prviot e pred vtoriot, pozitivna ako e posle.
"Ana".compareTo("Ana"); // 0
"Ana".compareTo("Bob"); // negativno
//startsWith(String prefix) — proveruva dali stringot pochnuva so daden tekst.
"Hello".startsWith("He"); // true
//endsWith(String suffix) — proveruva dali stringot zavrshuva so daden tekst.
"Hello".endsWith("lo"); // true
//length() — vrakja kolku karakteri ima stringot.
"Hello".length(); // 5
//charAt(int index) — go vrakja karakterot na dadena pozicija. Indeksiranjeto pochnuva od 0.
"Hello".charAt(0); // 'H'
"Hello".charAt(1); // 'e'
//concat(String s) — spojuva dva stringa.
"Hello".concat(" World"); // "Hello World" Isto mozhe so operatorot + -> "Hello" + " World";
//substring(int beginIndex, int endIndex) — izdvojuva del od stringot. Pochetniot indeks se vkluchuva, a krajnioт ne se vkluchuva.
"Hello".substring(1, 4); // "ell"

public class Main {
    public static void main(String[] args) {
        String text = "Hello World";

        System.out.println(text.equals("Hello World")); // true
        System.out.println(text.compareTo("Hello"));    // pozitivno
        System.out.println(text.startsWith("Hello"));   // true
        System.out.println(text.endsWith("World"));     // true
        System.out.println(text.length());              // 11
        System.out.println(text.charAt(0));             // H
        System.out.println(text.concat("!"));           // Hello World!
        System.out.println(text.substring(0, 5));        // Hello
    }
}
public class Main {
    public static void main(String[] args) {
        String text = "Hello World";

        // toLowerCase() - converts to lowercase
        System.out.println(text.toLowerCase()); // hello world

        // toUpperCase() - converts to uppercase
        System.out.println(text.toUpperCase()); // HELLO WORLD

        // trim() - removes spaces from both ends
        String text2 = "  Hello World  ";
        System.out.println(text2.trim()); // Hello World

        // split() - splits the string using a delimiter
        String[] words = text.split(" ");
        System.out.println(words[0]); // Hello
        System.out.println(words[1]); // World

        // replace() - replaces all occurrences
        System.out.println(text.replace("l", "x")); // Hexxo Worxd

        // replaceFirst() - replaces the first match
        System.out.println(text.replaceFirst("l", "x")); // Hexlo World

        // replaceAll() - replaces all regex matches
        System.out.println(text.replaceAll("l", "x")); // Hexxo Worxd

        // indexOf() - finds the first occurrence
        System.out.println(text.indexOf("l")); // 2

        // lastIndexOf() - finds the last occurrence
        System.out.println(text.lastIndexOf("l")); // 9
    }
}
//konverzii char i string

        // String -> char[]
        char[] chars = "Java".toCharArray();

        System.out.println(chars[0]); // J
        System.out.println(chars[1]); // a
        System.out.println(chars[2]); // v
        System.out.println(chars[3]); // a

        // char[] -> String
        char[] letters = {'C', 'o', 'd', 'e'};
        String str = new String(letters);

        System.out.println(str); // Code
    }
}
//kastiranje
double d1 = 3.2;
int i1 = (int) d1;

System.out.println(i1); // 3

int i2 = 3;
double d3 = (double) i2;

System.out.println(d3); // 3.0
//implicitno kastiranje
//Implicit casting znachi deka Java avtomatski pretvora vrednost od eden tip vo drug tip, bez ti da pishuvash (double) ili (int).
int i = 3;
double d = i;
//Java ne dozvoluva avtomatski da smestish double vo int, bidejki moze da se izgubi decimalniot del. Zatoa kodot ne se kompajlira.
//Implicit casting kaj String
int age = 20;
String text = "Age: " + age;

System.out.println(text); // Age: 20
//eksplicitno ne moesh posho string rekovmo ne e primitive variable 


//

        // \t - tab
        System.out.println("Hello\tWorld"); //Hello World

        // \n - new line
        System.out.println("Hello\nWorld"); // Hello
                                            // World

        // \\ - backslash se koristi za da mu kazhesh na Java deka sakash da prikazhesh backslash posho eden \ se koristi za escape sequences, kako \n i \t.
        System.out.println("C:\\Java\\Files"); // C:\Java\Files

        // \' - single quotation mark
        System.out.println("It\'s Java"); //It's Java

        // \" - double quotation marks inside a String
        System.out.println("He said \"Java is fun\""); //He said "Java is fun"
    }
}
