// Fig. 4.7: GradeBookTest.java
// Create GradeBook object and invoke its determineClassAverage method.
package ch6fig_9;
public class GradeBookTest
    {
    public static void main(String[] args) 
        {
        // creaate gradebook object myGradeBook and
        // pass the coursename to the constructor
        GradeBook myGradeBook = new GradeBook(
            "CIS 101 Introduction To Java Programming");
        
        myGradeBook.displayMessage(); //displays welcome message
        myGradeBook.determineClassAverage();//find the average of 10 grades
        }// end main
    }// end class gadeBookYest
