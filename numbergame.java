import java.util.*;


public class mini{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int myNumber = (int)(Math.random()*100);
        int username=0;

        do{
            System.out.println("Guess My Number(1-100)");
            username = sc .nextInt();

            if(username == myNumber){
                System.out.println("wooHooo ... Correct number");
                break;

            } 
            else if (username > myNumber) {
                System.out.println("your number is too large");
                
            }
            else{
                System.out.println("your number is too small");
            }

            
        }while(username >=0);
        System.out.print("My number was : ");
        System.out.println(myNumber);

    }
}

