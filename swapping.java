package codejava;

import java.util.Scanner;

public class swapping {


    public static void main(String[] args) {
        
        // int a=10,b=20;
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

            // int t=a;  // value of a is = t 
            // a=b;        // value of a=b 
            // b=t;      // value of b=t
            
            
                //    method 21

// ?            a=a*b;
//             b=a/b;
//             a=a/b;

      b=a+b-(a=b);

    System.out.println("after swapping the values" +a+" "+b);

    }
    
}
