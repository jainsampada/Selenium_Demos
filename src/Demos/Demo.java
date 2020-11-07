package Demos;

public class Demo {
	String path;
public void Launch()
{
	path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
	System.out.println(path);
	System.out.println("Hello from git");
	System.out.println("Pawan Kashyap");
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo oo=new Demo();
		oo.Launch();
		
	}

}
