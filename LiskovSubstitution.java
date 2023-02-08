abstract class Amphibian {

    public void swim();
    public void walk();

}

public class Frog extends Amphibian {
    public void swim() {
        System.out.println("The frog is swimming");
    }
    
    public void walk() {
        System.out.println("The frog is walking on land");
    }
}

public class Dolphin extends Fish{
   public void swim() {
        System.out.println("The dolphin is swimming");
   }
    
}

abstract class Fish{
    public void swim();
}
