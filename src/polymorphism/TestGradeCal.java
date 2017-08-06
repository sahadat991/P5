package polymorphism;

public class TestGradeCal {

	public static void main(String[] args) {

		GradeCal gr = new GradeCal();
		
		int studentGrade = gr.studentGrade(10, 5);
		System.out.println(studentGrade);
		
		PresentGradeCal grade = new PresentGradeCal();
		
		int PresentGradeCal = grade.studentGrade(1, 1, 1, 1, 1);
		System.out.println(PresentGradeCal);
		
		

	}

}
