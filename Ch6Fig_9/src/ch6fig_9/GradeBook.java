// Fig. 4.9: GradeBook.java
// GradeBook class that solves the class-average problem using
// sentinel-controlled repetition.
package ch6fig_9;
import java.util.Scanner;
public class GradeBook 
    {
    private String courseName;// name of the course this gradebook represents

    // constructor iniyializes coursename
    public GradeBook(String name)
        {
        courseName = name; // initializes coursename
        }//end constructor
    
    // method to set the coursename
    public void setCourseName(String name)
        {
        courseName = name;
        } //end method setCourseName
    
    //method to retrieve course name
    public String getCourseName() 
        {
        return courseName;
        }//end method getcoursename
    
    //display a welcome message to gradebook user
    public void displayMessage()
        {
        //grtCourseName gets the name of the course
        System.out.printf( "Welcome to the gradebook for\n%s!\n\n", 
             getCourseName());
        }// end method displayMessage
    
    //determine class based on 10 gtades entered by user
    public void determineClassAverage()
        {
        //create scammer to obtain input from command window
        Scanner input = new Scanner(System.in);
        
        int total; // sum of grades entered by user
        int gradeCounter;// number of grade to be entered next
        int grade; //grade value entered by user
        double average; //average of grades
        
        //initialization phaze
        total = 0;//initialize total
        gradeCounter = 0;// initialize loop counter
        
        //processong phase
        //prompt for input and read grade from user
        System.out.print("Enter grade or -1 to quit: ");//prompt
        grade=input.nextInt();// input next grade
        
        //loop until sentinal value read from user
        while (grade != -1)
            {
            total = total + grade; //add grate to total
            gradeCounter = gradeCounter + 1;
            
            // prompt for input and read next grade from user
            System.out.print("Enter grade or -1 to quit: ");//prompt
            grade=input.nextInt();// input next grade
            }// end while
    
        //termination phaze
        //if user enters at least 1 grade
        if(gradeCounter != 0)
            {
            // calculate the average of all grades entered
            average = (double) total / gradeCounter; //integer fivision yields intiger results
                
            //display total average of grades
            System.out.printf("\nTotal of the %d grades entered is %d\n",
                gradeCounter, total);
            System.out.printf("Class average is %.2f\n", average);
            }// end if
            else
                System.out.println( "No grades were entered" );

                }//end method determineClassAverage
            }
        
        
      
