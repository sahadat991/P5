package nestedclass;

public class Outer {
	
	Food inner1 = new Food();
	Water inner2 = new Water();
	Education inner3 = new Education();
	
	public void outterM() {
		System.out.println("Human basic needs");
		inner1.inner();	
		inner2.inner();
		inner3.inner();
	}
	private class Food{
		private void inner(){
			System.out.println("");
		}
	}		
		private class Water{
			private void inner(){
				System.out.println("This is Inner B");	
		}
	}
	
		private class Education{
			private void inner(){
				System.out.println("This is Inner C");
			}
		}
}
