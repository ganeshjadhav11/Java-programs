import java.util.Scanner;

class shape{
    public void area(){
        System.out.println("display area");
    }
}



class Triangle extends shape{            // single level inheritance
    public void area(int l, int h ){
        System.out.println(0.5* l *h);
    }
}


class EquilateralTriangle extends  Triangle{  // multiple inheritance
    public void area(int l, int h){
        System.out.println(0.5*l*h);
    }
} 

class  circle extends shape{    // hierarchial inheritance
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}



public class inher {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);         
        
     
    //  circle c1= new circle();

    //  c1.area(5);

     Triangle t1= new Triangle();
     t1.area( 6,8);

     EquilateralTriangle e1=new EquilateralTriangle();
     e1.area(8,9);

    }
    
}
