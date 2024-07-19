import java.util.*;

class Taskl{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int score=0;
    Random rd = new Random();
    int randomNumber= rd.nextInt(100);
    int i;
    for(i=0;i<10;i++){
        System.out.println("Guess Your Number");
        int X= sc.nextInt();
        if(randomNumber==X){
            System.out.println("Your number matched You Win");
            System.out.println("");
            score++; 
            break; 
        }
        else if(X<randomNumber){
            System.out.println("Your guess is too low.Your number didn't matched You loose");
            System.out.println("");
            score--;
        }      
        else{
            System.out.println("Your guess is too high.Your number didn't matched You loose");
            System.out.println("");            
            score--;
        }
    }
    System.out.println("Number of attempts "+i);
    System.out.println("Your Score is "+score);
    
}
}