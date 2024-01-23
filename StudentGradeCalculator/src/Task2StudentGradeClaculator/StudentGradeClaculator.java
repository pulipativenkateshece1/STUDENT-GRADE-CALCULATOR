package Task2StudentGradeClaculator;

import java.util.Scanner;

public class StudentGradeClaculator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Student Grade Calculator");
		System.out.print("Enter the number of Subjects: ");
		int numberOfsubject =sc.nextInt();
		int totalMarks =0;
		for(int i=1;i<=numberOfsubject;i++)
		{
			System.out.print("Enter the marks obbtain in subject: "+i+": ");
			int subjectMarks = sc.nextInt();
			totalMarks += subjectMarks;
		}
		System.out.println("Total Marks: "+totalMarks);
		double averagePercentage = (double )totalMarks/numberOfsubject;
		System.out.printf("Average Percentage: %.2f%%\n",averagePercentage);
		char grade =clacuateGrade(averagePercentage);
		System.out.println("Grade: "+grade);
		sc.close();
		
	}
	private static char clacuateGrade(double averagePercentage)
	{
		if(averagePercentage >=90)
		{
			return 'A';
		}
		else if(averagePercentage>=80)
		{
			return 'B';
		}
		else if(averagePercentage>=70)
		{
			return 'C';
		}
		else if(averagePercentage >=60)
		{
			return 'D';
		}
		else
		{
			return 'F';
		}
	}

}
