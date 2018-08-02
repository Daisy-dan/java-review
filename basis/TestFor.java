public class TestFor{
	public static void main(String args[]){
		int [] numbers={10,20,30,40,50};
		for (int x:numbers){
			System.out.println(x);
			System.out.println("-");
			
			if( x == 30){
				break;
			}
		}
		System.out.println("\n");
		String [] names={"A","B","C"};
		for (String name:names){
			System.out.println(name);
			System.out.print("-");
		}
	}
}
