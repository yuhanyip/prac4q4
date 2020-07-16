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
public class TestQ2 {
    public static void main(String[]args){
        Q2 stud1 = new Q2();
        Q2 stud2 = new Q2("W3085","Ahmad");
        
        stud1.setName("YuHanYip");
        stud1.setStdID("W1902054");
        
        stud1.addQuiz(5);
        stud2.addQuiz(9);
        
        System.out.printf("%-15s %3d %3d %5.2f\n",
                stud1.getStudentName(),stud1.getQuizNum(),
                stud1.getTotalScore(),stud1.getAverageScore());
        System.out.printf("%-15s %3d %3d %5.2f\n",
                stud2.getStudentName(),stud2.getQuizNum(),
                stud2.getTotalScore(),stud2.getAverageScore());
    }
}
