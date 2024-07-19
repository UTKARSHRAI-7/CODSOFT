import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter number of subject");
        int numSub=s.nextInt();
        int[] Marks = new int[numSub];
        //input from user
        for(int i=0;i<numSub;i++){
            System.out.println("enter the marks of "+(i+1)+" subject");
            Marks[i]=s.nextInt();
        }
        //total marks
        int totalMarks=0;
        for(int j=0; j<Marks.length;j++){
            totalMarks+=Marks[j];
        }
        //percentage
        double percentage= (double) totalMarks/numSub;
        
        //grade
        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
         
        //result
        System.out.println("Result");
        System.out.println("");
        System.out.println("Total Marks "+totalMarks);
        System.out.println("");
        System.out.println("The Average Percentage "+percentage);
        System.out.println("");
        System.out.println("The Grade Scored "+grade);        
    }
    
}
