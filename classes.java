
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


