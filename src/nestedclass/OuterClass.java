package nestedclass;

public class OuterClass {

	InnerA innerA = new InnerA();
	InnerB innerB = new InnerB();
	InnerC innerC = new InnerC();
	
	public void outterMethod() {
		System.out.println("This is Outter" + "                          " + "Method");
		System.out.println("*********************************************************");
		innerA.innerAMethod();	
		innerB.innerAMethod();
		innerC.innerAMethod();
	}
	private class InnerA{
		private void innerAMethod(){
			System.out.println("This is Inner                            A");
		}
	}		
		private class InnerB{
			private void innerAMethod(){
				System.out.println("This is Inner B");	
		}
	}
	
		private class InnerC{
			private void innerAMethod(){
				System.out.println("This is Inner C");
			}
		}
}