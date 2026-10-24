
public class Main {

    public static void main(String[] args) {

        // STEP 1: Create a Counter object.
        // "new Counter()" creates the object.
        // The constructor sets count to 0.
        Counter c = new Counter();

        // STEP 2: Get the starting value and print it.
        System.out.println("Starting count: " + c.getCount());

        // STEP 3: Increase the counter by 1.
        c.incrementCount();

        // Print the new value.
        System.out.println("After first increment: " + c.getCount());

        // STEP 4: Increase the counter again.
        c.incrementCount();

        System.out.println("After second increment: " + c.getCount());

        // STEP 5: Decrease the counter by 1.
        c.decrementCount();

        System.out.println("After decrement: " + c.getCount());

        // STEP 6: Read the final value.
        int finalValue = c.getCount();

        System.out.println("Final value: " + finalValue);
    }
}


// This class defines what a Counter object contains and what operations it can perform.
class Counter {

    // FIELD:
    // Stores the current value of this counter.
    // private means we access it through methods, rather than directly from Main.
    private int count;


    // CONSTRUCTOR:
    // Runs when a new Counter object is created.
    // A constructor has the same name as its class.
    // It has no return type, not even void.
    public Counter() {
        count = 0;
    }


    // GETTER METHOD:
    // Returns the current value of count.
    // int means this method returns an integer.
    public int getCount() {
        return count;
    }


    // INCREMENT METHOD:
    // Increases count by 1.
    // void means this method returns no value.
    public void incrementCount() {
        count++;
    }


    // DECREMENT METHOD:
    // Decreases count by 1.
    public void decrementCount() {
        count--;
    }
}

//Class = definicija na objekt ili nekoja funkcionalnost.

//Package = grupa za organiziranje na Java klasi.

//Directory = folder vo koj se naogjaat fajlovite.

package package_name; //na koj paket mu pripagja klasata

package animals;

public class Dog {
    public void bark() {
        System.out.println("Woof!");
    }
}
//package animals; kazhuva deka klasata Dog e del od paketot animals.

//Vazhno: deklaracijata package se pishuva na pochetokot na Java fajlot, pred import i pred definicijata na klasata.

import animals.Dog; //ja pravi klasata Dog dostapna za koristeње so kratkoto ime Dog.

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog(); //deklarirash promenliva koja mozhe da chuvа referenca do objekt od klasata Dog i kreirash nov objekt od klasata Dog.
        myDog.bark(); //ja povikuvash metodata bark() na toj objekt.
    }
} //Znachi, import ne kreira objekt. Samo ti ovozmozhuva da ja koristish klasata bez da go pishuvash nejzinoto celosno ime.

import packageName.*; //Ova e korisno koga koristish povekje klasi od ist paket.

import animals.*;

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
    }
} //* znachi: mozham da gi koristam site dostapni klasi od paketot animals bez da gi importiram edna po edna.
primer:
public class Main {
    public static void main(String[] args) {
        java.util.Scanner input =
            new java.util.Scanner(System.in);
    }
} //bez import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    }
}//so import


//API e kratenka od Application Programming Interface. -API e zbirka od gotovi funkcii, klasi i pravila preku koi mozesh da koristish neshto shto vekje e napraveno.

Java Packages for PSAA
- java.util – Lists, stacks, queues, hash tables, sets, maps, and sorting.
- java.lang – Basic classes: String, Math, System, Integer (automatically imported).
- java.util.function – Functional interfaces used in some algorithms.
- java.util.stream – Processing and transforming collections.

Important classes and interfaces:
- ArrayList – Dynamic array / list.
- LinkedList – Linked list; can also implement Queue and Deque.
- Stack – Stack (LIFO).
- Queue – Queue interface (FIFO).
- ArrayDeque – Can be used as a stack or queue.
- HashMap – Hash table with key-value pairs.
- HashSet – Stores unique elements using hashing.
- PriorityQueue – Priority queue.
- Collections – Utility methods for sorting and working with collections.
- Scanner – Reads user input.

Import all classes from java.util:
import java.util.*;

//ACCESS MODIFIERS 
/*
Modifier	           Znachenje
public	        Mozhe da se koristi od bilo kade kade shto e dostapno.
protected	    Dostapno vo istiot paket i vo podklasi.
private	        Dostapno samo vnatre vo klasata vo koja e definirano.
(no modifier)	Package-private: dostapno vo istiot paket.
*/
//static — promenliva ili metoda povrzana so klasata -znachi deka chlenot pripagja na klasata, a ne na sekoj objekt posebno.
public class Gnome {
    static int count = 0;

    public Gnome() {
        count++;
    }
}
Gnome g1 = new Gnome();
Gnome g2 = new Gnome();
Gnome g3 = new Gnome();

System.out.println(Gnome.count); // 3
//Site objekti ja delat istata count promenliva. Sekoj nov objekt ja zgolemuva za eden.
//Bez static, sekoj objekt bi imal svoja posebna promenliva.

//final — vrednost koja ne se menuva-Kaj promenliva od osnoven tip, final znachi deka otkako ke i dodelish vrednost, ne mozesh povtorno da ja dodelish.
final int MAX_HEIGHT = 3;

System.out.println(MAX_HEIGHT); // 3

 MAX_HEIGHT = 4; // ERROR

//Kaj referenca kon objekt, 
//final znachi deka referencata ne mozhe da se prepravi da pokazhuva kon drug objekt. 
//Samiot objekt mozhe da se menuva ako negovata sodrzhina e promenliva.
final StringBuilder text = new StringBuilder("Hello");

text.append(" World"); // dozvoleno

text = new StringBuilder("Bye"); // ERROR



public class Gnome {
    public String name;
    public int age;
    public Gnome gnomeBuddy;
    private boolean magical = false;
    protected double height = 2.6;

    public static final int MAX_HEIGHT = 3;

    // Constructor with parameters
    Gnome(String nm, int ag, Gnome bud, double hgt) {
        name = nm;
        age = ag;
        gnomeBuddy = bud;
        height = hgt;
    }
    //Gnome g1 = new Gnome("Alex", 100, null, 2.5);

    // Constructor without parameters
    Gnome() {
        name = "Rumple!!";
        age = 204;
        gnomeBuddy = null;
        height = 2.1;
    }
    //Gnome g2 = new Gnome();
    //System.out.println(g2.name); // Rumple!!
    //System.out.println(g2.age);  // 204

    //METODI
public static void makeKing(Gnome h) { //static, pa se povikuva preku klasata i prima objekt kako argument: Gnome.makeKing(g1).
    h.name = "King " + h.getRealName();
    h.magical = true;
}

public void makeMeKing() { //ne e static, pa se povikuva na samiot objekt: g1.makeMeKing().
    name = "King " + getRealName();
    magical = true;
}

public boolean isMagical() {
    return magical;
}

public void setHeight(int newHeight) {
    height = newHeight;
}

public String getName() {
    return "I won't tell";
}

public String getRealName() {
    return name;
}

public void renameGnome(String s) {
    name = s;
}
}
/*
Java Modifiers
- public: accessible wherever the class/member is accessible.
- protected: accessible in the same package and in subclasses.
- private: accessible only inside the declaring class.
- package-private: accessible within the same package.
- static: belongs to the class, shared rather than per-instance.
- final: prevents reassignment; for references, the reference cannot point elsewhere.
- Constructors initialize new objects.
- Getters return values; setters or other methods can modify object state.
- static methods are called through the class; instance methods are called on objects.
*/

//METODIIIIIII VO JAVA

modifiers returnType methodName(parameters) {
    // method body
}
//primer
public int add(int a, int b) {
    return a + b;
}
//povikuvanje
int result = add(3, 5);

//Procedure vs Function
//Procedure — metoda shto ne vrakja vrednost; vo Java se koristi void.
//- Function — metoda shto vrakja vrednost, na primer int, double ili String.
// Procedure: returns nothing
public void sayHello() {
    System.out.println("Hello!");
}

// Function: returns an integer
public int square(int number) {
    return number * number;
}
//povikuvanje
sayHello();

int result = square(4); // result = 16

//Method modifiers
/*
Modifier	Znachenje
public	        Metodata mozhe da se povikuva od mesta kade shto e dostapna.
protected	    Dostapna vo istiot paket i vo podklasi.
private	        Mozhe da se povikuva samo vnatre vo istata klasa.
(no modifier)	Package-private: dostapna vo istiot paket.
static      	Pripagja na klasata, ne na konkreten objekt.
final	        Metodata ne mozhe da bide override-irana vo podklasa.
abstract	    Metodata nema telo i mora da se implementira vo konkreten tip spored pravilata za abstract classes.
*/


//enum — nabrojuvanje na fiksni vrednosti
public enum Day {
    MON, TUE, WED, THU, FRI, SAT, SUN
}
//ili
public class Main {
    enum Day {
        MON, TUE, WED, THU, FRI, SAT, SUN
    }

    public static void main(String[] args) {
        Day d = Day.MON;

        System.out.println("Initially d is " + d);

        d = Day.WED;
        System.out.println("Then it is " + d);

        Day t = Day.valueOf("WED");

        System.out.println("Are d and t the same? " + (d == t));
    }
}



//if else
if (condition) {
    // Runs if condition is true
} else if (anotherCondition) {
    // Runs if the first condition is false
    // and anotherCondition is true
} else {
    // Runs if all conditions are false
}

//switch
switch (variable) {
    case VALUE1:
        // Statements
        break;

    case VALUE2:
        // Statements
        break;

    default:
        // Runs if no case matches
        break;
}

//while
while (condition) {
    // Statements repeated while condition is true
}

//do-while
do {
    // Statements executed at least once
} while (condition);

//for
for (initialization; condition; update) {
    // Statements repeated while condition is true
}

//break ja prekinuva najbliskata ciklichna struktura ili switch.
for (int i = 0; i < 10; i++) {
    if (i == 3) {
        break;
    }

    System.out.println(i);

//continue - ja preskoknuva tekovnata iteracija i prodolzhuva so slednata.
    for (int i = 0; i < 5; i++) {
    if (i == 2) {
        continue;
    }

    System.out.println(i);
}
}
//Labeled break — prekinuvanje nadvoreshen ciklus-break outer; izleguva od ciklusot oznachen so outer, a ne samo od vnatrešniot ciklus.
outer:
for (int i = 0; i < 5; i++) {
    for (int j = 0; j < 3; j++) {
        if (i == 2) {
            break outer;
        }
    }

    System.out.println(i);
}

//Operators
// Arithmetic operators
+  -  *  /  %  ++  --

// Relational operators
<  <=  >  >=  ==  !=

// Logical operators
&&  ||  !

//&& — AND: dvata uslova treba da se true.
//|| — OR: barem eden uslov treba da e true.
//! — NOT: ja prevrtuva boolean vrednosta
//% — ostatok pri delenje.
//== — sporeduva vrednosti kaj primitivni tipovi, a kaj objekti sporeduva referenci.


    //primer
        

        int a = 10;
        int b = 3;

        // 1. ARITHMETIC OPERATORS
        System.out.println("Addition: " + (a + b));       // 13
        System.out.println("Subtraction: " + (a - b));    // 7
        System.out.println("Multiplication: " + (a * b)); // 30
        System.out.println("Division: " + (a / b));       // 3
        System.out.println("Remainder: " + (a % b));      // 1

        // Increment: increases the value by 1
        a++;
        System.out.println("After a++: " + a);            // 11

        // Decrement: decreases the value by 1
        b--;
        System.out.println("After b--: " + b);            // 2

        // 2. RELATIONAL OPERATORS
        System.out.println("a < b: " + (a < b));           // false
        System.out.println("a <= 11: " + (a <= 11));       // true
        System.out.println("a > b: " + (a > b));           // true
        System.out.println("a >= 11: " + (a >= 11));       // true
        System.out.println("a == 11: " + (a == 11));       // true
        System.out.println("b != 3: " + (b != 3));         // true

        // 3. LOGICAL OPERATORS
        System.out.println("AND: " + (a > 5 && b < 5));    // true
        System.out.println("OR: " + (a < 5 || b < 5));     // true
        System.out.println("NOT: " + !(a > 5));            // false

        // 4. STRING CONCATENATION
        String rug = "carpet";
        String dog = "spot";
        String mess = rug + dog;

        System.out.println(mess); // carpetspot

        String answer = mess + " will cost me " + 5 + " hours!";
        System.out.println(answer); // carpetspot will cost me 5 hours!

        // Parentheses make the arithmetic happen first
        System.out.println("Result: " + (5 + 3));          // Result: 8
        System.out.println("Result: " + 5 + 3);            // Result: 53
    }
}

//Class modifiers
/*
public — klasata mozhe da se koristi od drugi paketi ako e pravilno importirana i dostupna.

(no modifier) — klasata e package-private, odnosno dostapna samo vo istiot paket.

abstract — ne mozesh direktno da kreirash objekt od klasata; moze da ima abstract metodi bez telo.

final — klasata ne mozhe da se nasleduva so extends.
    */




//toString() e metoda shto vrakja eden String — odnosno tekstualna pretstava na objektot.
class Student {
    int rollno;
    String name;
    String city;

    // Constructor: initializes the student's data
    Student(int rollno, String name, String city) {
        this.rollno = rollno;
        this.name = name;
        this.city = city;
    }

    // Overrides the toString() method
    public String toString() {
        return rollno + " " + name + " " + city;
    }
}

public class Main {
    public static void main(String[] args) {

        // Create two Student objects
        Student s1 = new Student(101, "Raj", "lucknow");
        Student s2 = new Student(102, "Vijay", "ghaziabad");

        // Java automatically calls s1.toString() and s2.toString()
        System.out.println(s1);
        System.out.println(s2);
    }
}
//OUTPUT 101 Raj lucknow

//@OVERRIDE -oznachuva redefiniranje na nasledena metoda.

class Student {
    int rollno = 101;
    String name = "Raj";

    @Override
    public String toString() {
        return rollno + " " + name;
    }
}  //@Override I kazhuva na Java deka nameruvash da ja redefinirash metodata toString() shto vekje postoi vo roditelskata klasa Object.

//Nizi (Arrays)

//deklaracija i chitanje
int[] numbers = {10, 20, 30, 40};

System.out.println(numbers[0]); // 10
System.out.println(numbers[2]); // 30

numbers[1] = 99; // Change the element at index 1

System.out.println(numbers[1]); // 99
//Kreiranje niza so odredena golemina:
int[] numbers = new int[5];

//lenght
int[] numbers = {10, 20, 30, 40};

System.out.println(numbers.length); //output: 4

//public class Main {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40};

        // Print every element in the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
