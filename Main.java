//import package for Scanner
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //GPA calculator App

    //Declare your variables
      Scanner sc = new Scanner(System.in);
      float score;
      int unit;
      int totalUnit = 0;
      int numCourses;
      float totalGradePoints = 0;
      float gpa;
    //Request user to input number of courses taken
      System.out.println("Kindly input the number of courses you took this semester");
      numCourses = sc.nextInt();
    // For loop to loop through number of courses taken
      for (int i = 1; i<=numCourses; i++){

        //request score for current course
        System.out.println("Kindly input the score for course " + i);
        score = sc.nextFloat();

        System.out.println("Kindly input the unit for course " + i);
        unit = sc.nextInt();

        if (unit > 6 || unit < 0){
          System.out.println("Invalid Unit Inputted, kindly re-input what is right");
          i--;
        
        }
        else{
          //write an if statement to decipher the grade point for the score entered
         
          

          if (score > 100 || score < 0){
              System.out.println("Invalid Score Inputted, kindly re-input what is right");
              i--;
              continue;
          }
          else{
            //sum up the grade points
             totalUnit += unit;
            totalGradePoints += calculateGradePoint(score, unit);
          }  
        }
      }
    //calculate the average of the grade points
    gpa = totalGradePoints/totalUnit;
    //Print out the GPA of the student for the semester
    System.out.println("Your Grade Point Average for the semester is "+ gpa);
    
  }

  static float calculateGradePoint (float marks, float un){
        float gradePoint = 0.0f;
          if(marks <=100 && marks >= 80)
            gradePoint = 5.0f * un;

          else if(marks <= 79 && marks >= 60)
              gradePoint = 4.0f * un;

          else if(marks <= 59 && marks >= 50)
            gradePoint = 3.0f * un;

          else if(marks <= 49 && marks >= 45)
            gradePoint = 2.0f * un;

          else if(marks <= 44 && marks >= 40)
            gradePoint = 1.0f * un;

          else if(marks <= 39 && marks >= 0)
            gradePoint = 0.0f * un;

          return gradePoint;
  }
}