import java.util.Scanner;

public class student_grade {
    public static void main(String[] args) 
    {
        Scanner gr = new Scanner(System.in);

        System.out.println("Enter the number of subjects: ");
        int num = gr.nextInt();

        int totalmarks = 0;
        for(int i=1; i<=num; i++)
        {
            System.out.println("Enter the marks of students " + i + ": ");
            int marks = gr.nextInt();
            totalmarks += marks;
        }

        double average = (double) totalmarks / num;

        System.out.println("Average marks: " + average);

        if(average >= 90)
        {
            System.out.println("Grade: A");
        }
        else if(average >= 80)
        {
            System.out.println("Grade: B");
        }
        else if(average >= 70)
        {
            System.out.println("Grade: C");
        }
        else if(average >= 60)
        {
            System.out.println("Grade: D");
        }
        else
        {
            System.out.println("Grade: F");
        }
        gr.close();
    }
}
