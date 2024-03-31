import java.util.Scanner;
class Grade{
    public String grade(int avgp){
        switch (avgp / 10) {
            case 10:
                return "A++";
            case 9:
                return "A+";
            case 8:
                return "A";
            case 7:
                return "B+";
            case 6:
                return "B";
            case 5:
                return "C";
            default:
                return "D";
        }
    }
}
public class Studgrade{
   public static void main(String[] args) {
       Grade g = new Grade();
       Scanner sc = new Scanner(System.in);

       //Amount of subjects
       System.out.println("Enter the amount of subjects");
       int tsubs = sc.nextInt();
       int tmarks = 0;

       //Taking and adding all marks
       for (int i=0; i< tsubs; i++) {
           System.out.println("Enter the marks obtained in subject" + (i + 1));
           int marks = sc.nextInt();
           tmarks += marks;
       }

       //Percentage calculation
       int avgp = tmarks / tsubs;

       //Calculating grades
       String Grade = g.grade(avgp);
       System.out.println("Total marks obtained:- " + tmarks);
        System.out.println("Percentage:- " + avgp+"%");
        System.out.println("Grade:- " + Grade);

        sc.close();
        
    }
 }
