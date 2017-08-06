package polymorphism;

public class GradeCal {

	public int studentGrade(int a,int b){
		int total = a + b;
		return total;
	}	
	public int studentGrade(int a,int b, int c, int d){
		int total = a + b + c + d;
		return total;	
	}
	public int studentGrade(int a,int b, int c, int d, int e){
		int total = a + b + c + d + e;
		return total;
	}
	public int studentGrade(int a,int b, int c, int d, int e, int f){
		int total = a + b + c + d + e + f;
		return total;
	}

}