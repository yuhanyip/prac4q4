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
public class Car {
    private String plateNo;
    private String color;
    private int year;
    private CarType cartype;
    
    public Car(String plateNo, String color, int year ,CarType cartype){
        this.plateNo = plateNo;
        this.color = color;
        this.year = year;
        this.cartype = cartype;
    }
    
    public String toString()
    {
        return String.format("%15s %15s %8d %s",plateNo,color,year,cartype.toString());
    }
        
}
