/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prac4;

/**
 *
 * @author User
 */
public class TestQ3 {
     public static void main(String[]args){
        Q3 stud1 = new Q3();
        Q3 stud2 = new Q3("W3085","Ahmad");
        
       stud1.setName("YuHanYip");
        stud1.setStdID("W1902054");
        
        stud1.addQuiz(10);
        stud2.addQuiz(1);
        
        stud1.setContribution(0.2);
        
        System.out.printf("%-15s %s %s %s %s\n", 
                "Name", "Score","QuizNum" , "Average", "contribution");
        System.out.printf("%-15s %3d %5d %9.2f %8.2f\n",
                stud1.getStudentName(),stud1.getQuizNum(),
                stud1.getTotalScore(),stud1.getAverageScore(),
                stud1.getAverageScore()/10 * Q3.getContribution());
        System.out.printf("%-15s %3d %5d %9.2f %8.2f\n",
                stud2.getStudentName(),stud2.getQuizNum(),
                stud2.getTotalScore(),stud2.getAverageScore(),
                stud2.getAverageScore()/10 * Q3.getContribution());
     }
    
}
