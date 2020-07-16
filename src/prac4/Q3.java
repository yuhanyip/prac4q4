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
public class Q3 {
     private String studentID;
    private String studentName;
    private int quizNum;
    private int totalScore;
    private static double contribution;
    
    public Q3() {
       this("","");
        
    }

    public Q3(String studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }
    public int getQuizNum() {
        return quizNum;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setStdID(String StdID) {
        this.studentID = StdID;
    }

    public static double getContribution() {
        return contribution;
    }
    public static void setContribution(double contribution) {
        Q3.contribution = contribution;
    }

    public void setName(String name) {
        this.studentName = name;
    }
    
    public void addQuiz(int score ){
        
        if(score <0 && score > 10)
    	{
           System.out.println("Invalid score, score can only be from 0 to 10 marks ");
    	}
    	else
        { 
            quizNum++;
            totalScore+=score;           
        }
    	    
    	
    }
    public double getAverageScore(){
        return totalScore/quizNum;
    }
}
