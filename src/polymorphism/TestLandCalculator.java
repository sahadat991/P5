package polymorphism;

public class TestLandCalculator {

	public static void main(String[] args) {

		LandCalculator calculate = new LandCalculator();
		
		int sizeOfStrightLine = calculate.areaOfLand(10, 5);
		System.out.println(sizeOfStrightLine);
		
		int sizeOfTriangle = calculate.areaOfLand(10, 5, 20);
		System.out.println(sizeOfTriangle);

		int sizeOfRectangle = calculate.areaOfLand(10, 5, 20, 30);
		System.out.println(sizeOfRectangle);
		
		MordernLandCalculator mlc = new MordernLandCalculator();
		
		int modernOfRectangle1 = mlc.areaOfLand(10, 40, 20, 30);
		System.out.println(modernOfRectangle1);
	}

}
