/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentarray;

/**
 *
 * @author stuti
 */
public class Student 
{
    private String name;
    private double marks;
    private String rollno;
    private int numofstudents;
    
    public Student(String name,String rollno,double marks)
    {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
        numofstudents++;
    }
    
    public double getMarks()
    {
        return this.marks;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public String getRollno()
    {
        return this.rollno;
    }
    
    public int number()
    {
        return numofstudents;
    }
    
    
}
