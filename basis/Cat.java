public class Cat{
	int catAge;
	public Cat(String name){
		System.out.println("cat name:"+name);
	}
	
	public void setAge(int age){
		catAge = age;
	}

	public int getAge(){
		System.out.println("age:"+catAge);
		return catAge;
	}

	public static void main(String []args){
		//实例化对象
		Cat myCat = new Cat("tommy");
		//设定age
		myCat.setAge(2);
		myCat.getAge();
		//访问成员变量
		System.out.println("变量值:"+myCat.catAge);
	}
}
	
