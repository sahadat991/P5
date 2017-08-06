package polymorphism;

public class PresentGradeCal extends GradeCal {

	@Override
	public int studentGrade(int a,int b, int c, int d, int e){
		int total = a + b + c + d + e - 2 * 2;
		return total;	
		
	}
}
