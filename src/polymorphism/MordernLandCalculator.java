package polymorphism;

public class MordernLandCalculator extends LandCalculator {
	
	@Override
	public int areaOfLand(int a,int b, int c, int d){
		int total = a + b + c + d - 4 * 2 + 2;
		return total;	
	}
	//Overloading
	public int areaOfLand(int a,int b, int c, int d, int e){
		int total = a + b + c + d + e;
		return total;
	}
}
