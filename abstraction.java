abstract class Animal{
    abstract void walk();
     
    Animal(){
        System.out.println("you are creating a animal");
    }
    public void eats(){
        System.out.println("Eats");

    }
}




class Horse extends Animal{

        Horse(){
            System.out.println("you have creted a horse");

        }

    public void walk(){
        System.out.println("walks on 4 legs");
    }
}

class chicken extends Animal{
    public void walk(){
        System.out.println("walks on 2 legs");
    }
}

public class abst {

    public static void main(String[] args) {
        Horse horse=new Horse();

        // horse.walk();

    }
    
}
