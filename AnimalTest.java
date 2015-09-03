class Animal {

   // Properties of the class...
   public int     numberOfLegs;
   public boolean hasWings;

   // Constructor of the class...
   public Animal() {
      numberOfLegs = 4;
      hasWings = false;
   }

   // Methods of the class...
   public void talk() {
      System.out.println("Hello");
   }
}

class Bird extends Animal {

   // Properties of the class...
   public boolean canFly;

   // Constructor of the class...
   public Bird() {
      numberOfLegs = 2;  
      hasWings = true;
      canFly = true;
   }

   // Methods of the class...
   public void fly() {
      System.out.println("flap flap");
   }
}

class Eagle extends Bird {

   // Properties of the class...
   private int numberOfKills;

   // Constructor of the class...
   Eagle() {
      numberOfKills = 0;
   }

   // Methods of the class...
   public void attack() {
      numberOfKills++;
   }
}

class AnimalTest {

   // The main method is the point of entry into the program...
   public static void main(String[] args) {

      Animal a = new Animal();
      System.out.println(a.numberOfLegs);
      System.out.println(a.hasWings);
      a.talk();
      // The method fly does not exist in Animal;
      // you can use methods from Animal (upperclass), but not 
      // eagle (lowerclass).
      //a.fly(); 

      Bird b = new Bird();
      System.out.println(b.numberOfLegs);
      System.out.println(b.hasWings);
      System.out.println(b.canFly);
      // The number of kills and attack does not exist in Bird,
      // you can use methods from Animal (upperclass), but not 
      // eagle (lowerclass).
      //System.out.println(b.numberOfKills);
      b.talk();
      //b.attack(); 

      Eagle e = new Eagle();
      // numberOfKills is private, so does not have the right scope
      //System.out.println(e.numberOfKills);
      System.out.println(e.numberOfLegs);
      System.out.println(e.hasWings);
      e.talk();
      e.attack();

      b = a;
      b.talk();
      b.fly();
   }
}

/* Questions:
 d. It prints 2, because the parent class of Eagle is bird, and 
 the Bird class says numberOfLegs = 2 (and numberOfLegs is a 
 public int).
 e. The line that gives a compilation error is a.fly, since not all 
 animals can fly.
 f. The b = a line gives an error, because not all animals are birds.
 */