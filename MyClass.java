public class MyClass
{
    static void myStaticMethod()
    {
        System.out.println("Static method called!");
    }
    public void myPublicMethod()
    {
        System.out.println("Public method called!");
    }
	public static void main(String[] args) {
		myStaticMethod();
		//myPublicMethod(); will give error
		MyClass obj=new MyClass();
		obj.myPublicMethod();
	}
}
