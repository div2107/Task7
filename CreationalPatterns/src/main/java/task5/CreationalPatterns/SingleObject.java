package task5.CreationalPatterns;

public class SingleObject {
	public static SingleObject instance = new SingleObject();

	   public SingleObject(){}

	   //Get the only object available
	   public static SingleObject getInstance(){
	      return instance;
	   }

	   public void showMessage(){
	      System.out.println("This is a simpe demo of Singleton Pattern");
	      System.out.println("Holaa!!This is Singleton Design Pattern");
	   }

}
