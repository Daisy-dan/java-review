public class Switch{
	public static void main(String args[]){
		char grade='C';
		switch(grade){
			case 'A':
				System.out.println("A");
				break;
			case 'B':
				System.out.println("B");
                                break;
			case 'C':
				System.out.println("C");
				break;
			case 'D':
				System.out.println("D");
			default:
				System.out.println("none");
		}
		System.out.println("is:"+grade);
	}
}
