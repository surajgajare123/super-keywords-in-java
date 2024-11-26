class Base{
    Base(){
        System.out.println("I am a constructor of Base class!.....");
}
 Base(int x){
        System.out.println("I am a overloaded constructor of Base class!....."+ x);
}
}
class Derived extends Base{
    Derived(){
    System.out.println("I am a constructor of Derived class!....");
    }
    Derived(int x, int y){
        super(x);
    System.out.println("I am a overloadedvconstructor of Derived class!...." + y);
    }
}
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		//Base b = new Base();// run only base class constructor
		Derived d = new Derived(13, 56); // run both class constructor
		
	}
}
