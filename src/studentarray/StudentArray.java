/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentarray;
import java.util.Scanner;

/**
 *
 * @author stuti
 */
public class StudentArray 
{
    
    public static void main(String[] args) 
    {
       Student[] myclass = new Student[4];
       Scanner input = new Scanner(System.in);
       int i;
       for(i=0;i<myclass.length;i++)
       {
           System.out.print("Please enter Name,Rollno and Marks\n");
           String name = input.next();
           String rollno = input.next();
           double marks = input.nextDouble();
           myclass[i] = new Student(name,rollno,marks);
           
       }
       System.out.print("\tName\t\t\tRollNo\t\t\tMarks\n");
       for(i=0;i<myclass.length;i++)
       {
           
           System.out.printf("\t%s\t\t\t%s\t\t\t%.2f\n", 
           myclass[i].getName(),myclass[i].getRollno(),myclass[i].getMarks());
       }
       
    }
    
}
